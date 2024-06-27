/**
 */
package library.impl;

import java.util.Collection;

import library.LibraryPackage;
import library.Loan;
import library.Member;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link library.impl.MemberImpl#getLoans <em>Loans</em>}</li>
 *   <li>{@link library.impl.MemberImpl#getMemberId <em>Member Id</em>}</li>
 *   <li>{@link library.impl.MemberImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberImpl extends MinimalEObjectImpl.Container implements Member {
	/**
	 * The cached value of the '{@link #getLoans() <em>Loans</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoans()
	 * @generated
	 * @ordered
	 */
	protected EList<Loan> loans;

	/**
	 * The default value of the '{@link #getMemberId() <em>Member Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberId()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberId() <em>Member Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberId()
	 * @generated
	 * @ordered
	 */
	protected String memberId = MEMBER_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Loan> getLoans() {
		if (loans == null) {
			loans = new EObjectResolvingEList<Loan>(Loan.class, this, LibraryPackage.MEMBER__LOANS);
		}
		return loans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemberId() {
		return memberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberId(String newMemberId) {
		String oldMemberId = memberId;
		memberId = newMemberId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.MEMBER__MEMBER_ID, oldMemberId,
					memberId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.MEMBER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LibraryPackage.MEMBER__LOANS:
			return getLoans();
		case LibraryPackage.MEMBER__MEMBER_ID:
			return getMemberId();
		case LibraryPackage.MEMBER__NAME:
			return getName();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LibraryPackage.MEMBER__LOANS:
			getLoans().clear();
			getLoans().addAll((Collection<? extends Loan>) newValue);
			return;
		case LibraryPackage.MEMBER__MEMBER_ID:
			setMemberId((String) newValue);
			return;
		case LibraryPackage.MEMBER__NAME:
			setName((String) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case LibraryPackage.MEMBER__LOANS:
			getLoans().clear();
			return;
		case LibraryPackage.MEMBER__MEMBER_ID:
			setMemberId(MEMBER_ID_EDEFAULT);
			return;
		case LibraryPackage.MEMBER__NAME:
			setName(NAME_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LibraryPackage.MEMBER__LOANS:
			return loans != null && !loans.isEmpty();
		case LibraryPackage.MEMBER__MEMBER_ID:
			return MEMBER_ID_EDEFAULT == null ? memberId != null : !MEMBER_ID_EDEFAULT.equals(memberId);
		case LibraryPackage.MEMBER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (memberId: ");
		result.append(memberId);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MemberImpl
