/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId.impl;

import co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Block;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Type;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeAcces;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeParameter;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.VariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodDeclarationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodDeclarationImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodDeclarationImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractMethodDeclarationImpl extends BodyDeclarationImpl implements AbstractMethodDeclaration {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Block body;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> parameters;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getThrownExceptions() <em>Thrown Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAcces> thrownExceptions;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMethodDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSharpArchIdPackage.Literals.ABSTRACT_METHOD_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		Block oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__BODY, oldBody, newBody);
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
	public void setBody(Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__BODY,
					newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<VariableDeclaration>(VariableDeclaration.class, this,
					CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS,
					CSharpArchIdPackage.VARIABLE_DECLARATION__METHOD_DECLARATION);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<TypeParameter>(TypeParameter.class, this,
					CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAcces> getThrownExceptions() {
		if (thrownExceptions == null) {
			thrownExceptions = new EObjectContainmentEList<TypeAcces>(TypeAcces.class, this,
					CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS);
		}
		return thrownExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(Type newReturnType, NotificationChain msgs) {
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE, oldReturnType, newReturnType);
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
	public void setReturnType(Type newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject) returnType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE, null,
						msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject) newReturnType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE, null,
						msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParameters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__BODY:
			return basicSetBody(null, msgs);
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
			return ((InternalEList<?>) getTypeParameters()).basicRemove(otherEnd, msgs);
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
			return ((InternalEList<?>) getThrownExceptions()).basicRemove(otherEnd, msgs);
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE:
			return basicSetReturnType(null, msgs);
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
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__BODY:
			return getBody();
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
			return getParameters();
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
			return getTypeParameters();
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
			return getThrownExceptions();
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE:
			return getReturnType();
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
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__BODY:
			setBody((Block) newValue);
			return;
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends VariableDeclaration>) newValue);
			return;
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
			getTypeParameters().clear();
			getTypeParameters().addAll((Collection<? extends TypeParameter>) newValue);
			return;
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
			getThrownExceptions().clear();
			getThrownExceptions().addAll((Collection<? extends TypeAcces>) newValue);
			return;
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE:
			setReturnType((Type) newValue);
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
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__BODY:
			setBody((Block) null);
			return;
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
			getParameters().clear();
			return;
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
			getTypeParameters().clear();
			return;
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
			getThrownExceptions().clear();
			return;
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE:
			setReturnType((Type) null);
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
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__BODY:
			return body != null;
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
			return typeParameters != null && !typeParameters.isEmpty();
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
			return thrownExceptions != null && !thrownExceptions.isEmpty();
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE:
			return returnType != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractMethodDeclarationImpl
