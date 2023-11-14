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
        double precio, descuento = 0;
        System.out.println("Precio del producto: ");
        precio = tc.nextDouble();
        if (precio > 100){
            descuento = precio * 0.1;
            precio = precio - descuento;
            System.out.println("Descuento: $" + descuento);
        } 
        System.out.println("Total: $" + precio);
    }
}