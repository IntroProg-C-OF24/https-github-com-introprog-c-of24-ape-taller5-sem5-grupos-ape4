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
        double peso, altura, IMC;
        System.out.println("Ingresa tu peso en kilos. Ejemplo 85.5 (usando un punto)");
        peso = tc.nextDouble();
        System.out.println("Ingresa tu altura en metros. Ejemplo: 1.70 (usando un punto)");
        altura = tc.nextDouble();
        IMC = peso / (altura * altura);
        System.out.println("======================");
        if(IMC < 18) 
            System.out.println("Bajo peso");   
        else 
            if(IMC < 25)
                System.out.println("Peso saludable");
            else 
                if(IMC < 30)
                    System.out.println("Sobrepeso");        
                else
                    System.out.println("Obesidad");  
        
        System.out.println("Tu IMC es: " + IMC);
    }
}