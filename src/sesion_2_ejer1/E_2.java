package sesion_2_ejer1;

import java.util.Scanner;

public class E_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear 2 funciones. 1º GENERAR NUMEROS PRIMOS (Recibe por parametro un nunero
		// y crea por Parametro un ARRAY con los 5 primeros numeros primos) 
		// Con el ARRAY anterior pedimos un nuevo numero y comprobamos si este nuevo numero
		// esta dentro del ARRAY y devolvemos TRUE o FALSE
		
		int array[];
		int indices=0;
		int numero=0;
		 
		System.out.println("¿De que tamaño desea el array de primos?");		
		indices=(int) leerFloat();
		array=new int[indices];
		array=arrayPrimos(indices);
		
		System.out.println("¿Que numero desea comparar con los del array?");
		numero=(int) leerFloat();
				
		imprimeArray(array);
		System.out.println(numero);
		System.out.print(comparaElementos(array, numero));
				
	}
	public static boolean comparaElementos(int array[], int num){
		boolean coincide=false;
		for (int i=0;i<array.length;i++){
			if (array[i]==num){
				coincide=true;
			}
		}
		return coincide;
	}
	
	public static int[] arrayPrimos (int num){
		int []array=new int[num];
		int a=1;
		boolean esPrimo1=false;
		array[0]=1;
		for (int i=0;i<num-1;i++){
			do{
				a++;
				esPrimo1=esPrimo(a);
			if (esPrimo1==true){
				array[i+1]=a;
			}
			}while(esPrimo1==false);
			
		}		
		return array;
	}
	public static boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
	public static float leerFloat() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";
		float num = 0;
		boolean error = false;

		do {
			System.out.println("Introduzca numero:");
			entrada = teclado.nextLine();

			try {
				num = Float.parseFloat(entrada);
				error = false;
				} catch (NumberFormatException ne) {
				error = true;
				System.out.println("Error no has introducido un numero");
				} catch (Exception e) {
				error = true;
				System.out.println("Error generico, revisa la excepcion");
				}
			} while (error);
		return num;
	}
	public static void imprimeArray(int []array){
		int f;
		System.out.print("[");
		for(f=0;f<array.length-1;f++){
			System.out.print(array[f] + "\t ");
		}System.out.println(array[f] + "]");
	}
}
