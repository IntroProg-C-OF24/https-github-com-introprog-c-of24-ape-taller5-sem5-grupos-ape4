/*
*En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, 
del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. 
*Elaborar un solución que pida como datos de entrada el número de días y el precio diario de la habitación 
y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E14_Hosteria {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int dias;
        double costoPorDia, descuento, subtotal, total;
        System.out.println("Ingresa el numero de dias que te hospedaste:");
        dias = tc.nextInt();
        System.out.println("Ingresa el valor del costo por dia de tu habitacion:");
        costoPorDia = tc.nextDouble();
        subtotal = dias * costoPorDia;
        total = dias * costoPorDia;
        descuento = 0;
        if (dias > 15){
            descuento = total * 0.2;
            total = total - descuento;
        }
        else {
            if (dias > 10){
                descuento = total * 0.15;
                total = total - descuento;
            }
            else{
                if (dias > 5){
                    descuento = total * 0.1;
                    total = total - descuento;
                }
            }
        }
        System.out.println("==========================");
        System.out.println("SUBTOTAL: " + subtotal);
        System.out.println("DESCUENTO: " + descuento);
        System.out.println("TOTAL: " + total);
    }
}