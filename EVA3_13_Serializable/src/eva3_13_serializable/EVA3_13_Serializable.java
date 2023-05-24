/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 52614
 */
public class EVA3_13_Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String ruta = "C:\\Archivos\\archivosObjetos.per";
            Persona perso = new Persona("Diana", "Rosales", 19);

            /*
            Guardar el objeto en archivo
            Leer el objeto desde un archivo
             */
            guardarObj(perso, ruta);
            Persona resu = leerObj(ruta);
            System.out.println("Nombre: " + resu.getNombre());
            System.out.println("Apellido: " + resu.getApellido());
            System.out.println("Edad: " + resu.getEdad());
        } catch (IOException ex) {
            Logger.getLogger(EVA3_13_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_13_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void guardarObj(Persona perso, String ruta) throws IOException {
        FileOutputStream foStream = new FileOutputStream(ruta);
        ObjectOutputStream ooStream = new ObjectOutputStream(foStream);
        ooStream.writeObject(perso);
        ooStream.close();
    }

    public static Persona leerObj(String ruta) throws IOException, ClassNotFoundException {
        Persona perso = null;
        FileInputStream fiStream = new FileInputStream(ruta);
        ObjectInputStream oiStream = new ObjectInputStream(fiStream);
        perso = (Persona) oiStream.readObject();
        return perso;
    }

}

class Persona implements Serializable {

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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

}
