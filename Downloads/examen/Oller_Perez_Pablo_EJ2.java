/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oller_perez_pablo_ej2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pablo Oller
 */
public class Oller_Perez_Pablo_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);//Creamos las variables scanner lector para leer y random aleatorio para generar aleatorios
        Random aleatorio = new Random();
        int n;//variable que vamos a utilizar para pedir el tamaño de la matriz
        double media = 0;//variable para calcular la media de la diagonal principal

        do {
            System.out.println("Introduzca la longitud de su array: ");
            while (!(lector.hasNextInt())) {//bucle que hace que cuando el array no sea entero no lo sigue ejecutando
                System.out.println("Introduce un numero positivo mayor a 2: ");
                lector.next();
            }
            n = lector.nextInt();//se le asigna la varaible n un número entero
        } while (n <= 2);//bucle que  hace que mientras sea menor o igual a 1 no termina
        int[][] matrix = new int[n][n];//declaración de la matriz
        System.out.println("Apartado A:");
        for (int f = 0; f < matrix.length; f++) {//for para las filas: f
            for (int c = 0; c < matrix.length; c++) {//for para las columnas: c
                matrix[f][c] = aleatorio.nextInt(61) + 5;//asignación de un número aleatorio a un elemento de la matriz
                if (matrix[f][c] < 10) {
                    System.out.print("0" + matrix[f][c] + "  ");//Este if es para cuando un elemento sea menor que 10, se le añada un 0 a la izquierda
                } else {
                    System.out.print(matrix[f][c] + "  ");//Esta es cuando valga más que 10 que no se le añada nada
                }
            }
            System.out.println("");//esto es un salto de linea para cuando se complete una columna
        }
        System.out.println("");
        System.out.println("Apartado B:");
        for (int f = 0; f < matrix.length; f++) {//for para las filas: f
            for (int c = 0; c < matrix.length; c++) {//for para las columnas: c
                if (f == 0) {
                    matrix[f][c] = 10;//este if es para cuando los elemenotos que esten en la primera fila se le cambia el valor a 10
                }
                if (f == matrix.length - 1) {
                    matrix[f][c] = 20;//este if es para cuando los elemenotos que esten en la última fila se le cambia el valor a 20
                }
                if (f == c) {
                    media += matrix[f][c];//Este if es para calcular la suma de la diagonal de la matriz(elementos que tengan la misma posicion en fila y columna
                }
                if (matrix[f][c] < 10) {
                    System.out.print("0" + matrix[f][c] + "  ");//Este if es para cuando un elemento sea menor que 10, se le añada un 0 a la izquierda
                } else {
                    System.out.print(matrix[f][c] + "  ");//Esta es cuando valga más que 10 que no se le añada nada
                }
            }
            System.out.println("");
        }
        media /= (double) n;//esto es la media divide la suma generada por los elementos de la diagonal entre el número del tamaño de la matriz
        System.out.println("");
        System.out.println("Apartado C:");
        System.out.println("Lamedia de la diagonal principal es: " + media);
    }

}
