/**
 * generated by Xtext 2.14.0
 */
package org.unipampa.lesse.canopus;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.canopus.Metric#getName <em>Name</em>}</li>
 *   <li>{@link org.unipampa.lesse.canopus.Metric#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see org.unipampa.lesse.canopus.CanopusPackage#getMetric()
 * @model
 * @generated
 */
public interface Metric extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.unipampa.lesse.canopus.CanopusPackage#getMetric_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.canopus.Metric#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.unipampa.lesse.canopus.CanopusPackage#getMetric_Threshold()
   * @model
   * @generated
   */
  Threshold getThreshold();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.canopus.Metric#getThreshold <em>Threshold</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold</em>' reference.
   * @see #getThreshold()
   * @generated
   */
  void setThreshold(Threshold value);

} // Metric
