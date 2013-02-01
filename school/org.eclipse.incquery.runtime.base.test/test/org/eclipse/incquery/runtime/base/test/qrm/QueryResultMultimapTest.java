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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
        
        qrm.remove("test", "set");
        results = qrm.get("test");
        assertTrue(results.isEmpty());
        
        qrm.put("errorValidate", "no");
        
        assertTrue(qrm.get("errorValidate").isEmpty());
        
        qrm.put("errorPut", "no");
        qrm.put("errorRemove", "x");
        
        assertTrue(qrm.get("errorPut").isEmpty());
        
        qrm.remove("errorRemove", "x");
        
        assertFalse(qrm.get("errorRemove").isEmpty());
        
        qrm.put("putMultiple", "v");
        
        assertTrue(qrm.get("putMultiple").size() == 2);
        
        qrm.put("putMultipleFalse", "v");
        
        assertTrue(qrm.get("putMultipleFalse").size() == 2);
        
        assertFalse(qrm.put("putLie", "s"));
        assertFalse(qrm.containsEntry("putLie", "s"));
        
        
        assertTrue(qrm.put("removeLie", "s"));
        assertFalse(qrm.remove("removeLie", "s"));
        assertTrue(qrm.containsEntry("removeLie", "s"));
        
        
    }
    
    @Test
    public void queryResultSetterExceptionTest() {
        
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        qrm.put("exceptionValidate", "no");
        
        assertTrue(qrm.get("exceptionValidate").isEmpty());
        
        qrm.put("exceptionPut", "no");
        qrm.put("exceptionRemove", "x");
        
        assertTrue(qrm.get("exceptionPut").isEmpty());
        
        qrm.remove("exceptionRemove", "x");
        
        assertFalse(qrm.get("exceptionRemove").isEmpty());
        
    }
    
    @Test
    public void QRMPutAllSetterTest() {
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        ArrayList<String> list = Lists.newArrayList("k1", "k2");
        assertTrue(qrm.putAll("t", list));
        
        Collection<String> results = qrm.get("t");
        assertTrue(results.size() == 2);
        
        for (String s : results) {
            assertTrue("Unexpected notification: "+ s, list.remove(s));
        }
        assertTrue("Cannot find notifications: " + list.toString(),list.isEmpty());
    }
    
    @Test
    public void QRMPutAllMapSetterTest() {
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        Multimap<String, String> map = HashMultimap.create();
        map.put("t", "g");
        map.put("1", "k2");
        
        assertTrue(qrm.putAll(map));
        
        assertTrue(qrm.containsEntry("t", "g"));
        assertTrue(qrm.containsEntry("1", "k2"));
    }
    
    @Test
    public void QRMRemoveSetterTest() {
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        assertTrue(qrm.remove("1", "k1"));
        
        assertFalse(qrm.containsEntry("1", "k1"));
        
        assertFalse(qrm.remove("nonExistentKey", "v"));
        
    }
    
    @Test
    public void QRMRemoveAllSetterTest() {
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        Collection<String> all = qrm.removeAll("2");
        assertTrue(all.size() == 1);
        assertTrue(all.iterator().next().equals("k2"));
        
        assertTrue(qrm.get("2").isEmpty());
        
        qrm.put("errorRemove", "v");
        assertTrue(qrm.removeAll("errorRemove").size() == 1);
    }

    @Test
    public void QRMClearSetterTest() {
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        qrm.clear();
        
        assertTrue(qrm.isEmpty());
        
        qrm.put("errorRemove", "r");
        qrm.put("errorRemove", "v");
        qrm.clear();
        
        assertFalse(qrm.isEmpty());
        
    }

    @Test
    public void QRMReplaceValuesSetterTest() {
        qrm.setQueryResultSetter(new QRMTestSetter(qrm));
        
        Collection<String> values = qrm.replaceValues("1", Lists.newArrayList("k2", "k3"));
        assertTrue(values.size() == 1);
        assertTrue(values.iterator().next().equals("k1"));
        
        assertTrue(qrm.replaceValues("errorPut", Lists.newArrayList("v1", "v2")).isEmpty());
        
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
