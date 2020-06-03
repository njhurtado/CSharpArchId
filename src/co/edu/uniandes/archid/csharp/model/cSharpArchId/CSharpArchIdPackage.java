/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdFactory
 * @model kind="package"
 * @generated
 */
public interface CSharpArchIdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cSharpArchId";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cSharpArchId";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cSharpArchId";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CSharpArchIdPackage eINSTANCE = co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModelImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Archives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ARCHIVES = 1;

	/**
	 * The feature id for the '<em><b>Compile Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMPILE_UNITS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ASTNodeImpl <em>AST Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ASTNodeImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getASTNode()
	 * @generated
	 */
	int AST_NODE = 12;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE__ORIGINAL_COMPILATION_UNIT = 0;

	/**
	 * The number of structural features of the '<em>AST Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>AST Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.NamedElementImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__PATH = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.EnumerationLiteralImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.EnumerationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 4;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ORIGINAL_COMPILATION_UNIT = TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PATH = TYPE__PATH;

	/**
	 * The feature id for the '<em><b>Enum Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ENUM_LITERALS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractTypeDeclarationImpl <em>Abstract Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractTypeDeclarationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getAbstractTypeDeclaration()
	 * @generated
	 */
	int ABSTRACT_TYPE_DECLARATION = 18;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT = TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__PATH = TYPE__PATH;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__MODIFIER = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeDeclarationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getTypeDeclaration()
	 * @generated
	 */
	int TYPE_DECLARATION = 19;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__NAME = ABSTRACT_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__PATH = ABSTRACT_TYPE_DECLARATION__PATH;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__COMMENTS_BEFORE_BODY = ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__COMMENTS_AFTER_BODY = ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__BODY_DECLARATIONS = ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__MODIFIER = ABSTRACT_TYPE_DECLARATION__MODIFIER;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_FEATURE_COUNT = ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_OPERATION_COUNT = ABSTRACT_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ClassDeclarationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getClassDeclaration()
	 * @generated
	 */
	int CLASS_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ORIGINAL_COMPILATION_UNIT = TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__NAME = TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__PATH = TYPE_DECLARATION__PATH;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__COMMENTS_BEFORE_BODY = TYPE_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__COMMENTS_AFTER_BODY = TYPE_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__BODY_DECLARATIONS = TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__MODIFIER = TYPE_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__SUPER_CLASS = TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_OPERATION_COUNT = TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.InterfaceDeclarationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getInterfaceDeclaration()
	 * @generated
	 */
	int INTERFACE_DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__ORIGINAL_COMPILATION_UNIT = TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__NAME = TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__PATH = TYPE_DECLARATION__PATH;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__COMMENTS_BEFORE_BODY = TYPE_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__COMMENTS_AFTER_BODY = TYPE_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__BODY_DECLARATIONS = TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__MODIFIER = TYPE_DECLARATION__MODIFIER;

	/**
	 * The number of structural features of the '<em>Interface Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_OPERATION_COUNT = TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.PrimitiveTypeImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ORIGINAL_COMPILATION_UNIT = TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PATH = TYPE__PATH;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__KIND = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.NamespaceImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 8;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__CLASSES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ENUMERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.MethodParameterImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getMethodParameter()
	 * @generated
	 */
	int METHOD_PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Method Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CompileUnitImpl <em>Compile Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CompileUnitImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getCompileUnit()
	 * @generated
	 */
	int COMPILE_UNIT = 10;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_UNIT__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_UNIT__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_UNIT__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_UNIT__ORIGINAL_FILE_PATH = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_UNIT__COMMENT_LIST = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_UNIT__TYPE_DECLARATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_UNIT__USINGS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_UNIT__NAMESPACE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Namspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_UNIT__NAMSPACE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Compile Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Compile Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_UNIT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ElementRefImpl <em>Element Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ElementRefImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getElementRef()
	 * @generated
	 */
	int ELEMENT_REF = 11;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REF__ORIGINAL_COMPILATION_UNIT = TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REF__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REF__PATH = TYPE__PATH;

	/**
	 * The number of structural features of the '<em>Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REF_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REF_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ArchiveImpl <em>Archive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ArchiveImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getArchive()
	 * @generated
	 */
	int ARCHIVE = 13;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__ORIGINAL_FILE_PATH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compile Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__COMPILE_UNITS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.UsingDeclarationImpl <em>Using Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.UsingDeclarationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getUsingDeclaration()
	 * @generated
	 */
	int USING_DECLARATION = 14;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_DECLARATION__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_DECLARATION__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The number of structural features of the '<em>Using Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Using Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_DECLARATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CommentImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 15;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CONTENT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.LineCommentImpl <em>Line Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.LineCommentImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getLineComment()
	 * @generated
	 */
	int LINE_COMMENT = 16;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT__ORIGINAL_COMPILATION_UNIT = COMMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT__CONTENT = COMMENT__CONTENT;

	/**
	 * The number of structural features of the '<em>Line Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.BlockCommentImpl <em>Block Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.BlockCommentImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getBlockComment()
	 * @generated
	 */
	int BLOCK_COMMENT = 17;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_COMMENT__ORIGINAL_COMPILATION_UNIT = COMMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_COMMENT__CONTENT = COMMENT__CONTENT;

	/**
	 * The number of structural features of the '<em>Block Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_COMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_COMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ExpresionImpl <em>Expresion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ExpresionImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getExpresion()
	 * @generated
	 */
	int EXPRESION = 21;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The number of structural features of the '<em>Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeAccesImpl <em>Type Acces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeAccesImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getTypeAcces()
	 * @generated
	 */
	int TYPE_ACCES = 20;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCES__ORIGINAL_COMPILATION_UNIT = EXPRESION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The number of structural features of the '<em>Type Acces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCES_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Acces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCES_OPERATION_COUNT = EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.BodyDeclarationImpl <em>Body Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.BodyDeclarationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getBodyDeclaration()
	 * @generated
	 */
	int BODY_DECLARATION = 22;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__PATH = NAMED_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__MODIFIER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Body Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Body Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModifierImpl <em>Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModifierImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 23;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__VISIBILITY = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__INHERITANCE = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__STATIC = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__BODY_DECLARATION = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__ANNOTATIONS = AST_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__MODIFIER = AST_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AnnotationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 24;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ORIGINAL_COMPILATION_UNIT = EXPRESION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Typeacces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TYPEACCES = EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodDeclarationImpl <em>Abstract Method Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodDeclarationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getAbstractMethodDeclaration()
	 * @generated
	 */
	int ABSTRACT_METHOD_DECLARATION = 25;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT = BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__PATH = BODY_DECLARATION__PATH;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__MODIFIER = BODY_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__BODY = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__PARAMETERS = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS = BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS = BODY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__RETURN_TYPE = BODY_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Method Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Abstract Method Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.StatementImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 27;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.BlockImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 26;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.VariableDeclarationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 28;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT = BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__PATH = BODY_DECLARATION__PATH;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__MODIFIER = BODY_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Method Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__METHOD_DECLARATION = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__TYPE = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.SingleVariableDeclarationImpl <em>Single Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.SingleVariableDeclarationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getSingleVariableDeclaration()
	 * @generated
	 */
	int SINGLE_VARIABLE_DECLARATION = 29;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT = VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__NAME = VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__PATH = VARIABLE_DECLARATION__PATH;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__MODIFIER = VARIABLE_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Method Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION = VARIABLE_DECLARATION__METHOD_DECLARATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The number of structural features of the '<em>Single Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeParameterImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getTypeParameter()
	 * @generated
	 */
	int TYPE_PARAMETER = 30;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__ORIGINAL_COMPILATION_UNIT = TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__PATH = TYPE__PATH;

	/**
	 * The number of structural features of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.MethodDeclarationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getMethodDeclaration()
	 * @generated
	 */
	int METHOD_DECLARATION = 31;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__NAME = ABSTRACT_METHOD_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__PATH = ABSTRACT_METHOD_DECLARATION__PATH;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__MODIFIER = ABSTRACT_METHOD_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__BODY = ABSTRACT_METHOD_DECLARATION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__PARAMETERS = ABSTRACT_METHOD_DECLARATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__TYPE_PARAMETERS = ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__THROWN_EXCEPTIONS = ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__RETURN_TYPE = ABSTRACT_METHOD_DECLARATION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Local Variable Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__LOCAL_VARIABLE_DECLARATION = ABSTRACT_METHOD_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_FEATURE_COUNT = ABSTRACT_METHOD_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Method Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_OPERATION_COUNT = ABSTRACT_METHOD_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ConstructorDeclarationImpl <em>Constructor Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ConstructorDeclarationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getConstructorDeclaration()
	 * @generated
	 */
	int CONSTRUCTOR_DECLARATION = 32;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__NAME = ABSTRACT_METHOD_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__PATH = ABSTRACT_METHOD_DECLARATION__PATH;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__MODIFIER = ABSTRACT_METHOD_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__BODY = ABSTRACT_METHOD_DECLARATION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__PARAMETERS = ABSTRACT_METHOD_DECLARATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__TYPE_PARAMETERS = ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__THROWN_EXCEPTIONS = ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__RETURN_TYPE = ABSTRACT_METHOD_DECLARATION__RETURN_TYPE;

	/**
	 * The number of structural features of the '<em>Constructor Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_FEATURE_COUNT = ABSTRACT_METHOD_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constructor Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_OPERATION_COUNT = ABSTRACT_METHOD_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodInvocationImpl <em>Abstract Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodInvocationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getAbstractMethodInvocation()
	 * @generated
	 */
	int ABSTRACT_METHOD_INVOCATION = 33;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION__ARGUMENTS = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.MethodInvocationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getMethodInvocation()
	 * @generated
	 */
	int METHOD_INVOCATION = 34;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__TYPE_ARGUMENTS = ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__ARGUMENTS = ABSTRACT_METHOD_INVOCATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__EXPRESSION = ABSTRACT_METHOD_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_FEATURE_COUNT = ABSTRACT_METHOD_INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_OPERATION_COUNT = ABSTRACT_METHOD_INVOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AssignmentImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 35;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ORIGINAL_COMPILATION_UNIT = EXPRESION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ClassInstanceCreationImpl <em>Class Instance Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ClassInstanceCreationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getClassInstanceCreation()
	 * @generated
	 */
	int CLASS_INSTANCE_CREATION = 36;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__TYPE_ARGUMENTS = ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__ARGUMENTS = ABSTRACT_METHOD_INVOCATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__TYPE = ABSTRACT_METHOD_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expresion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__EXPRESION = ABSTRACT_METHOD_INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Instance Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_FEATURE_COUNT = ABSTRACT_METHOD_INVOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Instance Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_OPERATION_COUNT = ABSTRACT_METHOD_INVOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ConstructorInvocationImpl <em>Constructor Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ConstructorInvocationImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getConstructorInvocation()
	 * @generated
	 */
	int CONSTRUCTOR_INVOCATION = 37;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS = ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__ARGUMENTS = ABSTRACT_METHOD_INVOCATION__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Constructor Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_FEATURE_COUNT = ABSTRACT_METHOD_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constructor Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_OPERATION_COUNT = ABSTRACT_METHOD_INVOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ReturnTypeImpl <em>Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ReturnTypeImpl
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__ORIGINAL_COMPILATION_UNIT = TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__PATH = TYPE__PATH;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__RETURN_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType <em>Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 39;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.VisibilityKind <em>Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.VisibilityKind
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 40;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ModifierKind <em>Modifier Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ModifierKind
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getModifierKind()
	 * @generated
	 */
	int MODIFIER_KIND = 41;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.InheritanceKind <em>Inheritance Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.InheritanceKind
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getInheritanceKind()
	 * @generated
	 */
	int INHERITANCE_KIND = 42;

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Model#getArchives <em>Archives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Archives</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Model#getArchives()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Archives();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Model#getCompileUnits <em>Compile Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compile Units</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Model#getCompileUnits()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_CompileUnits();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.NamedElement#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.NamedElement#getPath()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Path();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Enumeration#getEnumLiterals <em>Enum Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Literals</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Enumeration#getEnumLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_EnumLiterals();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassDeclaration <em>Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassDeclaration
	 * @generated
	 */
	EClass getClassDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassDeclaration#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super Class</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassDeclaration#getSuperClass()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EReference getClassDeclaration_SuperClass();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.InterfaceDeclaration <em>Interface Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.InterfaceDeclaration
	 * @generated
	 */
	EClass getInterfaceDeclaration();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.PrimitiveType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.PrimitiveType#getKind()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Kind();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Namespace#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Namespace#getClasses()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Namespace#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Namespace#getEnumerations()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Enumerations();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodParameter <em>Method Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Parameter</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodParameter
	 * @generated
	 */
	EClass getMethodParameter();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodParameter#getType()
	 * @see #getMethodParameter()
	 * @generated
	 */
	EReference getMethodParameter_Type();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit <em>Compile Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compile Unit</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit
	 * @generated
	 */
	EClass getCompileUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getElements()
	 * @see #getCompileUnit()
	 * @generated
	 */
	EReference getCompileUnit_Elements();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getOriginalFilePath <em>Original File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original File Path</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getOriginalFilePath()
	 * @see #getCompileUnit()
	 * @generated
	 */
	EAttribute getCompileUnit_OriginalFilePath();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getCommentList <em>Comment List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment List</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getCommentList()
	 * @see #getCompileUnit()
	 * @generated
	 */
	EReference getCompileUnit_CommentList();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getTypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getTypeDeclaration()
	 * @see #getCompileUnit()
	 * @generated
	 */
	EReference getCompileUnit_TypeDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getUsings <em>Usings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usings</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getUsings()
	 * @see #getCompileUnit()
	 * @generated
	 */
	EReference getCompileUnit_Usings();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getNamespace()
	 * @see #getCompileUnit()
	 * @generated
	 */
	EReference getCompileUnit_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getNamspace <em>Namspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namspace</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit#getNamspace()
	 * @see #getCompileUnit()
	 * @generated
	 */
	EAttribute getCompileUnit_Namspace();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ElementRef <em>Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Ref</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ElementRef
	 * @generated
	 */
	EClass getElementRef();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ASTNode <em>AST Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AST Node</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ASTNode
	 * @generated
	 */
	EClass getASTNode();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ASTNode#getOriginalCompilationUnit <em>Original Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Compilation Unit</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ASTNode#getOriginalCompilationUnit()
	 * @see #getASTNode()
	 * @generated
	 */
	EReference getASTNode_OriginalCompilationUnit();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Archive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Archive
	 * @generated
	 */
	EClass getArchive();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Archive#getOriginalFilePath <em>Original File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original File Path</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Archive#getOriginalFilePath()
	 * @see #getArchive()
	 * @generated
	 */
	EAttribute getArchive_OriginalFilePath();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Archive#getCompileUnits <em>Compile Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compile Units</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Archive#getCompileUnits()
	 * @see #getArchive()
	 * @generated
	 */
	EReference getArchive_CompileUnits();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.UsingDeclaration <em>Using Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Using Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.UsingDeclaration
	 * @generated
	 */
	EClass getUsingDeclaration();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Comment#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Comment#getContent()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Content();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.LineComment <em>Line Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Comment</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.LineComment
	 * @generated
	 */
	EClass getLineComment();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.BlockComment <em>Block Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Comment</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.BlockComment
	 * @generated
	 */
	EClass getBlockComment();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration <em>Abstract Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration
	 * @generated
	 */
	EClass getAbstractTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration#getCommentsBeforeBody <em>Comments Before Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments Before Body</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration#getCommentsBeforeBody()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_CommentsBeforeBody();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration#getCommentsAfterBody <em>Comments After Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments After Body</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration#getCommentsAfterBody()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_CommentsAfterBody();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration#getBodyDeclarations <em>Body Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Declarations</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration#getBodyDeclarations()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_BodyDeclarations();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modifier</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration#getModifier()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_Modifier();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeDeclaration
	 * @generated
	 */
	EClass getTypeDeclaration();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeAcces <em>Type Acces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Acces</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeAcces
	 * @generated
	 */
	EClass getTypeAcces();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Expresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Expresion
	 * @generated
	 */
	EClass getExpresion();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.BodyDeclaration <em>Body Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.BodyDeclaration
	 * @generated
	 */
	EClass getBodyDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.BodyDeclaration#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modifier</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.BodyDeclaration#getModifier()
	 * @see #getBodyDeclaration()
	 * @generated
	 */
	EReference getBodyDeclaration_Modifier();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier
	 * @generated
	 */
	EClass getModifier();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getVisibility()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inheritance</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getInheritance()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Inheritance();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#isStatic()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Static();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getBodyDeclaration <em>Body Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Body Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getBodyDeclaration()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_BodyDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getAnnotations()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_Annotations();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier#getModifier()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Modifier();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Annotation#getTypeacces <em>Typeacces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typeacces</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Annotation#getTypeacces()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Typeacces();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration <em>Abstract Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Method Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration
	 * @generated
	 */
	EClass getAbstractMethodDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration#getBody()
	 * @see #getAbstractMethodDeclaration()
	 * @generated
	 */
	EReference getAbstractMethodDeclaration_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration#getParameters()
	 * @see #getAbstractMethodDeclaration()
	 * @generated
	 */
	EReference getAbstractMethodDeclaration_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration#getTypeParameters()
	 * @see #getAbstractMethodDeclaration()
	 * @generated
	 */
	EReference getAbstractMethodDeclaration_TypeParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration#getThrownExceptions <em>Thrown Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thrown Exceptions</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration#getThrownExceptions()
	 * @see #getAbstractMethodDeclaration()
	 * @generated
	 */
	EReference getAbstractMethodDeclaration_ThrownExceptions();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration#getReturnType()
	 * @see #getAbstractMethodDeclaration()
	 * @generated
	 */
	EReference getAbstractMethodDeclaration_ReturnType();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.VariableDeclaration#getMethodDeclaration <em>Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.VariableDeclaration#getMethodDeclaration()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_MethodDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.VariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.VariableDeclaration#getType()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Type();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.SingleVariableDeclaration <em>Single Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Variable Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.SingleVariableDeclaration
	 * @generated
	 */
	EClass getSingleVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeParameter
	 * @generated
	 */
	EClass getTypeParameter();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodDeclaration <em>Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodDeclaration
	 * @generated
	 */
	EClass getMethodDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodDeclaration#getLocalVariableDeclaration <em>Local Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variable Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodDeclaration#getLocalVariableDeclaration()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EReference getMethodDeclaration_LocalVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ConstructorDeclaration <em>Constructor Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Declaration</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ConstructorDeclaration
	 * @generated
	 */
	EClass getConstructorDeclaration();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodInvocation <em>Abstract Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Method Invocation</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodInvocation
	 * @generated
	 */
	EClass getAbstractMethodInvocation();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodInvocation#getTypeArguments <em>Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Arguments</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodInvocation#getTypeArguments()
	 * @see #getAbstractMethodInvocation()
	 * @generated
	 */
	EReference getAbstractMethodInvocation_TypeArguments();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodInvocation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodInvocation#getArguments()
	 * @see #getAbstractMethodInvocation()
	 * @generated
	 */
	EReference getAbstractMethodInvocation_Arguments();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodInvocation <em>Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Invocation</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodInvocation
	 * @generated
	 */
	EClass getMethodInvocation();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodInvocation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodInvocation#getExpression()
	 * @see #getMethodInvocation()
	 * @generated
	 */
	EReference getMethodInvocation_Expression();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassInstanceCreation <em>Class Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Instance Creation</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassInstanceCreation
	 * @generated
	 */
	EClass getClassInstanceCreation();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassInstanceCreation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassInstanceCreation#getType()
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	EReference getClassInstanceCreation_Type();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassInstanceCreation#getExpresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expresion</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassInstanceCreation#getExpresion()
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	EReference getClassInstanceCreation_Expresion();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ConstructorInvocation <em>Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Invocation</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ConstructorInvocation
	 * @generated
	 */
	EClass getConstructorInvocation();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ReturnType
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ReturnType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ReturnType#getReturnType()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_ReturnType();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Type</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType
	 * @generated
	 */
	EEnum getSimpleType();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ModifierKind <em>Modifier Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modifier Kind</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ModifierKind
	 * @generated
	 */
	EEnum getModifierKind();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.InheritanceKind <em>Inheritance Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inheritance Kind</em>'.
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.InheritanceKind
	 * @generated
	 */
	EEnum getInheritanceKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CSharpArchIdFactory getCSharpArchIdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModelImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Archives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ARCHIVES = eINSTANCE.getModel_Archives();

		/**
		 * The meta object literal for the '<em><b>Compile Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__COMPILE_UNITS = eINSTANCE.getModel_CompileUnits();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.EnumerationLiteralImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.NamedElementImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__PATH = eINSTANCE.getNamedElement_Path();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.EnumerationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Enum Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__ENUM_LITERALS = eINSTANCE.getEnumeration_EnumLiterals();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ClassDeclarationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getClassDeclaration()
		 * @generated
		 */
		EClass CLASS_DECLARATION = eINSTANCE.getClassDeclaration();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION__SUPER_CLASS = eINSTANCE.getClassDeclaration_SuperClass();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.InterfaceDeclarationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getInterfaceDeclaration()
		 * @generated
		 */
		EClass INTERFACE_DECLARATION = eINSTANCE.getInterfaceDeclaration();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.PrimitiveTypeImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__KIND = eINSTANCE.getPrimitiveType_Kind();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.NamespaceImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__CLASSES = eINSTANCE.getNamespace_Classes();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__ENUMERATIONS = eINSTANCE.getNamespace_Enumerations();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.MethodParameterImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getMethodParameter()
		 * @generated
		 */
		EClass METHOD_PARAMETER = eINSTANCE.getMethodParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PARAMETER__TYPE = eINSTANCE.getMethodParameter_Type();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CompileUnitImpl <em>Compile Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CompileUnitImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getCompileUnit()
		 * @generated
		 */
		EClass COMPILE_UNIT = eINSTANCE.getCompileUnit();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILE_UNIT__ELEMENTS = eINSTANCE.getCompileUnit_Elements();

		/**
		 * The meta object literal for the '<em><b>Original File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILE_UNIT__ORIGINAL_FILE_PATH = eINSTANCE.getCompileUnit_OriginalFilePath();

		/**
		 * The meta object literal for the '<em><b>Comment List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILE_UNIT__COMMENT_LIST = eINSTANCE.getCompileUnit_CommentList();

		/**
		 * The meta object literal for the '<em><b>Type Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILE_UNIT__TYPE_DECLARATION = eINSTANCE.getCompileUnit_TypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILE_UNIT__USINGS = eINSTANCE.getCompileUnit_Usings();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILE_UNIT__NAMESPACE = eINSTANCE.getCompileUnit_Namespace();

		/**
		 * The meta object literal for the '<em><b>Namspace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILE_UNIT__NAMSPACE = eINSTANCE.getCompileUnit_Namspace();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ElementRefImpl <em>Element Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ElementRefImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getElementRef()
		 * @generated
		 */
		EClass ELEMENT_REF = eINSTANCE.getElementRef();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ASTNodeImpl <em>AST Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ASTNodeImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getASTNode()
		 * @generated
		 */
		EClass AST_NODE = eINSTANCE.getASTNode();

		/**
		 * The meta object literal for the '<em><b>Original Compilation Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AST_NODE__ORIGINAL_COMPILATION_UNIT = eINSTANCE.getASTNode_OriginalCompilationUnit();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ArchiveImpl <em>Archive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ArchiveImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getArchive()
		 * @generated
		 */
		EClass ARCHIVE = eINSTANCE.getArchive();

		/**
		 * The meta object literal for the '<em><b>Original File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVE__ORIGINAL_FILE_PATH = eINSTANCE.getArchive_OriginalFilePath();

		/**
		 * The meta object literal for the '<em><b>Compile Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIVE__COMPILE_UNITS = eINSTANCE.getArchive_CompileUnits();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.UsingDeclarationImpl <em>Using Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.UsingDeclarationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getUsingDeclaration()
		 * @generated
		 */
		EClass USING_DECLARATION = eINSTANCE.getUsingDeclaration();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CommentImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CONTENT = eINSTANCE.getComment_Content();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.LineCommentImpl <em>Line Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.LineCommentImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getLineComment()
		 * @generated
		 */
		EClass LINE_COMMENT = eINSTANCE.getLineComment();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.BlockCommentImpl <em>Block Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.BlockCommentImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getBlockComment()
		 * @generated
		 */
		EClass BLOCK_COMMENT = eINSTANCE.getBlockComment();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractTypeDeclarationImpl <em>Abstract Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractTypeDeclarationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getAbstractTypeDeclaration()
		 * @generated
		 */
		EClass ABSTRACT_TYPE_DECLARATION = eINSTANCE.getAbstractTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Comments Before Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY = eINSTANCE
				.getAbstractTypeDeclaration_CommentsBeforeBody();

		/**
		 * The meta object literal for the '<em><b>Comments After Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY = eINSTANCE
				.getAbstractTypeDeclaration_CommentsAfterBody();

		/**
		 * The meta object literal for the '<em><b>Body Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS = eINSTANCE
				.getAbstractTypeDeclaration_BodyDeclarations();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_DECLARATION__MODIFIER = eINSTANCE.getAbstractTypeDeclaration_Modifier();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeDeclarationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getTypeDeclaration()
		 * @generated
		 */
		EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeAccesImpl <em>Type Acces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeAccesImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getTypeAcces()
		 * @generated
		 */
		EClass TYPE_ACCES = eINSTANCE.getTypeAcces();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ExpresionImpl <em>Expresion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ExpresionImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getExpresion()
		 * @generated
		 */
		EClass EXPRESION = eINSTANCE.getExpresion();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.BodyDeclarationImpl <em>Body Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.BodyDeclarationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getBodyDeclaration()
		 * @generated
		 */
		EClass BODY_DECLARATION = eINSTANCE.getBodyDeclaration();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_DECLARATION__MODIFIER = eINSTANCE.getBodyDeclaration_Modifier();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModifierImpl <em>Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ModifierImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getModifier()
		 * @generated
		 */
		EClass MODIFIER = eINSTANCE.getModifier();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__VISIBILITY = eINSTANCE.getModifier_Visibility();

		/**
		 * The meta object literal for the '<em><b>Inheritance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__INHERITANCE = eINSTANCE.getModifier_Inheritance();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__STATIC = eINSTANCE.getModifier_Static();

		/**
		 * The meta object literal for the '<em><b>Body Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER__BODY_DECLARATION = eINSTANCE.getModifier_BodyDeclaration();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER__ANNOTATIONS = eINSTANCE.getModifier_Annotations();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__MODIFIER = eINSTANCE.getModifier_Modifier();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AnnotationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Typeacces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TYPEACCES = eINSTANCE.getAnnotation_Typeacces();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodDeclarationImpl <em>Abstract Method Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodDeclarationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getAbstractMethodDeclaration()
		 * @generated
		 */
		EClass ABSTRACT_METHOD_DECLARATION = eINSTANCE.getAbstractMethodDeclaration();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_METHOD_DECLARATION__BODY = eINSTANCE.getAbstractMethodDeclaration_Body();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_METHOD_DECLARATION__PARAMETERS = eINSTANCE.getAbstractMethodDeclaration_Parameters();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS = eINSTANCE
				.getAbstractMethodDeclaration_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Thrown Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS = eINSTANCE
				.getAbstractMethodDeclaration_ThrownExceptions();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_METHOD_DECLARATION__RETURN_TYPE = eINSTANCE.getAbstractMethodDeclaration_ReturnType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.BlockImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.StatementImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.VariableDeclarationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Method Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__METHOD_DECLARATION = eINSTANCE.getVariableDeclaration_MethodDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.SingleVariableDeclarationImpl <em>Single Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.SingleVariableDeclarationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getSingleVariableDeclaration()
		 * @generated
		 */
		EClass SINGLE_VARIABLE_DECLARATION = eINSTANCE.getSingleVariableDeclaration();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.TypeParameterImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getTypeParameter()
		 * @generated
		 */
		EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.MethodDeclarationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getMethodDeclaration()
		 * @generated
		 */
		EClass METHOD_DECLARATION = eINSTANCE.getMethodDeclaration();

		/**
		 * The meta object literal for the '<em><b>Local Variable Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION__LOCAL_VARIABLE_DECLARATION = eINSTANCE
				.getMethodDeclaration_LocalVariableDeclaration();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ConstructorDeclarationImpl <em>Constructor Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ConstructorDeclarationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getConstructorDeclaration()
		 * @generated
		 */
		EClass CONSTRUCTOR_DECLARATION = eINSTANCE.getConstructorDeclaration();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodInvocationImpl <em>Abstract Method Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AbstractMethodInvocationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getAbstractMethodInvocation()
		 * @generated
		 */
		EClass ABSTRACT_METHOD_INVOCATION = eINSTANCE.getAbstractMethodInvocation();

		/**
		 * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS = eINSTANCE.getAbstractMethodInvocation_TypeArguments();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_METHOD_INVOCATION__ARGUMENTS = eINSTANCE.getAbstractMethodInvocation_Arguments();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.MethodInvocationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getMethodInvocation()
		 * @generated
		 */
		EClass METHOD_INVOCATION = eINSTANCE.getMethodInvocation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_INVOCATION__EXPRESSION = eINSTANCE.getMethodInvocation_Expression();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.AssignmentImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ClassInstanceCreationImpl <em>Class Instance Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ClassInstanceCreationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getClassInstanceCreation()
		 * @generated
		 */
		EClass CLASS_INSTANCE_CREATION = eINSTANCE.getClassInstanceCreation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_INSTANCE_CREATION__TYPE = eINSTANCE.getClassInstanceCreation_Type();

		/**
		 * The meta object literal for the '<em><b>Expresion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_INSTANCE_CREATION__EXPRESION = eINSTANCE.getClassInstanceCreation_Expresion();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ConstructorInvocationImpl <em>Constructor Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ConstructorInvocationImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getConstructorInvocation()
		 * @generated
		 */
		EClass CONSTRUCTOR_INVOCATION = eINSTANCE.getConstructorInvocation();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ReturnTypeImpl <em>Return Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.ReturnTypeImpl
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getReturnType()
		 * @generated
		 */
		EClass RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__RETURN_TYPE = eINSTANCE.getReturnType_ReturnType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType <em>Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getSimpleType()
		 * @generated
		 */
		EEnum SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.VisibilityKind <em>Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.VisibilityKind
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getVisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.ModifierKind <em>Modifier Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.ModifierKind
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getModifierKind()
		 * @generated
		 */
		EEnum MODIFIER_KIND = eINSTANCE.getModifierKind();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.archid.csharp.model.cSharpArchId.InheritanceKind <em>Inheritance Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.InheritanceKind
		 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl#getInheritanceKind()
		 * @generated
		 */
		EEnum INHERITANCE_KIND = eINSTANCE.getInheritanceKind();

	}

} //CSharpArchIdPackage
