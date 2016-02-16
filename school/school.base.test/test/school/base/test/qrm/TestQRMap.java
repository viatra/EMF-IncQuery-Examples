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
package school.base.test.qrm;

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.base.api.QueryResultMap;

/**
 * @author Abel Hegedus
 *
 */
public class TestQRMap extends QueryResultMap<String, String> {

    /**
     * @param logger
     */
    protected TestQRMap(Logger logger) {
        super(logger);
        // TODO Auto-generated constructor stub
    }

    public TestQRMap() {
        this(Logger.getLogger("QRMTestLogger"));        
    }
    
    public void testInternalPut(Map<String, String> input) {
        
        Map<String, String> cache2 = getCache();
        Logger logger2 = getLogger();
        logger2.info("Test");
        setCache(cache2);
        
        if(input != null) {
            for (Entry<String, String> entry : input.entrySet()) {
                internalPut(entry.getKey(), entry.getValue());
            }
        }
        
    }
    
    public void testInternalRemove(Map<String, String> input) {
        
        if(input != null) {
            for(Entry<String, String> entry : input.entrySet()) {
                internalRemove(entry.getKey(), entry.getValue());
            }
        }
        
    }
    
    
    
}
