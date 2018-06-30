package webapp.login;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("51027094") && password.equals("1234");
	}

}
