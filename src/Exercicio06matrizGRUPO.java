import java.util.Scanner;

//Faça um programa para jogar o jogo da velha. O programa deve
//permitir que dois jogadores façam uma partida do jogo da velha,
//usando o computador para ver o tabuleiro. Cada jogador vai
//alternadamente informando a posição onde deseja colocar a sua
//peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
//determinar automaticamente quando o jogo terminou e quem foi o
//vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
//deve atualizar a situação do tabuleiro na tela.

public class Exercicio06matrizGRUPO {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Declarando a matriz
		char[] [] jogoDaVelha = new char[3][3];

		System.out.println(" Jogador 1 = x ");
		System.out.println(" Jogador 2 = 0 ");

		// Precisa saber quando vai para automaticamente
		//indicando a vez de cada jogador

		boolean ganhou = false;
		int jogadorDaVez = 1; // para contar qual jogada estamos
		char simbolo;
		int linha = 0;
		int coluna = 0;

		// usou flag
		while (!ganhou) {
			// Equanto a jogada for jogador par
			if (jogadorDaVez % 2 == 1) { // jogador 1 que irá fazer a jogada, pois sempre que é número ímpar

				System.out.print(" Vez do jogador 1. Escolha linha e coluna (1-3). ");
				simbolo = 'x';
			} else {
				System.out.print(" Vez do jogador 2. Escolha linha e coluna (1-3). ");
				simbolo = 'O';
			}
			// Continua o jogo e validando as linhas

			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.print(" Entre com a linha (1, 2 ou 3) ");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.print(" Entrada inválida, tente novamente ");
				}
			}

			// Agora a coluna
			 // Validando a entrada das colunas do jogo

			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.print(" Entre com a coluna (1, 2 ou 3) ");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.print(" Entrada inválida, tente novamente ");
				}
			}
			
			//PRECISA DECREMENTAR, porque a matriz inicia contando do zero e nao tem zero
			//..em nossas linhas e coluna, por isso decrementar, por isso o menos menos --, pode
			//decrementar também como linha -1 ou coluna -1
			linha --;
			coluna --;
			
			// Se o jogo da velha for igual  OU   OU   OU 
			if(jogoDaVelha [linha] [coluna] == 'X' || jogoDaVelha [linha] [coluna] == 'O') {
				System.out.print(" Posição já usada, tente novamente ");
			}else { //jogada válida
				jogoDaVelha [linha] [coluna] = simbolo; // setando o sinal
				jogadorDaVez++; //se não for volta para o início
								
			}
			// imprimir o tabuleiro
			
			//não é uma boa prática na hora do length colocar valores
			
			for(int i= 0; i< jogoDaVelha.length; i++) {
				for(int j=0;  j<jogoDaVelha.length; j++) {
					System.out.print(jogoDaVelha[i][j] + " | ");
					
				}
				System.out.println();				
			}
			
			//Verifica se tem um ganhador
			// Agrupando, linha zero, coluna zero
			 // Verificando o ganhador do jogo (descrevendo todas as possibilidades de ganho
            // no tabuleiro)
																									// OU
			if((jogoDaVelha[0][0] ==  'X' && jogoDaVelha[0][1] ==  'X' && jogoDaVelha[0][2] ==  'X' ) ||  // LINHA01
					(jogoDaVelha[1][0] ==  'X' && jogoDaVelha[1][1] ==  'X' && jogoDaVelha[1][2] ==  'X' )||  //LINHA02
					(jogoDaVelha[2][0] ==  'X' && jogoDaVelha[2][1] ==  'X' && jogoDaVelha[2][2] ==  'X' ) || //LINHA03
					(jogoDaVelha[0][0] ==  'X' && jogoDaVelha[0][1] ==  'X' && jogoDaVelha[2][0] ==  'X' )|| //COLUNA01
					(jogoDaVelha[0][1] ==  'X' && jogoDaVelha[0][1] ==  'X' && jogoDaVelha[0][1] ==  'X' )|| //COLUNA02
					(jogoDaVelha[0][2] ==  'X' && jogoDaVelha[0][2] ==  'X' && jogoDaVelha[0][2] ==  'X' )|| //COLUNA03
					(jogoDaVelha[0][0] ==  'X' && jogoDaVelha[1][1] ==  'X' && jogoDaVelha[2][2] ==  'X' )) { // DIAGONAL
				
				ganhou = true;
				System.out.print(" Parabéns, jogador 1 ganhou!!!");
			}else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] ==  'O' ) ||  // LINHA01
					(jogoDaVelha[1][0] ==  'O' && jogoDaVelha[1][1] ==  'O' && jogoDaVelha[1][2] ==  'O' )||  //LINHA02
					(jogoDaVelha[2][0] ==  'O' && jogoDaVelha[2][1] ==  'O' && jogoDaVelha[2][2] ==  'O' ) || //LINHA03
					(jogoDaVelha[0][0] ==  'O' && jogoDaVelha[0][1] ==  'O' && jogoDaVelha[2][0] ==  'O' )|| //COLUNA01
					(jogoDaVelha[0][1] ==  'O' && jogoDaVelha[0][1] ==  'O' && jogoDaVelha[0][1] ==  'O' )|| //COLUNA02
					(jogoDaVelha[0][2] ==  'O' && jogoDaVelha[0][2] ==  'O' && jogoDaVelha[0][2] ==  'O' )|| //COLUNA03
					(jogoDaVelha[0][0] ==  'O' && jogoDaVelha[1][1] ==  'O' && jogoDaVelha[2][2] ==  'O' )) { // DIAGONAL
				
				ganhou = true;
				
				System.out.print(" Parabéns, jogador 2 ganhou!!!!");
			}else if (jogadorDaVez > 9 ) {
				ganhou = true;
				System.out.print("Ninguém ganhou esta partida");
				
				
			}
						
		}
		
	}
}
