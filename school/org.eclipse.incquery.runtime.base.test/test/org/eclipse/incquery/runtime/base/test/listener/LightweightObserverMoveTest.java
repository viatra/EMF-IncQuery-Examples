package org.eclipse.incquery.runtime.base.test.listener;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.incquery.runtime.base.api.LightweightEObjectObserver;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseParameterizedTest;
import org.eclipse.incquery.runtime.base.test.util.ModelManager;
import org.junit.Assert;
import org.junit.Test;

import school.Course;
import school.School;
import school.SchoolPackage;

public class LightweightObserverMoveTest extends IncQueryBaseParameterizedTest {

    private LightweightEObjectObserver observer;
    private EReference coursesFeature;
    private School school;
    private boolean courseMoved;

    public LightweightObserverMoveTest(Notifier notifier) {
        super(notifier, false, false);
        
        school = (School) ModelManager.getModel().getResources().get(0).getContents().get(0);
        coursesFeature = SchoolPackage.eINSTANCE.getSchool_Courses();
        observer = new LightweightEObjectObserver() {


            @Override
            public void notifyFeatureChanged(EObject host, EStructuralFeature feature, Notification notification) {
                courseMoved = (notification.getEventType() == Notification.MOVE) && notification.getFeature().equals(coursesFeature);
                assertTrue(courseMoved);
            }
        };
    }
    
    /**
     * Subclasses should handle listener registration in this method. 
     * This method will be called before the model manipulations.
     */
    public void registerListener(){
        navigationHelper.addLightweightEObjectObserver(observer, school);
    };
    
    /**
     * Subclasses should handle listener unregistration in this method. 
     * This method will be called before the model is changed back to its original state.
     * The listeners will not be notified about the {@link Course} removal. 
     */
    public void unregisterListener(){
        navigationHelper.removeLightweightEObjectObserver(observer, school);
    };

    /**
     * Stub of the listener based tests. 
     */
    @Test
    public void listenerBasedTest() {       
        registerListener();
        
        final Command command = new RecordingCommand(ModelManager.demandCreateTransactionalEditingDomain(notifier)) {
            @Override
            protected void doExecute() {
                try {
                    EObject firstSchool = ModelManager.getModel().getResources().get(0).getContents().get(0);
                    
                    EList<Course> courses = ((School) firstSchool).getCourses();
                    int size = courses.size();
                    courses.move(0, size-1);
                } catch (RuntimeException ex) {
                    Assert.fail("Exception: " + ex.getMessage());
                    throw ex;
                }
            }
        };
        try {
            ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().execute(command);
            Assert.assertTrue(courseMoved);
        }
        finally {
            ModelManager.demandCreateTransactionalEditingDomain(notifier).getCommandStack().undo();
            unregisterListener();
        }
    }
}
