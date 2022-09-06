
// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
// criar um vetor A com 5 elementos inteiros
// criar um vetor B com 5 elementos e tamanhos do vetor A

public class Exercicio01vetor {

	public static void main(String[] args) {

		// criar um vetor A com 5 elementos inteiros
		int[] vetorA = new int[5];
		// criar um vetor B com 5 elementos e tamanhos do vetor A
		int[] vetorB = new int[5];

		// Armazenei valor 10 no índice zero
		// Elementos
		vetorA[0] = 10;
		vetorA[1] = 30;
		vetorA[2] = 50;
		vetorA[3] = 70;
		vetorA[4] = 90;
		//Criamos o FOR para percorrer o vetorA e ter acesso aos valores armazenados....
		//.....
		//PARA que eu atenda condição que comece do zero e vá até 4
		// indice ++ porque vai de um em um, ele é o incremento
		for(int indice= 0; indice<vetorA.length; indice ++ ) {
		// Foi feito o for para percorrer ele e mostrar os valores
									
			vetorB[indice] = vetorA[indice];
			
			// A cada laço será impresso
			System.out.println(" O valor do vetor A : " + (indice + 1) + " º posição:  " + vetorA[indice]);
			
			System.out.println(" O valor do vetor B : " + (indice + 1) + " º posição:  " + vetorB[indice]);
						
		}

	}
}
