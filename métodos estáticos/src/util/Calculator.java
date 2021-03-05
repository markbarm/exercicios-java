package util;

public class Calculator {
	/*
	 * Esta classe possui métodos estáticos.
	 * Ela não pode ser instanciada.
	 * para chamar os métodos deve ser usado o nome da classe.
	*/
	
	public static final double PI = 3.14159 ;
	
	public static double circunference(double radius) {
		return 2 * PI * radius;
	}
	public static double volume(double radius) {
		return 4 * PI * Math.pow(radius, 3.00)/3.00;
	}
}
