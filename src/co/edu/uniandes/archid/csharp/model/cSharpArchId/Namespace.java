/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Namespace#getClasses <em>Classes</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Namespace#getEnumerations <em>Enumerations</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getNamespace_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeDeclaration> getClasses();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getNamespace_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumeration> getEnumerations();

} // Namespace
