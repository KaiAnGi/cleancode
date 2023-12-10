/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloques_1_2_3;

import java.util.Scanner;

/**
 *
 * @author Kai
 */
public class Funciones {

    //EJEMPLO DE CÓDIGO SUCIO:
    //(Para este utilicé mi código de la patata caliente)

    public static void opcionesMenu() { //La función está nombrada como sustantivo

        Scanner sc = new Scanner(System.in);

        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1: {
                System.out.println("Elige la dificultad");
                System.out.println("1. Facil");
                System.out.println("2. Medio");
                System.out.println("3. Dificil");

                //elegirDificultad();
                break;
            }

            case 2: { //La función tiene demasiados niveles de indentación
                System.out.println("REGLAS DEL JUEGO:");
                System.out.println("");
                System.out.println("En este juego deberas responder correctamente 5 preguntas \n"
                        + "el numero de intentos erroneos permitidos por cada pregunta y el multiplicador de \n"
                        + "puntuacion dependera de la dificultad que selecciones. \n"
                        + "Si aciertas las 5 preguntas en el modo dificil, tal vez pase algo divertido! \n"
                        + "Acierta las preguntas sin que la patata explote para ganar. \n");
                //elegirOpcionesMenu();
            }

            case 3:
            //salirMenu();

            default:
                System.out.println("");//La función no me devuelve nada en default
        }
    }
    //***************************************************************************************************
    //EJEMPLO CON CLEANCODE:
    //La función debe nombrarse como verbo y describir lo que va a hacer de forma directa
    //Recibe entre 0 y 3 argumentos útiles como mucho
    public static void elegirOpcionesMenu(Scanner sc) {

        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1: {
                System.out.println("Elige la dificultad");
                System.out.println("1. Facil");
                System.out.println("2. Medio");
                System.out.println("3. Dificil");

                //elegirDificultad();
                break;
            }

            case 2: { //La función tiene 3 niveles como máximo
                mostrarInstrucciones();
                //elegirOpcionesMenu();
            }

            case 3:
            //salirMenu();

            default://La función devuelve una respuesta válida
                System.out.println("Elige un número válido");
        }

    }
//Se separa en otra función para que no sea tan pesado

    private static void mostrarInstrucciones() {
        System.out.println("REGLAS DEL JUEGO:");
        System.out.println("");
        System.out.println("En este juego deberas responder correctamente 5 preguntas \n"
                + "el numero de intentos erroneos permitidos por cada pregunta y el multiplicador de \n"
                + "puntuacion dependera de la dificultad que selecciones. \n"
                + "Si aciertas las 5 preguntas en el modo dificil, tal vez pase algo divertido! \n"
                + "Acierta las preguntas sin que la patata explote para ganar. \n");
    }

}
