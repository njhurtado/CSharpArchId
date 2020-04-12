/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Annotation#getTypeacces <em>Typeacces</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends Expresion {
	/**
	 * Returns the value of the '<em><b>Typeacces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typeacces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeacces</em>' containment reference.
	 * @see #setTypeacces(TypeAcces)
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getAnnotation_Typeacces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeAcces getTypeacces();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Annotation#getTypeacces <em>Typeacces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeacces</em>' containment reference.
	 * @see #getTypeacces()
	 * @generated
	 */
	void setTypeacces(TypeAcces value);

} // Annotation
