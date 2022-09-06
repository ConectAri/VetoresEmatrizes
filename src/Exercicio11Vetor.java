import java.util.Random;

// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
// Criar um vetor A com 10 elementos inteiros. Implementar um programa
// que defina e escreva a quantidade de elementos armazenados neste
// vetor que são pares.

public class Exercicio11Vetor {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		
		int quantidadeDePares = 0 ;

		Random random = new Random();
		
		
		// For é apenas a condição
		// For armazena um valor aleatório de zero até 00 dentro das posições do vetor A
		for (int i = 0; i < vetorA.length; i++) {
			// Vai sortear 10 números aleatórios de zero até 99, pois a contagem inicia no
			// zero
			// Caso queira gerar o número 100 teria que colocar 101
			// Eu que defino que quero números aleatórios até 100, poderia ter colocado 50,
			// 70, 28 por exemplo
						
			vetorA[i] = random.nextInt(100);
		
			// If tem que ficar dentro do for
			if (vetorA[i] % 2 == 0) {
				quantidadeDePares++;

			}

		}

		System.out.println(" A quantidade de pares do vetor é: " + quantidadeDePares);
	}

}

