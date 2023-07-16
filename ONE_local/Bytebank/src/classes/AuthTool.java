package classes;

public class AuthTool {
	private String password;

	public boolean login(String password) {
		return this.password == password;
	}

	public void setPassword(String password) {
		this.password = password; 
	}

}
