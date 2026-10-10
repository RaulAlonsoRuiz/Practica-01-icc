import java.util.Scanner;
/**
* Programa que simula la sesión de terapia virtual.
* Se le pide al usuario nombre y problema a tratar para decirle amablemente que lo tratará después
* @author Ruiz D'santillana Raul Alonso'
* @version 1.0
*/
class Psicologo {

/**
     * Método principal que ejecuta la simulación de la sesión psicológica.
     * Este recibe el nombre y los problema del paciente para poder interactuar en la consola.
     */

    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido. ¿Cuál es tu nombre?");
        String nombre = in.nextLine();

        System.out.println("Hola " + nombre + ".");
        System.out.println("Cuenteme, ¿Cuál es su problema en la vida?");
        String problema = in.nextLine();

        System.out.println("MMM... Ya veo " + nombre + ".");
        System.out.println("Y dígame...");
        System.out.println("¿Qué problema tiene usted con " + problema + " ? ");

        String respuesta = in.nextLine();

        System.out.println("Muy interesante! hablaremos de ello cuando me pague la siguiente sesión.");


    }


}
