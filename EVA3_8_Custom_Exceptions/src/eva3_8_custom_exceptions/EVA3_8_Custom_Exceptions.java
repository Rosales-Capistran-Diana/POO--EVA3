/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_custom_exceptions;

/**
 *
 * @author 52614
 */
public class EVA3_8_Custom_Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Diana");
        p1.setApellido("Gomez");
        try {
            p1.setEdad(-20);
        } catch (DatoIncorrectoCheckedEx e) {
            System.out.println(e.getMessage());
        }
    }

}

class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoIncorrectoCheckedEx {
        if (edad < 0) {
            // throw new DatoIncorrectoException(); -> Uncheked Exception 
            throw new DatoIncorrectoCheckedEx(); //-> Cheked Exception
        }
        this.edad = edad;

    }

    public Persona() {
        this.nombre = " ";
        this.apellido = " ";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws DatoIncorrectoCheckedEx {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }

}

class DatoIncorrectoException extends RuntimeException {

    public DatoIncorrectoException() {
        super("¡¡Dato incorrecto!! El valor introducido no puede ser negativo.");
    }

}

class DatoIncorrectoCheckedEx extends Exception {

    public DatoIncorrectoCheckedEx() {
        super("¡¡Dato incorrecto!! El valor introducido no puede ser negativo.");
    }
}
