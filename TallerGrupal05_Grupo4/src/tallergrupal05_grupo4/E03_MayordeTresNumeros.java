/*
Mayor de tres números: Dados tres números, determinar cuál es el mayor. 
Si son iguales, mostrar un mensaje.
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E03_MayordeTresNumeros {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numero1, numero2, numero3, mayor = 0;
        System.out.println("A continuacion ingresa 3 numeros");
        System.out.println("Ingresa el primero");
        numero1 = tc.nextInt();
        System.out.println("Ingresa el segundo");
        numero2 = tc.nextInt();
        System.out.println("Ingresa el tercero");
        numero3 = tc.nextInt();
        System.out.println("===========================================");
        if (numero1 == numero2 && numero1 == numero3 )
            System.out.println("Los numeros son iguales, ninguno es mayor");
        else 
            if (numero1 > numero2 && numero1 > numero3)
                mayor = numero1;
            else
                if (numero2 > numero1 && numero2 > numero3)
                    mayor = numero2;
                else
                    if (numero3 > numero1 && numero3 > numero2)
                        mayor = numero3;
        
        System.out.println("El mayor es: " + mayor);
    }
}