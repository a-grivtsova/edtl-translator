/**
 * generated by Xtext 2.25.0
 */
package su.nsk.iae.edtl.edtl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macros</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.Macros#getName <em>Name</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.Macros#getArgs <em>Args</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.Macros#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.edtl.edtl.EdtlPackage#getMacros()
 * @model
 * @generated
 */
public interface Macros extends Statement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getMacros_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.Macros#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(VarList)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getMacros_Args()
   * @model containment="true"
   * @generated
   */
  VarList getArgs();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.Macros#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(VarList value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link su.nsk.iae.edtl.edtl.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getMacros_Value()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getValue();

} // Macros
