/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId.impl;

import co.edu.uniandes.archid.csharp.model.cSharpArchId.Annotation;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeAcces;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AnnotationImpl#getTypeacces <em>Typeacces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends ExpresionImpl implements Annotation {
	/**
	 * The cached value of the '{@link #getTypeacces() <em>Typeacces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeacces()
	 * @generated
	 * @ordered
	 */
	protected TypeAcces typeacces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSharpArchIdPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAcces getTypeacces() {
		return typeacces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeacces(TypeAcces newTypeacces, NotificationChain msgs) {
		TypeAcces oldTypeacces = typeacces;
		typeacces = newTypeacces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CSharpArchIdPackage.ANNOTATION__TYPEACCES, oldTypeacces, newTypeacces);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeacces(TypeAcces newTypeacces) {
		if (newTypeacces != typeacces) {
			NotificationChain msgs = null;
			if (typeacces != null)
				msgs = ((InternalEObject) typeacces).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.ANNOTATION__TYPEACCES, null, msgs);
			if (newTypeacces != null)
				msgs = ((InternalEObject) newTypeacces).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.ANNOTATION__TYPEACCES, null, msgs);
			msgs = basicSetTypeacces(newTypeacces, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpArchIdPackage.ANNOTATION__TYPEACCES,
					newTypeacces, newTypeacces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CSharpArchIdPackage.ANNOTATION__TYPEACCES:
			return basicSetTypeacces(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CSharpArchIdPackage.ANNOTATION__TYPEACCES:
			return getTypeacces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CSharpArchIdPackage.ANNOTATION__TYPEACCES:
			setTypeacces((TypeAcces) newValue);
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
		case CSharpArchIdPackage.ANNOTATION__TYPEACCES:
			setTypeacces((TypeAcces) null);
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
		case CSharpArchIdPackage.ANNOTATION__TYPEACCES:
			return typeacces != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationImpl
