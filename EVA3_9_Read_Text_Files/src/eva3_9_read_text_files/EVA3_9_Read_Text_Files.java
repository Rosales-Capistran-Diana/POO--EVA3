/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_read_text_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 52614
 */
public class EVA3_9_Read_Text_Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String ruta = "C:\\Archivos\\Prueba.txt";
        //"C:\Archivos\Prueba.txt.txt"
        try {
            readUsingFiles(ruta);              // Lee el archivo completo, ineficiente para archivos de texto.
            ReadUsingBufferedReader(ruta);     // Opción para archivos de texto.
            readUsingFileReader(ruta);         // Combinación de archivos  y buffered reader, ineficiente.
            readUsingScanner(ruta);            // Scanner es una herramienta general para entradas (inputs). 
        } catch (IOException ex) {
            ex.printStackTrace(); //Imprimir la excepción.
        }
    }

    public static void readUsingFiles(String ruta) throws IOException {
    /*
        Files --> Lee todo el archivo y lo carga en memoria principal (RAM).
        Por tanto, solo sirve con archivos pequeños.
     */

        System.out.println("Leer el archivo usando Files");
        //Recibimos la ruta en formato de texto, y la convertimos en path.
        Path path = Paths.get(ruta);
        //ReadAllLines me regresa una lista tipo String 
        /*
        List <String> contenidoArch = Files.readAllLines(path);
        System.out.println(contenidoArch.toString());
        for (int i = 0; i < contenidoArch.size(); i++) {
            System.out.println(contenidoArch.get(i));
        }
         */
        byte[] arregloBytes = Files.readAllBytes(path);
        System.out.println(new String(arregloBytes));
    }

    /*
        Es la mejor opción para leer archivos de texto aunque sea más compleja.
        Cuenta con 3 pasos:
         1) Abrir el archivo.
         2) Leer el archivo como Bytes.
         3) Interpreta los Bytes como caracteres.
     */
    public static void ReadUsingBufferedReader(String ruta) throws IOException {
        System.out.println("");
        System.out.println("Lectura de archivos usando Buffered Reader");
        File file = new File(ruta);                          // Es la ruta de nuestro archivo.
        FileInputStream is = new FileInputStream(file);             // Abre el archivo.
        InputStreamReader isReader = new InputStreamReader(is);  // Lee el archivo como Bytes
        BufferedReader breader = new BufferedReader(isReader);   // Interpreta los Bytes como caracteres.
        String Linea;
        while ((Linea = breader.readLine()) != null) { //Leer el archivo mientras no lleguemos al final del archivo.
            System.out.println(Linea);
        }
        breader.close(); //Cerrar el archivo
    }

    public static void readUsingFileReader(String ruta) throws FileNotFoundException, IOException {
        System.out.println("");
        System.out.println("Lectura de archivos usando File Reader");
        File file = new File(ruta);
        FileReader fileReader = new FileReader(file);
        BufferedReader breader = new BufferedReader(fileReader);   // Interpreta los Bytes como caracteres.
        String Linea;
        while ((Linea = breader.readLine()) != null) { //Leer el archivo mientras no lleguemos al final del archivo.
            System.out.println(Linea);
        }
        breader.close(); //Cerrar el archivo
        fileReader.close();
    }
    public static void readUsingScanner(String ruta) throws IOException{
        System.out.println("");
        System.out.println("Lectura de archivos usando Scanner");
        Path source = Paths.get(ruta);
        Scanner sc = new Scanner(source);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
