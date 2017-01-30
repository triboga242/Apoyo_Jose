// Crear un programa java con 3 funciones, la primera creara y devolvera un array de 100 elementos del 1 al 100
// Calcula la suma de el array de enteros que acabamos de crear
// Calcula la media de el array que hemos creado y te la devuelve 
public class EJER_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		imprimeArray(generaArray());
		System.out.println("");
		System.out.println("La suma es " + sumaArray(generaArray()));
		System.out.println("");
		System.out.println("La media es " + mediaArray(sumaArray(generaArray())));
	}
	
	public static int[] generaArray(){
		int []myArray=new int[100]; 
		int i=1;
		for (int num=0;num<100;num++){
			myArray[num]=i;
			i++;
		}
		return myArray;
	}
	
	public static void imprimeArray(int array[]){
		for (int i=0;i<array.length-1;i++){
			System.out.print(array[i] + "\t");
		}
		}
	
	
	public static int sumaArray(int array[]){
		int suma=0;
		
		for (int aux=0; aux<100;aux++){
			suma+=array[aux];
		}
		return suma;
	}
	
	public static float mediaArray(int suma){
		float media=0;
		media=suma/100;
		return media;
	}
}
