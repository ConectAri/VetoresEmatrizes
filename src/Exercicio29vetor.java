import java.util.Random;

//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
//Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
//sendo este a junção dos dois outros vetores. Os primeiros 10
//elementos de C deverão receber os elementos de A e os últimos
//elementos C deverão receber os elementos de B. Desta forma, C
//deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.

public class Exercicio29vetor {

	public static void main(String[] args) {

		int[] VetorA = new int[10];
		int[] VetorB = new int[10];
		int[] VetorC = new int[20];

		Random random = new Random();
		
		// caminho percorrido (length)
		//O indice inicia em zero e quando ele for menor que o tamanho do vetor c será incrementado
		//mais um
		for(int i = 0; i<VetorA.length; i++) {
			//gerou vetor a pelo random
			VetorA[i] = random.nextInt(100);
			VetorC[i] = VetorA[i];
			
		}
		
		for(int i = 0; i<VetorB.length; i++) {
			//gerou vetor b pelo random de zero até 99
			VetorB[i] = random.nextInt(100);
			// Mais i representa a contagem e inicia a próxima contagem
			VetorC[VetorA.length + i] = VetorB[i];
			
		}		
		
		for(int i = 0; i<VetorC.length; i++) {	
					
			//VetorC[i] = random.nextInt(100);
			
			System.out.println( "VetorC na posição " + (i + 1) +  " é:"  + VetorC[i]);
		}
		

	}

	
}

