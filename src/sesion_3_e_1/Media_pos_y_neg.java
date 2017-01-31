//Programa Java que lea por teclado 10 números enteros y los guarde en un array.
//A continuación calcula y muestra por separado la media de los valores positivos y la de los valores negativos.

package sesion_3_e_1;

import java.util.Scanner;

public class Media_pos_y_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float medias[] = new float[2];
		int indices = 0;

		System.out.println("¿De cuantos indices desea el array?");
		indices = leerEntero();
		int[] array = new int[indices];

		for (int i = 0; i < array.length; i++) {
			System.out.println("¿Que numero desea en el indice " + i + "?");
			array[i] = leerEntero();
		}
		imprimeArray(array);
		medias = mediaEnteros(array);

		System.out.println("La media de los positivos es " + medias[0] + ".");
		System.out.println("La media de los negativos es -" + medias[1] + ".");
	}

	public static float[] mediaEnteros(int[] array) {
		float medias[] = new float[2];
		float mediaPos = 0.00f;
		float mediaNeg = 0.00f;
		int contPos = 0;
		int contNeg = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
			}
			if (array[i] < 0) {
				mediaNeg -= array[i];
				contNeg++;
			} else {
				mediaPos += array[i];
				contPos++;
			}
		}

		medias[0] = mediaPos / contPos;
		medias[1] = mediaNeg / contNeg;
		return medias;
	}

	public static int leerEntero() {
		boolean esNumero = false;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";
		int entero = 0;
		do {
			System.out.println("Numero:");
			entrada = teclado.next();
			try {
				entero = Integer.parseInt(entrada);
				esNumero = true;
			} catch (NumberFormatException nfe) {
				esNumero = false;
				System.out.println("Ha de introducir un numero entero.");
			}
		} while (!esNumero);
		return entero;
	}

	public static void imprimeArray(int[] array) {
		int f;
		System.out.print("[");
		for (f = 0; f < array.length - 1; f++) {
			System.out.print(array[f] + "\t ");
		}
		System.out.println(array[f] + "]");
	}

}
