/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_exception_propagation;

/**
 *
 * @author 52614
 */
public class EVA3_2_Exception_Propagation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicia main");
        A();
        System.out.println("Termina main");
    }
 public static void A(){
         System.out.println("Inicia A");
         B();
        System.out.println("Termina A");    
 }   
  public static void B(){
         System.out.println("Inicia B");
         C();
        System.out.println("Termina B");    
 }   
   public static void C(){
         System.out.println("Inicia C");
         int x=5, y=0;
         int resu = x/y;
         System.out.println("Resultado: " + resu);
        System.out.println("Termina C");    
 }   
}
