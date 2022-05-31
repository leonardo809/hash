/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package código;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Home1
 */
public class acciones {
public    JFileChooser seleccionar=new JFileChooser();
public File archivo;
public FileInputStream entrada;
public String documento="";
public String Abrirarchivo(File archivo) throws FileNotFoundException, IOException, NullPointerException{
        
        
        try{
            entrada=new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read())!=-1){
                char caracter=(char) ascci;
                documento+=caracter;
            }
            
        }catch(Exception e){
            
        }
        return documento;
    }
}
