/**
 * generated by Xtext 2.14.0
 */
package org.unipampa.lesse.canopus.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.unipampa.lesse.canopus.CanopusPackage;
import org.unipampa.lesse.canopus.LoadGenerator;
import org.unipampa.lesse.canopus.Monitoring;
import org.unipampa.lesse.canopus.SUT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.canopus.impl.MonitoringImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.unipampa.lesse.canopus.impl.MonitoringImpl#getProjectLabel <em>Project Label</em>}</li>
 *   <li>{@link org.unipampa.lesse.canopus.impl.MonitoringImpl#getProjectAuthor <em>Project Author</em>}</li>
 *   <li>{@link org.unipampa.lesse.canopus.impl.MonitoringImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.unipampa.lesse.canopus.impl.MonitoringImpl#getSuts <em>Suts</em>}</li>
 *   <li>{@link org.unipampa.lesse.canopus.impl.MonitoringImpl#getLoadGenerators <em>Load Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoringImpl extends MinimalEObjectImpl.Container implements Monitoring
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getProjectLabel() <em>Project Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectLabel()
   * @generated
   * @ordered
   */
  protected static final String PROJECT_LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProjectLabel() <em>Project Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectLabel()
   * @generated
   * @ordered
   */
  protected String projectLabel = PROJECT_LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getProjectAuthor() <em>Project Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectAuthor()
   * @generated
   * @ordered
   */
  protected static final String PROJECT_AUTHOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProjectAuthor() <em>Project Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectAuthor()
   * @generated
   * @ordered
   */
  protected String projectAuthor = PROJECT_AUTHOR_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuts() <em>Suts</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuts()
   * @generated
   * @ordered
   */
  protected EList<SUT> suts;

  /**
   * The cached value of the '{@link #getLoadGenerators() <em>Load Generators</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoadGenerators()
   * @generated
   * @ordered
   */
  protected EList<LoadGenerator> loadGenerators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonitoringImpl()
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
    return CanopusPackage.Literals.MONITORING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CanopusPackage.MONITORING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProjectLabel()
  {
    return projectLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectLabel(String newProjectLabel)
  {
    String oldProjectLabel = projectLabel;
    projectLabel = newProjectLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CanopusPackage.MONITORING__PROJECT_LABEL, oldProjectLabel, projectLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProjectAuthor()
  {
    return projectAuthor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectAuthor(String newProjectAuthor)
  {
    String oldProjectAuthor = projectAuthor;
    projectAuthor = newProjectAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CanopusPackage.MONITORING__PROJECT_AUTHOR, oldProjectAuthor, projectAuthor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CanopusPackage.MONITORING__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SUT> getSuts()
  {
    if (suts == null)
    {
      suts = new EObjectResolvingEList<SUT>(SUT.class, this, CanopusPackage.MONITORING__SUTS);
    }
    return suts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LoadGenerator> getLoadGenerators()
  {
    if (loadGenerators == null)
    {
      loadGenerators = new EObjectResolvingEList<LoadGenerator>(LoadGenerator.class, this, CanopusPackage.MONITORING__LOAD_GENERATORS);
    }
    return loadGenerators;
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
      case CanopusPackage.MONITORING__NAME:
        return getName();
      case CanopusPackage.MONITORING__PROJECT_LABEL:
        return getProjectLabel();
      case CanopusPackage.MONITORING__PROJECT_AUTHOR:
        return getProjectAuthor();
      case CanopusPackage.MONITORING__DESCRIPTION:
        return getDescription();
      case CanopusPackage.MONITORING__SUTS:
        return getSuts();
      case CanopusPackage.MONITORING__LOAD_GENERATORS:
        return getLoadGenerators();
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
      case CanopusPackage.MONITORING__NAME:
        setName((String)newValue);
        return;
      case CanopusPackage.MONITORING__PROJECT_LABEL:
        setProjectLabel((String)newValue);
        return;
      case CanopusPackage.MONITORING__PROJECT_AUTHOR:
        setProjectAuthor((String)newValue);
        return;
      case CanopusPackage.MONITORING__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case CanopusPackage.MONITORING__SUTS:
        getSuts().clear();
        getSuts().addAll((Collection<? extends SUT>)newValue);
        return;
      case CanopusPackage.MONITORING__LOAD_GENERATORS:
        getLoadGenerators().clear();
        getLoadGenerators().addAll((Collection<? extends LoadGenerator>)newValue);
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
      case CanopusPackage.MONITORING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CanopusPackage.MONITORING__PROJECT_LABEL:
        setProjectLabel(PROJECT_LABEL_EDEFAULT);
        return;
      case CanopusPackage.MONITORING__PROJECT_AUTHOR:
        setProjectAuthor(PROJECT_AUTHOR_EDEFAULT);
        return;
      case CanopusPackage.MONITORING__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case CanopusPackage.MONITORING__SUTS:
        getSuts().clear();
        return;
      case CanopusPackage.MONITORING__LOAD_GENERATORS:
        getLoadGenerators().clear();
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
      case CanopusPackage.MONITORING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CanopusPackage.MONITORING__PROJECT_LABEL:
        return PROJECT_LABEL_EDEFAULT == null ? projectLabel != null : !PROJECT_LABEL_EDEFAULT.equals(projectLabel);
      case CanopusPackage.MONITORING__PROJECT_AUTHOR:
        return PROJECT_AUTHOR_EDEFAULT == null ? projectAuthor != null : !PROJECT_AUTHOR_EDEFAULT.equals(projectAuthor);
      case CanopusPackage.MONITORING__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case CanopusPackage.MONITORING__SUTS:
        return suts != null && !suts.isEmpty();
      case CanopusPackage.MONITORING__LOAD_GENERATORS:
        return loadGenerators != null && !loadGenerators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", projectLabel: ");
    result.append(projectLabel);
    result.append(", projectAuthor: ");
    result.append(projectAuthor);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //MonitoringImpl
