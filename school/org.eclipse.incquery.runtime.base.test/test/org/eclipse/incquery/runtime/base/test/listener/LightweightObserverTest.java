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
package org.eclipse.incquery.runtime.base.test.listener;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.incquery.runtime.base.api.LightweightEObjectObserver;
import org.eclipse.incquery.runtime.base.api.LightweightEObjectObserverAdapter;
import org.eclipse.incquery.runtime.base.test.util.ResourceAccess;

import school.SchoolPackage;

import com.google.common.collect.Sets;

/**
 * @author Abel Hegedus
 *
 */
public class LightweightObserverTest extends IncQueryBaseListenerTest {

    private LightweightEObjectObserver observer;
    private LightweightEObjectObserverAdapter adapter;
    private EStructuralFeature feature;
    
    /**
     * @param notifier
     */
    public LightweightObserverTest(Notifier notifier) {
        super(notifier, false);
        
        feature = SchoolPackage.eINSTANCE.getSchool_Courses();
        
        observer = new LightweightEObjectObserver() {

            @Override
            public void notifyFeatureChanged(EObject host, EStructuralFeature feature, Notification notification) {
                boolean courseAdded = host.equals(ResourceAccess.getFirstSchool()) && feature.equals(SchoolPackage.eINSTANCE.getSchool_Courses())
                        && newCourse.equals(notification.getNewValue());
                boolean courseRemoved = host.equals(ResourceAccess.getFirstSchool()) && feature.equals(SchoolPackage.eINSTANCE.getSchool_Courses())
                        && notification.getNewValue() == null;
                assertTrue(courseAdded || courseRemoved);
            }
        };
        
        adapter = new LightweightEObjectObserverAdapter(Sets.<EStructuralFeature>newHashSet(feature)) {
            
            @Override
            public void observedFeatureUpdate(EObject host, EStructuralFeature feature, Notification notification) {
                boolean courseAdded = host.equals(ResourceAccess.getFirstSchool()) && feature.equals(SchoolPackage.eINSTANCE.getSchool_Courses())
                        && newCourse.equals(notification.getNewValue());
                boolean courseRemoved = host.equals(ResourceAccess.getFirstSchool()) && feature.equals(SchoolPackage.eINSTANCE.getSchool_Courses())
                        && notification.getNewValue() == null;
                assertTrue(courseAdded || courseRemoved);
            }
        };
        // TODO test multiple observers added to same listener
    }

    @Override
    public void registerListener() {
        navigationHelper.addLightweightEObjectObserver(observer, ResourceAccess.getFirstSchool());
        navigationHelper.addLightweightEObjectObserver(adapter, ResourceAccess.getFirstSchool());
        navigationHelper.addLightweightEObjectObserver(observer, ResourceAccess.getSecondSchool());
        navigationHelper.addLightweightEObjectObserver(adapter, ResourceAccess.getSecondSchool());
    }

    @Override
    public void unregisterListener() {
        navigationHelper.removeLightweightEObjectObserver(observer, ResourceAccess.getFirstSchool());
        navigationHelper.removeLightweightEObjectObserver(adapter, ResourceAccess.getFirstSchool());
        navigationHelper.removeLightweightEObjectObserver(observer, ResourceAccess.getSecondSchool());
        navigationHelper.removeLightweightEObjectObserver(adapter, ResourceAccess.getSecondSchool());
    }

}
