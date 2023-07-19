package bytebank;

public class TestReferences {
	public static void main(String[] args) {
		Official official = new Accountant("Fabito", "001", 3000);
		// Gerente gerente = new Gerente("Fanto", "117", 5000);
		Gerente officialGerente = new Gerente("Ricardo", "002", 7500);

		// officialGerente.login();

		System.out.println(official.getName());
		// System.out.println(gerente.getName());
		System.out.println(officialGerente.getBonus());
	}

}
