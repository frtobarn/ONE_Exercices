package classes;

public class SystemControl {
	String password = "1234";

	public boolean auth(Logeable official) {
		if (official.login(password)) {
			System.out.println("Login succesfull!!!");
			return true;
		}
		System.out.println("Login failled!!!");
		return false;
	}

}
