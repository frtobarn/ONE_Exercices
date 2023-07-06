package byteBank;

public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Fabi", "0", 5000);
		gerente.setPassword("0123");
		
		System.out.println(gerente.login("0", "0123"));

		System.out.println(gerente.getBonus());
	}

}
