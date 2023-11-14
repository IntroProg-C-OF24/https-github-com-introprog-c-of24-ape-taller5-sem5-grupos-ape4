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
        int edad;
        System.out.println("Ingresa tu edad: ");
        edad = tc.nextInt();
        if (edad >= 0 && edad <= 150)
            if(edad >= 18)
                System.out.println("Eres un adulto");
            else 
                if(edad >= 12)
                    System.out.println("Eres un adolescente");
                else
                    System.out.println("Eres un nino");
        else
            System.out.println("El numero ingresado es incorrecto");
    }
}