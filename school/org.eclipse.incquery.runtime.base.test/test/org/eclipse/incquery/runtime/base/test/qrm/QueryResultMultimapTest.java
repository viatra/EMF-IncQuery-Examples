/*******************************************************************************
 * Copyright (c) 2010-2012, Abel Hegedus, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Abel Hegedus - initial API and implementation
 *******************************************************************************/
package org.eclipse.incquery.runtime.base.test.qrm;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.incquery.runtime.base.api.IQueryResultSetter;
import org.eclipse.incquery.runtime.base.api.IQueryResultUpdateListener;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

/**
 * @author Abel Hegedus
 *
 */
public class QueryResultMultimapTest {

    
    
    /**
     * @author Abel Hegedus
     *
     */
    private final class QRMTestSetter implements IQueryResultSetter<String, String> {
        
        TestQRM testQrm;
        
        /**
         * 
         */
        public QRMTestSetter(TestQRM tqrm) {
            testQrm = tqrm;
        }
        
        @Override
        public boolean validate(String key, String value) {
            if(key.isEmpty() || value.isEmpty()) {
                return false;
            }
            if(key.equals("errorValidate")) {
                return false;
            }
            return true;
        }

        @Override
        public boolean remove(String key, String value) {
            if(key.equals("errorRemove")) {
                return false;
            }
            Map<String, String> map = new HashMap<String, String>();
            map.put(key, value);
            testQrm.testInternalRemove(map);
            if(testQrm.containsEntry(key, value)) {
                return false;
            }
            return true;
        }

        @Override
        public boolean put(String key, String value) {
            if(key.equals("errorPut")) {
                return false;
            }
            Map<String, String> map = new HashMap<String, String>();
            map.put(key, value);
            testQrm.testInternalPut(map);
            if(!testQrm.containsEntry(key, value)) {
                return false;
            }
            return true;
        }
    }

    /**
     * @author Abel Hegedus
     *
     */
    private final class QRMTestListener implements IQueryResultUpdateListener<String, String> {
        
        private boolean throwErrors;

        /**
         * 
         */
        public QRMTestListener(boolean throwErrors) {
            this.throwErrors = throwErrors;
        }
        
        private List<String> updates = new ArrayList<String>();

        @Override
        public void notifyRemove(String key, String value) {
            updates.add("[REMOVE]"+key + ":" + value);
            if(throwErrors) {
                throw new UnsupportedOperationException();
            }
        }

        @Override
        public void notifyPut(String key, String value) {
            updates.add("[PUT]"+key + ":" + value);
            if(throwErrors) {
                throw new UnsupportedOperationException();
            }
        }

        /**
         * @return the updates
         */
        public List<String> getUpdates() {
            return updates;
        }
    }
    

    private Map<String, String> testMap;
    private TestQRM qrm;
    
    @Before
    public void setup() {
        qrm = new TestQRM();
        qrm.testInternalPut(testMap());
    }
    
    @After
    public void breakdown() {
        qrm = null;
    }
    
    @Test
    public void basicQRMTest() {
        
        assertFalse(qrm.isEmpty());
        assertEquals(qrm.size(), testMap.size());
        Collection<String> expected = qrm.get("1");
        assertTrue(expected.size() == 1);
        assertTrue(expected.iterator().next().equals(testMap.get("1")));
        assertTrue(qrm.containsEntry("2", "k2"));
        assertTrue(qrm.containsKey("5"));
        assertTrue(qrm.containsValue("k6"));
        assertArrayEquals(qrm.keySet().toArray(), testMap.keySet().toArray());
        assertArrayEquals(qrm.keys().toArray(), testMap.keySet().toArray());
        assertArrayEquals(qrm.values().toArray(), testMap.values().toArray());
        
        Set<Entry<String,String>> set = new HashSet<Map.Entry<String,String>>(testMap.entrySet());
        for(Entry<String, String> e :  qrm.entries()) {
            assertTrue("Doesn't contain " + e.getKey() + " : " + e.getValue(), set.contains(e));
            set.remove(e);
        }
        assertTrue(set.isEmpty());
        
        Map<String, Collection<String>> asMap = qrm.asMap();
        for (String key : asMap.keySet()) {
            assertTrue(testMap.containsKey(key));
            assertTrue(asMap.get(key).size() == 1);
            assertTrue(asMap.get(key).iterator().next().equals(testMap.get(key)));
        }
        
    }
    
    @Test(expected=UnsupportedOperationException.class)
    public void QRMPutTest() {
        qrm.put("t", "t");
    }
    
    @Test(expected=UnsupportedOperationException.class)
    public void QRMPutAllTest() {
        qrm.putAll("t", Lists.newArrayList("k1", "k2"));
    }
    
    @Test(expected=UnsupportedOperationException.class)
    public void QRMPutAllMapTest() {
        Multimap<String, String> map = HashMultimap.create();
        map.put("t", "g");
        map.put("1", "k2");
        
        qrm.putAll(map);
    }
    
