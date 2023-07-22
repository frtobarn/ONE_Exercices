package stack;

public class TestConecction {

	public static void main(String[] args) throws Exception {

		try (Connecction connection = new Connecction()) {
			connection.leerDatos();
		} catch (IllegalStateException ie) {
			System.out.println("Ejecutando catch");
			ie.printStackTrace();
		}

		/*
		 * Conecction conecction = null; try { conecction = new Conecction();
		 * conecction.leerDatos(); } catch (IllegalStateException ie) {
		 * System.out.println("He recibido la excepción"); ie.printStackTrace(); }
		 * finally { if (conecction != null) {
		 * System.out.println("Se cerrará la conexión"); conecction.cerrar(); } else {
		 * System.out.println("No hay conexión para cerrar"); } } }
		 */

	}
}
