/*
Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. 
Si es bisiesto, mostrar un mensaje especial.
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E05_AnioBisiesto {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);  
        int anio;
        System.out.println("A continuacion ingresa un anio");
        anio = tc.nextInt();
        if((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0){
            System.out.println("El anio es bisiesto");
            System.out.println("**************************************************************************");
            System.out.println("Los anios bisiestos nos recuerdan que hasta en el calendario existen \nocasiones en las que se rompe la norma para crear un momento muy especial :)");
            System.out.println("**************************************************************************");
        }    
        else
            System.out.println("El anio no es bisiesto");
    }
}