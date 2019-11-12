package unittests;

import business.UserAccount;
import junit.framework.TestCase;


public class UserNameTests extends TestCase {

	public void testValidUserName() {
		assertTrue(UserAccount.isUserNameValid("admin"));
		assertTrue(UserAccount.isUserNameValid("tanvi"));
		assertTrue(UserAccount.isUserNameValid("jain"));
		assertFalse(UserAccount.isUserNameValid("5262"));
		assertFalse(UserAccount.isUserNameValid("$$$"));
		assertFalse(UserAccount.isUserNameValid("09Y7"));
	}

}
