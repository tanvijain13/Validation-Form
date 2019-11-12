package unittests;

import business.UserAccount;
import junit.framework.TestCase;


public class PasswordTests extends TestCase {

	public void testValidPassword() {
		assertTrue(UserAccount.isPasswordValid("@White0House"));
		assertTrue(UserAccount.isPasswordValid("hjgshd@#12"));
		assertTrue(UserAccount.isPasswordValid("082@hdgu$"));
		assertFalse(UserAccount.isPasswordValid("pass"));
		assertFalse(UserAccount.isPasswordValid("1234"));
		assertFalse(UserAccount.isPasswordValid("test2"));
	}

}
