/**
 */
package library;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link library.Loan#getLoanDate <em>Loan Date</em>}</li>
 *   <li>{@link library.Loan#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link library.Loan#getBook <em>Book</em>}</li>
 *   <li>{@link library.Loan#getBorrower <em>Borrower</em>}</li>
 * </ul>
 *
 * @see library.LibraryPackage#getLoan()
 * @model
 * @generated
 */
public interface Loan extends EObject {
	/**
	 * Returns the value of the '<em><b>Loan Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loan Date</em>' attribute.
	 * @see #setLoanDate(String)
	 * @see library.LibraryPackage#getLoan_LoanDate()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getLoanDate();

	/**
	 * Sets the value of the '{@link library.Loan#getLoanDate <em>Loan Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loan Date</em>' attribute.
	 * @see #getLoanDate()
	 * @generated
	 */
	void setLoanDate(String value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see library.LibraryPackage#getLoan_DueDate()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getDueDate();

	/**
	 * Sets the value of the '{@link library.Loan#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(String value);

	/**
	 * Returns the value of the '<em><b>Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book</em>' reference.
	 * @see #setBook(Book)
	 * @see library.LibraryPackage#getLoan_Book()
	 * @model required="true"
	 * @generated
	 */
	Book getBook();

	/**
	 * Sets the value of the '{@link library.Loan#getBook <em>Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book</em>' reference.
	 * @see #getBook()
	 * @generated
	 */
	void setBook(Book value);

	/**
	 * Returns the value of the '<em><b>Borrower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borrower</em>' reference.
	 * @see #setBorrower(Member)
	 * @see library.LibraryPackage#getLoan_Borrower()
	 * @model required="true"
	 * @generated
	 */
	Member getBorrower();

	/**
	 * Sets the value of the '{@link library.Loan#getBorrower <em>Borrower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Borrower</em>' reference.
	 * @see #getBorrower()
	 * @generated
	 */
	void setBorrower(Member value);

} // Loan
