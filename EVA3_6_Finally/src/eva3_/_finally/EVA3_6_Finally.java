/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_._finally;

/**
 *
 * @author 52614
 */
public class EVA3__Finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int x = 5, y = 0;
    try{
        int resu = x / y;
    } catch (ArithmeticException e){
        System.out.println(e.getMessage());
    } finally{  //Siempre se ejecuta haya o no excepciones.
        System.out.println("Siempre se ejecuta por estar dentro del Finally");
        System.out.println("Fin del programa");
    }
    }
    
}
