/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package código;


import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Home1
 */
public class idiomas extends Properties{
    private static final long serialVersionUID = 1L;
    public void idiomas(String idioma){ 
        try{
        switch(idioma){
            case "Espanol":
                getProperties("/idiomas/Espanol.properties");
            break;
            case "aleman":
                getProperties("/idiomas/ale.properties");
            break;
            case "frances":
                getProperties("/idiomas/fra.properties");
            break;
            case "ingles":
                getProperties("/idiomas/ing.properties");
            break;
            case "italiano":
                getProperties("/idiomas/ita.properties");
            break;
            case "portugues":
                getProperties("/idiomas/por.properties");
            break;
            case "ruso":
                getProperties("/idiomas/ruso.properties");
            break;
        }
                
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Vacio");
                }
    }
    private void getProperties(String idioma){
        try{
            this.load(getClass().getResourceAsStream(idioma));
        }catch(Exception e){
            
        }
    }
}
