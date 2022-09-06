
// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
// Criar dois vetores A e B cada um com 10 elementos inteiros.
// Construir um vetor C, onde cada elemento de C é a soma dos respectivos
// elementos em A e B, ou seja:
// C[i] = A[i] + B[i].

public class Exercicios06vetoresSEMRandom {

	public static void main(String[] args) {

		// Construtor de vetor, inclusive o Scanner é um construtor
		// tipo , nome, crio ( o crio é o new alguma coisa)
		// tipo inteiro que é um vetor, vetor b é um nome
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		// 10 Elementos do vetor na posição 0 até 9:
		// índice começa no zero por padrão POR ISSO DE 0 ATÉ 9
		// Armazenando os valores 10,20,30 etc.. dentro da posição 0,1,2,3,4,..
		vetorA[0] = 10;
		vetorA[1] = 20;
		vetorA[2] = 30;
		vetorA[3] = 40;
		vetorA[4] = 50;
		vetorA[5] = 60;
		vetorA[6] = 70;
		vetorA[7] = 80;
		vetorA[8] = 90;
		vetorA[9] = 100;

		for (int i = 0; i < vetorA.length; i++) {

			vetorB[i] = vetorA[i];
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(" ");
			System.out.println(" O valor do vetor A é: " + vetorA[i]);
			System.out.println(" A posição do: " + (i + 1) + " º " + " elemento do vetor A é " + vetorA[i]);
			System.out.println(" ");

		}

		for (int i = 0; i < vetorB.length; i++) {

			System.out.println(" ");
			System.out.println(" O valor do vetor B é: " + vetorB[i]);
			System.out.println(" A posição do: " + (i + 1) + " º " + " elemento do vetor B é " + vetorB[i]);
			System.out.println(" ");

		}

		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(" -----------------------------------");
			System.out.println(" O valor do vetor C é: " + vetorC[i]);
			System.out.println(" -----------------------------------");
		}

		// System.out.println(" O vetor C é igual " + vetorA[i] + vetorB[i]);

		// ou

		// System.out.println(" O vetor C sem a soma é igual " + vetorC[i]);

		// ou

		// System.out.println( vetorC[i] + " = " + vetorA[i] + " + " + vetorB[i]);

		// ou

		// System.out.println(" O valor de Vetor C é: " + vetorC[i] + " = " + " Vetor
		// A:"
		// + vetorA[i] + " + " + " Vetor B" + vetorB[i]);

	}

}
