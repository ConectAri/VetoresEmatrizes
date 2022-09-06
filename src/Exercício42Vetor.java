import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19

// Ler 10 elementos inteiros em um vetor A e colocá-los em ordem
// crescente e apresentar os elementos ordenados.
//
//

public class Exercício42Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] VetorA = new int[10];

		for (int i = 0; i < VetorA.length; i++) {
			// Precisa ser dentro do for para o usuário inserir os números
			System.out.print(" Digite o " + (i + 1) + "° número: ");
			VetorA[i]= leia.nextInt();

		}

		Arrays.sort(VetorA);

		System.out.println(" Ordem crescente");
		for (int j = 1; j < VetorA.length; j++) {

			System.out.println(VetorA[j]);
		}
		
		leia.close();

	}

}
