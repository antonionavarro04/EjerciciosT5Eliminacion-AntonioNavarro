package ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ^ Definimos un Array de 20 posiciones
        int randomArray[] = new int[20];

        // ! Rellenamos el array con valores aleatorios entre 0 y 100
        randomArray = SharedMethods.randomFill(randomArray, 0, 100);

        // ? Imprimimos el Array
        System.out.println("Array Original:\n"); SharedMethods.printArray(randomArray);

        // ! Mediante un for recorreremos todos los numeros, si el numero es impar lo eliminaremos de la tabla y decrementaremos la posicion ya que en la posicion que acabamos de eliminar el impar ahora puede haber otro
        for (int pos = 0; pos < randomArray.length; pos++) {
            if (randomArray[pos] % 2 == 1) {
                randomArray = SharedMethods.deleteKnowingData(randomArray, pos);
                pos--;
            }
        }

        // ? Mostramos el Array con los impares eliminados
        System.out.println();
        System.out.println("Array sin Impares:\n"); SharedMethods.printArray(randomArray);
    }
} // € Hecho por Antonio Navarro
