/*
Edad para Votar: Determinar si una persona es elegible para votar en función de su edad 
(mayor o igual a 18 años).
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E01_EdadParaVotar {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int edadUser;
        System.out.println("A continuacion ingresa tu edad");
        edadUser = tc.nextInt();
        if (edadUser < 18)
            System.out.println("No eres apto/a para votar");
        else{
            System.out.println("Eres apto/a para votar");
            System.out.println("Consulta tu recinto electoral en el bot de telegram @Cneecuador_bot");
        }  
    }   
}