/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ReturnType#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getReturnType()
 * @model
 * @generated
 */
public interface ReturnType extends Type {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The default value is <code>"bool"</code>.
	 * The literals are from the enumeration {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType
	 * @see #setReturnType(SimpleType)
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getReturnType_ReturnType()
	 * @model default="bool"
	 * @generated
	 */
	SimpleType getReturnType();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ReturnType#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(SimpleType value);

} // ReturnType
