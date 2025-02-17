/*
 * generated by Xtext 2.35.0
 */
package mdu.mydsl.formatting2

import com.google.inject.Inject
import library.Library
import mdu.mydsl.services.MyDslGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(Library library, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (book : library.books) {
			book.format
		}
		for (member : library.members) {
			member.format
		}
		for (loan : library.loans) {
			loan.format
		}
	}
	
}
