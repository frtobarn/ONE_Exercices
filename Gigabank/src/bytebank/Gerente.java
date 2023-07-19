package bytebank;

public class Gerente implements Logeable {
	private String password;

	public Gerente() {
		super();
	}

	public Gerente(String name, String id, double payment) {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getBonus() {
		return 0.1;
	}

	@Override
	public boolean login(String password) {
		return this.password == password;
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub

	}

}
