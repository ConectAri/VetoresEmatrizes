
import java.util.Random;

//* matriz 10 x 10 ( linha x coluna)
//-->Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9.
//-->Após isso indique qual é a maior e menor valor da linha 5 e qual é o maior e o
//   menor valor da coluna 7.
//*
public class ExercicioMatriz02emGRUPO {

	public static void main(String[] args) {

		Random random = new Random();

		int[][] matriz = new int[10][10];

		// Contador que inicia em zero, enquanto i for mentor que o tamanho da matriz
		// acrescenta
		// de um em um

		System.out.println("--------------------------------------------------");
		for (int i = 0; i < matriz.length; i++) {

			// Aqui determina que o j (coluna) tem que ser o mesmo tamanho da linha
			// Contador que inicia em zero, enquanto
			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = random.nextInt(10);

				System.out.print("_" + matriz[i][j] + "_|");

			}
			System.out.println();
		}

		int maior5 = 0;
		int menor5 = 11;
		int maior7 = 0;
		int menor7 = 11;

		for (int i = 0; i < matriz[5].length; i++) {
			// Criar condição
			if (matriz[5][i] > maior5) {
				maior5 = matriz[5][i];
			}
			if (matriz[5][i] < menor5) {
				menor5 = matriz[5][i];
			}

		}

		for (int i = 0; i < matriz.length; i++) {
			// Criar condição
			if (matriz[i][7] > maior7) {
				maior7 = matriz[i][7];
			}
			if (matriz[i][7] < menor7) {
				menor7 = matriz[i][7];

			}
		}

		System.out.println(" ");

		// lembrando que começa a contar do zero

		System.out.println(" O maior valor da linha 5 é : " + maior5);
		System.out.println(" O menor valor da linha 5: " + menor5);

		System.out.println(" ");

		System.out.println(" O maior valor da coluna 7 é : " + maior7);
		System.out.println(" O menor valor da coluna 7: " + menor7);
	}
}
