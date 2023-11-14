/*
Descuento en Compras: Calcular el precio final de un producto con un descuento del 10% si el precio original es mayor de $100; 
de lo contrario, no hay descuento.
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E04_DescuentoenCompras {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double precioProducto, descuento = 0;
        System.out.println("A continuacion ingresa el precio del producto");
        precioProducto = tc.nextDouble();
        if (precioProducto > 100){
            descuento = precioProducto * 0.1;
            precioProducto = precioProducto - descuento;
            System.out.println("Descuento: $" + descuento);
        } 
        System.out.println("Total: $" + precioProducto);
    }
}