
// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
// Criar um vetor A com 8 elementos inteiros.Construir um vetor B de mesmo tipo
//e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[I]=A[I]*2

public class Exercicio02vetor {

	public static void main(String[] args) {

		int[] vetorA = new int[8];
		int[] vetorB = new int[8];

		// 8 Elementos do vetor na posição 0 até 7:
		// índice começa no zero por padrão
		vetorA[0] = 10;
		vetorA[1] = 20;
		vetorA[2] = 30;
		vetorA[3] = 40;
		vetorA[4] = 50;
		vetorA[5] = 60;
		vetorA[6] = 70;
		vetorA[7] = 80;

		// Aqui o índice pode ser i, w, u, qualquer coisa
		//
		for (int i = 0; i < vetorA.length; i++) {

			vetorB[i] = vetorA[i] * 2;

			//System.out.println(" O " + ( i + 1) + " º  " + " elemento do vetor A é " +  vetorA + vetorB[i]);

			
			//System.out.println("Elementos vetorA: " + vetorA[i] + " Elementos vetorB: " + vetorB[i]);
			
			// ou
			
			 System.out.println("Elementos vetorA: " + vetorA[i] + " Elementos vetorB: " + vetorB[i]);
			
			//ou
			
			//System.out.println("Posição " + (i+1) + " do vetor A: " + vetorA[i]);
			
			//System.out.println("Posição " + (i+1) + " do vetor A: " + vetorB[i]);
			
		}

	}
}
