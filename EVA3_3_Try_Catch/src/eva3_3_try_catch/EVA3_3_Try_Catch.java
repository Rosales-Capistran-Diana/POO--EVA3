/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_try_catch;

/**
 *
 * @author 52614
 */
public class EVA3_3_Try_Catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5, y = 0;

        //Si no hay excepciones, se ignora el bloque catch.
        try {
            //Sección de código que potencialmente genera una excepción
            int resu = x / y;
            System.out.println("Resultado: " + resu);
        } catch (ArithmeticException e) {
            //Se genera un objeto exception llamado "e" de tipo ArithmeticException
            System.out.println("Se produjo un error: " + e.getMessage());
        }

        System.out.println("Programa terminado");
    }

}
