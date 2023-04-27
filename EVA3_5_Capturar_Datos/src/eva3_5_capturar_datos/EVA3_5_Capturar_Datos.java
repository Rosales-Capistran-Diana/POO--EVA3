/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_capturar_datos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class EVA3_5_Capturar_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int valor;
    do{
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor (numero entero):");
        valor = sc.nextInt();
        break;
        } catch(InputMismatchException e){
            System.out.println("El valor es erroneo, no se puede convertir a numero");
        }
    } while(true);    
        System.out.println("El valor capturado es: " + valor);
    
    }
    
}
