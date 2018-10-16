/**
 * generated by Xtext 2.14.0
 */
package org.unipampa.lesse.canopus.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.unipampa.lesse.canopus.CanopusPackage;
import org.unipampa.lesse.canopus.Metric;
import org.unipampa.lesse.canopus.MetricCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.canopus.impl.MetricCollectionImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricCollectionImpl extends MinimalEObjectImpl.Container implements MetricCollection
{
  /**
   * The cached value of the '{@link #getMetric() <em>Metric</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected EList<Metric> metric;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetricCollectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CanopusPackage.Literals.METRIC_COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Metric> getMetric()
  {
    if (metric == null)
    {
      metric = new EObjectContainmentEList<Metric>(Metric.class, this, CanopusPackage.METRIC_COLLECTION__METRIC);
    }
    return metric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CanopusPackage.METRIC_COLLECTION__METRIC:
        return ((InternalEList<?>)getMetric()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CanopusPackage.METRIC_COLLECTION__METRIC:
        return getMetric();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CanopusPackage.METRIC_COLLECTION__METRIC:
        getMetric().clear();
        getMetric().addAll((Collection<? extends Metric>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CanopusPackage.METRIC_COLLECTION__METRIC:
        getMetric().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CanopusPackage.METRIC_COLLECTION__METRIC:
        return metric != null && !metric.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MetricCollectionImpl
