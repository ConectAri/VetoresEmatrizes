import java.util.Scanner;

//Ler 10 elementos inteiros em um vetor A. Montar uma rotina de busca, para
//pesquisar se um dado elemento X está armazenado em A

public class Exerciciooutraformavetor {

	public static void main(String[] args) {
	
		   int  a [] = new  int [ 10 ];
		   
	        boolean Verdadeiro = false ;

	        Scanner  in = new  Scanner(System.in);

	        for ( int  i = 0 ; i < a.length ; i ++) {
	       
	        	System.out.print( "Preencher o vetor A[" + i + "]:" );       
	                       
	            a [ i ] = in.nextInt ();

	        }
	        
	        System.out.print( "Qual elemento você quer verificar" );
	        int  x = in.nextInt ();


	        for ( int  i = 0 ; i < a . length ; i ++) {
	            if ( a [ i ] == x ){
	                Verdadeiro = true ;
	            }
	        }



	        if (true){
	        	System.out.print( "O numero " + x + " exite no vetor A!" );
	        } else {
	        	System.out.print( "O numero " + x + " nao exite no vetor A!" );
	        }



	    }
	

	}


