package view;
import controler.Metodos;

public class Exercicio5 {
	public static void main(String[]args) {
		Metodos metodos = new Metodos();
		int number = 3;
		
		double resultado = metodos.somatoriaDeDivisoes(number, 0);
		System.out.printf("%.2f",resultado);
	}
}
