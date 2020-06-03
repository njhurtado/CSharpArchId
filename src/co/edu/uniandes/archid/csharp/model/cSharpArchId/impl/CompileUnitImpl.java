/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId.impl;

import co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Comment;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.NamedElement;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Namespace;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.UsingDeclaration;

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
 * An implementation of the model object '<em><b>Compile Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CompileUnitImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CompileUnitImpl#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CompileUnitImpl#getCommentList <em>Comment List</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CompileUnitImpl#getTypeDeclaration <em>Type Declaration</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CompileUnitImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CompileUnitImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CompileUnitImpl#getNamspace <em>Namspace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompileUnitImpl extends NamedElementImpl implements CompileUnit {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> elements;

	/**
	 * The default value of the '{@link #getOriginalFilePath() <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalFilePath() <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFilePath()
	 * @generated
	 * @ordered
	 */
	protected String originalFilePath = ORIGINAL_FILE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommentList() <em>Comment List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentList()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> commentList;

	/**
	 * The cached value of the '{@link #getTypeDeclaration() <em>Type Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeDeclaration typeDeclaration;

	/**
	 * The cached value of the '{@link #getUsings() <em>Usings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsings()
	 * @generated
	 * @ordered
	 */
	protected EList<UsingDeclaration> usings;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace namespace;

	/**
	 * The default value of the '{@link #getNamspace() <em>Namspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamspace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamspace() <em>Namspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamspace()
	 * @generated
	 * @ordered
	 */
	protected String namspace = NAMSPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompileUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSharpArchIdPackage.Literals.COMPILE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<NamedElement>(NamedElement.class, this,
					CSharpArchIdPackage.COMPILE_UNIT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalFilePath() {
		return originalFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalFilePath(String newOriginalFilePath) {
		String oldOriginalFilePath = originalFilePath;
		originalFilePath = newOriginalFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpArchIdPackage.COMPILE_UNIT__ORIGINAL_FILE_PATH,
					oldOriginalFilePath, originalFilePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getCommentList() {
		if (commentList == null) {
			commentList = new EObjectContainmentEList<Comment>(Comment.class, this,
					CSharpArchIdPackage.COMPILE_UNIT__COMMENT_LIST);
		}
		return commentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration getTypeDeclaration() {
		if (typeDeclaration != null && typeDeclaration.eIsProxy()) {
			InternalEObject oldTypeDeclaration = (InternalEObject) typeDeclaration;
			typeDeclaration = (AbstractTypeDeclaration) eResolveProxy(oldTypeDeclaration);
			if (typeDeclaration != oldTypeDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CSharpArchIdPackage.COMPILE_UNIT__TYPE_DECLARATION, oldTypeDeclaration, typeDeclaration));
			}
		}
		return typeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration basicGetTypeDeclaration() {
		return typeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDeclaration(AbstractTypeDeclaration newTypeDeclaration) {
		AbstractTypeDeclaration oldTypeDeclaration = typeDeclaration;
		typeDeclaration = newTypeDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpArchIdPackage.COMPILE_UNIT__TYPE_DECLARATION,
					oldTypeDeclaration, typeDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsingDeclaration> getUsings() {
		if (usings == null) {
			usings = new EObjectContainmentEList<UsingDeclaration>(UsingDeclaration.class, this,
					CSharpArchIdPackage.COMPILE_UNIT__USINGS);
		}
		return usings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs) {
		Namespace oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CSharpArchIdPackage.COMPILE_UNIT__NAMESPACE, oldNamespace, newNamespace);
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
	public void setNamespace(Namespace newNamespace) {
		if (newNamespace != namespace) {
			NotificationChain msgs = null;
			if (namespace != null)
				msgs = ((InternalEObject) namespace).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.COMPILE_UNIT__NAMESPACE, null, msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject) newNamespace).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CSharpArchIdPackage.COMPILE_UNIT__NAMESPACE, null, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpArchIdPackage.COMPILE_UNIT__NAMESPACE,
					newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamspace() {
		return namspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamspace(String newNamspace) {
		String oldNamspace = namspace;
		namspace = newNamspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpArchIdPackage.COMPILE_UNIT__NAMSPACE,
					oldNamspace, namspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CSharpArchIdPackage.COMPILE_UNIT__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case CSharpArchIdPackage.COMPILE_UNIT__COMMENT_LIST:
			return ((InternalEList<?>) getCommentList()).basicRemove(otherEnd, msgs);
		case CSharpArchIdPackage.COMPILE_UNIT__USINGS:
			return ((InternalEList<?>) getUsings()).basicRemove(otherEnd, msgs);
		case CSharpArchIdPackage.COMPILE_UNIT__NAMESPACE:
			return basicSetNamespace(null, msgs);
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
		case CSharpArchIdPackage.COMPILE_UNIT__ELEMENTS:
			return getElements();
		case CSharpArchIdPackage.COMPILE_UNIT__ORIGINAL_FILE_PATH:
			return getOriginalFilePath();
		case CSharpArchIdPackage.COMPILE_UNIT__COMMENT_LIST:
			return getCommentList();
		case CSharpArchIdPackage.COMPILE_UNIT__TYPE_DECLARATION:
			if (resolve)
				return getTypeDeclaration();
			return basicGetTypeDeclaration();
		case CSharpArchIdPackage.COMPILE_UNIT__USINGS:
			return getUsings();
		case CSharpArchIdPackage.COMPILE_UNIT__NAMESPACE:
			return getNamespace();
		case CSharpArchIdPackage.COMPILE_UNIT__NAMSPACE:
			return getNamspace();
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
		case CSharpArchIdPackage.COMPILE_UNIT__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends NamedElement>) newValue);
			return;
		case CSharpArchIdPackage.COMPILE_UNIT__ORIGINAL_FILE_PATH:
			setOriginalFilePath((String) newValue);
			return;
		case CSharpArchIdPackage.COMPILE_UNIT__COMMENT_LIST:
			getCommentList().clear();
			getCommentList().addAll((Collection<? extends Comment>) newValue);
			return;
		case CSharpArchIdPackage.COMPILE_UNIT__TYPE_DECLARATION:
			setTypeDeclaration((AbstractTypeDeclaration) newValue);
			return;
		case CSharpArchIdPackage.COMPILE_UNIT__USINGS:
			getUsings().clear();
			getUsings().addAll((Collection<? extends UsingDeclaration>) newValue);
			return;
		case CSharpArchIdPackage.COMPILE_UNIT__NAMESPACE:
			setNamespace((Namespace) newValue);
			return;
		case CSharpArchIdPackage.COMPILE_UNIT__NAMSPACE:
			setNamspace((String) newValue);
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
		case CSharpArchIdPackage.COMPILE_UNIT__ELEMENTS:
			getElements().clear();
			return;
		case CSharpArchIdPackage.COMPILE_UNIT__ORIGINAL_FILE_PATH:
			setOriginalFilePath(ORIGINAL_FILE_PATH_EDEFAULT);
			return;
		case CSharpArchIdPackage.COMPILE_UNIT__COMMENT_LIST:
			getCommentList().clear();
			return;
		case CSharpArchIdPackage.COMPILE_UNIT__TYPE_DECLARATION:
			setTypeDeclaration((AbstractTypeDeclaration) null);
			return;
		case CSharpArchIdPackage.COMPILE_UNIT__USINGS:
			getUsings().clear();
			return;
		case CSharpArchIdPackage.COMPILE_UNIT__NAMESPACE:
			setNamespace((Namespace) null);
			return;
		case CSharpArchIdPackage.COMPILE_UNIT__NAMSPACE:
			setNamspace(NAMSPACE_EDEFAULT);
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
		case CSharpArchIdPackage.COMPILE_UNIT__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case CSharpArchIdPackage.COMPILE_UNIT__ORIGINAL_FILE_PATH:
			return ORIGINAL_FILE_PATH_EDEFAULT == null ? originalFilePath != null
					: !ORIGINAL_FILE_PATH_EDEFAULT.equals(originalFilePath);
		case CSharpArchIdPackage.COMPILE_UNIT__COMMENT_LIST:
			return commentList != null && !commentList.isEmpty();
		case CSharpArchIdPackage.COMPILE_UNIT__TYPE_DECLARATION:
			return typeDeclaration != null;
		case CSharpArchIdPackage.COMPILE_UNIT__USINGS:
			return usings != null && !usings.isEmpty();
		case CSharpArchIdPackage.COMPILE_UNIT__NAMESPACE:
			return namespace != null;
		case CSharpArchIdPackage.COMPILE_UNIT__NAMSPACE:
			return NAMSPACE_EDEFAULT == null ? namspace != null : !NAMSPACE_EDEFAULT.equals(namspace);
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
		result.append(" (originalFilePath: ");
		result.append(originalFilePath);
		result.append(", namspace: ");
		result.append(namspace);
		result.append(')');
		return result.toString();
	}

} //CompileUnitImpl
