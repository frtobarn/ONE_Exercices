package byteBank;

public class Admin extends Official {

	public Admin(String name, String id, double payment) {
		super(name, id, payment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		
		return 0;
	}

}
