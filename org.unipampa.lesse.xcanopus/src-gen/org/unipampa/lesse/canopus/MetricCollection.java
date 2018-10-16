/**
 * generated by Xtext 2.14.0
 */
package org.unipampa.lesse.canopus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.canopus.MetricCollection#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see org.unipampa.lesse.canopus.CanopusPackage#getMetricCollection()
 * @model
 * @generated
 */
public interface MetricCollection extends EObject
{
  /**
   * Returns the value of the '<em><b>Metric</b></em>' containment reference list.
   * The list contents are of type {@link org.unipampa.lesse.canopus.Metric}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metric</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metric</em>' containment reference list.
   * @see org.unipampa.lesse.canopus.CanopusPackage#getMetricCollection_Metric()
   * @model containment="true"
   * @generated
   */
  EList<Metric> getMetric();

} // MetricCollection