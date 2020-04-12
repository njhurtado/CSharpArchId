/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#isStatic <em>Static</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getBodyDeclaration <em>Body Declaration</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getModifier()
 * @model
 * @generated
 */
public interface Modifier extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getModifier_Visibility()
	 * @model
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Inheritance</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.InheritanceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance</em>' attribute.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.InheritanceKind
	 * @see #setInheritance(InheritanceKind)
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getModifier_Inheritance()
	 * @model
	 * @generated
	 */
	InheritanceKind getInheritance();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getInheritance <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance</em>' attribute.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.InheritanceKind
	 * @see #getInheritance()
	 * @generated
	 */
	void setInheritance(InheritanceKind value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getModifier_Static()
	 * @model
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Body Declaration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.BodyDeclaration#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Declaration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declaration</em>' container reference.
	 * @see #setBodyDeclaration(BodyDeclaration)
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getModifier_BodyDeclaration()
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.BodyDeclaration#getModifier
	 * @model opposite="modifier" transient="false" ordered="false"
	 * @generated
	 */
	BodyDeclaration getBodyDeclaration();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getBodyDeclaration <em>Body Declaration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Declaration</em>' container reference.
	 * @see #getBodyDeclaration()
	 * @generated
	 */
	void setBodyDeclaration(BodyDeclaration value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getModifier_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ModifierKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' attribute.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ModifierKind
	 * @see #setModifier(ModifierKind)
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getModifier_Modifier()
	 * @model
	 * @generated
	 */
	ModifierKind getModifier();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getModifier <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' attribute.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ModifierKind
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(ModifierKind value);

} // Modifier
