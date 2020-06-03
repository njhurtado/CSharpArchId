package co.edu.uniandes.archid.csharp.antlr;
import java.util.List;

import org.antlr.v4.runtime.Token;
// Generated from CSharpParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import co.edu.uniandes.archid.csharp.model.cSharpArchId.AbstractTypeDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdFactory;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ConstructorDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ElementRef;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.InheritanceKind;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.InterfaceDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.MethodDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Model;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Modifier;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ModifierKind;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Namespace;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ReturnType;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.SimpleType;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.SingleVariableDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.UsingDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.VisibilityKind;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl;
import co.edu.uniandes.archid.csharp.util.Util;

/**
 * This class provides an empty implementation of {@link CSharpParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class CSharpParserAdvancedVisitor<T> extends AbstractParseTreeVisitor<T> implements CSharpParserVisitor<T> {
	
	private Model model;	
	private CSharpArchIdFactory factory;
	private CompileUnit cuParent;
	private AbstractTypeDeclaration typeParent;
	//private co.edu.uniandes.archid.csharp.model.cSharpArchId.ASTNode parent;
	private MethodDeclaration methodDeclParent;
	private ConstructorDeclaration constDeclarationParent;
	//private String projectName;
	private String filePath;
	
	/**
	 * Constructor for a new model.
	 * @param modelName value of new model
	 * @param cuName value of new Compile Unit.
	 * */
	public CSharpParserAdvancedVisitor(final String modelName, String fileName, String filePath, String projectName) {
		CSharpArchIdPackageImpl.init();
        // Retrieve the default factory singleton
		this.filePath = filePath.substring(filePath.indexOf(projectName));
		this.filePath = this.filePath.replaceAll("\\", "/");
        // create an instance of myWeb
		//this.projectName = projectName;
		model = factory.createModel();
		model.setName(modelName);
		cuParent = factory.createCompileUnit();
		cuParent.setName(fileName);
		cuParent.setOriginalFilePath(filePath);
		cuParent.setPath(this.filePath + "#L5");
		model.getCompileUnits().add(cuParent);
		
	}
	
	/**
	 * Constructor for a existing model.
	 * @param model value of existing model
	 * @param cuName value of new Compile Unit.
	 * */
	public CSharpParserAdvancedVisitor(Model model, String fileName, String filePath, String projectName) {
		this.model = model;
		factory = CSharpArchIdFactory.eINSTANCE;
		if(filePath.indexOf("src") >= 0) {
			this.filePath = filePath.substring(filePath.indexOf("src"));
			this.filePath = this.filePath.replaceAll("\\\\", "/");
		} else {
			this.filePath = filePath;
		}
		
		cuParent = factory.createCompileUnit();
		cuParent.setName(fileName);
		cuParent.setOriginalFilePath(filePath);
		cuParent.setPath(this.filePath + "#L5");
		model.getCompileUnits().add(cuParent);
		//this.projectName = projectName;
	}

	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
	public T visitCompilation_unit(CSharpParser.Compilation_unitContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		final List<Token> tokensCUNames = Util.getTokensWithType(tokens, CSharpParser.IDENTIFIER);
		for(Token t : tokensCUNames) {
			CompileUnit cu = factory.createCompileUnit();
			cu.setName(t.getText());
			archiveParent.getCompileUnits().add(cu);
			System.out.println("Se agrega Compilation_unit ->" + t.getText());
		}*/
		
		return visitChildren(ctx); 
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
	public T visitNamespace_or_type_name(CSharpParser.Namespace_or_type_nameContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		
		final String name = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getText();
		System.out.println("Namespace ->" + name);*/
		return visitChildren(ctx); 		
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
	public T visitType_(CSharpParser.Type_Context ctx) { 
		return visitChildren(ctx); 
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitBase_type(CSharpParser.Base_typeContext ctx) {
		return visitChildren(ctx);
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSimple_type(CSharpParser.Simple_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNumeric_type(CSharpParser.Numeric_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIntegral_type(CSharpParser.Integral_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFloating_point_type(CSharpParser.Floating_point_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_type(CSharpParser.Class_typeContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Class_type -> Linea: " + t.getLine() + " Texto: " + t.getText());
		}*/
		//final String name = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getText();
		//System.out.println("Class_type ->" + name);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_argument_list(CSharpParser.Type_argument_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArgument_list(CSharpParser.Argument_listContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Argument_list -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArgument(CSharpParser.ArgumentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExpression(CSharpParser.ExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNon_assignment_expression(CSharpParser.Non_assignment_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAssignment(CSharpParser.AssignmentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAssignment_operator(CSharpParser.Assignment_operatorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConditional_expression(CSharpParser.Conditional_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNull_coalescing_expression(CSharpParser.Null_coalescing_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConditional_or_expression(CSharpParser.Conditional_or_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConditional_and_expression(CSharpParser.Conditional_and_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInclusive_or_expression(CSharpParser.Inclusive_or_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExclusive_or_expression(CSharpParser.Exclusive_or_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAnd_expression(CSharpParser.And_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEquality_expression(CSharpParser.Equality_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRelational_expression(CSharpParser.Relational_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitShift_expression(CSharpParser.Shift_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAdditive_expression(CSharpParser.Additive_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMultiplicative_expression(CSharpParser.Multiplicative_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUnary_expression(CSharpParser.Unary_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPrimary_expression(CSharpParser.Primary_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLiteralExpression(CSharpParser.LiteralExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSimpleNameExpression(CSharpParser.SimpleNameExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitParenthesisExpressions(CSharpParser.ParenthesisExpressionsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMemberAccessExpression(CSharpParser.MemberAccessExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLiteralAccessExpression(CSharpParser.LiteralAccessExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitThisReferenceExpression(CSharpParser.ThisReferenceExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBaseAccessExpression(CSharpParser.BaseAccessExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitObjectCreationExpression(CSharpParser.ObjectCreationExpressionContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token ObjectCreationExpression -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitTypeofExpression(CSharpParser.TypeofExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCheckedExpression(CSharpParser.CheckedExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUncheckedExpression(CSharpParser.UncheckedExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDefaultValueExpression(CSharpParser.DefaultValueExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAnonymousMethodExpression(CSharpParser.AnonymousMethodExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSizeofExpression(CSharpParser.SizeofExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNameofExpression(CSharpParser.NameofExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_access(CSharpParser.Member_accessContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Member_access -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBracket_expression(CSharpParser.Bracket_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIndexer_argument(CSharpParser.Indexer_argumentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPredefined_type(CSharpParser.Predefined_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExpression_list(CSharpParser.Expression_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitObject_or_collection_initializer(CSharpParser.Object_or_collection_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitObject_initializer(CSharpParser.Object_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_initializer_list(CSharpParser.Member_initializer_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_initializer(CSharpParser.Member_initializerContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Member_initializer -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInitializer_value(CSharpParser.Initializer_valueContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCollection_initializer(CSharpParser.Collection_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitElement_initializer(CSharpParser.Element_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAnonymous_object_initializer(CSharpParser.Anonymous_object_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_declarator_list(CSharpParser.Member_declarator_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_declarator(CSharpParser.Member_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUnbound_type_name(CSharpParser.Unbound_type_nameContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGeneric_dimension_specifier(CSharpParser.Generic_dimension_specifierContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Generic_dimension_specifier -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIsType(CSharpParser.IsTypeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLambda_expression(CSharpParser.Lambda_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAnonymous_function_signature(CSharpParser.Anonymous_function_signatureContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExplicit_anonymous_function_parameter_list(
			CSharpParser.Explicit_anonymous_function_parameter_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExplicit_anonymous_function_parameter(CSharpParser.Explicit_anonymous_function_parameterContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitImplicit_anonymous_function_parameter_list(
			CSharpParser.Implicit_anonymous_function_parameter_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAnonymous_function_body(CSharpParser.Anonymous_function_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQuery_expression(CSharpParser.Query_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFrom_clause(CSharpParser.From_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQuery_body(CSharpParser.Query_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQuery_body_clause(CSharpParser.Query_body_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLet_clause(CSharpParser.Let_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitWhere_clause(CSharpParser.Where_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCombined_join_clause(CSharpParser.Combined_join_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOrderby_clause(CSharpParser.Orderby_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOrdering(CSharpParser.OrderingContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSelect_or_group_clause(CSharpParser.Select_or_group_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQuery_continuation(CSharpParser.Query_continuationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLabeledStatement(CSharpParser.LabeledStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDeclarationStatement(CSharpParser.DeclarationStatementContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token DeclarationStatement -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEmbeddedStatement(CSharpParser.EmbeddedStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLabeled_Statement(CSharpParser.Labeled_StatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEmbedded_statement(CSharpParser.Embedded_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitTheEmptyStatement(CSharpParser.TheEmptyStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExpressionStatement(CSharpParser.ExpressionStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIfStatement(CSharpParser.IfStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSwitchStatement(CSharpParser.SwitchStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitWhileStatement(CSharpParser.WhileStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDoStatement(CSharpParser.DoStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitForStatement(CSharpParser.ForStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitForeachStatement(CSharpParser.ForeachStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBreakStatement(CSharpParser.BreakStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitContinueStatement(CSharpParser.ContinueStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGotoStatement(CSharpParser.GotoStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitReturnStatement(CSharpParser.ReturnStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitThrowStatement(CSharpParser.ThrowStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitTryStatement(CSharpParser.TryStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCheckedStatement(CSharpParser.CheckedStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUncheckedStatement(CSharpParser.UncheckedStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLockStatement(CSharpParser.LockStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUsingStatement(CSharpParser.UsingStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitYieldStatement(CSharpParser.YieldStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUnsafeStatement(CSharpParser.UnsafeStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixedStatement(CSharpParser.FixedStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBlock(CSharpParser.BlockContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Local_variable_declaration -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		final String name = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getText();
		Token tok = Util.getTokenAfterType(tokens,  CSharpParser.IDENTIFIER);
		if(tok.getText().equals("=")) {
			tok = Util.getSecondTokenWithType(tokens,  CSharpParser.IDENTIFIER);
		}
		//Si tiene el caracter ( es porque se trata de un metodo, de lo contrario es una atributo de clase 
		SingleVariableDeclaration variableDecl = factory.createSingleVariableDeclaration();
		variableDecl.setPath(this.filePath + "#L" + Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getLine());
		//El elemento referenciado el primer identificador, el segundo es el nombre de la variable
		ElementRef ref = factory.createElementRef();
		ref.setName(name);
		if(tok != null) {
			variableDecl.setName(name);
			ref.setName(tok.getText());
		} else {
			variableDecl.setName(name);
		}
		variableDecl.setType(ref);
		//variableDecl.setPath(this.filePath + "@" + Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getLine());
		if(methodDeclParent !=  null) {
			methodDeclParent.getLocalVariableDeclaration().add(variableDecl);
		}
				
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_variable_type(CSharpParser.Local_variable_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_variable_declarator(CSharpParser.Local_variable_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_variable_initializer(CSharpParser.Local_variable_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_constant_declaration(CSharpParser.Local_constant_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIf_body(CSharpParser.If_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSwitch_section(CSharpParser.Switch_sectionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSwitch_label(CSharpParser.Switch_labelContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStatement_list(CSharpParser.Statement_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFor_initializer(CSharpParser.For_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFor_iterator(CSharpParser.For_iteratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCatch_clauses(CSharpParser.Catch_clausesContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSpecific_catch_clause(CSharpParser.Specific_catch_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGeneral_catch_clause(CSharpParser.General_catch_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitException_filter(CSharpParser.Exception_filterContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFinally_clause(CSharpParser.Finally_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitResource_acquisition(CSharpParser.Resource_acquisitionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNamespace_declaration(CSharpParser.Namespace_declarationContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		final String name = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getText();
		System.out.println("Namespace_declaration ->" + name);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQualified_identifier(CSharpParser.Qualified_identifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNamespace_body(CSharpParser.Namespace_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExtern_alias_directives(CSharpParser.Extern_alias_directivesContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExtern_alias_directive(CSharpParser.Extern_alias_directiveContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUsing_directives(CSharpParser.Using_directivesContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Using_directives -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type: " + t.getType());
		}*/
		
			//System.out.println("Token Using_directives -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type: " + t.getType());
		//final String name = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getText();
		
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUsingAliasDirective(CSharpParser.UsingAliasDirectiveContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token UsingAliasDirective -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type: " + t.getType());
		}
		final String name = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getText();
		//System.out.println("UsingAliasDirective ->" + name);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUsingNamespaceDirective(CSharpParser.UsingNamespaceDirectiveContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		/*for(Token t : tokens) {
			System.out.println("Token UsingNamespaceDirective -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type: " + t.getType());
		}*/
		List<Token> tokensBeforeName = Util.getTokensBeforeType(tokens, CSharpParser.SEMICOLON);
		String nom = "";
		for(Token t : tokensBeforeName) {
			if(t.getType() == CSharpParser.IDENTIFIER || t.getType() == CSharpParser.DOT) {
				nom += t.getText();
			}
		}
		
		UsingDeclaration usingDecl = factory.createUsingDeclaration();
		usingDecl.setName(nom);
		cuParent.getUsings().add(usingDecl);
		System.out.println("Se agrega UsingNamespaceDirective ->" + nom);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUsingStaticDirective(CSharpParser.UsingStaticDirectiveContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNamespace_member_declarations(CSharpParser.Namespace_member_declarationsContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		final List<Token> tokensNamespaceName = Util.getTokensBetween(tokens, CSharpParser.NAMESPACE, CSharpParser.OPEN_BRACE);
		if(tokensNamespaceName != null && !tokensNamespaceName.isEmpty()) {
			StringBuffer namespaceName = new StringBuffer();
			for(Token t : tokensNamespaceName) {
				namespaceName.append(t.getText());
			}
			Namespace namespace = factory.createNamespace();
			namespace.setName(namespaceName.toString());
			cuParent.setNamespace(namespace);
			cuParent.setNamspace(namespaceName.toString());
		}
		
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNamespace_member_declaration(CSharpParser.Namespace_member_declarationContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Namespace_member_declaration -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_declaration(CSharpParser.Type_declarationContext ctx) {
		List<Token> tokens = Util.getFlatTokenList(ctx);
		
		/*List<List<Token>> tokensByRange = Util.getTokensByRange(tokens, CSharpParser.OPEN_BRACKET, CSharpParser.CLOSE_BRACKET);
		
		if(tokensByRange.isEmpty()) {
			//Se obtienen los tokens que representan anotaciones pues vienen entre los caracteres []
		}*/
		
		int indexOfToken = Util.getLastTokenIndex(tokens, CSharpParser.CLOSE_BRACKET,  CSharpParser.OPEN_BRACE);
		if(indexOfToken > 0) {
			tokens = Util.getTokensFromIndex(tokens, indexOfToken+1);
		}
		
		/*for(Token t : tokens) {
			System.out.println("Token Type_declaration -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}*/
		List<Token> tokensBeforeName = Util.getTokensBeforeType(tokens, CSharpParser.IDENTIFIER);		
		
		final Token tokenName = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER);
		final Token tokenSuperClass = Util.getTokenAfterType(tokens, CSharpParser.COLON);
		
		Modifier modifier = factory.createModifier();
		
		boolean isClass = false;
		boolean isInterface = false;

		
		for(Token t : tokensBeforeName) {
			
			if(VisibilityKind.get(t.getText()) != null){
				//System.out.println("modifer VisibilityKind ->" + t.getText());
				modifier.setVisibility(VisibilityKind.get(t.getText()));
			}
			if(InheritanceKind.get(t.getText()) != null){
				//System.out.println("modifier InheritanceKind ->" + t.getText());
				modifier.setInheritance(InheritanceKind.get(t.getText()));
			}
			if(ModifierKind.get(t.getText()) != null && ModifierKind.get(t.getText()).equals(CSharpParser.ABSTRACT)){
				//System.out.println("modifier ModifierKind ->" + t.getText());
				modifier.setStatic(true);
			} else {
				modifier.setStatic(false);
			}
			if(t.getType() == CSharpParser.INTERFACE) {
				isInterface = true;
			}
			if(t.getType() == CSharpParser.CLASS) {
				isClass = true;
			}
		}
		
		if(isClass) {
			ClassDeclaration classDecl = factory.createClassDeclaration();
			classDecl.setName(tokenName.getText());
			if(tokenSuperClass != null) {
				ElementRef ref = factory.createElementRef();
				ref.setName(tokenSuperClass.getText());
				classDecl.setSuperClass(ref);
			}
			classDecl.setModifier(modifier);
			classDecl.setPath(this.filePath + "#L" + Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getLine());
			cuParent.getElements().add(classDecl);
			typeParent = classDecl;
			System.out.println("Se adiciona Type_declaration -> " + tokenName.getText());
		} else if (isInterface) {
			InterfaceDeclaration classDecl = factory.createInterfaceDeclaration();
			classDecl.setName(tokenName.getText());
			classDecl.setModifier(modifier);
			classDecl.setPath(this.filePath + "#L" + Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getLine());
			cuParent.getElements().add(classDecl);
			typeParent = classDecl;
			System.out.println("Se adiciona Type_declaration -> " + tokenName.getText());
		} else {
			System.out.println("No se adiciona Type_declaration -> " + tokenName.getText());
		}
		
		
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQualified_alias_member(CSharpParser.Qualified_alias_memberContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_parameter_list(CSharpParser.Type_parameter_listContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Type_parameter_list -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type: " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_parameter(CSharpParser.Type_parameterContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Type_parameter -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type: " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_base(CSharpParser.Class_baseContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Class_base -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type: " + t.getType());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_type_list(CSharpParser.Interface_type_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_parameter_constraints_clauses(CSharpParser.Type_parameter_constraints_clausesContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Type_parameter_constraints_clauses -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_parameter_constraints_clause(CSharpParser.Type_parameter_constraints_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_parameter_constraints(CSharpParser.Type_parameter_constraintsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPrimary_constraint(CSharpParser.Primary_constraintContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSecondary_constraints(CSharpParser.Secondary_constraintsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstructor_constraint(CSharpParser.Constructor_constraintContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_body(CSharpParser.Class_bodyContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Class_body -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type: " + t.getType());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_member_declarations(CSharpParser.Class_member_declarationsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_member_declaration(CSharpParser.Class_member_declarationContext ctx) {
		List<Token> tokens = Util.getFlatTokenList(ctx);
		//for(Token t : tokens) {
			//System.out.println("Token Class_body -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type: " + t.getType());
		//}
		//if(tokens != null && tokens.isEmpty() && Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER) != null) {
		Token tokName = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER);
		if(tokName != null) {
			String name = tokName.getText();
			if(Util.getFirstTokenWithType(tokens, CSharpParser.OPEN_BRACKET) != null) {
				tokens = Util.removeTokensBetween(tokens, CSharpParser.OPEN_BRACKET, CSharpParser.CLOSE_BRACKET); 
				//Si el token es un [ es un comentario y se debe buscar el nombre antes del caracter (
				Token tk = Util.getTokenBeforeType(tokens, CSharpParser.OPEN_PARENS);
				if(tk.getType() == CSharpParser.IDENTIFIER) {
					name = tk.getText();
				}
			}
			
			List<Token> tokensBeforeName = Util.getTokensBeforeType(tokens, CSharpParser.IDENTIFIER);
			Modifier modifier = factory.createModifier();
			ReturnType returnType = factory.createReturnType();
			modifier.setStatic(false);
			for(Token t : tokensBeforeName) {
				
				if(VisibilityKind.get(t.getText()) != null){
					//System.out.println("modifer VisibilityKind ->" + t.getText());
					modifier.setVisibility(VisibilityKind.get(t.getText()));
				}
				if(InheritanceKind.get(t.getText()) != null){
					//System.out.println("modifier InheritanceKind ->" + t.getText());
					modifier.setInheritance(InheritanceKind.get(t.getText()));
				}
				if(ModifierKind.get(t.getText()) != null){
					//System.out.println("modifier ModifierKind ->" + t.getText());
					modifier.setModifier(ModifierKind.get(t.getText()));
				}
				if(SimpleType.get(t.getText()) != null) {
					returnType.setReturnType(SimpleType.get(t.getText()));
					//System.out.println("returnType ->" + SimpleType.get(t.getText()));
				}
			}
			
			if(name.equals(typeParent.getName())) {
				//Se trata del constructor
				ConstructorDeclaration constDeclaration = factory.createConstructorDeclaration();
				constDeclaration.setModifier(modifier);
				constDeclaration.setName(name);
				constDeclaration.setReturnType(returnType);
				constDeclaration.setPath(this.filePath + "#L" + Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getLine());
				typeParent.getBodyDeclarations().add(constDeclaration);
				constDeclarationParent = constDeclaration;
			} else {
				Token tok = Util.getFirstTokenWithType(tokens, CSharpParser.OPEN_PARENS);
				//Si tiene el caracter ( es porque se trata de un metodo, de lo contrario es una atributo de clase 
				if(tok != null) {
					MethodDeclaration methodDecl = factory.createMethodDeclaration();
					methodDecl.setModifier(modifier);
					methodDecl.setName(name);
					methodDecl.setReturnType(returnType);
					methodDecl.setPath(this.filePath + "#L" + Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getLine());
					typeParent.getBodyDeclarations().add(methodDecl);
					methodDeclParent = methodDecl;
				} else {
					SingleVariableDeclaration variableDecl = factory.createSingleVariableDeclaration();
					//El elemento referenciado el primer identificador, el segundo es el nombre de la variable
					ElementRef ref = factory.createElementRef();
					
					String varibleName = Util.getTokenBeforeType(tokens, CSharpParser.SEMICOLON).getText();
					if(name.equals(varibleName)) {
						//Si el identificador es igual al nombre del objeto es porque el tipo es un dato primitivo
						Token tok2 =  Util.getTokenBeforeType(tokens, CSharpParser.IDENTIFIER);
						if(tok2 != null) {
							varibleName = tok2.getText();
							//System.out.println("varibleName ->" + varibleName);
							ref.setName(varibleName);
							variableDecl.setName(name);
						} else {
							ref.setName(name);
							variableDecl.setName(name);
						}
					} else {
						//System.out.println("diferentes ->" + varibleName);
						ref.setName(name);
						variableDecl.setName(varibleName);
					}
					variableDecl.setModifier(modifier);
					variableDecl.setType(ref);
					variableDecl.setPath(this.filePath + "#L" + Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getLine());
					typeParent.getBodyDeclarations().add(variableDecl);
				}
			}
			System.out.println("Se adicionó Class_member_declaration ->" + name);
		}
		
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAll_member_modifiers(CSharpParser.All_member_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAll_member_modifier(CSharpParser.All_member_modifierContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token All_member_modifier -> Linea: " + t.getLine() + " Texto: " + t.getText());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitTyped_member_declaration(CSharpParser.Typed_member_declarationContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Typed_member_declaration -> Linea: " + t.getLine() + " Texto: " + t.getText());
		}
		
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstant_declarators(CSharpParser.Constant_declaratorsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstant_declarator(CSharpParser.Constant_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariable_declarators(CSharpParser.Variable_declaratorsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariable_declarator(CSharpParser.Variable_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariable_initializer(CSharpParser.Variable_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitReturn_type(CSharpParser.Return_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_name(CSharpParser.Member_nameContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Member_name -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_body(CSharpParser.Method_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFormal_parameter_list(CSharpParser.Formal_parameter_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_parameters(CSharpParser.Fixed_parametersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_parameter(CSharpParser.Fixed_parameterContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Fixed_parameter -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		final String name = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getText();
		List<Token> tokensBeforeName = Util.getTokensBeforeType(tokens, CSharpParser.IDENTIFIER);
		SingleVariableDeclaration variableDecl = factory.createSingleVariableDeclaration();
		variableDecl.setPath(this.filePath + "#L" + Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getLine());
		//El elemento referenciado el primer identificador, el segundo es el nombre de la variable
		ElementRef ref = factory.createElementRef();
		if(tokensBeforeName == null || tokensBeforeName.isEmpty()) {
			//Si hay tokens antes del nombre corresponde a tipos primitivos
			Token tokEqual = Util.getTokenBeforeType(tokens,  CSharpParser.ASSIGNMENT);
			if(tokEqual != null) {
				ref.setName(name);
				variableDecl.setName(tokEqual.getText());
				variableDecl.setType(ref);
			} else {
				Token tok = Util.getLastTokenWithType(tokens,  CSharpParser.IDENTIFIER);
				ref.setName(name);
				variableDecl.setName(tok.getText());
				variableDecl.setType(ref);
			}
			/*if(tok != null && tok.getType() == CSharpParser.LT) {
				tok = Util.getLastTokenWithType(tokens,  CSharpParser.IDENTIFIER);
				ref.setName(tok.getText());
				variableDecl.setName(name);
				variableDecl.setType(ref);
			} else {
				ref.setName(name);
				variableDecl.setName(tok.getText());
				variableDecl.setType(ref);
			}*/
		} else {
			Token tok =tokensBeforeName.iterator().next();
			if(tok != null && tok.getType() == CSharpParser.THIS) {
				//si el token anterior es this, el nombre del parametro es el segundo identificador
				tok = Util.getLastTokenWithType(tokens,  CSharpParser.IDENTIFIER);
				ref.setName(name);
				variableDecl.setName(tok.getText());
				variableDecl.setType(ref);
			} else {
				ref.setName(tok.getText());
				variableDecl.setName(name);
				variableDecl.setType(ref);
			}
		}
		if(methodDeclParent != null) {
			methodDeclParent.getParameters().add(variableDecl);
			//typeParent.getBodyDeclarations().add(methodDeclParent);
		} else if (constDeclarationParent != null) {
			constDeclarationParent.getParameters().add(variableDecl);
			//typeParent.getBodyDeclarations().add(constDeclarationParent);
		}
		System.out.println("Se adicionó Fixed_parameter ->" + name);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitParameter_modifier(CSharpParser.Parameter_modifierContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Parameter_modifier -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitParameter_array(CSharpParser.Parameter_arrayContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAccessor_declarations(CSharpParser.Accessor_declarationsContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Accessor_declarations -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGet_accessor_declaration(CSharpParser.Get_accessor_declarationContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Get_accessor_declaration -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSet_accessor_declaration(CSharpParser.Set_accessor_declarationContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Set_accessor_declaration -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAccessor_modifier(CSharpParser.Accessor_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAccessor_body(CSharpParser.Accessor_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEvent_accessor_declarations(CSharpParser.Event_accessor_declarationsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAdd_accessor_declaration(CSharpParser.Add_accessor_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRemove_accessor_declaration(CSharpParser.Remove_accessor_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOverloadable_operator(CSharpParser.Overloadable_operatorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConversion_operator_declarator(CSharpParser.Conversion_operator_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstructor_initializer(CSharpParser.Constructor_initializerContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		final String name = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getText();
		System.out.println("Constructor_initializer ->" + name);*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBody(CSharpParser.BodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_interfaces(CSharpParser.Struct_interfacesContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_body(CSharpParser.Struct_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_member_declaration(CSharpParser.Struct_member_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArray_type(CSharpParser.Array_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRank_specifier(CSharpParser.Rank_specifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArray_initializer(CSharpParser.Array_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariant_type_parameter_list(CSharpParser.Variant_type_parameter_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariant_type_parameter(CSharpParser.Variant_type_parameterContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariance_annotation(CSharpParser.Variance_annotationContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Variance_annotation -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_base(CSharpParser.Interface_baseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_body(CSharpParser.Interface_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_member_declaration(CSharpParser.Interface_member_declarationContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Interface_member_declaration -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_accessors(CSharpParser.Interface_accessorsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEnum_base(CSharpParser.Enum_baseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEnum_body(CSharpParser.Enum_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEnum_member_declaration(CSharpParser.Enum_member_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGlobal_attribute_section(CSharpParser.Global_attribute_sectionContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Global_attribute_section -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGlobal_attribute_target(CSharpParser.Global_attribute_targetContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Global_attribute_target -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttributes(CSharpParser.AttributesContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Attributes -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute_section(CSharpParser.Attribute_sectionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute_target(CSharpParser.Attribute_targetContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute_list(CSharpParser.Attribute_listContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Attribute_list -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute(CSharpParser.AttributeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute_argument(CSharpParser.Attribute_argumentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPointer_type(CSharpParser.Pointer_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_pointer_declarators(CSharpParser.Fixed_pointer_declaratorsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_pointer_declarator(CSharpParser.Fixed_pointer_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_pointer_initializer(CSharpParser.Fixed_pointer_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_size_buffer_declarator(CSharpParser.Fixed_size_buffer_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_variable_initializer_unsafe(CSharpParser.Local_variable_initializer_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRight_arrow(CSharpParser.Right_arrowContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRight_shift(CSharpParser.Right_shiftContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRight_shift_assignment(CSharpParser.Right_shift_assignmentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLiteral(CSharpParser.LiteralContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBoolean_literal(CSharpParser.Boolean_literalContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitString_literal(CSharpParser.String_literalContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterpolated_regular_string(CSharpParser.Interpolated_regular_stringContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterpolated_verbatium_string(CSharpParser.Interpolated_verbatium_stringContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterpolated_regular_string_part(CSharpParser.Interpolated_regular_string_partContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterpolated_verbatium_string_part(CSharpParser.Interpolated_verbatium_string_partContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterpolated_string_expression(CSharpParser.Interpolated_string_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitKeyword(CSharpParser.KeywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_definition(CSharpParser.Class_definitionContext ctx) {
		/*co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassDeclaration clase = factory.createClassDeclaration();
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Class_definition -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		cuParent.setTypeDeclaration(clase);
		Modifier modifier = factory.createModifier();
		clase.setModifier(modifier);
		//modifier.setVisibility();
		final String name = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getText();
		//clase.setName(name);
		//classParent = clase;*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_definition(CSharpParser.Struct_definitionContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		final String name = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getText();
		System.out.println("Struct_definition ->" + name);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_definition(CSharpParser.Interface_definitionContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		final String name = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getText();
		System.out.println("Interface_definition ->" + name);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEnum_definition(CSharpParser.Enum_definitionContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		final String name = Util.getFirstTokenWithType(tokens, CSharpParser.IDENTIFIER).getText();
		System.out.println("Enum_definition ->" + name);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDelegate_definition(CSharpParser.Delegate_definitionContext ctx) {
		final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Delegate_definition -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEvent_declaration(CSharpParser.Event_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitField_declaration(CSharpParser.Field_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitProperty_declaration(CSharpParser.Property_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstant_declaration(CSharpParser.Constant_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIndexer_declaration(CSharpParser.Indexer_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDestructor_definition(CSharpParser.Destructor_definitionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstructor_declaration(CSharpParser.Constructor_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_declaration(CSharpParser.Method_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_member_name(CSharpParser.Method_member_nameContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOperator_declaration(CSharpParser.Operator_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArg_declaration(CSharpParser.Arg_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_invocation(CSharpParser.Method_invocationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitObject_creation_expression(CSharpParser.Object_creation_expressionContext ctx) {
		/*final List<Token> tokens = Util.getFlatTokenList(ctx);
		for(Token t : tokens) {
			System.out.println("Token Object_creation_expression -> Linea: " + t.getLine() + " Texto: " + t.getText() + " Type " + t.getType());
		}*/
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIdentifier(CSharpParser.IdentifierContext ctx) {
		return visitChildren(ctx);
	}

	public Model getModel() {
		return model;
	}
}