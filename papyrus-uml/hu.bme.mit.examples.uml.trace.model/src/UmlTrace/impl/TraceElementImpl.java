/**
 */
package UmlTrace.impl;

import UmlTrace.TraceElement;
import UmlTrace.UmlTracePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UmlTrace.impl.TraceElementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link UmlTrace.impl.TraceElementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link UmlTrace.impl.TraceElementImpl#getInheritedSource <em>Inherited Source</em>}</li>
 *   <li>{@link UmlTrace.impl.TraceElementImpl#getInheritedTarget <em>Inherited Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceElementImpl extends EObjectImpl implements TraceElement {
    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected org.eclipse.uml2.uml.Class source;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected org.eclipse.uml2.uml.Class target;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TraceElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlTracePackage.Literals.TRACE_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Class getSource() {
        if (source != null && source.eIsProxy()) {
            InternalEObject oldSource = (InternalEObject)source;
            source = (org.eclipse.uml2.uml.Class)eResolveProxy(oldSource);
            if (source != oldSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlTracePackage.TRACE_ELEMENT__SOURCE, oldSource, source));
            }
        }
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Class basicGetSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(org.eclipse.uml2.uml.Class newSource) {
        org.eclipse.uml2.uml.Class oldSource = source;
        source = newSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlTracePackage.TRACE_ELEMENT__SOURCE, oldSource, source));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Class getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (org.eclipse.uml2.uml.Class)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlTracePackage.TRACE_ELEMENT__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Class basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(org.eclipse.uml2.uml.Class newTarget) {
        org.eclipse.uml2.uml.Class oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlTracePackage.TRACE_ELEMENT__TARGET, oldTarget, target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<org.eclipse.uml2.uml.Class> getInheritedSource() {
        // TODO: implement this method to return the 'Inherited Source' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<org.eclipse.uml2.uml.Class> getInheritedTarget() {
        // TODO: implement this method to return the 'Inherited Target' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlTracePackage.TRACE_ELEMENT__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case UmlTracePackage.TRACE_ELEMENT__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
            case UmlTracePackage.TRACE_ELEMENT__INHERITED_SOURCE:
                return getInheritedSource();
            case UmlTracePackage.TRACE_ELEMENT__INHERITED_TARGET:
                return getInheritedTarget();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UmlTracePackage.TRACE_ELEMENT__SOURCE:
                setSource((org.eclipse.uml2.uml.Class)newValue);
                return;
            case UmlTracePackage.TRACE_ELEMENT__TARGET:
                setTarget((org.eclipse.uml2.uml.Class)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case UmlTracePackage.TRACE_ELEMENT__SOURCE:
                setSource((org.eclipse.uml2.uml.Class)null);
                return;
            case UmlTracePackage.TRACE_ELEMENT__TARGET:
                setTarget((org.eclipse.uml2.uml.Class)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case UmlTracePackage.TRACE_ELEMENT__SOURCE:
                return source != null;
            case UmlTracePackage.TRACE_ELEMENT__TARGET:
                return target != null;
            case UmlTracePackage.TRACE_ELEMENT__INHERITED_SOURCE:
                return !getInheritedSource().isEmpty();
            case UmlTracePackage.TRACE_ELEMENT__INHERITED_TARGET:
                return !getInheritedTarget().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TraceElementImpl
