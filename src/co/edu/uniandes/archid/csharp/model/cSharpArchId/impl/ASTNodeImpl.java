/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId.impl;

import co.edu.uniandes.archid.csharp.model.cSharpArchId.ASTNode;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AST Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ASTNodeImpl#getOriginalCompilationUnit <em>Original Compilation Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ASTNodeImpl extends MinimalEObjectImpl.Container implements ASTNode {
	/**
	 * The cached value of the '{@link #getOriginalCompilationUnit() <em>Original Compilation Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalCompilationUnit()
	 * @generated
	 * @ordered
	 */
	protected CompileUnit originalCompilationUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASTNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSharpArchIdPackage.Literals.AST_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompileUnit getOriginalCompilationUnit() {
		if (originalCompilationUnit != null && originalCompilationUnit.eIsProxy()) {
			InternalEObject oldOriginalCompilationUnit = (InternalEObject) originalCompilationUnit;
			originalCompilationUnit = (CompileUnit) eResolveProxy(oldOriginalCompilationUnit);
			if (originalCompilationUnit != oldOriginalCompilationUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CSharpArchIdPackage.AST_NODE__ORIGINAL_COMPILATION_UNIT, oldOriginalCompilationUnit,
							originalCompilationUnit));
			}
		}
		return originalCompilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompileUnit basicGetOriginalCompilationUnit() {
		return originalCompilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalCompilationUnit(CompileUnit newOriginalCompilationUnit) {
		CompileUnit oldOriginalCompilationUnit = originalCompilationUnit;
		originalCompilationUnit = newOriginalCompilationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CSharpArchIdPackage.AST_NODE__ORIGINAL_COMPILATION_UNIT, oldOriginalCompilationUnit,
					originalCompilationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CSharpArchIdPackage.AST_NODE__ORIGINAL_COMPILATION_UNIT:
			if (resolve)
				return getOriginalCompilationUnit();
			return basicGetOriginalCompilationUnit();
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
		case CSharpArchIdPackage.AST_NODE__ORIGINAL_COMPILATION_UNIT:
			setOriginalCompilationUnit((CompileUnit) newValue);
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
		case CSharpArchIdPackage.AST_NODE__ORIGINAL_COMPILATION_UNIT:
			setOriginalCompilationUnit((CompileUnit) null);
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
		case CSharpArchIdPackage.AST_NODE__ORIGINAL_COMPILATION_UNIT:
			return originalCompilationUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //ASTNodeImpl
