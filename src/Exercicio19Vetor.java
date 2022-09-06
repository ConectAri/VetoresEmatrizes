import java.util.Scanner;

// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
// Ler as duas notas bimestrais para um conjunto de 10 alunos.
// Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
// tipo real. 
// Escreva um programa que calcule a média aritmética simples
// das notas informadas armazenando o resultado em um vetor “Result”
// de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
// de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
// estará “aprovado”, caso contrário, a situação do aluno será
// “reprovado”.

//double ou float para números reais

public class Exercicio19Vetor {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
			
		
		// double se refere aos elementos	
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] resultado = new double[10];
		
		
		// int do for é o índice do vetor que está como inteiro, porque não tem índice quebrado
			for(int i = 0; i<10; i++ ) {
							
			System.out.printf("\n Informe a primeira nota:");
			nota1[i] = leia.nextInt();
			
			System.out.printf("\n Informe a segunda nota: ");
			nota2[i] = leia.nextInt();
			resultado[i] = (nota1[i] + nota2[i])/2;
			
			System.out.println("\n Sua média após informar as notas foram: " + resultado[i] + ".");

	        System.out.printf("\n==============================================================\n");
	        
	        if(resultado[i] >= 7) {
	        	
	        	System.out.println(" Parabéns!! Você foi aprovado(a)");
	        }
	        else {
	        	System.out.println(" Infelizmente você foi reprovado(a)! ");
	        }
	      
		}
	      leia.close();
	    
		}
	}
		


//System.out.printf("\n  Aluno 1a.Nota 2a.Nota Media Situacao.");
// System.out.printf("\n =====================================");
// 
// for (int i = 0; i<7; i++) {
//	  
//   System.out.printf("\n%5d %7.2f %7.2f %5.2f ", (i+1), nota1[i], nota2[i], resultado[i]);
//   if (resultado[i] >= 7.0)
//      System.out.printf("aprovado");
//   else System.out.printf("reprovado");
	
