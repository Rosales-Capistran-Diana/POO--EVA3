/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_escritura_archivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 52614
 */
public class EVA3_10_Escritura_Archivos_TXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String ruta = "C:\\Archivos\\";
        try {
            writeUsingFiles(ruta,"Prueba de escritura de archivos usando Clase Files");
            wirteUsingFileWrite(ruta,"Prueba de escritura de archivos usando Clase Files Writer" );
            writeUsingBufferedWriter (ruta,"Prueba de escritura de archivos usando Clase Buffered Writer");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_Escritura_Archivos_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void writeUsingFiles(String ruta, String datos) throws IOException{
       /*
        Si el archivo no existe, lo crea
        Si el archivo existe, lo sobreescribe
        */        
        Path path = Paths.get(ruta + "archivosFiles.txt");
        Files.write(path,datos.getBytes());
    }
    public static void wirteUsingFileWrite(String ruta, String datos) throws IOException{
      File file = new File(ruta + "archivoFileWriter.txt");
        FileWriter fileWriter = new FileWriter(file); 
        fileWriter.write(datos);
        fileWriter.close();
    }
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        Path path = Paths.get(ruta + "archivosBufferedWriter.txt");
        OutputStream out = Files.newOutputStream(path);
        OutputStreamWriter osWriter = new OutputStreamWriter(out);
        BufferedWriter bufWriter = new BufferedWriter (osWriter);
        for (int i = 0; i < 10; i++) {  //Escribimos 10 lineas al archivo
            bufWriter.write((i + 1 ) + " " + datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        osWriter.close();
    }
}
