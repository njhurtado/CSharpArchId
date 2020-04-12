/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId.impl;

import co.edu.uniandes.archid.csharp.model.cSharpArchId.Annotation;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.BodyDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.InheritanceKind;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ModifierKind;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.VisibilityKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModifierImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModifierImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModifierImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModifierImpl#getBodyDeclaration <em>Body Declaration</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModifierImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModifierImpl#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifierImpl extends ASTNodeImpl implements Modifier {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.NONE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected static final InheritanceKind INHERITANCE_EDEFAULT = InheritanceKind.NONE;

	/**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected InheritanceKind inheritance = INHERITANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected static final ModifierKind MODIFIER_EDEFAULT = ModifierKind.STATIC;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected ModifierKind modifier = MODIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSharpArchIdPackage.Literals.MODIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpArchIdPackage.MODIFIER__VISIBILITY,
					oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceKind getInheritance() {
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritance(InheritanceKind newInheritance) {
		InheritanceKind oldInheritance = inheritance;
		inheritance = newInheritance == null ? INHERITANCE_EDEFAULT : newInheritance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpArchIdPackage.MODIFIER__INHERITANCE,
					oldInheritance, inheritance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpArchIdPackage.MODIFIER__STATIC, oldStatic,
					static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyDeclaration getBodyDeclaration() {
		if (eContainerFeatureID() != CSharpArchIdPackage.MODIFIER__BODY_DECLARATION)
			return null;
		return (BodyDeclaration) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyDeclaration(BodyDeclaration newBodyDeclaration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newBodyDeclaration, CSharpArchIdPackage.MODIFIER__BODY_DECLARATION,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyDeclaration(BodyDeclaration newBodyDeclaration) {
		if (newBodyDeclaration != eInternalContainer()
				|| (eContainerFeatureID() != CSharpArchIdPackage.MODIFIER__BODY_DECLARATION
						&& newBodyDeclaration != null)) {
			if (EcoreUtil.isAncestor(this, newBodyDeclaration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBodyDeclaration != null)
				msgs = ((InternalEObject) newBodyDeclaration).eInverseAdd(this,
						CSharpArchIdPackage.BODY_DECLARATION__MODIFIER, BodyDeclaration.class, msgs);
			msgs = basicSetBodyDeclaration(newBodyDeclaration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpArchIdPackage.MODIFIER__BODY_DECLARATION,
					newBodyDeclaration, newBodyDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this,
					CSharpArchIdPackage.MODIFIER__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifierKind getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(ModifierKind newModifier) {
		ModifierKind oldModifier = modifier;
		modifier = newModifier == null ? MODIFIER_EDEFAULT : newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpArchIdPackage.MODIFIER__MODIFIER, oldModifier,
					modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CSharpArchIdPackage.MODIFIER__BODY_DECLARATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetBodyDeclaration((BodyDeclaration) otherEnd, msgs);
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
		case CSharpArchIdPackage.MODIFIER__BODY_DECLARATION:
			return basicSetBodyDeclaration(null, msgs);
		case CSharpArchIdPackage.MODIFIER__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CSharpArchIdPackage.MODIFIER__BODY_DECLARATION:
			return eInternalContainer().eInverseRemove(this, CSharpArchIdPackage.BODY_DECLARATION__MODIFIER,
					BodyDeclaration.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CSharpArchIdPackage.MODIFIER__VISIBILITY:
			return getVisibility();
		case CSharpArchIdPackage.MODIFIER__INHERITANCE:
			return getInheritance();
		case CSharpArchIdPackage.MODIFIER__STATIC:
			return isStatic();
		case CSharpArchIdPackage.MODIFIER__BODY_DECLARATION:
			return getBodyDeclaration();
		case CSharpArchIdPackage.MODIFIER__ANNOTATIONS:
			return getAnnotations();
		case CSharpArchIdPackage.MODIFIER__MODIFIER:
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
		case CSharpArchIdPackage.MODIFIER__VISIBILITY:
			setVisibility((VisibilityKind) newValue);
			return;
		case CSharpArchIdPackage.MODIFIER__INHERITANCE:
			setInheritance((InheritanceKind) newValue);
			return;
		case CSharpArchIdPackage.MODIFIER__STATIC:
			setStatic((Boolean) newValue);
			return;
		case CSharpArchIdPackage.MODIFIER__BODY_DECLARATION:
			setBodyDeclaration((BodyDeclaration) newValue);
			return;
		case CSharpArchIdPackage.MODIFIER__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection<? extends Annotation>) newValue);
			return;
		case CSharpArchIdPackage.MODIFIER__MODIFIER:
			setModifier((ModifierKind) newValue);
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
		case CSharpArchIdPackage.MODIFIER__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case CSharpArchIdPackage.MODIFIER__INHERITANCE:
			setInheritance(INHERITANCE_EDEFAULT);
			return;
		case CSharpArchIdPackage.MODIFIER__STATIC:
			setStatic(STATIC_EDEFAULT);
			return;
		case CSharpArchIdPackage.MODIFIER__BODY_DECLARATION:
			setBodyDeclaration((BodyDeclaration) null);
			return;
		case CSharpArchIdPackage.MODIFIER__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case CSharpArchIdPackage.MODIFIER__MODIFIER:
			setModifier(MODIFIER_EDEFAULT);
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
		case CSharpArchIdPackage.MODIFIER__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case CSharpArchIdPackage.MODIFIER__INHERITANCE:
			return inheritance != INHERITANCE_EDEFAULT;
		case CSharpArchIdPackage.MODIFIER__STATIC:
			return static_ != STATIC_EDEFAULT;
		case CSharpArchIdPackage.MODIFIER__BODY_DECLARATION:
			return getBodyDeclaration() != null;
		case CSharpArchIdPackage.MODIFIER__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case CSharpArchIdPackage.MODIFIER__MODIFIER:
			return modifier != MODIFIER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", inheritance: ");
		result.append(inheritance);
		result.append(", static: ");
		result.append(static_);
		result.append(", modifier: ");
		result.append(modifier);
		result.append(')');
		return result.toString();
	}

} //ModifierImpl
