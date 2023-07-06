package byteBank;

public class TestBonus {
	public static void main(String[] args) {
		Official official = new Counter("Fanto", "001", 2000);
		Gerente gerente = new Gerente("Fabito", "002", 5000);
		Counter counter = new Counter("Mathman", "003", 4500);

		BonusControl bonusControl = new BonusControl();
		bonusControl.bonusLog(official);
		bonusControl.bonusLog(gerente);
		bonusControl.bonusLog(counter);
		
		
	}

}
