
//  https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19

// Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
// que verifique se "todos" os elementos do vetor A são pares. Se pelo
// menos um elemento do vetor não for par o processo de repetição para
// percorrer os elementos do vetor deve ser encerrado, como sugestão:
// utilize uma variável do tipo flag para atingir este propósito.

public class Exercicio23vetor2HUGO {

	public static void main(String[] args) {
		
			
		int[] vetorA = { 2, 3, 4, 5, 7, 8, 9, 10};
		
				
		// for é laço de repetição, ele é usado para percorrer o vetor de forma automática
		for(int i=0; i<vetorA.length; i++) {
			
							
			//toda vez que o número for divisível por 2 e o resto é igual a zero significa que é par
			// % é referÊncia a resto da divisão
			if (vetorA[i] % 2 != 0) {
								
				break;
			}
			
			System.out.println( vetorA[i] );
			
		}

	}

}
