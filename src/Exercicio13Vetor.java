import java.util.Random;

// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
// Criar um vetor A com 10 elementos inteiros. Implementar um programa
// que determine a soma dos elementos armazenados neste vetor que
// são múltiplos de 5.

public class Exercicio13Vetor {

	public static void main(String[] args) {

		// Construtor
		int[] vetorA = new int[10];
		
		
		// Atributo
		int soma = 0;

		// Para gerar valores aleatórios
		// Construtor
		Random random = new Random();

		// For é apenas a condição
		// For armazena um valor aleatório de zero até 00 dentro das posições do vetor A
		for (int i = 0; i < vetorA.length; i++) {

			vetorA[i] = random.nextInt(100);

			// que determine a soma dos elementos armazenados neste vetor que
			// são múltiplos de 5.

			if (vetorA[i] % 5 == 0) {
				
				soma +=  vetorA[i];
				

			}
		}

		System.out.println(" A soma dos elementos do vetor A é:" + soma);
	}
}
