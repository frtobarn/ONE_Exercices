package classes;

public class ExeptionFLow {

	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin de main");
	}

	private static void metodo1() {
		System.out.println("Inicio de metodo1");
		try {
			metodo2();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		} catch (MyException me) {
			System.out.println("He atrapado una de las mias");
			me.printStackTrace();
		}
		System.out.println("Fin de metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicio de metodo2");
		throw new MyException("Mi excepcion se ha ejecutado");
		// System.out.println("Fin de metodo2");
	}

}
