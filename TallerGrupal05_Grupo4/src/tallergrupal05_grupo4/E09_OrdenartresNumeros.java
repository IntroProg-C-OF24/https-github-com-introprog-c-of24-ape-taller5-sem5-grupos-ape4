/*
Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E09_OrdenartresNumeros {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("A continuacion ingresa 3 numeros");
        System.out.println("Ingresa el primero");
        num1 = tc.nextInt();
        System.out.println("Ingresa el segundo");
        num2 = tc.nextInt();
        System.out.println("Ingresa el tercero");
        num3 = tc.nextInt();
        System.out.println("***************************************************");
        if (num1 == num2 && num2 == num3)
            System.out.println("Los tres numeros son iguales, no se pueden ordenar");
        else
            if(num1 >= num2 && num2 >= num3)
                System.out.println("Los numeros ordenados ascendentemente: " + num3 + ", " + num2 + ", " + num1);  
            else 
                if(num1 >= num3 && num3 >= num2)
                    System.out.println("Los numeros ordenados ascendentemente: " + num2 + ", " + num3 + ", " + num1);
                else 
                    if(num2 >= num3 && num3 >= num1)
                        System.out.println("Los numeros ordenados ascendentemente: " + num1 + ", " + num3 + ", " + num2);
                    else 
                        if(num2 >= num1 && num1 >= num3)
                            System.out.println("Los numeros ordenados ascendentemente: " + num3 + ", " + num1 + ", " + num2);
                        else 
                            if(num3 >= num2 && num2 >= num1)
                                System.out.println("Los numeros ordenados ascendentemente: " + num1 + ", " + num2 + ", " + num3);
                            else 
                                if(num3 >= num1 && num1 >= num2)
                                    System.out.println("Los numeros ordenados ascendentemente: " + num2 + ", " + num1 + ", " + num3);
    }
}