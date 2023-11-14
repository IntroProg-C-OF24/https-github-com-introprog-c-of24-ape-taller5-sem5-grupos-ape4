/*
Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango 
(A para 90-100, B para 80-89, etc.).
 */
package tallergrupal05_grupo4;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO y JUAN DIEGO GUERRERO CAMARGO
 */
import java.util.Scanner;
public class E07_RangodeNotas {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int notaUser ;
        System.out.println("A continuacion ingresa tu calificacion");
        notaUser = tc.nextInt();
        if (notaUser >= 90 && notaUser <= 100) 
            System.out.println("TIENES A (EXELENTE)"); 
        else 
            if (notaUser >= 80 && notaUser <= 89) 
                System.out.println("TIENES B (MUY BUENO)"); 
            else
                if (notaUser >= 70 && notaUser <= 79) 
                    System.out.println("TIENES C (BUENO)");
                else
                    if (notaUser >= 60 && notaUser <= 69) 
                        System.out.println("TIENES D (REGULAR - DEBES MEJORAR)");
                    else
                        if (notaUser >= 50 && notaUser <= 59) 
                            System.out.println("TIENES E (MALO - DEBES MEJORAR)");
                        else
                            System.out.println("REPROBADO");
    }
}