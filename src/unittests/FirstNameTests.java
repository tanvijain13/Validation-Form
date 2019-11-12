package unittests;

import business.UserAccount;
import junit.framework.TestCase;


public class FirstNameTests extends TestCase {

	public void testValidFirstName() {
		assertTrue(UserAccount.isFirstNameValid("Smith"));
		assertTrue(UserAccount.isFirstNameValid("tanvi"));
		assertTrue(UserAccount.isFirstNameValid("jain"));
		assertFalse(UserAccount.isFirstNameValid("@@Smith"));
		assertFalse(UserAccount.isFirstNameValid(")(Smith"));
		assertFalse(UserAccount.isFirstNameValid("=-9Smith"));
		

	}

}
