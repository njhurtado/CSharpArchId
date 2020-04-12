/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId.impl;

import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassInstanceCreation;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Expresion;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeAcces;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Instance Creation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ClassInstanceCreationImpl#getType <em>Type</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ClassInstanceCreationImpl#getExpresion <em>Expresion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassInstanceCreationImpl extends AbstractMethodInvocationImpl implements ClassInstanceCreation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeAcces type;

	/**
	 * The cached value of the '{@link #getExpresion() <em>Expresion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpresion()
	 * @generated
	 * @ordered
	 */
	protected Expresion expresion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassInstanceCreationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSharpArchIdPackage.Literals.CLASS_INSTANCE_CREATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAcces getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeAcces newType, NotificationChain msgs) {
		TypeAcces oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CSharpArchIdPackage.CLASS_INSTANCE_CREATION__TYPE, oldType, newType);
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
	public void setType(TypeAcces newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.CLASS_INSTANCE_CREATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.CLASS_INSTANCE_CREATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpArchIdPackage.CLASS_INSTANCE_CREATION__TYPE,
					newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expresion getExpresion() {
		return expresion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpresion(Expresion newExpresion, NotificationChain msgs) {
		Expresion oldExpresion = expresion;
		expresion = newExpresion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CSharpArchIdPackage.CLASS_INSTANCE_CREATION__EXPRESION, oldExpresion, newExpresion);
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
	public void setExpresion(Expresion newExpresion) {
		if (newExpresion != expresion) {
			NotificationChain msgs = null;
			if (expresion != null)
				msgs = ((InternalEObject) expresion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.CLASS_INSTANCE_CREATION__EXPRESION, null, msgs);
			if (newExpresion != null)
				msgs = ((InternalEObject) newExpresion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.CLASS_INSTANCE_CREATION__EXPRESION, null, msgs);
			msgs = basicSetExpresion(newExpresion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CSharpArchIdPackage.CLASS_INSTANCE_CREATION__EXPRESION, newExpresion, newExpresion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CSharpArchIdPackage.CLASS_INSTANCE_CREATION__TYPE:
			return basicSetType(null, msgs);
		case CSharpArchIdPackage.CLASS_INSTANCE_CREATION__EXPRESION:
			return basicSetExpresion(null, msgs);
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
		case CSharpArchIdPackage.CLASS_INSTANCE_CREATION__TYPE:
			return getType();
		case CSharpArchIdPackage.CLASS_INSTANCE_CREATION__EXPRESION:
			return getExpresion();
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
		case CSharpArchIdPackage.CLASS_INSTANCE_CREATION__TYPE:
			setType((TypeAcces) newValue);
			return;
		case CSharpArchIdPackage.CLASS_INSTANCE_CREATION__EXPRESION:
			setExpresion((Expresion) newValue);
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
		case CSharpArchIdPackage.CLASS_INSTANCE_CREATION__TYPE:
			setType((TypeAcces) null);
			return;
		case CSharpArchIdPackage.CLASS_INSTANCE_CREATION__EXPRESION:
			setExpresion((Expresion) null);
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
		case CSharpArchIdPackage.CLASS_INSTANCE_CREATION__TYPE:
			return type != null;
		case CSharpArchIdPackage.CLASS_INSTANCE_CREATION__EXPRESION:
			return expresion != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassInstanceCreationImpl
