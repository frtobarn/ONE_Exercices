package java_first_steps;

public class matrizExercices {
	public static void main(String[] args) {
		int tamano = 10;

		// Complete
		System.out.println("--------------------------------");
		System.out.println("Complete");
		System.out.println();
		for (int fila = 0; fila < tamano; fila++) {
			for (int columna = 0; columna < tamano; columna++) {
				System.out.print('#');
				System.out.print(' ');
			}
			System.out.println();
		}

		// Diagonal
		System.out.println("--------------------------------");
		System.out.println("Diagonal");
		System.out.println();
		for (int fila = 0; fila < tamano; fila++) {
			for (int columna = 0; columna < tamano; columna++) {
				if (fila == columna) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
				System.out.print(' ');
			}
			System.out.println();
		}

		// Upper
		System.out.println("--------------------------------");
		System.out.println("Upper");
		System.out.println();
		for (int fila = 0; fila < tamano; fila++) {
			for (int columna = 0; columna < tamano; columna++) {
				if (fila < columna) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
				System.out.print(' ');
			}
			System.out.println();
		}

		// Lower
		System.out.println("--------------------------------");
		System.out.println("Lower");
		System.out.println();
		for (int fila = 0; fila < tamano; fila++) {
			for (int columna = 0; columna < tamano; columna++) {
				if (fila < columna) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
				System.out.print(' ');
			}
			System.out.println();
		}
	}

}
