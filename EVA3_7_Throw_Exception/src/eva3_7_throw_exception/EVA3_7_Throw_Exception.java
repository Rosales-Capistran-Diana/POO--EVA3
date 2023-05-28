/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 52614
 */
public class EVA3_7_Throw_Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {
            try {
                Prueba obje = new Prueba(); // Crear instancia de Prueba
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca un valor positivo");
                int valor = sc.nextInt();
                obje.setValor(valor); // Acceder a la instancia creada anteriormente
                break;
            } catch (Exception ex) {
                /*
                                        Es la superclase de todas las excepciones por tanto, 
                                        captura todas las excepciones.Complica detectar el tipo
                                        de excepción y dar la solución correcta.
                 */
                System.out.println(ex.getMessage());
            }
            /*
            Obj no existe fuera del bloque try, ya que ahí fue declarado
            System.out.println(obj.getVaor());
             */
        } while (true);
        System.out.println("Valor capturado correctamente");
    }

    static class Prueba {

        private int valor;

        public int getValor() {
            return valor;
        }

        /*
    Checked exception: Se deben resolver en tiempo de complilación.
    Unchecked exception: Erróres de lógica, del programador, Java no te obliga a resolverlas.
         */
        public void setValor(int valor) throws Exception {  //Controla valores que entran a nuestras clases
            if (valor < 0) {
                throw new Exception("El valor " + valor + " es invalido. Debe ser mayor o igual a cero");
            } else {
                this.valor = valor;
            }
        }
    }
}
