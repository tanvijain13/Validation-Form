package business;
import java.util.regex.Pattern;
public class UserAccount {
	
	private String userName;
	private String password;
	
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public UserAccount() {	
	}
	
	public static String checkInputError(String userName, String password, String firstName, String lastName, String email, String phone){
		String errorMessage ="";
		if (!isUserNameValid(userName))
				errorMessage += "Invalid user name.\n";
		if (!isPasswordValid(password))
				errorMessage += "Invalid password.\n";	
		if (!isFirstNameValid(firstName))
			errorMessage += "Invalid first name.\n";
		if (!isLastNameValid(lastName))
			errorMessage += "Invalid last name.\n";
		if (!isEmailValid(email))
			errorMessage += "Invalid email.\n";
		if (!isPhoneNumberValid(phone))
			errorMessage += "Invalid phone number.\n";
		return errorMessage;
	}
	
	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	// you need to complete this method
	public static boolean isUserNameValid(String userName){
		// check if userName is valid	 
		if (userName.length()==0) {
			System.out.println("BLANK");
			return false;
		}
		if (!Character.isLetter(userName.charAt(0))) {
			System.out.println("Does not start with character");
			return false;
		}
		for (int index=0; index<userName.length(); index++) {
			if (!(Character.isLetter(userName.charAt(index))||Character.isDigit(userName.charAt(index)))) {
				System.out.println("your username contains something other than letter or Dig");
				return false;
			}
		}
		return true;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	

	// you need to complete this method
	public static boolean isPasswordValid(String password){
		// check if password is valid
		boolean sChar=false;
		boolean Dig=false;
		boolean uCase=false;
		boolean lCase=false;
		
		if (password.length()<6) {
			System.out.println("Password is short");
			return false;
		}
		
		
		for (int index=0; index<password.length(); index++) {
			if (!(Character.isLetter(password.charAt(index))||Character.isDigit(password.charAt(index))
					|| password.charAt(index)=='^' || password.charAt(index)=='#' || password.charAt(index)=='$'
					|| password.charAt(index)=='&' || password.charAt(index)=='@')) {
				System.out.println("Create another password");
				return false;
			}
			if(password.charAt(index)=='&' || password.charAt(index)=='@' || password.charAt(index)=='$'
			|| password.charAt(index)=='^' || password.charAt(index)=='#') {
				sChar=true;
			}
			if (Character.isLetter(password.charAt(index))) {
				if(Character.isUpperCase(password.charAt(index))) {
					
					uCase=true;
			    }
				else {
					lCase=true;
				}
			}
			else if (Character.isDigit(password.charAt(index))) {
				
				Dig=true;
			}
			
		}
		if (!sChar) {
			System.out.println("No Special Character");
		}
		if (!uCase) {
			System.out.println("No uCase Case");
		}
		if (!lCase) {
			System.out.println("No lCase Case");
		}
		if (!Dig) {
			System.out.println("No Dig");
		}
		if (sChar&&uCase&&lCase&&Dig) {
			System.out.println("Strong Password");
		}
		
		return (sChar&&uCase&&lCase&&Dig);
	}


    public boolean isValidCredential(String userName, String password) {
         return matchUserName(userName) && matchPassword(password);
    }
    
    public boolean matchUserName(String userName) {
         return userName != null && userName.equalsIgnoreCase(this.userName);
    }
    
    private boolean matchPassword(String password) {
        return password != null && password.equals(this.password);
   }

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	// you need to complete this method
	public static boolean isFirstNameValid(String firstName){
		// check if firstName is valid
		if (firstName.length()==0) {
			System.out.println("Firstname empty");
			return false;
		}
		for (int index=0; index<firstName.length(); index++) {
			if(!(Character.isLetter(firstName.charAt(index)))) {
				System.out.println("fname contains something weird");
				return false;
			}
		}
		System.out.println("fname good");
		return true;
	}
	
	public String getLastName(){
		return lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	// you need to complete this method
	public static boolean isLastNameValid(String lastName){
		if (lastName.length()==0) {
			System.out.println("lastname empty");
			return false;
		}
		for (int index=0; index<lastName.length(); index++) {
			if(!(Character.isLetter(lastName.charAt(index)))) {
				System.out.println("lname contains something weird");
				return false;
			}
		}
		System.out.println("lname good");
		return true;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	// you need to complete this method
	public static boolean isEmailValid(String email){
		// check if email is valid
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
		Pattern pat = Pattern.compile(emailRegex); 
		if (email == null) 
			return false; 
		if (pat.matcher(email).matches()) {
			System.out.println("email good");
			}
		else {
			System.out.println("email bad");
			}
		return pat.matcher(email).matches(); 
		
		
		}

	public String getPhoneNumber(){
		return phone;
	}

	public void setPhoneNumber(String phone){
		this.phone = phone;
	}

	// you need to complete this method
	public static boolean isPhoneNumberValid(String phone){
		// check if phone (number) is valid
		System.out.println("phone good is good-");
		if (phone.matches("\\d{10}")) return true;
		//validating phone number with -, . or spaces
		else if(phone.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
		//validating phone number with extension length from 3 to 5
		else if(phone.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
		//validating phone number where area code is in braces ()
		else if(phone.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
		//return false if nothing matches the input
		else {
			System.out.println("BAAAAAD");
			return false;
		}
}


}
