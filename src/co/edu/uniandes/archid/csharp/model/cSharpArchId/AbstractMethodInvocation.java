/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodInvocation#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodInvocation#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getAbstractMethodInvocation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMethodInvocation extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeAcces}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' containment reference list.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getAbstractMethodInvocation_TypeArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeAcces> getTypeArguments();

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Expresion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#getAbstractMethodInvocation_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expresion> getArguments();

} // AbstractMethodInvocation
