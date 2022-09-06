import java.util.Scanner;

// Ler um vetor A de 10 inteiros.
//  Apresentar o vetor B que será A em ordem
// crescente. Apresentar um vetor C que será A em ordem decrescente.


public class Exercicioaleatorioordemcrescente {

	public static void main(String[] args) {
		
		 int  a [], c = 0 , i ;
	        a = new  int [ 10 ];

	        Scanner  in = new  Scanner ( System . in );

	        for ( i = 0 ; i < a.length ; i ++){
	        	
	        	
	        	System.out.print( "Digite" +( i + 1 )+ "° número: " );
	            a [ i ] = in.nextInt ();
	        }

	        for ( i = 0 ; i < a.length ; i ++){
	        	
	        	System.out.print( a [ i ]+ " ={ " );
	        	
	            for ( c = 1 ; c < a [ i ] ; c ++){
	                if ( a [ i ]% c == 0 ){
	                	
	                	System.out.print( c + ", " );
	                }


	            }
	            System.out.print( a [ i ]+ "}" );
	        }


	}
}



	    
	
		

	


