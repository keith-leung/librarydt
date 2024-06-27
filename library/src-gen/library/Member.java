/**
 */
package library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link library.Member#getLoans <em>Loans</em>}</li>
 *   <li>{@link library.Member#getMemberId <em>Member Id</em>}</li>
 *   <li>{@link library.Member#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see library.LibraryPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends EObject {
	/**
	 * Returns the value of the '<em><b>Loans</b></em>' reference list.
	 * The list contents are of type {@link library.Loan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loans</em>' reference list.
	 * @see library.LibraryPackage#getMember_Loans()
	 * @model
	 * @generated
	 */
	EList<Loan> getLoans();

	/**
	 * Returns the value of the '<em><b>Member Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Id</em>' attribute.
	 * @see #setMemberId(String)
	 * @see library.LibraryPackage#getMember_MemberId()
	 * @model required="true"
	 * @generated
	 */
	String getMemberId();

	/**
	 * Sets the value of the '{@link library.Member#getMemberId <em>Member Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Id</em>' attribute.
	 * @see #getMemberId()
	 * @generated
	 */
	void setMemberId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see library.LibraryPackage#getMember_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link library.Member#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Member
