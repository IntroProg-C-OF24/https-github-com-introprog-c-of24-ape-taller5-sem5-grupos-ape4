/*
Solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E11_PlanillaLuz {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double kilovatioporHora, kilovatiosConsumidos, edadUser, subtotal, valorPlanilla, descuento = 0;
        System.out.println("A continuacion ingresa tu edad");
        edadUser = tc.nextDouble();
        System.out.println("Ingresa el valor del kilovatio por hora, para decimales usa la coma");
        kilovatioporHora = tc.nextDouble();
        System.out.println("Ingresa el valor de los kilovatios consumidos en el mes, para decimales usa la coma");
        kilovatiosConsumidos = tc.nextDouble();
        valorPlanilla = kilovatioporHora * kilovatiosConsumidos;
        subtotal = kilovatioporHora * kilovatiosConsumidos;
        System.out.println("****************************");
        if (edadUser > 65){
            descuento = valorPlanilla * 0.1;
            valorPlanilla = valorPlanilla - descuento;
        }
        System.out.println("SUBTOTAL: $" + subtotal);
        System.out.println("DESCUENTO: $" + descuento);
        System.out.println("EL VALOR TOTAL DE LA PLANILLA ES: $" + valorPlanilla);
    }
}