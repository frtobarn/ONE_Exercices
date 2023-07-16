package classes;

public class TestSystem {

	public static void main(String[] args) {
		SystemControl systemTest = new SystemControl();
		Gerente gerente1 = new Gerente();
		Admin admin1 = new Admin();
		
		systemTest.auth(gerente1);
		systemTest.auth(admin1);
	}

}
