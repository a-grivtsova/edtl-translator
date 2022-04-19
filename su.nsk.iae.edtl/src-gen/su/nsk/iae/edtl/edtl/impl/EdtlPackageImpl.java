/**
 * generated by Xtext 2.25.0
 */
package su.nsk.iae.edtl.edtl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import su.nsk.iae.edtl.edtl.Abbr;
import su.nsk.iae.edtl.edtl.AndExpression;
import su.nsk.iae.edtl.edtl.CompExpression;
import su.nsk.iae.edtl.edtl.CompOperator;
import su.nsk.iae.edtl.edtl.CrossVarAbbr;
import su.nsk.iae.edtl.edtl.DeclVarInput;
import su.nsk.iae.edtl.edtl.DeclVarOutput;
import su.nsk.iae.edtl.edtl.EdtlFactory;
import su.nsk.iae.edtl.edtl.EdtlPackage;
import su.nsk.iae.edtl.edtl.EquExpression;
import su.nsk.iae.edtl.edtl.EquOperator;
import su.nsk.iae.edtl.edtl.Expression;
import su.nsk.iae.edtl.edtl.Macros;
import su.nsk.iae.edtl.edtl.Model;
import su.nsk.iae.edtl.edtl.ParamAssignmentElements;
import su.nsk.iae.edtl.edtl.PrimaryExpression;
import su.nsk.iae.edtl.edtl.Requirement;
import su.nsk.iae.edtl.edtl.Statement;
import su.nsk.iae.edtl.edtl.TauExpression;
import su.nsk.iae.edtl.edtl.TimeLiteral;
import su.nsk.iae.edtl.edtl.UnExpression;
import su.nsk.iae.edtl.edtl.VarDeclaration;
import su.nsk.iae.edtl.edtl.VarList;
import su.nsk.iae.edtl.edtl.Variable;
import su.nsk.iae.edtl.edtl.XorExpression;
import su.nsk.iae.edtl.edtl.w;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdtlPackageImpl extends EPackageImpl implements EdtlPackage
{
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
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declVarInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declVarOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abbrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass macrosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xorExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tauExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramAssignmentElementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass crossVarAbbrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum equOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum compOperatorEEnum = null;

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
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EdtlPackageImpl()
  {
    super(eNS_URI, EdtlFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EdtlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EdtlPackage init()
  {
    if (isInited) return (EdtlPackage)EPackage.Registry.INSTANCE.getEPackage(EdtlPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredEdtlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    EdtlPackageImpl theEdtlPackage = registeredEdtlPackage instanceof EdtlPackageImpl ? (EdtlPackageImpl)registeredEdtlPackage : new EdtlPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theEdtlPackage.createPackageContents();

    // Initialize created meta-data
    theEdtlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEdtlPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EdtlPackage.eNS_URI, theEdtlPackage);
    return theEdtlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeclVarInput()
  {
    return declVarInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDeclVarInput_Value()
  {
    return (EReference)declVarInputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeclVarOutput()
  {
    return declVarOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDeclVarOutput_Value()
  {
    return (EReference)declVarOutputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVarDeclaration()
  {
    return varDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getVarDeclaration_Var()
  {
    return (EReference)varDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getVarDeclaration_Type()
  {
    return (EAttribute)varDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAbbr()
  {
    return abbrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAbbr_Value()
  {
    return (EReference)abbrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMacros()
  {
    return macrosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMacros_Name()
  {
    return (EAttribute)macrosEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMacros_Args()
  {
    return (EReference)macrosEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMacros_Value()
  {
    return (EReference)macrosEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVarList()
  {
    return varListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getVarList_Vars()
  {
    return (EReference)varListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRequirement()
  {
    return requirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRequirement_Name()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRequirement_Attribute()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRequirement_Value()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpression_Left()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExpression_OrOp()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpression_Right()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getXorExpression()
  {
    return xorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAndExpression()
  {
    return andExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAndExpression_AndOp()
  {
    return (EAttribute)andExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCompExpression()
  {
    return compExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCompExpression_CompOp()
  {
    return (EAttribute)compExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEquExpression()
  {
    return equExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEquExpression_EquOp()
  {
    return (EAttribute)equExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnExpression()
  {
    return unExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnExpression_UnOp()
  {
    return (EAttribute)unExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTauExpression()
  {
    return tauExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTauExpression_Time()
  {
    return (EReference)tauExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTimeLiteral()
  {
    return timeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTimeLiteral_Interval()
  {
    return (EAttribute)timeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPrimaryExpression()
  {
    return primaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrimaryExpression_Const()
  {
    return (EAttribute)primaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrimaryExpression_Var()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrimaryExpression_Macros()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrimaryExpression_Args()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrimaryExpression_Tau()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrimaryExpression_NestExpr()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParamAssignmentElements()
  {
    return paramAssignmentElementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getParamAssignmentElements_Elements()
  {
    return (EReference)paramAssignmentElementsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCrossVarAbbr()
  {
    return crossVarAbbrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCrossVarAbbr_Name()
  {
    return (EAttribute)crossVarAbbrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getw()
  {
    return wEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getw_Elements()
  {
    return (EReference)wEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getEquOperator()
  {
    return equOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getCompOperator()
  {
    return compOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EdtlFactory getEdtlFactory()
  {
    return (EdtlFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);

    statementEClass = createEClass(STATEMENT);

    declVarInputEClass = createEClass(DECL_VAR_INPUT);
    createEReference(declVarInputEClass, DECL_VAR_INPUT__VALUE);

    declVarOutputEClass = createEClass(DECL_VAR_OUTPUT);
    createEReference(declVarOutputEClass, DECL_VAR_OUTPUT__VALUE);

    varDeclarationEClass = createEClass(VAR_DECLARATION);
    createEReference(varDeclarationEClass, VAR_DECLARATION__VAR);
    createEAttribute(varDeclarationEClass, VAR_DECLARATION__TYPE);

    abbrEClass = createEClass(ABBR);
    createEReference(abbrEClass, ABBR__VALUE);

    macrosEClass = createEClass(MACROS);
    createEAttribute(macrosEClass, MACROS__NAME);
    createEReference(macrosEClass, MACROS__ARGS);
    createEReference(macrosEClass, MACROS__VALUE);

    varListEClass = createEClass(VAR_LIST);
    createEReference(varListEClass, VAR_LIST__VARS);

    requirementEClass = createEClass(REQUIREMENT);
    createEAttribute(requirementEClass, REQUIREMENT__NAME);
    createEAttribute(requirementEClass, REQUIREMENT__ATTRIBUTE);
    createEReference(requirementEClass, REQUIREMENT__VALUE);

    variableEClass = createEClass(VARIABLE);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__LEFT);
    createEAttribute(expressionEClass, EXPRESSION__OR_OP);
    createEReference(expressionEClass, EXPRESSION__RIGHT);

    xorExpressionEClass = createEClass(XOR_EXPRESSION);

    andExpressionEClass = createEClass(AND_EXPRESSION);
    createEAttribute(andExpressionEClass, AND_EXPRESSION__AND_OP);

    compExpressionEClass = createEClass(COMP_EXPRESSION);
    createEAttribute(compExpressionEClass, COMP_EXPRESSION__COMP_OP);

    equExpressionEClass = createEClass(EQU_EXPRESSION);
    createEAttribute(equExpressionEClass, EQU_EXPRESSION__EQU_OP);

    unExpressionEClass = createEClass(UN_EXPRESSION);
    createEAttribute(unExpressionEClass, UN_EXPRESSION__UN_OP);

    tauExpressionEClass = createEClass(TAU_EXPRESSION);
    createEReference(tauExpressionEClass, TAU_EXPRESSION__TIME);

    timeLiteralEClass = createEClass(TIME_LITERAL);
    createEAttribute(timeLiteralEClass, TIME_LITERAL__INTERVAL);

    primaryExpressionEClass = createEClass(PRIMARY_EXPRESSION);
    createEAttribute(primaryExpressionEClass, PRIMARY_EXPRESSION__CONST);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__VAR);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__MACROS);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__ARGS);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__TAU);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__NEST_EXPR);

    paramAssignmentElementsEClass = createEClass(PARAM_ASSIGNMENT_ELEMENTS);
    createEReference(paramAssignmentElementsEClass, PARAM_ASSIGNMENT_ELEMENTS__ELEMENTS);

    crossVarAbbrEClass = createEClass(CROSS_VAR_ABBR);
    createEAttribute(crossVarAbbrEClass, CROSS_VAR_ABBR__NAME);

    wEClass = createEClass(W);
    createEReference(wEClass, W__ELEMENTS);

    // Create enums
    equOperatorEEnum = createEEnum(EQU_OPERATOR);
    compOperatorEEnum = createEEnum(COMP_OPERATOR);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    declVarInputEClass.getESuperTypes().add(this.getStatement());
    declVarOutputEClass.getESuperTypes().add(this.getStatement());
    abbrEClass.getESuperTypes().add(this.getStatement());
    abbrEClass.getESuperTypes().add(this.getCrossVarAbbr());
    macrosEClass.getESuperTypes().add(this.getStatement());
    requirementEClass.getESuperTypes().add(this.getStatement());
    variableEClass.getESuperTypes().add(this.getCrossVarAbbr());
    xorExpressionEClass.getESuperTypes().add(this.getExpression());
    andExpressionEClass.getESuperTypes().add(this.getXorExpression());
    compExpressionEClass.getESuperTypes().add(this.getAndExpression());
    equExpressionEClass.getESuperTypes().add(this.getCompExpression());
    unExpressionEClass.getESuperTypes().add(this.getEquExpression());
    primaryExpressionEClass.getESuperTypes().add(this.getUnExpression());
    wEClass.getESuperTypes().add(this.getModel());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(declVarInputEClass, DeclVarInput.class, "DeclVarInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclVarInput_Value(), this.getVarDeclaration(), null, "value", null, 0, -1, DeclVarInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declVarOutputEClass, DeclVarOutput.class, "DeclVarOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclVarOutput_Value(), this.getVarDeclaration(), null, "value", null, 0, -1, DeclVarOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varDeclarationEClass, VarDeclaration.class, "VarDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVarDeclaration_Var(), this.getVariable(), null, "var", null, 0, 1, VarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVarDeclaration_Type(), ecorePackage.getEString(), "type", null, 0, 1, VarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abbrEClass, Abbr.class, "Abbr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbbr_Value(), this.getExpression(), null, "value", null, 0, -1, Abbr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(macrosEClass, Macros.class, "Macros", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMacros_Name(), ecorePackage.getEString(), "name", null, 0, 1, Macros.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMacros_Args(), this.getVarList(), null, "args", null, 0, 1, Macros.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMacros_Value(), this.getExpression(), null, "value", null, 0, -1, Macros.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varListEClass, VarList.class, "VarList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVarList_Vars(), this.getVariable(), null, "vars", null, 0, -1, VarList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_Attribute(), ecorePackage.getEString(), "attribute", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_Value(), this.getExpression(), null, "value", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Left(), this.getExpression(), null, "left", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_OrOp(), ecorePackage.getEString(), "orOp", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Right(), this.getXorExpression(), null, "right", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xorExpressionEClass, XorExpression.class, "XorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAndExpression_AndOp(), ecorePackage.getEString(), "andOp", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compExpressionEClass, CompExpression.class, "CompExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompExpression_CompOp(), this.getCompOperator(), "compOp", null, 0, 1, CompExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equExpressionEClass, EquExpression.class, "EquExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEquExpression_EquOp(), this.getEquOperator(), "equOp", null, 0, 1, EquExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unExpressionEClass, UnExpression.class, "UnExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnExpression_UnOp(), ecorePackage.getEString(), "unOp", null, 0, 1, UnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tauExpressionEClass, TauExpression.class, "TauExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTauExpression_Time(), this.getTimeLiteral(), null, "time", null, 0, 1, TauExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeLiteralEClass, TimeLiteral.class, "TimeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeLiteral_Interval(), ecorePackage.getEString(), "interval", null, 0, 1, TimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryExpressionEClass, PrimaryExpression.class, "PrimaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimaryExpression_Const(), ecorePackage.getEString(), "const", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_Var(), this.getCrossVarAbbr(), null, "var", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_Macros(), this.getMacros(), null, "macros", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_Args(), this.getParamAssignmentElements(), null, "args", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_Tau(), this.getTauExpression(), null, "tau", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_NestExpr(), this.getExpression(), null, "nestExpr", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramAssignmentElementsEClass, ParamAssignmentElements.class, "ParamAssignmentElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParamAssignmentElements_Elements(), this.getVariable(), null, "elements", null, 0, -1, ParamAssignmentElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(crossVarAbbrEClass, CrossVarAbbr.class, "CrossVarAbbr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCrossVarAbbr_Name(), ecorePackage.getEString(), "name", null, 0, 1, CrossVarAbbr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wEClass, w.class, "w", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getw_Elements(), this.getStatement(), null, "elements", null, 0, -1, w.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(equOperatorEEnum, EquOperator.class, "EquOperator");
    addEEnumLiteral(equOperatorEEnum, EquOperator.EQUAL);
    addEEnumLiteral(equOperatorEEnum, EquOperator.NOT_EQUAL);

    initEEnum(compOperatorEEnum, CompOperator.class, "CompOperator");
    addEEnumLiteral(compOperatorEEnum, CompOperator.LESS);
    addEEnumLiteral(compOperatorEEnum, CompOperator.GREATER);
    addEEnumLiteral(compOperatorEEnum, CompOperator.LESS_EQU);
    addEEnumLiteral(compOperatorEEnum, CompOperator.GREATER_EQU);

    // Create resource
    createResource(eNS_URI);
  }

} //EdtlPackageImpl
