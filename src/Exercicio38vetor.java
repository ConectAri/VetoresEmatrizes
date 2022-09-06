import java.util.Scanner;

//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19

// Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo
// e tamanho, sendo que cada elemento de B deverá ser o seguinte
// somatório: Bi = Somatório de Aj, para todo j variando de i até 10.

public class Exercicio38vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] VetorA = new int[10];
		int[] VetorB = new int[VetorA.length];
		
		
		// Tem que pegar primeiro o vetor A
		for( int j = 0; j< VetorA.length ; j++) {
			System.out.println(" Informe o valor do elemento:  ");
			VetorA[j] = leia.nextInt();
						
		}
		
		for (int i =0; i < VetorB.length;i++) {
			
            for (int j = i; j < 10 ; j++) {
            	
                VetorB[i] = VetorB[i] + VetorA[j];
                
            }
		}
            
            for (int i = 0; i < VetorA.length; i++){
            	
	            System.out.println("B ["+i+"] = " + VetorB[i]);
	        }
            leia.close();
        }
		
}

	


