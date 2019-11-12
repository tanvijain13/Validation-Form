package unittests;

import business.UserAccount;
import junit.framework.TestCase;


public class LastNameTests extends TestCase {

	public void testValidLastName() {
		assertTrue(UserAccount.isLastNameValid("john"));
		assertTrue(UserAccount.isLastNameValid("steve"));
		assertTrue(UserAccount.isLastNameValid("tanvi"));
		assertFalse(UserAccount.isLastNameValid("12jug"));
		assertFalse(UserAccount.isLastNameValid("@@hjgs"));
		assertFalse(UserAccount.isLastNameValid("..test"));

	}

}
