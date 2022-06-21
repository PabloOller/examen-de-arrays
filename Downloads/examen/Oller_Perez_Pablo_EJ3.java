/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oller_perez_pablo_ej3;

import java.util.Scanner;

/**
 *
 * @author Pablo Oller
 */
public class Oller_Perez_Pablo_EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int TAM = 11;
        int opcion = 0, posicion = 0, valor = 0;;
        double valorDecimal = 0;
        Scanner lector = new Scanner(System.in);
        int[] array = new int[TAM];
        for (int i = 0; i < array.length; i++) {
            array[i] = -2;
        }
        System.out.println("Manejo de Arrays");
        System.out.println("------------------------");
        System.out.println("1. Meter Valor.");
        System.out.println("2. Mostrar cajón.");
        System.out.println("3. Imprimir Array.");
        System.out.println("4. Resetear  Array.");
        System.out.println("5. Salir.");

        do {//El do while se ejecuta hasta que la variable opcion no sea 5
            System.out.print("\n¿Opción?>> ");
            do {
                opcion = lector.nextInt();
                if (opcion > 5 || opcion < 1) {
                    System.out.print("\nOpción incorrecta. Elige númeroentre 1 y 5 >> ");
                }
            } while (opcion > 5 || opcion < 1);//Este do while es para controlar que se coja una opcion entre 1 y 5
            switch (opcion) {
                case 1:
                    do {//Este do while es para controlar que se coja una opcion entre 0 y 10
                        System.out.print("¿Qué cajón vas a usar? ");
                        while (!(lector.hasNextInt())) {//bucle que hace que cuando el elemento no sea entero lo sigue ejecutando
                            System.out.println("Ese cajón no existe.");
                            System.out.print("¿Qué cajón vas a usar? ");
                            lector.next();
                        }
                        posicion = lector.nextInt();//se le asigna la varaible posicion un número entero
                        if (posicion <= 0 || posicion >= 10) {
                            System.out.println("Ese cajón no existe.");
                        }
                    } while (posicion <= 0 || posicion >= 10);
                    do {
                        System.out.print("¿Qué valor vas a meter? ");
                        while (!(lector.hasNextDouble())) {//bucle que hace que cuando el elemento no sea decimal no lo sigue ejecutando
                            System.out.println("El valor debe ser postitivo");
                            System.out.print("¿Qué valor vas a meter? ");
                            lector.next();
                        }
                        valorDecimal = lector.nextDouble();//se le asigna la varaible valorDecimal un número decimal
                    } while (valorDecimal < 0);//Aqui impide que el valor sea negativo

                    valor = (int) Math.round(valorDecimal);//aqui redondea el valorDecimal a su entero mas cercano y se le asigna a la variable entera valor
                    array[posicion] = valor;
                    break;
                case 2:
                    do {
                        System.out.print("¿Qué cajón quieres mostrar? ");

                        while (!(lector.hasNextInt())) {//bucle que hace que cuando el elemento no sea entero no lo sigue ejecutando
                            System.out.println("Ese cajón no existe.");
                            System.out.print("¿Qué cajón vas a usar? ");
                            lector.next();
                        }
                        posicion = lector.nextInt();
                    } while (posicion <= 0 || posicion >= 10);//Este do while es para controlar que se coja una opcion entre 0 y 10
                    if (array[posicion] == -2) {
                        System.out.println("En el cajon " + posicion + " no hay nada");
                    } else {
                        System.out.println("En el cajón " + posicion + " está el valor " + valor);
                    }
                    break;
                case 3:
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");//muestra el array
                    }
                    break;
                case 4:
                    for (int i = 0; i < array.length; i++) {
                        array[i] = -2;//resetea el array
                    }
                    System.out.println("Array reseteado.");
                    break;
                case 5:
                    System.out.println("¡¡Gracias por su visita!!");//muestra este mensaje y se finaliza el bucle
                    break;

            }
        } while (opcion != 5);
    }
}
