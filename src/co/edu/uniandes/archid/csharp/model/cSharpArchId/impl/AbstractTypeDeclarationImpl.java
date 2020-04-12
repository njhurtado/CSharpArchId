/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId.impl;

import co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.BodyDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Comment;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractTypeDeclarationImpl#getCommentsBeforeBody <em>Comments Before Body</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractTypeDeclarationImpl#getCommentsAfterBody <em>Comments After Body</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractTypeDeclarationImpl#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractTypeDeclarationImpl#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTypeDeclarationImpl extends TypeImpl implements AbstractTypeDeclaration {
	/**
	 * The cached value of the '{@link #getCommentsBeforeBody() <em>Comments Before Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsBeforeBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> commentsBeforeBody;

	/**
	 * The cached value of the '{@link #getCommentsAfterBody() <em>Comments After Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsAfterBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> commentsAfterBody;

	/**
	 * The cached value of the '{@link #getBodyDeclarations() <em>Body Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyDeclaration> bodyDeclarations;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected Modifier modifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSharpArchIdPackage.Literals.ABSTRACT_TYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getCommentsBeforeBody() {
		if (commentsBeforeBody == null) {
			commentsBeforeBody = new EObjectContainmentEList<Comment>(Comment.class, this,
					CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY);
		}
		return commentsBeforeBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getCommentsAfterBody() {
		if (commentsAfterBody == null) {
			commentsAfterBody = new EObjectContainmentEList<Comment>(Comment.class, this,
					CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY);
		}
		return commentsAfterBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodyDeclaration> getBodyDeclarations() {
		if (bodyDeclarations == null) {
			bodyDeclarations = new EObjectContainmentEList<BodyDeclaration>(BodyDeclaration.class, this,
					CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS);
		}
		return bodyDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifier(Modifier newModifier, NotificationChain msgs) {
		Modifier oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__MODIFIER, oldModifier, newModifier);
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
	public void setModifier(Modifier newModifier) {
		if (newModifier != modifier) {
			NotificationChain msgs = null;
			if (modifier != null)
				msgs = ((InternalEObject) modifier).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__MODIFIER, null, msgs);
			if (newModifier != null)
				msgs = ((InternalEObject) newModifier).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__MODIFIER, null, msgs);
			msgs = basicSetModifier(newModifier, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__MODIFIER, newModifier, newModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY:
			return ((InternalEList<?>) getCommentsBeforeBody()).basicRemove(otherEnd, msgs);
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY:
			return ((InternalEList<?>) getCommentsAfterBody()).basicRemove(otherEnd, msgs);
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
			return ((InternalEList<?>) getBodyDeclarations()).basicRemove(otherEnd, msgs);
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__MODIFIER:
			return basicSetModifier(null, msgs);
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
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY:
			return getCommentsBeforeBody();
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY:
			return getCommentsAfterBody();
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
			return getBodyDeclarations();
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__MODIFIER:
			return getModifier();
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
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY:
			getCommentsBeforeBody().clear();
			getCommentsBeforeBody().addAll((Collection<? extends Comment>) newValue);
			return;
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY:
			getCommentsAfterBody().clear();
			getCommentsAfterBody().addAll((Collection<? extends Comment>) newValue);
			return;
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
			getBodyDeclarations().clear();
			getBodyDeclarations().addAll((Collection<? extends BodyDeclaration>) newValue);
			return;
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__MODIFIER:
			setModifier((Modifier) newValue);
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
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY:
			getCommentsBeforeBody().clear();
			return;
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY:
			getCommentsAfterBody().clear();
			return;
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
			getBodyDeclarations().clear();
			return;
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__MODIFIER:
			setModifier((Modifier) null);
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
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY:
			return commentsBeforeBody != null && !commentsBeforeBody.isEmpty();
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY:
			return commentsAfterBody != null && !commentsAfterBody.isEmpty();
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
			return bodyDeclarations != null && !bodyDeclarations.isEmpty();
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION__MODIFIER:
			return modifier != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractTypeDeclarationImpl
