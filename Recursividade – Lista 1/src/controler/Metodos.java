package controler;

public class Metodos {
	public Metodos() {
		super();
	}
	
	
	//TODO: Exercício 1
	public int somatoria(int numero) {
		if(numero <= 0) {//condição de parada: se o numero for menor ou igual a zero retornamos 0
			return 0;
		}else {
			return numero + somatoria(numero - 1);
		}
	}//Relação da chamada dos passos: A cada chamada recursiva, o número é decrementado em um, até chegar ao caso base.
	
	
	//TODO: Exercício 2
	public int vetorDeInteiros(int[] vetor,int tamanho, int menorValor) {
		if(tamanho == 0) {//Cond. Parada: Se o tamanho do vetor for 0, retornamos o menor valor encontrado
			return menorValor;
		}else {
			if(vetor[tamanho-1] < menorValor) {
				menorValor = vetor[tamanho - 1];
			}
			return vetorDeInteiros(vetor, tamanho-1, menorValor);
		}
	}//relação de chamada: pegamos o ultimo valor do vetor e comparamos com o anterior, decrementando o tamanho do vetor a cada chamada e armazenando o menor valor encontrado.
	
	//TODO: Exercício 3
	public int fatorial(int numero) {
		if(numero <= 1) {//Cond Parada: se numero 0 ou 1 retorna 1 "nao existe fatorial negativo"
			return 1;
		}else{
			return numero * fatorial(numero - 1);
		}
	}//O retorno é dado pelo termo obtido multiplicado pelo termo anterior.
	
	
	//TODO: Exercício 4
	public int numerosNegativosNoVetor(int[] vetor, int tamanho, int Qtd_NumerosNegativos) {
		if(tamanho == 0) {//Cond Parada: se o tamanho do vetor chegar a Zero;
			return Qtd_NumerosNegativos;			
			
		}else {
			if(vetor[tamanho - 1] < 0){
				Qtd_NumerosNegativos += 1;
			}
			return numerosNegativosNoVetor(vetor, (tamanho - 1), Qtd_NumerosNegativos);
		}
	}/*Olhamos o ultimo termo do vetor, se for negativo fazemos a soma.
	   a cada passagem na função reduzimos o tamanho do vetor em uma unidade até chegarmos á Zero*/


	//TODO:Exercício 5 
	public double somatoriaDeDivisoes(int numero,double soma) {
		if(numero == 0) {//Cond Parada: Quando o numero for Zero paramos a soma.
			return soma;
			
		}else {
			double divisao = (1 / ((double)numero));
			soma += divisao;
			return somatoriaDeDivisoes((numero - 1), soma);
			
		}
	}/* Chamamos a função passando o número recebido como parâmetro,
		decrementamos o número em uma unidade a cada chamada,
		no momento em que o número iguala-se a zero retornamos o resultado total da soma.
	 */

}//FIM DA CLASSE