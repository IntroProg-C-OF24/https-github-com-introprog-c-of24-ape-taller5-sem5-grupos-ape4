/*
Día de la Semana: Mostrar el nombre del día de la semana en función del número ingresado 
(1 para lunes, 2 para martes, etc.).
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E02_DiadelaSemana {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numero;
        System.out.println("A continuacion ingresa un numero del 1 al 7");
        numero = tc.nextInt();
        switch (numero){
            case 1: 
                System.out.println("1 -> LUNES");
                break;
            case 2:
                System.out.println("2 -> MARTES");
                break;
            case 3:
                System.out.println("3 -> MIERCOLES");
                break;
            case 4:
                System.out.println("4 -> JUEVES");
                break;
            case 5:
                System.out.println("5 -> VIERNES");
                break;
            case 6:
                System.out.println("6 -> SABADO");
                break;
            case 7:
                System.out.println("7 -> DOMINGO");
                break;
            default:
                System.out.println("El numero ingresado no coincide");
        }
    }   
}