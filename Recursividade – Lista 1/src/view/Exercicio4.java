package view;
import controler.Metodos;

public class Exercicio4 {
	public static void main(String[]args) {
		Metodos metodos = new Metodos();
		int[] vetorQualquer = { -1, 7, -3, -4, 12, -45, 9, -99, 100, 16, 4, -7 };
		
		int negativosNoVetor = metodos.numerosNegativosNoVetor(vetorQualquer, vetorQualquer.length, 0);
		System.out.print(negativosNoVetor);
	}
}
