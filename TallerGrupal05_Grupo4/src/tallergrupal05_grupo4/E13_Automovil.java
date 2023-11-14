/*
*Elaborar una solución que permita leer los datos de un automóvil (marca, origen y costo) 
imprima el impuesto por pagar y el precio de venta (incluido el impuesto). 
*Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, 
si es de Italia, 15%, y si es de USA, 8%
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E13_Automovil {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String marca, origen;
        double costo, impuesto = 0;
        System.out.println("A continuacion ingresa los datos de tu vehiculo");
        System.out.println("Ingresa la marca");
        marca = tc.nextLine();
        System.out.println("Ingresa el pais de origen");
        origen = tc.nextLine();
        System.out.println("Ingresa el costo");
        costo = tc.nextDouble();
        if (origen.equals("Alemania")){
            impuesto = costo * 0.2;
            costo = costo + impuesto;
        }    
        else { 
            if (origen.equals("Japon")){
                impuesto = costo * 0.3;
                costo = costo + impuesto;
            }
            else {
                if (origen.equals("Italia")){
                    impuesto = costo * 0.15;
                    costo = costo + impuesto;
                }    
                else {
                    if (origen.equals("USA")){
                        impuesto = costo * 0.08;
                        costo = costo + impuesto;                       
                    }
                    else
                        System.out.println("Pais de origen desconocido, no se puede calcular el impuesto");
                }
            }
        }
        System.out.println("IMPUESTO " + marca + ": " + impuesto);
        System.out.println("TOTAL: " + costo);
    }
}