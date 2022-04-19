/**
 * generated by Xtext 2.25.0
 */
package su.nsk.iae.edtl.edtl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import su.nsk.iae.edtl.edtl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdtlFactoryImpl extends EFactoryImpl implements EdtlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EdtlFactory init()
  {
    try
    {
      EdtlFactory theEdtlFactory = (EdtlFactory)EPackage.Registry.INSTANCE.getEFactory(EdtlPackage.eNS_URI);
      if (theEdtlFactory != null)
      {
        return theEdtlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EdtlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdtlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EdtlPackage.MODEL: return createModel();
      case EdtlPackage.STATEMENT: return createStatement();
      case EdtlPackage.DECL_VAR_INPUT: return createDeclVarInput();
      case EdtlPackage.DECL_VAR_OUTPUT: return createDeclVarOutput();
      case EdtlPackage.VAR_DECLARATION: return createVarDeclaration();
      case EdtlPackage.ABBR: return createAbbr();
      case EdtlPackage.MACROS: return createMacros();
      case EdtlPackage.VAR_LIST: return createVarList();
      case EdtlPackage.REQUIREMENT: return createRequirement();
      case EdtlPackage.VARIABLE: return createVariable();
      case EdtlPackage.EXPRESSION: return createExpression();
      case EdtlPackage.XOR_EXPRESSION: return createXorExpression();
      case EdtlPackage.AND_EXPRESSION: return createAndExpression();
      case EdtlPackage.COMP_EXPRESSION: return createCompExpression();
      case EdtlPackage.EQU_EXPRESSION: return createEquExpression();
      case EdtlPackage.UN_EXPRESSION: return createUnExpression();
      case EdtlPackage.TAU_EXPRESSION: return createTauExpression();
      case EdtlPackage.TIME_LITERAL: return createTimeLiteral();
      case EdtlPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case EdtlPackage.PARAM_ASSIGNMENT_ELEMENTS: return createParamAssignmentElements();
      case EdtlPackage.CROSS_VAR_ABBR: return createCrossVarAbbr();
      case EdtlPackage.W: return createw();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EdtlPackage.EQU_OPERATOR:
        return createEquOperatorFromString(eDataType, initialValue);
      case EdtlPackage.COMP_OPERATOR:
        return createCompOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EdtlPackage.EQU_OPERATOR:
        return convertEquOperatorToString(eDataType, instanceValue);
      case EdtlPackage.COMP_OPERATOR:
        return convertCompOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeclVarInput createDeclVarInput()
  {
    DeclVarInputImpl declVarInput = new DeclVarInputImpl();
    return declVarInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeclVarOutput createDeclVarOutput()
  {
    DeclVarOutputImpl declVarOutput = new DeclVarOutputImpl();
    return declVarOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarDeclaration createVarDeclaration()
  {
    VarDeclarationImpl varDeclaration = new VarDeclarationImpl();
    return varDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Abbr createAbbr()
  {
    AbbrImpl abbr = new AbbrImpl();
    return abbr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Macros createMacros()
  {
    MacrosImpl macros = new MacrosImpl();
    return macros;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarList createVarList()
  {
    VarListImpl varList = new VarListImpl();
    return varList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XorExpression createXorExpression()
  {
    XorExpressionImpl xorExpression = new XorExpressionImpl();
    return xorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompExpression createCompExpression()
  {
    CompExpressionImpl compExpression = new CompExpressionImpl();
    return compExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EquExpression createEquExpression()
  {
    EquExpressionImpl equExpression = new EquExpressionImpl();
    return equExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnExpression createUnExpression()
  {
    UnExpressionImpl unExpression = new UnExpressionImpl();
    return unExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TauExpression createTauExpression()
  {
    TauExpressionImpl tauExpression = new TauExpressionImpl();
    return tauExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeLiteral createTimeLiteral()
  {
    TimeLiteralImpl timeLiteral = new TimeLiteralImpl();
    return timeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParamAssignmentElements createParamAssignmentElements()
  {
    ParamAssignmentElementsImpl paramAssignmentElements = new ParamAssignmentElementsImpl();
    return paramAssignmentElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CrossVarAbbr createCrossVarAbbr()
  {
    CrossVarAbbrImpl crossVarAbbr = new CrossVarAbbrImpl();
    return crossVarAbbr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public w createw()
  {
    wImpl w = new wImpl();
    return w;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquOperator createEquOperatorFromString(EDataType eDataType, String initialValue)
  {
    EquOperator result = EquOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEquOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompOperator createCompOperatorFromString(EDataType eDataType, String initialValue)
  {
    CompOperator result = CompOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EdtlPackage getEdtlPackage()
  {
    return (EdtlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EdtlPackage getPackage()
  {
    return EdtlPackage.eINSTANCE;
  }

} //EdtlFactoryImpl
