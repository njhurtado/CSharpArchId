/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compile Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getElements <em>Elements</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getCommentList <em>Comment List</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getTypeDeclaration <em>Type Declaration</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getUsings <em>Usings</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getCompileUnit()
 * @model
 * @generated
 */
public interface CompileUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getCompileUnit_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElement> getElements();

	/**
	 * Returns the value of the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original File Path</em>' attribute.
	 * @see #setOriginalFilePath(String)
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getCompileUnit_OriginalFilePath()
	 * @model
	 * @generated
	 */
	String getOriginalFilePath();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getOriginalFilePath <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original File Path</em>' attribute.
	 * @see #getOriginalFilePath()
	 * @generated
	 */
	void setOriginalFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Comment List</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment List</em>' containment reference list.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getCompileUnit_CommentList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getCommentList();

	/**
	 * Returns the value of the '<em><b>Type Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Declaration</em>' reference.
	 * @see #setTypeDeclaration(AbstractTypeDeclaration)
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getCompileUnit_TypeDeclaration()
	 * @model
	 * @generated
	 */
	AbstractTypeDeclaration getTypeDeclaration();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getTypeDeclaration <em>Type Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Declaration</em>' reference.
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	void setTypeDeclaration(AbstractTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.UsingDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usings</em>' containment reference list.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getCompileUnit_Usings()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsingDeclaration> getUsings();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' containment reference.
	 * @see #setNamespace(Namespace)
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getCompileUnit_Namespace()
	 * @model containment="true"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getNamespace <em>Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' containment reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

} // CompileUnit
