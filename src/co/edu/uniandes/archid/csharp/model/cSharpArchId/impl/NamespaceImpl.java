/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId.impl;

import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Enumeration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Namespace;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.NamespaceImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.NamespaceImpl#getEnumerations <em>Enumerations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImpl extends NamedElementImpl implements Namespace {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDeclaration> classes;

	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> enumerations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSharpArchIdPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassDeclaration> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<ClassDeclaration>(ClassDeclaration.class, this,
					CSharpArchIdPackage.NAMESPACE__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumeration> getEnumerations() {
		if (enumerations == null) {
			enumerations = new EObjectContainmentEList<Enumeration>(Enumeration.class, this,
					CSharpArchIdPackage.NAMESPACE__ENUMERATIONS);
		}
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CSharpArchIdPackage.NAMESPACE__CLASSES:
			return ((InternalEList<?>) getClasses()).basicRemove(otherEnd, msgs);
		case CSharpArchIdPackage.NAMESPACE__ENUMERATIONS:
			return ((InternalEList<?>) getEnumerations()).basicRemove(otherEnd, msgs);
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
		case CSharpArchIdPackage.NAMESPACE__CLASSES:
			return getClasses();
		case CSharpArchIdPackage.NAMESPACE__ENUMERATIONS:
			return getEnumerations();
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
		case CSharpArchIdPackage.NAMESPACE__CLASSES:
			getClasses().clear();
			getClasses().addAll((Collection<? extends ClassDeclaration>) newValue);
			return;
		case CSharpArchIdPackage.NAMESPACE__ENUMERATIONS:
			getEnumerations().clear();
			getEnumerations().addAll((Collection<? extends Enumeration>) newValue);
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
		case CSharpArchIdPackage.NAMESPACE__CLASSES:
			getClasses().clear();
			return;
		case CSharpArchIdPackage.NAMESPACE__ENUMERATIONS:
			getEnumerations().clear();
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
		case CSharpArchIdPackage.NAMESPACE__CLASSES:
			return classes != null && !classes.isEmpty();
		case CSharpArchIdPackage.NAMESPACE__ENUMERATIONS:
			return enumerations != null && !enumerations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NamespaceImpl
