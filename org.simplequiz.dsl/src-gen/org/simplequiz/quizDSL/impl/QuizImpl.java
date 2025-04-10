/**
 * generated by Xtext 2.38.0
 */
package org.simplequiz.quizDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.simplequiz.quizDSL.Question;
import org.simplequiz.quizDSL.Quiz;
import org.simplequiz.quizDSL.QuizDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quiz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.simplequiz.quizDSL.impl.QuizImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.simplequiz.quizDSL.impl.QuizImpl#isRandomizeOrder <em>Randomize Order</em>}</li>
 *   <li>{@link org.simplequiz.quizDSL.impl.QuizImpl#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuizImpl extends MinimalEObjectImpl.Container implements Quiz
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
   * The default value of the '{@link #isRandomizeOrder() <em>Randomize Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRandomizeOrder()
   * @generated
   * @ordered
   */
  protected static final boolean RANDOMIZE_ORDER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRandomizeOrder() <em>Randomize Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRandomizeOrder()
   * @generated
   * @ordered
   */
  protected boolean randomizeOrder = RANDOMIZE_ORDER_EDEFAULT;

  /**
   * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestions()
   * @generated
   * @ordered
   */
  protected EList<Question> questions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuizImpl()
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
    return QuizDSLPackage.Literals.QUIZ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuizDSLPackage.QUIZ__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isRandomizeOrder()
  {
    return randomizeOrder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRandomizeOrder(boolean newRandomizeOrder)
  {
    boolean oldRandomizeOrder = randomizeOrder;
    randomizeOrder = newRandomizeOrder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuizDSLPackage.QUIZ__RANDOMIZE_ORDER, oldRandomizeOrder, randomizeOrder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Question> getQuestions()
  {
    if (questions == null)
    {
      questions = new EObjectContainmentEList<Question>(Question.class, this, QuizDSLPackage.QUIZ__QUESTIONS);
    }
    return questions;
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
      case QuizDSLPackage.QUIZ__QUESTIONS:
        return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
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
      case QuizDSLPackage.QUIZ__NAME:
        return getName();
      case QuizDSLPackage.QUIZ__RANDOMIZE_ORDER:
        return isRandomizeOrder();
      case QuizDSLPackage.QUIZ__QUESTIONS:
        return getQuestions();
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
      case QuizDSLPackage.QUIZ__NAME:
        setName((String)newValue);
        return;
      case QuizDSLPackage.QUIZ__RANDOMIZE_ORDER:
        setRandomizeOrder((Boolean)newValue);
        return;
      case QuizDSLPackage.QUIZ__QUESTIONS:
        getQuestions().clear();
        getQuestions().addAll((Collection<? extends Question>)newValue);
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
      case QuizDSLPackage.QUIZ__NAME:
        setName(NAME_EDEFAULT);
        return;
      case QuizDSLPackage.QUIZ__RANDOMIZE_ORDER:
        setRandomizeOrder(RANDOMIZE_ORDER_EDEFAULT);
        return;
      case QuizDSLPackage.QUIZ__QUESTIONS:
        getQuestions().clear();
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
      case QuizDSLPackage.QUIZ__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case QuizDSLPackage.QUIZ__RANDOMIZE_ORDER:
        return randomizeOrder != RANDOMIZE_ORDER_EDEFAULT;
      case QuizDSLPackage.QUIZ__QUESTIONS:
        return questions != null && !questions.isEmpty();
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
    result.append(", randomizeOrder: ");
    result.append(randomizeOrder);
    result.append(')');
    return result.toString();
  }

} //QuizImpl
