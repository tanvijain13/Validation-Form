package unittests;

import business.UserAccount;
import junit.framework.TestCase;


public class PhoneNumberTests extends TestCase {

	public void testValidPhoneNumber() {
		assertTrue(UserAccount.isPhoneNumberValid("8162356218"));
		assertTrue(UserAccount.isPhoneNumberValid("9167806208"));
		assertTrue(UserAccount.isPhoneNumberValid("5162356786"));
		assertFalse(UserAccount.isPhoneNumberValid("816235"));
		assertFalse(UserAccount.isPhoneNumberValid("81618"));
		assertFalse(UserAccount.isPhoneNumberValid("8162308"));
	}

}
