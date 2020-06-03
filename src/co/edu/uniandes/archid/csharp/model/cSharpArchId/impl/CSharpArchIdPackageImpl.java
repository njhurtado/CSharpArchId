/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId.impl;

import co.edu.uniandes.archid.csharp.model.cSharpArchId.ASTNode;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractMethodInvocation;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Annotation;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Archive;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Assignment;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Block;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.BlockComment;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.BodyDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdFactory;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassInstanceCreation;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Comment;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ConstructorDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ConstructorInvocation;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ElementRef;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Enumeration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.EnumerationLiteral;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Expresion;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.InheritanceKind;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.InterfaceDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.LineComment;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodInvocation;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodParameter;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Model;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ModifierKind;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.NamedElement;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Namespace;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.PrimitiveType;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ReturnType;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.SingleVariableDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Statement;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Type;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeAcces;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.TypeParameter;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.UsingDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.VariableDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.VisibilityKind;

import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EcorePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSharpArchIdPackageImpl extends EPackageImpl implements CSharpArchIdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compileUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usingDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expresionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInstanceCreationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modifierKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inheritanceKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CSharpArchIdPackageImpl() {
		super(eNS_URI, CSharpArchIdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CSharpArchIdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CSharpArchIdPackage init() {
		if (isInited)
			return (CSharpArchIdPackage) EPackage.Registry.INSTANCE.getEPackage(CSharpArchIdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCSharpArchIdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CSharpArchIdPackageImpl theCSharpArchIdPackage = registeredCSharpArchIdPackage instanceof CSharpArchIdPackageImpl
				? (CSharpArchIdPackageImpl) registeredCSharpArchIdPackage
				: new CSharpArchIdPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (registeredPackage instanceof EcorePackageImpl
				? registeredPackage
				: EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theCSharpArchIdPackage.createPackageContents();
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theCSharpArchIdPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCSharpArchIdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CSharpArchIdPackage.eNS_URI, theCSharpArchIdPackage);
		return theCSharpArchIdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Archives() {
		return (EReference) modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_CompileUnits() {
		return (EReference) modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Path() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_EnumLiterals() {
		return (EReference) enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDeclaration() {
		return classDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDeclaration_SuperClass() {
		return (EReference) classDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDeclaration() {
		return interfaceDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveType_Kind() {
		return (EAttribute) primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_Classes() {
		return (EReference) namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_Enumerations() {
		return (EReference) namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodParameter() {
		return methodParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodParameter_Type() {
		return (EReference) methodParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompileUnit() {
		return compileUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompileUnit_Elements() {
		return (EReference) compileUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompileUnit_OriginalFilePath() {
		return (EAttribute) compileUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompileUnit_CommentList() {
		return (EReference) compileUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompileUnit_TypeDeclaration() {
		return (EReference) compileUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompileUnit_Usings() {
		return (EReference) compileUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompileUnit_Namespace() {
		return (EReference) compileUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompileUnit_Namspace() {
		return (EAttribute) compileUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementRef() {
		return elementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASTNode() {
		return astNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASTNode_OriginalCompilationUnit() {
		return (EReference) astNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchive() {
		return archiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchive_OriginalFilePath() {
		return (EAttribute) archiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchive_CompileUnits() {
		return (EReference) archiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsingDeclaration() {
		return usingDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Content() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineComment() {
		return lineCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockComment() {
		return blockCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTypeDeclaration() {
		return abstractTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTypeDeclaration_CommentsBeforeBody() {
		return (EReference) abstractTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTypeDeclaration_CommentsAfterBody() {
		return (EReference) abstractTypeDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTypeDeclaration_BodyDeclarations() {
		return (EReference) abstractTypeDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTypeDeclaration_Modifier() {
		return (EReference) abstractTypeDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDeclaration() {
		return typeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeAcces() {
		return typeAccesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpresion() {
		return expresionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyDeclaration() {
		return bodyDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyDeclaration_Modifier() {
		return (EReference) bodyDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifier() {
		return modifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Visibility() {
		return (EAttribute) modifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Inheritance() {
		return (EAttribute) modifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Static() {
		return (EAttribute) modifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifier_BodyDeclaration() {
		return (EReference) modifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifier_Annotations() {
		return (EReference) modifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Modifier() {
		return (EAttribute) modifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Typeacces() {
		return (EReference) annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMethodDeclaration() {
		return abstractMethodDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMethodDeclaration_Body() {
		return (EReference) abstractMethodDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMethodDeclaration_Parameters() {
		return (EReference) abstractMethodDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMethodDeclaration_TypeParameters() {
		return (EReference) abstractMethodDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMethodDeclaration_ThrownExceptions() {
		return (EReference) abstractMethodDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMethodDeclaration_ReturnType() {
		return (EReference) abstractMethodDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_MethodDeclaration() {
		return (EReference) variableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Type() {
		return (EReference) variableDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleVariableDeclaration() {
		return singleVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeParameter() {
		return typeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodDeclaration() {
		return methodDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclaration_LocalVariableDeclaration() {
		return (EReference) methodDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorDeclaration() {
		return constructorDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMethodInvocation() {
		return abstractMethodInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMethodInvocation_TypeArguments() {
		return (EReference) abstractMethodInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMethodInvocation_Arguments() {
		return (EReference) abstractMethodInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodInvocation() {
		return methodInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodInvocation_Expression() {
		return (EReference) methodInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassInstanceCreation() {
		return classInstanceCreationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassInstanceCreation_Type() {
		return (EReference) classInstanceCreationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassInstanceCreation_Expresion() {
		return (EReference) classInstanceCreationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorInvocation() {
		return constructorInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnType() {
		return returnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnType_ReturnType() {
		return (EAttribute) returnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSimpleType() {
		return simpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModifierKind() {
		return modifierKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInheritanceKind() {
		return inheritanceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpArchIdFactory getCSharpArchIdFactory() {
		return (CSharpArchIdFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__NAME);
		createEReference(modelEClass, MODEL__ARCHIVES);
		createEReference(modelEClass, MODEL__COMPILE_UNITS);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__PATH);

		typeEClass = createEClass(TYPE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__ENUM_LITERALS);

		classDeclarationEClass = createEClass(CLASS_DECLARATION);
		createEReference(classDeclarationEClass, CLASS_DECLARATION__SUPER_CLASS);

		interfaceDeclarationEClass = createEClass(INTERFACE_DECLARATION);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__KIND);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__CLASSES);
		createEReference(namespaceEClass, NAMESPACE__ENUMERATIONS);

		methodParameterEClass = createEClass(METHOD_PARAMETER);
		createEReference(methodParameterEClass, METHOD_PARAMETER__TYPE);

		compileUnitEClass = createEClass(COMPILE_UNIT);
		createEReference(compileUnitEClass, COMPILE_UNIT__ELEMENTS);
		createEAttribute(compileUnitEClass, COMPILE_UNIT__ORIGINAL_FILE_PATH);
		createEReference(compileUnitEClass, COMPILE_UNIT__COMMENT_LIST);
		createEReference(compileUnitEClass, COMPILE_UNIT__TYPE_DECLARATION);
		createEReference(compileUnitEClass, COMPILE_UNIT__USINGS);
		createEReference(compileUnitEClass, COMPILE_UNIT__NAMESPACE);
		createEAttribute(compileUnitEClass, COMPILE_UNIT__NAMSPACE);

		elementRefEClass = createEClass(ELEMENT_REF);

		astNodeEClass = createEClass(AST_NODE);
		createEReference(astNodeEClass, AST_NODE__ORIGINAL_COMPILATION_UNIT);

		archiveEClass = createEClass(ARCHIVE);
		createEAttribute(archiveEClass, ARCHIVE__ORIGINAL_FILE_PATH);
		createEReference(archiveEClass, ARCHIVE__COMPILE_UNITS);

		usingDeclarationEClass = createEClass(USING_DECLARATION);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__CONTENT);

		lineCommentEClass = createEClass(LINE_COMMENT);

		blockCommentEClass = createEClass(BLOCK_COMMENT);

		abstractTypeDeclarationEClass = createEClass(ABSTRACT_TYPE_DECLARATION);
		createEReference(abstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY);
		createEReference(abstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY);
		createEReference(abstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS);
		createEReference(abstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__MODIFIER);

		typeDeclarationEClass = createEClass(TYPE_DECLARATION);

		typeAccesEClass = createEClass(TYPE_ACCES);

		expresionEClass = createEClass(EXPRESION);

		bodyDeclarationEClass = createEClass(BODY_DECLARATION);
		createEReference(bodyDeclarationEClass, BODY_DECLARATION__MODIFIER);

		modifierEClass = createEClass(MODIFIER);
		createEAttribute(modifierEClass, MODIFIER__VISIBILITY);
		createEAttribute(modifierEClass, MODIFIER__INHERITANCE);
		createEAttribute(modifierEClass, MODIFIER__STATIC);
		createEReference(modifierEClass, MODIFIER__BODY_DECLARATION);
		createEReference(modifierEClass, MODIFIER__ANNOTATIONS);
		createEAttribute(modifierEClass, MODIFIER__MODIFIER);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__TYPEACCES);

		abstractMethodDeclarationEClass = createEClass(ABSTRACT_METHOD_DECLARATION);
		createEReference(abstractMethodDeclarationEClass, ABSTRACT_METHOD_DECLARATION__BODY);
		createEReference(abstractMethodDeclarationEClass, ABSTRACT_METHOD_DECLARATION__PARAMETERS);
		createEReference(abstractMethodDeclarationEClass, ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS);
		createEReference(abstractMethodDeclarationEClass, ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS);
		createEReference(abstractMethodDeclarationEClass, ABSTRACT_METHOD_DECLARATION__RETURN_TYPE);

		blockEClass = createEClass(BLOCK);

		statementEClass = createEClass(STATEMENT);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__METHOD_DECLARATION);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__TYPE);

		singleVariableDeclarationEClass = createEClass(SINGLE_VARIABLE_DECLARATION);

		typeParameterEClass = createEClass(TYPE_PARAMETER);

		methodDeclarationEClass = createEClass(METHOD_DECLARATION);
		createEReference(methodDeclarationEClass, METHOD_DECLARATION__LOCAL_VARIABLE_DECLARATION);

		constructorDeclarationEClass = createEClass(CONSTRUCTOR_DECLARATION);

		abstractMethodInvocationEClass = createEClass(ABSTRACT_METHOD_INVOCATION);
		createEReference(abstractMethodInvocationEClass, ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS);
		createEReference(abstractMethodInvocationEClass, ABSTRACT_METHOD_INVOCATION__ARGUMENTS);

		methodInvocationEClass = createEClass(METHOD_INVOCATION);
		createEReference(methodInvocationEClass, METHOD_INVOCATION__EXPRESSION);

		assignmentEClass = createEClass(ASSIGNMENT);

		classInstanceCreationEClass = createEClass(CLASS_INSTANCE_CREATION);
		createEReference(classInstanceCreationEClass, CLASS_INSTANCE_CREATION__TYPE);
		createEReference(classInstanceCreationEClass, CLASS_INSTANCE_CREATION__EXPRESION);

		constructorInvocationEClass = createEClass(CONSTRUCTOR_INVOCATION);

		returnTypeEClass = createEClass(RETURN_TYPE);
		createEAttribute(returnTypeEClass, RETURN_TYPE__RETURN_TYPE);

		// Create enums
		simpleTypeEEnum = createEEnum(SIMPLE_TYPE);
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
		modifierKindEEnum = createEEnum(MODIFIER_KIND);
		inheritanceKindEEnum = createEEnum(INHERITANCE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		enumerationLiteralEClass.getESuperTypes().add(this.getNamedElement());
		namedElementEClass.getESuperTypes().add(this.getASTNode());
		typeEClass.getESuperTypes().add(this.getNamedElement());
		enumerationEClass.getESuperTypes().add(this.getType());
		classDeclarationEClass.getESuperTypes().add(this.getTypeDeclaration());
		interfaceDeclarationEClass.getESuperTypes().add(this.getTypeDeclaration());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		namespaceEClass.getESuperTypes().add(this.getNamedElement());
		methodParameterEClass.getESuperTypes().add(this.getNamedElement());
		compileUnitEClass.getESuperTypes().add(this.getNamedElement());
		elementRefEClass.getESuperTypes().add(this.getType());
		archiveEClass.getESuperTypes().add(this.getNamedElement());
		usingDeclarationEClass.getESuperTypes().add(this.getNamedElement());
		commentEClass.getESuperTypes().add(this.getASTNode());
		lineCommentEClass.getESuperTypes().add(this.getComment());
		blockCommentEClass.getESuperTypes().add(this.getComment());
		abstractTypeDeclarationEClass.getESuperTypes().add(this.getType());
		typeDeclarationEClass.getESuperTypes().add(this.getAbstractTypeDeclaration());
		typeAccesEClass.getESuperTypes().add(this.getExpresion());
		expresionEClass.getESuperTypes().add(this.getASTNode());
		bodyDeclarationEClass.getESuperTypes().add(this.getNamedElement());
		modifierEClass.getESuperTypes().add(this.getASTNode());
		annotationEClass.getESuperTypes().add(this.getExpresion());
		abstractMethodDeclarationEClass.getESuperTypes().add(this.getBodyDeclaration());
		blockEClass.getESuperTypes().add(this.getStatement());
		statementEClass.getESuperTypes().add(this.getASTNode());
		variableDeclarationEClass.getESuperTypes().add(this.getBodyDeclaration());
		singleVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
		typeParameterEClass.getESuperTypes().add(this.getType());
		methodDeclarationEClass.getESuperTypes().add(this.getAbstractMethodDeclaration());
		constructorDeclarationEClass.getESuperTypes().add(this.getAbstractMethodDeclaration());
		abstractMethodInvocationEClass.getESuperTypes().add(this.getASTNode());
		methodInvocationEClass.getESuperTypes().add(this.getAbstractMethodInvocation());
		assignmentEClass.getESuperTypes().add(this.getExpresion());
		classInstanceCreationEClass.getESuperTypes().add(this.getAbstractMethodInvocation());
		constructorInvocationEClass.getESuperTypes().add(this.getAbstractMethodInvocation());
		returnTypeEClass.getESuperTypes().add(this.getType());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Archives(), this.getArchive(), null, "archives", null, 0, -1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_CompileUnits(), this.getCompileUnit(), null, "compileUnits", null, 0, -1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Path(), ecorePackage.getEString(), "path", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_EnumLiterals(), this.getEnumerationLiteral(), null, "enumLiterals", null, 0, -1,
				Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDeclarationEClass, ClassDeclaration.class, "ClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDeclaration_SuperClass(), this.getType(), null, "superClass", null, 0, 1,
				ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceDeclarationEClass, InterfaceDeclaration.class, "InterfaceDeclaration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveType_Kind(), this.getSimpleType(), "kind", null, 0, 1, PrimitiveType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_Classes(), this.getTypeDeclaration(), null, "classes", null, 0, -1, Namespace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_Enumerations(), this.getEnumeration(), null, "enumerations", null, 0, -1,
				Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodParameterEClass, MethodParameter.class, "MethodParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodParameter_Type(), this.getType(), null, "type", null, 1, 1, MethodParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compileUnitEClass, CompileUnit.class, "CompileUnit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompileUnit_Elements(), this.getNamedElement(), null, "elements", null, 0, -1,
				CompileUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompileUnit_OriginalFilePath(), ecorePackage.getEString(), "originalFilePath", null, 0, 1,
				CompileUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCompileUnit_CommentList(), this.getComment(), null, "commentList", null, 0, -1,
				CompileUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompileUnit_TypeDeclaration(), this.getAbstractTypeDeclaration(), null, "typeDeclaration",
				null, 0, 1, CompileUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompileUnit_Usings(), this.getUsingDeclaration(), null, "usings", null, 0, -1,
				CompileUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompileUnit_Namespace(), this.getNamespace(), null, "namespace", null, 0, 1,
				CompileUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompileUnit_Namspace(), ecorePackage.getEString(), "namspace", null, 0, 1, CompileUnit.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementRefEClass, ElementRef.class, "ElementRef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(astNodeEClass, ASTNode.class, "ASTNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getASTNode_OriginalCompilationUnit(), this.getCompileUnit(), null, "originalCompilationUnit",
				null, 0, 1, ASTNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archiveEClass, Archive.class, "Archive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchive_OriginalFilePath(), ecorePackage.getEString(), "originalFilePath", null, 0, 1,
				Archive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getArchive_CompileUnits(), this.getCompileUnit(), null, "compileUnits", null, 0, -1,
				Archive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usingDeclarationEClass, UsingDeclaration.class, "UsingDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(commentEClass, Comment.class, "Comment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Content(), ecorePackage.getEString(), "content", null, 0, 1, Comment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineCommentEClass, LineComment.class, "LineComment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockCommentEClass, BlockComment.class, "BlockComment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractTypeDeclarationEClass, AbstractTypeDeclaration.class, "AbstractTypeDeclaration", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractTypeDeclaration_CommentsBeforeBody(), this.getComment(), null, "commentsBeforeBody",
				null, 0, -1, AbstractTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTypeDeclaration_CommentsAfterBody(), this.getComment(), null, "commentsAfterBody",
				null, 0, -1, AbstractTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTypeDeclaration_BodyDeclarations(), this.getBodyDeclaration(), null,
				"bodyDeclarations", null, 0, -1, AbstractTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTypeDeclaration_Modifier(), this.getModifier(), null, "modifier", null, 1, 1,
				AbstractTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeAccesEClass, TypeAcces.class, "TypeAcces", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(expresionEClass, Expresion.class, "Expresion", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(bodyDeclarationEClass, BodyDeclaration.class, "BodyDeclaration", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodyDeclaration_Modifier(), this.getModifier(), this.getModifier_BodyDeclaration(),
				"modifier", null, 0, 1, BodyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modifierEClass, Modifier.class, "Modifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModifier_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, Modifier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Inheritance(), this.getInheritanceKind(), "inheritance", null, 0, 1, Modifier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, Modifier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifier_BodyDeclaration(), this.getBodyDeclaration(), this.getBodyDeclaration_Modifier(),
				"bodyDeclaration", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModifier_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1,
				Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Modifier(), this.getModifierKind(), "modifier", null, 0, 1, Modifier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_Typeacces(), this.getTypeAcces(), null, "typeacces", null, 1, 1, Annotation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMethodDeclarationEClass, AbstractMethodDeclaration.class, "AbstractMethodDeclaration",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMethodDeclaration_Body(), this.getBlock(), null, "body", null, 0, 1,
				AbstractMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMethodDeclaration_Parameters(), this.getVariableDeclaration(),
				this.getVariableDeclaration_MethodDeclaration(), "parameters", null, 0, -1,
				AbstractMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMethodDeclaration_TypeParameters(), this.getTypeParameter(), null, "typeParameters",
				null, 0, -1, AbstractMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMethodDeclaration_ThrownExceptions(), this.getTypeAcces(), null, "thrownExceptions",
				null, 0, -1, AbstractMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMethodDeclaration_ReturnType(), this.getType(), null, "returnType", null, 1, 1,
				AbstractMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDeclaration_MethodDeclaration(), this.getAbstractMethodDeclaration(),
				this.getAbstractMethodDeclaration_Parameters(), "methodDeclaration", null, 0, 1,
				VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclaration_Type(), this.getType(), null, "type", null, 1, 1,
				VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleVariableDeclarationEClass, SingleVariableDeclaration.class, "SingleVariableDeclaration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeParameterEClass, TypeParameter.class, "TypeParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodDeclarationEClass, MethodDeclaration.class, "MethodDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodDeclaration_LocalVariableDeclaration(), this.getBodyDeclaration(), null,
				"localVariableDeclaration", null, 0, -1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorDeclarationEClass, ConstructorDeclaration.class, "ConstructorDeclaration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractMethodInvocationEClass, AbstractMethodInvocation.class, "AbstractMethodInvocation",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMethodInvocation_TypeArguments(), this.getTypeAcces(), null, "typeArguments", null, 0,
				-1, AbstractMethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMethodInvocation_Arguments(), this.getExpresion(), null, "arguments", null, 0, -1,
				AbstractMethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodInvocationEClass, MethodInvocation.class, "MethodInvocation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodInvocation_Expression(), this.getExpresion(), null, "expression", null, 0, -1,
				MethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(classInstanceCreationEClass, ClassInstanceCreation.class, "ClassInstanceCreation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassInstanceCreation_Type(), this.getTypeAcces(), null, "type", null, 1, 1,
				ClassInstanceCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassInstanceCreation_Expresion(), this.getExpresion(), null, "expresion", null, 0, 1,
				ClassInstanceCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(constructorInvocationEClass, ConstructorInvocation.class, "ConstructorInvocation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnTypeEClass, ReturnType.class, "ReturnType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnType_ReturnType(), this.getSimpleType(), "returnType", "bool", 0, 1, ReturnType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(simpleTypeEEnum, SimpleType.class, "SimpleType");
		addEEnumLiteral(simpleTypeEEnum, SimpleType.BOOL);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.BYTE);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.CHAR);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.DECIMAL);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.DOUBLE);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.FLOAT);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.INT);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.LONG);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.SBYTE);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.SHORT);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.UINT);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.ULONG);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.USHORT);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.VOID);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.OBJECT);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.STRING);

		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.NONE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.INTERNAL);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.INTERNAL_PROTECTED);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE_PROTECTED);

		initEEnum(modifierKindEEnum, ModifierKind.class, "ModifierKind");
		addEEnumLiteral(modifierKindEEnum, ModifierKind.STATIC);
		addEEnumLiteral(modifierKindEEnum, ModifierKind.NATIVE);
		addEEnumLiteral(modifierKindEEnum, ModifierKind.SINCHRONIZED);
		addEEnumLiteral(modifierKindEEnum, ModifierKind.VIRTUAL);
		addEEnumLiteral(modifierKindEEnum, ModifierKind.OVERRIDE);
		addEEnumLiteral(modifierKindEEnum, ModifierKind.READONLY);
		addEEnumLiteral(modifierKindEEnum, ModifierKind.CONST);
		addEEnumLiteral(modifierKindEEnum, ModifierKind.NEW);
		addEEnumLiteral(modifierKindEEnum, ModifierKind.NONE);

		initEEnum(inheritanceKindEEnum, InheritanceKind.class, "InheritanceKind");
		addEEnumLiteral(inheritanceKindEEnum, InheritanceKind.NONE);
		addEEnumLiteral(inheritanceKindEEnum, InheritanceKind.ABSTRACT);
		addEEnumLiteral(inheritanceKindEEnum, InheritanceKind.SEALED);

		// Create resource
		createResource(eNS_URI);
	}

} //CSharpArchIdPackageImpl
