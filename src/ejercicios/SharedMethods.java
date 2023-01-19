package ejercicios;

// ? Importamos la Clase Array
import java.util.Arrays;

public class SharedMethods {
    // ! Enteros
    public static int[] deleteData(int originalArray[], int numberToBeSearched) { // ? Must be Ordered
        int newArray[] = originalArray;
        int indexOfSearched = Arrays.binarySearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    } public static int[] deleteUnsortedData(int originalArray[], int numberToBeSearched) { // ? Must be Ordered
        int newArray[] = originalArray;
        int indexOfSearched = secuentialSearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    } public static int[] deleteKnowingData(int originalArray[], int position) {
        int newArray[] = originalArray;
        int spotsToCopy = originalArray.length - position - 1;
        System.arraycopy(originalArray, position + 1, newArray, position, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }

    // ! Dobles
    public static double[] deleteData(double originalArray[], double numberToBeSearched) { // ? Must be Ordered
        double newArray[] = originalArray;
        int indexOfSearched = Arrays.binarySearch(originalArray, numberToBeSearched);
        int spotsToCopy = originalArray.length - indexOfSearched - 1;
        System.arraycopy(originalArray, indexOfSearched + 1, newArray, indexOfSearched, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }

    // ! Busqueda Secuencial
    public static int secuentialSearch(int[] array, int numberToBeSearched) {
        int pos = 0;
        while (pos < array.length && numberToBeSearched != array[pos]) {
            pos++;
        } if (pos == array.length) {
            pos = -1;
        } return pos;
    } public static int secuentialSearch(double[] array, double numberToBeSearched) {
        int pos = 0;
        while (pos < array.length && numberToBeSearched != array[pos]) {
            pos++;
        } if (pos == array.length) {
            pos = -1;
        } return pos;
    }

    // ! Fill
    // ! Numeros Aleatorios
    public static int[] randomFill(int[] array, int min, int max) {
        for (byte pos = 0; pos < array.length; pos++) {
            array[pos] = (int) (Math.random() * ((max - min) + 1) + min);
        } return array;
    } public static int[] randomFill(int[] array, int max) {
        for (byte pos = 0; pos < array.length; pos++) {
            array[pos] = (int) (Math.random() * (max + 1));
        } return array;
    }    

    // ! Con Scanner
    public static void scannerFill(int[] array, java.util.Scanner read) {
        for (int pos = 0; pos < array.length; pos++) {
            System.out.print("[" + pos + "] >>> ");
            array[pos] = read.nextInt();
        }
    }

    // ! Imprimir Array sin return
    public static void printArray(int[] array) {
        System.out.print("[");
        if (array.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int pos = 0; pos < array.length; pos++) {
                System.out.print(array[pos]);
                if (pos != array.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.print("]"); System.out.println();
    }

    public static void printArrayCascade(int[] array) {
        if (array.length == 0) {
            System.out.println("[EMPTY]");
        } else {
            for (int pos = 0; pos < array.length; pos++) {
                System.out.println("[" + pos + "] ---> " + array[pos]);
            }
        }
    }

    // ! Funcion Primos
    public static boolean esPrimo(int numero) {
        boolean state = false;
        if (numero <= 1) {
            // ? Si el numero es 1 o menor no hacemos nada, lo que significa que devolverá false
        } else {
            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    break;
                } else {
                    state = true;
                }
            }
        } return state;
    }
} // € Hecho por Antonio Navarro
