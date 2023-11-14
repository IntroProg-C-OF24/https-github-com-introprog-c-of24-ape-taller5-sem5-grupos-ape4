/*
Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona 
y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E08_CalculadoraIMC {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double pesoUser, alturaUser, IMC;
        System.out.println("Ingresa tu peso en kilos. Ejemplo 85,5 (usando la coma)");
        pesoUser = tc.nextDouble();
        System.out.println("Ingresa tu altura en metros. Ejemplo: 1,70 (usando la coma)");
        alturaUser = tc.nextDouble();
        IMC = pesoUser / (alturaUser * alturaUser);
        System.out.println("************************");
        if(IMC < 18) 
            System.out.println("TIENES BAJO PESO");   
        else 
            if(IMC < 25)
                System.out.println("TU PESO ES IDEAL");
            else 
                if(IMC < 30)
                    System.out.println("TIENES SOBREPESO");        
                else
                    System.out.println("TIENES OBESIDAD");  
        
        System.out.println("TU IMC ES: " + IMC);
    }
}