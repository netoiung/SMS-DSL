/**
 * generated by Xtext 2.14.0
 */
package org.unipampa.lesse.canopus;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SUT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unipampa.lesse.canopus.SUT#getName <em>Name</em>}</li>
 *   <li>{@link org.unipampa.lesse.canopus.SUT#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.unipampa.lesse.canopus.SUT#getIp <em>Ip</em>}</li>
 *   <li>{@link org.unipampa.lesse.canopus.SUT#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.unipampa.lesse.canopus.SUT#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.unipampa.lesse.canopus.CanopusPackage#getSUT()
 * @model
 * @generated
 */
public interface SUT extends EObject
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
   * @see org.unipampa.lesse.canopus.CanopusPackage#getSUT_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.canopus.SUT#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Hostname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hostname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hostname</em>' attribute.
   * @see #setHostname(String)
   * @see org.unipampa.lesse.canopus.CanopusPackage#getSUT_Hostname()
   * @model
   * @generated
   */
  String getHostname();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.canopus.SUT#getHostname <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hostname</em>' attribute.
   * @see #getHostname()
   * @generated
   */
  void setHostname(String value);

  /**
   * Returns the value of the '<em><b>Ip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip</em>' attribute.
   * @see #setIp(String)
   * @see org.unipampa.lesse.canopus.CanopusPackage#getSUT_Ip()
   * @model
   * @generated
   */
  String getIp();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.canopus.SUT#getIp <em>Ip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ip</em>' attribute.
   * @see #getIp()
   * @generated
   */
  void setIp(String value);

  /**
   * Returns the value of the '<em><b>Hardware</b></em>' attribute.
   * The literals are from the enumeration {@link org.unipampa.lesse.canopus.Hardware}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hardware</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hardware</em>' attribute.
   * @see org.unipampa.lesse.canopus.Hardware
   * @see #setHardware(Hardware)
   * @see org.unipampa.lesse.canopus.CanopusPackage#getSUT_Hardware()
   * @model
   * @generated
   */
  Hardware getHardware();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.canopus.SUT#getHardware <em>Hardware</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hardware</em>' attribute.
   * @see org.unipampa.lesse.canopus.Hardware
   * @see #getHardware()
   * @generated
   */
  void setHardware(Hardware value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.unipampa.lesse.canopus.SUTType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.unipampa.lesse.canopus.SUTType
   * @see #setType(SUTType)
   * @see org.unipampa.lesse.canopus.CanopusPackage#getSUT_Type()
   * @model
   * @generated
   */
  SUTType getType();

  /**
   * Sets the value of the '{@link org.unipampa.lesse.canopus.SUT#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.unipampa.lesse.canopus.SUTType
   * @see #getType()
   * @generated
   */
  void setType(SUTType value);

} // SUT