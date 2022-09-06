import java.util.Scanner;


//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
//Ler as duas notas bimestrais para um conjunto de 10 alunos.
//Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
//tipo real. 
//Escreva um programa que calcule a média aritmética simples
//das notas informadas armazenando o resultado em um vetor “Result”
//de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
//de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
//estará “aprovado”, caso contrário, a situação do aluno será
//“reprovado”.

//double ou float para números reais



public class Exercicio19rafafezVetor {

	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
		

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] results = new double[10];
        String[] nomeAluno = new String[10];

        for (int i = 0; i < nota1.length; i++) {
        	
            System.out.print("Digite o nome do aluno: ");
            nomeAluno[i] = teclado.next();
            
            System.out.print("Digite a primeira nota: ");
            nota1[i] = teclado.nextDouble();
            
            System.out.print("Digite a segunda nota: ");
            nota2[i] = teclado.nextDouble();

            results[i] = (nota1[i] + nota2[i]) / 2;
            
            if (results[i] >= 7) {
            	
                System.out.println("A média do aluno " + nomeAluno[i] + " é: " + results[i] + " Aluno aprovado!");
                
            } else if (results[i] < 7 && results[i] >= 5) {
            	
                System.out.println("A média do aluno " + nomeAluno[i] + " é: " + results[i] + " Aluno em recuperação!");
                
            } else {
            	
                System.out.println("A média do aluno " + nomeAluno[i] + " é: " + results[i] + " Aluno reprovado!");
            }
        }
    }
	

	}


