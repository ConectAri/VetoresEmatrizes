import java.util.Random;
import java.util.Scanner;

//  https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
// Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
// que verifique se "todos" os elementos do vetor A são pares. Se pelo
// menos um elemento do vetor não for par o processo de repetição para
// percorrer os elementos do vetor deve ser encerrado, como sugestão:
// utilize uma variável do tipo flag para atingir este propósito.

public class Exercicio23vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//tipo, sinal de vetor []
		
		int[] vetorA = new int[10];
		
		//int quantidadeDePares = 0 ;
		
		Random random = new Random();
		
				
		// for é laço de repetição, ele é usado para percorrer o vetor de forma automática
		for(int i=0; i<vetorA.length; i++) {
			
			vetorA[i] = random.nextInt(10);
			
					
			//toda vez que o número for divisível por 2 e o resto é igual a zero significa que é par
			// % é referÊncia a resto da divisão
			if (vetorA[i] % 2 != 0) {
				//quantidadeDePares++;
				
				break;
			}
			
			System.out.println( vetorA[i] );
			
		}

	}

}
