/**
 */
package co.edu.uniandes.archid.csharp.model.cSharpArchId.util;

import co.edu.uniandes.archid.csharp.model.cSharpArchId.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage
 * @generated
 */
public class CSharpArchIdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CSharpArchIdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpArchIdSwitch() {
		if (modelPackage == null) {
			modelPackage = CSharpArchIdPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CSharpArchIdPackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.ENUMERATION_LITERAL: {
			EnumerationLiteral enumerationLiteral = (EnumerationLiteral) theEObject;
			T result = caseEnumerationLiteral(enumerationLiteral);
			if (result == null)
				result = caseNamedElement(enumerationLiteral);
			if (result == null)
				result = caseASTNode(enumerationLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = caseASTNode(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = caseNamedElement(type);
			if (result == null)
				result = caseASTNode(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.ENUMERATION: {
			Enumeration enumeration = (Enumeration) theEObject;
			T result = caseEnumeration(enumeration);
			if (result == null)
				result = caseType(enumeration);
			if (result == null)
				result = caseNamedElement(enumeration);
			if (result == null)
				result = caseASTNode(enumeration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.CLASS_DECLARATION: {
			ClassDeclaration classDeclaration = (ClassDeclaration) theEObject;
			T result = caseClassDeclaration(classDeclaration);
			if (result == null)
				result = caseTypeDeclaration(classDeclaration);
			if (result == null)
				result = caseAbstractTypeDeclaration(classDeclaration);
			if (result == null)
				result = caseType(classDeclaration);
			if (result == null)
				result = caseNamedElement(classDeclaration);
			if (result == null)
				result = caseASTNode(classDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.INTERFACE_DECLARATION: {
			InterfaceDeclaration interfaceDeclaration = (InterfaceDeclaration) theEObject;
			T result = caseInterfaceDeclaration(interfaceDeclaration);
			if (result == null)
				result = caseTypeDeclaration(interfaceDeclaration);
			if (result == null)
				result = caseAbstractTypeDeclaration(interfaceDeclaration);
			if (result == null)
				result = caseType(interfaceDeclaration);
			if (result == null)
				result = caseNamedElement(interfaceDeclaration);
			if (result == null)
				result = caseASTNode(interfaceDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.PRIMITIVE_TYPE: {
			PrimitiveType primitiveType = (PrimitiveType) theEObject;
			T result = casePrimitiveType(primitiveType);
			if (result == null)
				result = caseType(primitiveType);
			if (result == null)
				result = caseNamedElement(primitiveType);
			if (result == null)
				result = caseASTNode(primitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.NAMESPACE: {
			Namespace namespace = (Namespace) theEObject;
			T result = caseNamespace(namespace);
			if (result == null)
				result = caseNamedElement(namespace);
			if (result == null)
				result = caseASTNode(namespace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.METHOD_PARAMETER: {
			MethodParameter methodParameter = (MethodParameter) theEObject;
			T result = caseMethodParameter(methodParameter);
			if (result == null)
				result = caseNamedElement(methodParameter);
			if (result == null)
				result = caseASTNode(methodParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.COMPILE_UNIT: {
			CompileUnit compileUnit = (CompileUnit) theEObject;
			T result = caseCompileUnit(compileUnit);
			if (result == null)
				result = caseNamedElement(compileUnit);
			if (result == null)
				result = caseASTNode(compileUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.ELEMENT_REF: {
			ElementRef elementRef = (ElementRef) theEObject;
			T result = caseElementRef(elementRef);
			if (result == null)
				result = caseType(elementRef);
			if (result == null)
				result = caseNamedElement(elementRef);
			if (result == null)
				result = caseASTNode(elementRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.AST_NODE: {
			ASTNode astNode = (ASTNode) theEObject;
			T result = caseASTNode(astNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.ARCHIVE: {
			Archive archive = (Archive) theEObject;
			T result = caseArchive(archive);
			if (result == null)
				result = caseNamedElement(archive);
			if (result == null)
				result = caseASTNode(archive);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.USING_DECLARATION: {
			UsingDeclaration usingDeclaration = (UsingDeclaration) theEObject;
			T result = caseUsingDeclaration(usingDeclaration);
			if (result == null)
				result = caseNamedElement(usingDeclaration);
			if (result == null)
				result = caseASTNode(usingDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.COMMENT: {
			Comment comment = (Comment) theEObject;
			T result = caseComment(comment);
			if (result == null)
				result = caseASTNode(comment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.LINE_COMMENT: {
			LineComment lineComment = (LineComment) theEObject;
			T result = caseLineComment(lineComment);
			if (result == null)
				result = caseComment(lineComment);
			if (result == null)
				result = caseASTNode(lineComment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.BLOCK_COMMENT: {
			BlockComment blockComment = (BlockComment) theEObject;
			T result = caseBlockComment(blockComment);
			if (result == null)
				result = caseComment(blockComment);
			if (result == null)
				result = caseASTNode(blockComment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.ABSTRACT_TYPE_DECLARATION: {
			AbstractTypeDeclaration abstractTypeDeclaration = (AbstractTypeDeclaration) theEObject;
			T result = caseAbstractTypeDeclaration(abstractTypeDeclaration);
			if (result == null)
				result = caseType(abstractTypeDeclaration);
			if (result == null)
				result = caseNamedElement(abstractTypeDeclaration);
			if (result == null)
				result = caseASTNode(abstractTypeDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.TYPE_DECLARATION: {
			TypeDeclaration typeDeclaration = (TypeDeclaration) theEObject;
			T result = caseTypeDeclaration(typeDeclaration);
			if (result == null)
				result = caseAbstractTypeDeclaration(typeDeclaration);
			if (result == null)
				result = caseType(typeDeclaration);
			if (result == null)
				result = caseNamedElement(typeDeclaration);
			if (result == null)
				result = caseASTNode(typeDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.TYPE_ACCES: {
			TypeAcces typeAcces = (TypeAcces) theEObject;
			T result = caseTypeAcces(typeAcces);
			if (result == null)
				result = caseExpresion(typeAcces);
			if (result == null)
				result = caseASTNode(typeAcces);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.EXPRESION: {
			Expresion expresion = (Expresion) theEObject;
			T result = caseExpresion(expresion);
			if (result == null)
				result = caseASTNode(expresion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.BODY_DECLARATION: {
			BodyDeclaration bodyDeclaration = (BodyDeclaration) theEObject;
			T result = caseBodyDeclaration(bodyDeclaration);
			if (result == null)
				result = caseNamedElement(bodyDeclaration);
			if (result == null)
				result = caseASTNode(bodyDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.MODIFIER: {
			Modifier modifier = (Modifier) theEObject;
			T result = caseModifier(modifier);
			if (result == null)
				result = caseASTNode(modifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.ANNOTATION: {
			Annotation annotation = (Annotation) theEObject;
			T result = caseAnnotation(annotation);
			if (result == null)
				result = caseExpresion(annotation);
			if (result == null)
				result = caseASTNode(annotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.ABSTRACT_METHOD_DECLARATION: {
			AbstractMethodDeclaration abstractMethodDeclaration = (AbstractMethodDeclaration) theEObject;
			T result = caseAbstractMethodDeclaration(abstractMethodDeclaration);
			if (result == null)
				result = caseBodyDeclaration(abstractMethodDeclaration);
			if (result == null)
				result = caseNamedElement(abstractMethodDeclaration);
			if (result == null)
				result = caseASTNode(abstractMethodDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = caseStatement(block);
			if (result == null)
				result = caseASTNode(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = caseASTNode(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.VARIABLE_DECLARATION: {
			VariableDeclaration variableDeclaration = (VariableDeclaration) theEObject;
			T result = caseVariableDeclaration(variableDeclaration);
			if (result == null)
				result = caseBodyDeclaration(variableDeclaration);
			if (result == null)
				result = caseNamedElement(variableDeclaration);
			if (result == null)
				result = caseASTNode(variableDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.SINGLE_VARIABLE_DECLARATION: {
			SingleVariableDeclaration singleVariableDeclaration = (SingleVariableDeclaration) theEObject;
			T result = caseSingleVariableDeclaration(singleVariableDeclaration);
			if (result == null)
				result = caseVariableDeclaration(singleVariableDeclaration);
			if (result == null)
				result = caseBodyDeclaration(singleVariableDeclaration);
			if (result == null)
				result = caseNamedElement(singleVariableDeclaration);
			if (result == null)
				result = caseASTNode(singleVariableDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.TYPE_PARAMETER: {
			TypeParameter typeParameter = (TypeParameter) theEObject;
			T result = caseTypeParameter(typeParameter);
			if (result == null)
				result = caseType(typeParameter);
			if (result == null)
				result = caseNamedElement(typeParameter);
			if (result == null)
				result = caseASTNode(typeParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.METHOD_DECLARATION: {
			MethodDeclaration methodDeclaration = (MethodDeclaration) theEObject;
			T result = caseMethodDeclaration(methodDeclaration);
			if (result == null)
				result = caseAbstractMethodDeclaration(methodDeclaration);
			if (result == null)
				result = caseBodyDeclaration(methodDeclaration);
			if (result == null)
				result = caseNamedElement(methodDeclaration);
			if (result == null)
				result = caseASTNode(methodDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.CONSTRUCTOR_DECLARATION: {
			ConstructorDeclaration constructorDeclaration = (ConstructorDeclaration) theEObject;
			T result = caseConstructorDeclaration(constructorDeclaration);
			if (result == null)
				result = caseAbstractMethodDeclaration(constructorDeclaration);
			if (result == null)
				result = caseBodyDeclaration(constructorDeclaration);
			if (result == null)
				result = caseNamedElement(constructorDeclaration);
			if (result == null)
				result = caseASTNode(constructorDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.ABSTRACT_METHOD_INVOCATION: {
			AbstractMethodInvocation abstractMethodInvocation = (AbstractMethodInvocation) theEObject;
			T result = caseAbstractMethodInvocation(abstractMethodInvocation);
			if (result == null)
				result = caseASTNode(abstractMethodInvocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.METHOD_INVOCATION: {
			MethodInvocation methodInvocation = (MethodInvocation) theEObject;
			T result = caseMethodInvocation(methodInvocation);
			if (result == null)
				result = caseAbstractMethodInvocation(methodInvocation);
			if (result == null)
				result = caseASTNode(methodInvocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.ASSIGNMENT: {
			Assignment assignment = (Assignment) theEObject;
			T result = caseAssignment(assignment);
			if (result == null)
				result = caseExpresion(assignment);
			if (result == null)
				result = caseASTNode(assignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.CLASS_INSTANCE_CREATION: {
			ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) theEObject;
			T result = caseClassInstanceCreation(classInstanceCreation);
			if (result == null)
				result = caseAbstractMethodInvocation(classInstanceCreation);
			if (result == null)
				result = caseASTNode(classInstanceCreation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.CONSTRUCTOR_INVOCATION: {
			ConstructorInvocation constructorInvocation = (ConstructorInvocation) theEObject;
			T result = caseConstructorInvocation(constructorInvocation);
			if (result == null)
				result = caseAbstractMethodInvocation(constructorInvocation);
			if (result == null)
				result = caseASTNode(constructorInvocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CSharpArchIdPackage.RETURN_TYPE: {
			ReturnType returnType = (ReturnType) theEObject;
			T result = caseReturnType(returnType);
			if (result == null)
				result = caseType(returnType);
			if (result == null)
				result = caseNamedElement(returnType);
			if (result == null)
				result = caseASTNode(returnType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDeclaration(ClassDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDeclaration(InterfaceDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameter(MethodParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compile Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compile Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompileUnit(CompileUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementRef(ElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AST Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AST Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTNode(ASTNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchive(Archive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Using Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Using Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsingDeclaration(UsingDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineComment(LineComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockComment(BlockComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeDeclaration(AbstractTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclaration(TypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Acces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Acces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAcces(TypeAcces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpresion(Expresion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyDeclaration(BodyDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier(Modifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodDeclaration(AbstractMethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableDeclaration(SingleVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter(TypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeclaration(MethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorDeclaration(ConstructorDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodInvocation(AbstractMethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocation(MethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Instance Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Instance Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInstanceCreation(ClassInstanceCreation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorInvocation(ConstructorInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType(ReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CSharpArchIdSwitch
