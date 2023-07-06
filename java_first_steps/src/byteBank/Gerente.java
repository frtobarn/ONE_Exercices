package byteBank;

public class Gerente extends Official {
	private String password;

	public Gerente(String name, String id, double payment) {
		super(name, id, payment);
	}

	// Overwrite. Overwriting a method
	@Override
	public double getBonus() {
		return super.getPayment() + super.getPayment() * 0.05	;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean login(String id, String password) {
		if (this.getId() == id && this.password == password) {
			return true;
		}
		return false;
	}
}
