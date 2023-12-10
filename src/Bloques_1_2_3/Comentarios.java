/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloques_1_2_3;

import java.util.Scanner;

/**
 *
 * @author user1
 */
public class Comentarios {

    static Scanner sc = new Scanner(System.in);

    //variables
    static String Nombre;
    static int NumEnvios, NumPaquetes = 0;
    static float PesoPaquetes, PesoTotal = 0;

    //EJEMPLO DE CÓDIGO SUCIO:
    //Esta vez utilicé nuestro programa de envíos y paquetes sin arrays del inicio de curso
    //Lo he exagerado y modificado para que se vea la diferencia
    private static void calcularEnviosYP() {

        //escáner       
        Scanner sc = new Scanner(System.in);

        //variables
        String Nombre;
        int NumEnvios, NumPaquetes = 0;
        float Paquetes, Total = 0;

        System.out.println("Escribe tu nombre de usuario: ");
        Nombre = sc.nextLine();//Te pide el nombre

        System.out.println("Escribe el número de envíos: ");
        NumEnvios = sc.nextInt();// Te pide el número de envios

        //por cada envío -> bloque de código
        for (int i = 1; i <= NumEnvios; i++) {

            System.out.println("\nEnvío número " + i);

            System.out.println("Dime el número de paquetes: ");
            NumPaquetes = sc.nextInt();//Te pide que ingreses el numero de paquetes

            if (NumPaquetes < 2 || NumPaquetes > 10) {//Si es menor de 2 y mayor que 10...
                System.out.println("El número mínimo de paquetes es 2 y el máximo es 10");
            } else {
                System.out.println("Dime el peso de los paquetes: ");
                Paquetes = sc.nextInt();
                if (Paquetes > 7.5) {
                    System.out.println("El peso total no puede superar los 7,5 kg.");
                } else {
                    System.out.println("Envío realizado correctamente.");
                    Total += Paquetes;//Suma el numero de paquetes
                }

            }

        }

        //condicional del rango de paquetes
        if (NumPaquetes < 2 || NumPaquetes > 10) {
            System.out.println("El número mínimo de paquetes es 2 y el máximo es 10");
        } else {
            System.out.println(Nombre + ", el peso total que has enviado es de " + Total + "kg.");
        }//Lo que te muestra al final

    }

    //Se deben evitar los comentarios innecesarios, que expliquen lo que hace un programa
    // así como los comentarios que muestran incorrectamente lo que hace el programa
    //***************************************************************************************************
    //EJEMPLO CON CLEANCODE:
    private static void calcularEnviosYPaquetes() {

        System.out.println("Escribe tu nombre de usuario: ");
        Nombre = sc.nextLine();

        System.out.println("Escribe el número de envíos: ");
        NumEnvios = sc.nextInt();

        //por cada envío -> bloque de código
        for (int i = 1; i <= NumEnvios; i++) {

            System.out.println("\nEnvío número " + i);

            calcularNumeroPaquetes();

            calcularRangoPaquetes();

        }

    }

    private static void calcularNumeroPaquetes() {

        System.out.println("Dime el número de paquetes: ");
        NumPaquetes = sc.nextInt();

        if (NumPaquetes < 2 || NumPaquetes > 10) {
            System.out.println("El número mínimo de paquetes es 2 y el máximo es 10");
        } else {
            calcularPesoPaquetes();
        }
    }

    private static void calcularPesoPaquetes() {

        System.out.println("Dime el peso de los paquetes: ");
        PesoPaquetes = sc.nextInt();

        if (PesoPaquetes > 7.5) {
            System.out.println("El peso total no puede superar los 7,5 kg.");
        } else {
            System.out.println("Envío realizado correctamente.");
            PesoTotal += PesoPaquetes;
        }

    }

    private static void calcularRangoPaquetes() {
        if (NumPaquetes < 2 || NumPaquetes > 10) {
            System.out.println("El número mínimo de paquetes es 2 y el máximo es 10");
        } else {
            System.out.println(Nombre + ", el peso total que has enviado es de " + PesoTotal + "kg.");
        }
    }

    //Quitar los comentarios innecesarios y dejar los que pueden ser útiles para los programadores
    //Usar funciones con nombres explicativos para evitar comentar
}
