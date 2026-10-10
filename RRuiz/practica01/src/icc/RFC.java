import java.util.Scanner;

/**
*  Programa que genera el RFC (ficticio e ideal) de una persona a partir de su nombre completo y su fecha de nacimiento. 
* 
* @author Raúl Alonso Ruiz D'santillana
* @version 1.0
*/

public class RFC {

    public static void main(String [] args ){

    /**
     * Método principal que solicita al usuario su nombre completo y fecha de nacimiento
     * para generarle un RFC
     */

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo");

        String NombreCompleto = in.nextLine().trim(); //Se recortan los posibles espacios en los extremos que proporcione el usuario

        System.out.println("Ingrese su fecha de nacimiento en formato dd/mm/aa");
        String fecha = in.nextLine().trim();          //se utiliza el mismo .trim() para recortar espacios

        int primerdato = NombreCompleto.indexOf(" "); //Se busca el espacio separador entre el nombre y el primer apellido
        int segundodato = NombreCompleto.indexOf(" ", primerdato +1); //Se busca el segundo separador entre el primer apellido y el segundo


        // Se obtienen las iniciales identificando dónde inician y dónde terminan los nombre
        String nombre = NombreCompleto.substring(0, 1); 
        String Apellidopaterno = NombreCompleto.substring(primerdato + 1, primerdato + 3);
        String Apellidomaterno = NombreCompleto.substring(segundodato + 1, segundodato + 2);

        //Con la fecha de cumpleaños se definen directamente el dia, mes y año
        String dia = fecha.substring(0,2);
        String mes = fecha.substring(3,5);
        String aa = fecha.substring(6,8);

        //Se crea directamente el RFC y se imprime el programa
        System.out.println("El RFC de " + NombreCompleto + " es: " + Apellidopaterno.toUpperCase() + Apellidomaterno + nombre + aa + mes + dia );


    }





}


