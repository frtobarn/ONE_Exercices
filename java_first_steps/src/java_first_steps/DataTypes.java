package java_first_steps;

public class DataTypes {
	
	public static void main(String[] args) {
		//Data types title
		System.out.println("Data types");
		
		//integers
		int age=32;
		
		//size in meters
		double size= 1.84;
		
		//float is a smaller decimal number
		float floatVar= 2.5f;
		System.out.println(floatVar);
		
		//String 
		String text1 = "Mi edad es: ";
		String text2 = " y mi estatura es: " + size + "m";
		
		System.out.println(text1 + age + text2);
		
		//Operators's behaviors
		int regalos = 15;
		int personas = 2;
		System.out.println (regalos / personas);
		
		double regalos1 = 15;
		int personas1 = 2;
		System.out.println (regalos1 / personas1);
		
		//Casting3
		double doubleVar = 10.5;
		int intVar = (int) doubleVar;
		System.out.println(intVar);
		
		//Type long
		long longVar = 990000000000000000L;
		System.out.println(longVar);
		short shortVar = 12345;
		System.out.println(shortVar);
		byte eightBitsDataVar = 1;
		System.out.println(eightBitsDataVar);
		
		//Casting again
		System.out.println((float) eightBitsDataVar + intVar);
		
	}

}
