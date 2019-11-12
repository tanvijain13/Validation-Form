package unittests;

import business.UserAccount;
import junit.framework.TestCase;


public class EmailAddressTests extends TestCase {

	public void testValidEmailAddress() {
		assertTrue(UserAccount.isEmailValid("don.smith@gmail.com"));
		assertTrue(UserAccount.isEmailValid("jammith@yahoo.com"));
		assertTrue(UserAccount.isEmailValid("dctest@gmail.com"));
		assertFalse(UserAccount.isEmailValid(".smith@..gmail.com"));
		assertTrue(UserAccount.isEmailValid("tanvi@suvysoft.com"));
		assertFalse(UserAccount.isEmailValid("@@.jack@gmailcom"));
		assertTrue(UserAccount.isEmailValid("steves@icloud.com"));
		assertFalse(UserAccount.isEmailValid("do@n@gmail.com"));
	}

}
