/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.PrimitiveType#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType
	 * @see #setKind(SimpleType)
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getPrimitiveType_Kind()
	 * @model
	 * @generated
	 */
	SimpleType getKind();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.PrimitiveType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SimpleType value);

} // PrimitiveType
