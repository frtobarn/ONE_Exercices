package byteBank;

public class TestOfficial {

	public static void main(String[] args) {
		Official official = new Counter("Fanto", "1033724677", 3000);
		System.out.println(official.getPayment());
		System.out.println(official.getBonus());
	}

}
