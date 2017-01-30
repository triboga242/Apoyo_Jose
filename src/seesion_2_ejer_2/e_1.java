package seesion_2_ejer_2;

import java.util.Scanner;

public class e_1 {

		final static char[] Alfabeto = {
				
				'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'
		};
		
		public static void main(String[] args) {
			
			// Pedir una LETRA y comprobar si esta en el Alfabeto.
			
			@SuppressWarnings("resource")
			
			Scanner Teclado = new Scanner(System.in);
			
			System.out.println("Introduce la Letra a comprobar: ");
			
			String cadena = Teclado.next();
			 
			char letra = cadena.charAt(0);	
			 
			 System.out.println(EsLetra(letra));
			
		}
		
		public static boolean EsLetra (char Letra){
			
				for ( int i = 0 ; i < Alfabeto.length ; i++){
					
					if(Alfabeto[i] == Letra)
					
						return true;
				}
				
				return false;
	}

}
