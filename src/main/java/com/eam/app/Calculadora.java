package main.java.com.eam.app;

public class Calculadora {

	public double sumar (double a, double b) {
	return a + b ;
    }
	
	public double restar (double a, double b) {
		return a - b;
	}
	
	public double dividir (double a, double b) {
		if (b == 0.0) {
			throw new IllegalArgumentException("No se admiten divisores 0");
		}
		return a / b;
	}
	
	public double multiplicar (double a, double b) {
		return a*b;
	}


}
