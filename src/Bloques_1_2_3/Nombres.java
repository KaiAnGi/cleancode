package Bloques_1_2_3;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Kai
 */
public class Nombres {

    //EJEMPLO DE CÓDIGO SUCIO:
    private static void sahjkdhadk() { //Nombres impronunciables

        int[] hola = new int[30]; //Nombres sin significado

        int contador = 1;

        for (int i = 0; i <= 30; i++) {
            Random aleatorio = new Random();
            hola[i] = aleatorio.nextInt(100) + 1;
            System.out.println("Valor aleatorio " + contador + ": " + hola[i]);
            contador++;

        }

        int a = 0; //El nombre de las variables no representa para que sirven

        for (int i = 0; i < hola.length; i++) {
            a += hola[i];

        }
        System.out.printf("Esto da %d\n", a);
        
        
        //El código es difícil de entender, de manipular y mantener para las personas ajenas a él
    }
//***************************************************************************************************
//EJEMPLO CON CLEANCODE:
    private static void calcularValorAleatorio() { //Nombres fáciles de pronunciar

        int diasMes = 30; //diasMes es un nombre que puede buscarse y reutilizarse

        int[] valores = new int[diasMes]; // Nombres con significado

        int contador = 1;

        for (int i = 0; i <= diasMes; i++) {
            Random aleatorio = new Random();
            valores[i] = aleatorio.nextInt(100) + 1;
            System.out.println("Valor aleatorio " + contador + ": " + valores[i]);
            contador++;

        }

        int suma = 0; //El nombre de las variables sí representa para que sirven

        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];

        }
        System.out.printf("La suma de todo los valores aleatorios es %d\n", suma);
    }

}
