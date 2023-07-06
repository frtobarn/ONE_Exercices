package byteBank;

public class Counter extends Official{

	public Counter(String name, String id, double payment) {
		super(name, id, payment);
	}
	
	@Override
	public double getBonus() {
		return 200;
	}
}
