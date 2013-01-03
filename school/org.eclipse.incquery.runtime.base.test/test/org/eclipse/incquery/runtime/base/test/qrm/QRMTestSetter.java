/*******************************************************************************
 * Copyright (c) 2010-2013, Abel Hegedus, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Abel Hegedus - initial API and implementation
 *******************************************************************************/
package org.eclipse.incquery.runtime.base.test.qrm;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.incquery.runtime.base.api.IQueryResultSetter;

/**
 * @author Abel Hegedus
 *
 */
final class QRMTestSetter implements IQueryResultSetter<String, String> {
    
    TestQRM testQrm;
    TestQRMap testQrMap;
        
    /**
     * 
     */
    public QRMTestSetter(TestQRM tqrm) {
        testQrm = tqrm;
    }

    public QRMTestSetter(TestQRMap tqrm) {
        testQrMap = tqrm;
    }
    
    @Override
    public boolean validate(String key, String value) {
        if(key.isEmpty() || value.isEmpty()) {
            return false;
        }
        if(key.equals("errorValidate")) {
            return false;
        }
        if(key.equals("exceptionValidate")) {
            throw new UnsupportedOperationException();
        }
        return true;
    }

    @Override
    public boolean remove(String key, String value) {
        if(key.equals("errorRemove")) {
            return false;
        }
        if(key.equals("removeLie")) {
            return true;
        }
        if(key.equals("exceptionRemove")) {
            throw new UnsupportedOperationException();
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put(key, value);
        if(testQrm != null) {
            testQrm.testInternalRemove(map);
            if(testQrm.containsEntry(key, value)) {
                return false;
            }
        } else {
            testQrMap.testInternalRemove(map);
            if(testQrMap.get(key).equals(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean put(String key, String value) {
        if(key.equals("errorPut")) {
            return false;
        }
        if(key.equals("putLie")) {
            return true;
        }
        if(key.equals("exceptionPut")) {
            throw new UnsupportedOperationException();
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put(key, value);
        if(testQrm != null) {
            testQrm.testInternalPut(map);
            if(key.equals("putMultiple")) {
                map.put(key, value+".");
                testQrm.testInternalPut(map);
                return true;
            }
            if(key.equals("putMultipleFalse")) {
                map.put(key, value+".");
                testQrm.testInternalPut(map);
                return false;
            }
            if(!testQrm.containsEntry(key, value)) {
                return false;
            }
        } else {
            testQrMap.testInternalPut(map);
            if(key.equals("putMultiple")) {
                map.put(key, value+".");
                testQrMap.testInternalPut(map);
                return true;
            }
            if(key.equals("putMultipleFalse")) {
                map.put(key, value+".");
                testQrMap.testInternalPut(map);
                return false;
            }
            if(!testQrMap.get(key).equals(value)) {
                return false;
            }
        }
        return true;
    }
}