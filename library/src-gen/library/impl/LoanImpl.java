/**
 */
package library.impl;

import java.util.Date;

import library.Book;
import library.LibraryPackage;
import library.Loan;
import library.Member;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link library.impl.LoanImpl#getLoanDate <em>Loan Date</em>}</li>
 *   <li>{@link library.impl.LoanImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link library.impl.LoanImpl#getBook <em>Book</em>}</li>
 *   <li>{@link library.impl.LoanImpl#getBorrower <em>Borrower</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoanImpl extends MinimalEObjectImpl.Container implements Loan {
	/**
	 * The default value of the '{@link #getLoanDate() <em>Loan Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoanDate()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoanDate() <em>Loan Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoanDate()
	 * @generated
	 * @ordered
	 */
	protected String loanDate = LOAN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected String dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBook() <em>Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBook()
	 * @generated
	 * @ordered
	 */
	protected Book book;

	/**
	 * The cached value of the '{@link #getBorrower() <em>Borrower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorrower()
	 * @generated
	 * @ordered
	 */
	protected Member borrower;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.LOAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoanDate() {
		return loanDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoanDate(String newLoanDate) {
		String oldLoanDate = loanDate;
		loanDate = newLoanDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LOAN__LOAN_DATE, oldLoanDate,
					loanDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(String newDueDate) {
		String oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LOAN__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Book getBook() {
		if (book != null && book.eIsProxy()) {
			InternalEObject oldBook = (InternalEObject) book;
			book = (Book) eResolveProxy(oldBook);
			if (book != oldBook) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.LOAN__BOOK, oldBook,
							book));
			}
		}
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book basicGetBook() {
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBook(Book newBook) {
		Book oldBook = book;
		book = newBook;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LOAN__BOOK, oldBook, book));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Member getBorrower() {
		if (borrower != null && borrower.eIsProxy()) {
			InternalEObject oldBorrower = (InternalEObject) borrower;
			borrower = (Member) eResolveProxy(oldBorrower);
			if (borrower != oldBorrower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.LOAN__BORROWER,
							oldBorrower, borrower));
			}
		}
		return borrower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member basicGetBorrower() {
		return borrower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorrower(Member newBorrower) {
		Member oldBorrower = borrower;
		borrower = newBorrower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LOAN__BORROWER, oldBorrower,
					borrower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LibraryPackage.LOAN__LOAN_DATE:
			return getLoanDate();
		case LibraryPackage.LOAN__DUE_DATE:
			return getDueDate();
		case LibraryPackage.LOAN__BOOK:
			if (resolve)
				return getBook();
			return basicGetBook();
		case LibraryPackage.LOAN__BORROWER:
			if (resolve)
				return getBorrower();
			return basicGetBorrower();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LibraryPackage.LOAN__LOAN_DATE:
			setLoanDate(String.valueOf(newValue));
			return;
		case LibraryPackage.LOAN__DUE_DATE:
			setDueDate(String.valueOf(newValue));
			return;
		case LibraryPackage.LOAN__BOOK:
			setBook((Book) newValue);
			return;
		case LibraryPackage.LOAN__BORROWER:
			setBorrower((Member) newValue);
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
		case LibraryPackage.LOAN__LOAN_DATE:
			setLoanDate(LOAN_DATE_EDEFAULT);
			return;
		case LibraryPackage.LOAN__DUE_DATE:
			setDueDate(DUE_DATE_EDEFAULT);
			return;
		case LibraryPackage.LOAN__BOOK:
			setBook((Book) null);
			return;
		case LibraryPackage.LOAN__BORROWER:
			setBorrower((Member) null);
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
		case LibraryPackage.LOAN__LOAN_DATE:
			return LOAN_DATE_EDEFAULT == null ? loanDate != null : !LOAN_DATE_EDEFAULT.equals(loanDate);
		case LibraryPackage.LOAN__DUE_DATE:
			return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
		case LibraryPackage.LOAN__BOOK:
			return book != null;
		case LibraryPackage.LOAN__BORROWER:
			return borrower != null;
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
		result.append(" (loanDate: ");
		result.append(loanDate);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(')');
		return result.toString();
	}

} //LoanImpl
