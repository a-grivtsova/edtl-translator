/**
 * generated by Xtext 2.25.0
 */
package su.nsk.iae.edtl.edtl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.PrimaryExpression#getConst <em>Const</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.PrimaryExpression#getVar <em>Var</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.PrimaryExpression#getMacros <em>Macros</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.PrimaryExpression#getArgs <em>Args</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.PrimaryExpression#getTau <em>Tau</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.PrimaryExpression#getNestExpr <em>Nest Expr</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.edtl.edtl.EdtlPackage#getPrimaryExpression()
 * @model
 * @generated
 */
public interface PrimaryExpression extends UnExpression
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' attribute.
   * @see #setConst(String)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getPrimaryExpression_Const()
   * @model
   * @generated
   */
  String getConst();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.PrimaryExpression#getConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #getConst()
   * @generated
   */
  void setConst(String value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(CrossVarAbbr)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getPrimaryExpression_Var()
   * @model
   * @generated
   */
  CrossVarAbbr getVar();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.PrimaryExpression#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(CrossVarAbbr value);

  /**
   * Returns the value of the '<em><b>Macros</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Macros</em>' reference.
   * @see #setMacros(Macros)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getPrimaryExpression_Macros()
   * @model
   * @generated
   */
  Macros getMacros();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.PrimaryExpression#getMacros <em>Macros</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Macros</em>' reference.
   * @see #getMacros()
   * @generated
   */
  void setMacros(Macros value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(ParamAssignmentElements)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getPrimaryExpression_Args()
   * @model containment="true"
   * @generated
   */
  ParamAssignmentElements getArgs();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.PrimaryExpression#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(ParamAssignmentElements value);

  /**
   * Returns the value of the '<em><b>Tau</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tau</em>' containment reference.
   * @see #setTau(TauExpression)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getPrimaryExpression_Tau()
   * @model containment="true"
   * @generated
   */
  TauExpression getTau();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.PrimaryExpression#getTau <em>Tau</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tau</em>' containment reference.
   * @see #getTau()
   * @generated
   */
  void setTau(TauExpression value);

  /**
   * Returns the value of the '<em><b>Nest Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nest Expr</em>' containment reference.
   * @see #setNestExpr(Expression)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getPrimaryExpression_NestExpr()
   * @model containment="true"
   * @generated
   */
  Expression getNestExpr();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.PrimaryExpression#getNestExpr <em>Nest Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nest Expr</em>' containment reference.
   * @see #getNestExpr()
   * @generated
   */
  void setNestExpr(Expression value);

} // PrimaryExpression