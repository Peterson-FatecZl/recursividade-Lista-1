package view;
import controler.Metodos;

public class Exercicio2 {
	public static void main(String[]args) {
		Metodos metodos = new Metodos();
		int[] vetorQualquer = {1,7,5,4,2,9,12,15,40,8,4,7};
		
		int menorValorEncontrado = metodos.vetorDeInteiros(vetorQualquer, vetorQualquer.length, vetorQualquer[vetorQualquer.length -1]);
		System.out.print(menorValorEncontrado);
	}
}