    @Test(expected=UnsupportedOperationException.class)
    public void QRMRemoveTest() {
        qrm.remove("1", "k1");
    }
    
    @Test(expected=UnsupportedOperationException.class)
    public void QRMRemoveAllTest() {
        qrm.removeAll("k2");
    }

    @Test(expected=UnsupportedOperationException.class)
    public void QRMClearTest() {
        qrm.clear();
    }

    @Test(expected=UnsupportedOperationException.class)
    public void QRMReplaceValuesTest() {
        qrm.replaceValues("1", Lists.newArrayList("k1", "k2"));
    }
    
    @Test
    public void listenerTest() {
        QRMTestListener listener = new QRMTestListener(false);
        qrm.removeCallbackOnQueryResultUpdate(listener);
        
        internalListenerTest(listener, false);

        assertArrayEquals(Lists.newArrayList("[PUT]t:g","[PUT]t:g2","[PUT]1:k2","[REMOVE]t:g").toArray(),
                listener.getUpdates().toArray());
        
        qrm.removeCallbackOnQueryResultUpdate(listener);
        
        qrm.addCallbackOnQueryResultUpdate(listener, false);
    }

    private void internalListenerTest(IQueryResultUpdateListener<String, String> listener, boolean fireNow) {
        
        qrm.addCallbackOnQueryResultUpdate(listener, fireNow);
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("t", "g");
        
        qrm.testInternalPut(map);
        
        map.put("t", "g2");
        
        qrm.testInternalPut(map);
        
        map.put("1", "k2");
        
        qrm.testInternalPut(map);
        
        map.clear();
        map.put("t", "g");
        map.put("x", "x");
        qrm.testInternalRemove(map);
        
    }
    
    @Test
    public void faultyListenerTest() {
        QRMTestListener listener = new QRMTestListener(true);
        
        internalListenerTest(listener, false);

        assertArrayEquals(Lists.newArrayList("[PUT]t:g","[PUT]t:g2","[PUT]1:k2","[REMOVE]t:g").toArray(),
                listener.getUpdates().toArray());
    }
    
    @Test
    public void fireNowListenerTest() {
        QRMTestListener listener = new QRMTestListener(false);
        
        internalListenerTest(listener, true);
        
        ArrayList<String> list = Lists.newArrayList("[PUT]1:k1","[PUT]2:k2","[PUT]3:k3",
                "[PUT]4:k4","[PUT]5:k5","[PUT]6:k6","[PUT]7:k7","[PUT]8:k8",
                "[PUT]t:g","[PUT]t:g2","[PUT]1:k2","[REMOVE]t:g");
        
        for (String s : listener.getUpdates()) {
            assertTrue("Unexpected notification: "+ s, list.remove(s));
        }
        assertTrue("Cannot find notifications: " + list.toString(),list.isEmpty());
        
    }
    
    @Test
    public void queryResultSetterTest() {
        
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        qrm.put("test", "set");
        
        Collection<String> results = qrm.get("test");
        assertTrue(results.size() == 1);
        assertTrue(results.iterator().next().equals("set"));
       
        qrm.put("errorValidate", "no");
        
        assertTrue(qrm.get("errorValidate").isEmpty());
        
        qrm.put("errorPut", "no");
        
        assertTrue(qrm.get("errorPut").isEmpty());
    }
    
    @Test
    public void QRMPutAllMapSetterTest() {
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        Multimap<String, String> map = HashMultimap.create();
        map.put("t", "g");
        map.put("1", "k2");
        
        qrm.putAll(map);
        
        assertTrue(qrm.containsEntry("t", "g"));
        assertTrue(qrm.containsEntry("1", "k2"));
    }
    
    @Test
    public void QRMRemoveSetterTest() {
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        qrm.remove("1", "k1");
        
        assertFalse(qrm.containsEntry("1", "k1"));
    }
    
    @Test
    public void QRMRemoveAllSetterTest() {
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        qrm.removeAll("k2");
        
        assertTrue(qrm.get("k2").isEmpty());
    }

    @Test
    public void QRMClearSetterTest() {
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        qrm.clear();
        
        assertTrue(qrm.isEmpty());
    }

    @Test
    public void QRMReplaceValuesSetterTest() {
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        qrm.replaceValues("1", Lists.newArrayList("k1", "k2"));
    }
    
    public Map<String, String> testMap(){
        if(testMap == null) {
            testMap = new HashMap<String, String>();
            
            testMap.put("1", "k1");
            testMap.put("2", "k2");
            testMap.put("3", "k3");
            testMap.put("4", "k4");
            testMap.put("5", "k5");
            testMap.put("6", "k6");
            testMap.put("7", "k7");
            testMap.put("8", "k8");
        }
        return testMap;
    }
}
