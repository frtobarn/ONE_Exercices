package byteBank;

public class Accountant extends Official{

	public Accountant(String name, String id, double payment) {
		super(name, id, payment);
	}
	
	@Override
	public double getBonus() {
		return 200;
	}
}
