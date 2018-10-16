/**
 * generated by Xtext 2.14.0
 */
package org.unipampa.lesse.canopus;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.canopus.Criteria#getValue <em>Value</em>}</li>
 *   <li>{@link org.unipampa.lesse.canopus.Criteria#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see org.unipampa.lesse.canopus.CanopusPackage#getCriteria()
 * @model
 * @generated
 */
public interface Criteria extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.unipampa.lesse.canopus.CanopusPackage#getCriteria_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.canopus.Criteria#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Threshold</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threshold</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threshold</em>' reference.
   * @see #setThreshold(Threshold)
   * @see org.unipampa.lesse.canopus.CanopusPackage#getCriteria_Threshold()
   * @model
   * @generated
   */
  Threshold getThreshold();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.canopus.Criteria#getThreshold <em>Threshold</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold</em>' reference.
   * @see #getThreshold()
   * @generated
   */
  void setThreshold(Threshold value);

} // Criteria