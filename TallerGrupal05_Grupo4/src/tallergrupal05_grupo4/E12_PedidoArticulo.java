/*
Solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, 
la cantidad que se requiere y el precio unitario. 
Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E12_PedidoArticulo {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String articulo;
        double costoProducto, unidades, total, descuento = 0;
        System.out.println("Ingresa el nombre del articulo que pediste");
        articulo = tc.nextLine();
        System.out.println("Ingresa la cantidad de unidades que pediste");
        unidades = tc.nextDouble();
        System.out.println("Ingresa el costo del producto");
        costoProducto = tc.nextDouble();
        total = costoProducto * unidades;
        if (unidades > 50){
            descuento = total * 0.15;
            total = total - descuento;
        }
        System.out.println("*************************************");
        System.out.println("COSTO POR UNIDAD DE: " + articulo + ": $" + costoProducto);
        System.out.println("DESCUENTO: $" + descuento);
        System.out.println("UNIDADES: " + unidades);
        System.out.println("TOTAL: $" + total);
    }
}