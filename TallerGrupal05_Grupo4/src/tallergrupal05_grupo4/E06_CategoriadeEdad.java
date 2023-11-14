/*
Categoría de Edad: Clasificar a una persona en una categoría de edadUser 
(niño, adolescente, adulto) en función de su edadUser.
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E06_CategoriadeEdad {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int edadUser;
        System.out.println("A continuacion ingresa tu edad");
        edadUser = tc.nextInt();
        if (edadUser >= 0 && edadUser <= 150)
            if(edadUser >= 18)
                System.out.println("Eres adulto");
            else 
                if(edadUser >= 12)
                    System.out.println("Eres adolescente");
                else
                    System.out.println("Eres nino");
        else
            System.out.println("El numero ingresado es incorrecto");
    }
}