/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class EVA3_1_Unchecked_exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Arithmetic exception: División entre 0
        
        int x=5, y = 0;
        System.out.println("Intentar la division");
        
        int resu = x/y;                            //Aquí se genera la excepción  
                                                   // Si no se atiende, el programa termina.
        System.out.println("Resultado: " + resu);  //Esta linea ya no se ejecuta
        

        //Inputmismatch exception
         
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:"); //Si el usuario captura una cadena
        int num = sc.nextInt();                       //que no puede convertir a número
        System.out.println("El numero es:" + num);    //se produce la excepcion y termina
                                                      //el programa
         
        
        //Array_index_out_of_bounds exception
        
        int[] arreglo = new int[5]; //Arreglo con 5 posiciones
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600; //<-- ? No es un índice válido, el arreglo va de 0 a 4.
         
        
        //Nullpointer exception
        Prueba objPrueba = null; //El objeto no existe, es nulo.
        System.out.println("Valor de x = " + objPrueba.x); //No puede leer la "x", porque el objeto no existe.
    }

}

class Prueba{
    int x = 100;
}
