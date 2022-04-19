/**
 * generated by Xtext 2.25.0
 */
package su.nsk.iae.edtl.edtl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decl Var Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.DeclVarInput#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.edtl.edtl.EdtlPackage#getDeclVarInput()
 * @model
 * @generated
 */
public interface DeclVarInput extends Statement
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link su.nsk.iae.edtl.edtl.VarDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getDeclVarInput_Value()
   * @model containment="true"
   * @generated
   */
  EList<VarDeclaration> getValue();

} // DeclVarInput