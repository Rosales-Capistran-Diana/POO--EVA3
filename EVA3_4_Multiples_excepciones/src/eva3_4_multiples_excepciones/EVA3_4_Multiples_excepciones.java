/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class EVA3_4_Multiples_excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce el valor de x (numero entero): ");
                x = sc.nextInt();
                System.out.println("Introduce el valor de y (numero entero): ");
                y = sc.nextInt();
                int resu = x / y;
                System.out.println("Resultado de " + x + "/" + y + ":" + resu);
            break;
            } catch (InputMismatchException e) {
                System.out.println("Captura en formato incorrecto, no se puede convertir en numero");
            } catch (ArithmeticException e) {
                System.out.println("No puede dividirse entre cero");
            }
        } while (true);
        System.out.println("Programa terminado exitosamente");

    }

}
