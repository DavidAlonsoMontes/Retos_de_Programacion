/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
package clases;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=1; i<=100; ++i){

            if(multiplo3(i)&&multiplo5(i)){
                System.out.println("fizzbuzz");
            } else if (multiplo3(i)) {
                System.out.println("fizz");
            } else if (multiplo5(i)) {
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }

        }
    }

    public static boolean multiplo5(int var){

        return var%3==0;
    }
    public static boolean multiplo3(int var){

        return var%5==0;
    }
}
