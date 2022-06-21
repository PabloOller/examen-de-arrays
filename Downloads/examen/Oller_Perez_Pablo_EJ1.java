/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oller_perez_pablo_ej1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pablo Oller
 */
public class Oller_Perez_Pablo_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); //Creamos las variables scanner lector para leer y random aleatorio para generar aleatorios
        Random aleatorio = new Random();
        int n; //variable que vamos a utilizar para pedir el tamaño del array
        int mayor = 0;//variable que indicará el mayor
        int menor = 101;//variable que indicará el menor
        int contadorMayor = 0;//variable que contará las veces que se ha repetido el mayor
        int contadorMenor = 0;//variable que contará las veces que se ha repetido el mayor

        System.out.println("Introduzca un número: ");
        do {
            while (!(lector.hasNextInt())) {//bucle que hace que cuando el array no sea entero no lo sigue ejecutando
                System.out.print("\nERROR. El número debe ser mayor a 1: ");
                lector.next();
            }
            n = lector.nextInt();//se le asigna la varaible n un número entero
        } while (n <= 1);//bucle que  hace que mientras sea menor o igual a 1 no termina

        int[] lista = new int[n];//Declaración del array lista
        for (int i = 0; i < lista.length; i++) {
            lista[i] = aleatorio.nextInt(101) + 10;//asignación de un número aleatorio a un elemento del array
            System.out.print(lista[i] + " ");//imprime la lista por pantalla
            if (lista[i] > mayor) {//condición para que si un elemento es mayor que la variable mayor, esta última tenga el valor del elemento
                contadorMayor = 0;//Si se asigna un mayor, el contador se reinicia para que no cuente lo de los mayores anteriores
                mayor = lista[i];
                contadorMayor++;
            }
            if (lista[i] < menor) {//condición para que si un elemento es menor que la variable mayor, esta última tenga el valor del elemento

                contadorMenor = 0;//Si se asigna un menor, el contador se reinicia para que no cuente lo de los menores anteriores
                menor = lista[i];
                contadorMenor++;
            }
        }
        System.out.println("");
        System.out.println("El valor máximo es el " + mayor + " y aparece " + contadorMayor + " veces.");
        System.out.println("El valor máximo es el " + menor + " y aparece " + contadorMenor + " veces.");

    }

}
