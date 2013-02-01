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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.incquery.runtime.base.api.IQueryResultUpdateListener;

/**
 * @author Abel Hegedus
 *
 */
final class QRMTestListener implements IQueryResultUpdateListener<String, String> {
    
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