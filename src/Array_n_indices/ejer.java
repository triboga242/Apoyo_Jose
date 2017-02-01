package Array_n_indices;

import java.util.Scanner;

public class ejer {

	public static void main(String[] args) {

		System.out.println("�De que tama�o desea el array?");
		int[] arrayMulti = new int[leerNum()];

		rellenaArray(arrayMulti);

		System.out.println("�Por que n�mero deseas multiplicar sus elementos?");
		int producto = leerNum();

		imprimeArray(arrayMulti);

		for (int i = 0; i <= arrayMulti.length - 1; i++) {
			System.out.print("x " + producto + "\t");
		}
		System.out.println("");

		imprimeArray(multiArray(arrayMulti, producto));

	}

	/**
	 * Esto es una funci�n que rellena el array
	 * @param array Array a rellenar
	 * @return Array rellenado
	 */
	public static int[] rellenaArray(int[] array) {

		for (int f = 0; f < array.length; f++) {
			array[f] = (int) (Math.random() * 100 + 1);
		}
		return array;
	}

	/**
	 * Lee un n�mero por consola y lo devuelve
	 * @return N�mero le�do por consola
	 */
	public static int leerNum() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";
		int num = 0;
		boolean error = false;

		do {
			entrada = teclado.nextLine();

			try {
				num = (int) Float.parseFloat(entrada);
				error = false;
			} catch (NumberFormatException ne) {
				error = true;
				System.out.println("Error no has introducido un numero.");
			} catch (Exception e) {
				error = true;
				System.out.println("Error generico, revisa la excepcion.");
			}

		} while (error);
		return num;
	}

	public static int[] multiArray(int[] array, int num) {

		int[] array2 = new int[array.length];

		for (int f = 0; f < array.length; f++) {
			array2[f] = array[f] * num;
		}
		return array2;
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
