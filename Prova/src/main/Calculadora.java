package main;

public class Calculadora {
	
	public double somar(double num1, double num2) {
		
		return num1 + num2;
	}
	
	public double subtrair(double num1, double num2) {
		
		return num1 - num2;
	}
	
	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
	public double dividir(double num1, double num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.somar(12, 3));
		System.out.println(calculadora.subtrair(12, 3));
		System.out.println(calculadora.multiplicar(12, 3));
		System.out.println(calculadora.dividir(12, 3));
	}
}
