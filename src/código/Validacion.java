/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package código;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Home1
 */
public class Validacion {
    int id_horario;
    archi arch= new archi();
    public boolean isNumeric(String cadena){
        try{
            Integer.parseInt(cadena);
            return true;
        }
        catch(NumberFormatException nfe){
           JOptionPane.showMessageDialog(null, "aqui");
            return false;
        }
    }
    public boolean isHour(String hour){
        String hora=hour.substring(0, 2)+":"+hour.substring(2);
        try{
            DateFormat dateF= new SimpleDateFormat("HH:mm");
            dateF.parse(hora);
            return true;
        }
        catch(ParseException e){
            
            return false;
            
        }  
    }
    public boolean isDate(String fecha){
        boolean correcto=true;
        Calendar fechaa= new GregorianCalendar();
        int annio=fechaa.get(Calendar.YEAR);
        int mesa=fechaa.get(Calendar.MONTH)+1;
        int diaa=fechaa.get(Calendar.DATE);
        int dia=Integer.parseInt(fecha.substring(0, 2));
        int mes=Integer.parseInt(fecha.substring(2, 4));
        int ano=Integer.parseInt(fecha.substring(4))+2000;
        JOptionPane.showMessageDialog(null, dia+" "+mes+" "+ano);
        JOptionPane.showMessageDialog(null, diaa+" "+mesa+" "+annio);
        if(ano<annio){
            if((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
                if((dia>0)&&(dia<=31)){
                    correcto=true;
                }
                else{
                    correcto=false;
                    JOptionPane.showMessageDialog(null, "Su día no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                if((mes==4)||(mes==6)||(mes==9)||(mes==11)){
                    if((dia>0)&&(dia<=30)){
                        correcto=true;
                    }
                    else{
                     correcto=false;
                     JOptionPane.showMessageDialog(null, "Su día no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    if(mes==2){
                        if(ano%4==0){
                            if((dia>=0)&&(dia<=29)){
                                correcto=true;
                            }
                            else{
                                correcto=false;
                                JOptionPane.showMessageDialog(null, "Su día no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else{
                            if((dia>0)&&(dia<=28)){
                                correcto=true;
                            }
                            else{
                                correcto=false;
                                JOptionPane.showMessageDialog(null, "Su día no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                    else{
                        correcto=false;
                        JOptionPane.showMessageDialog(null, "Su mes no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        else{
            if(ano==annio){
                if(mes>mesa){
                    correcto=false;
                    JOptionPane.showMessageDialog(null, "Su mes todavía no llega", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    if(mes==mesa){
                        if((dia>diaa)||(dia==0)){
                            correcto=false;
                            JOptionPane.showMessageDialog(null, "Su día todavía llega", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            if((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
                               if((dia>0)&&(dia<=31)){
                                   correcto=true;
                               }
                               else{
                                    correcto=false;
                                    JOptionPane.showMessageDialog(null, "Su día no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else{
                                if((mes==4)||(mes==6)||(mes==9)||(mes==11)){
                                    if((dia>0)&&(dia<=30)){
                                        correcto=true;
                                    }
                                    else{
                                        correcto=false;
                                        JOptionPane.showMessageDialog(null, "Su día no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else{
                                    if(mes==2){
                                        if(ano%4==0){
                                            if((dia>0)&&(dia<=29)){
                                                correcto=true;
                                            }
                                            else{
                                                correcto=false;
                                                JOptionPane.showMessageDialog(null, "Su día no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                        else{
                                            if((dia>0)&&(dia<=28)){
                                                correcto=true;
                                            }
                                            else{
                                                correcto=false;
                                                JOptionPane.showMessageDialog(null, "Su día no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                    }
                                    else{
                                        correcto=false;
                                        JOptionPane.showMessageDialog(null, "Su mes no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                        }
                    }
                    else{
                        if((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
                               if((dia>0)&&(dia<=31)){
                                   correcto=true;
                               }
                               else{
                                    correcto=false;
                                    JOptionPane.showMessageDialog(null, "Su día no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else{
                                if((mes==4)||(mes==6)||(mes==9)||(mes==11)){
                                    if((dia>0)&&(dia<=30)){
                                        correcto=true;
                                    }
                                    else{
                                        correcto=false;
                                        JOptionPane.showMessageDialog(null, "Su día no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else{
                                    if(mes==2){
                                        if(ano%4==0){
                                            if((dia>0)&&(dia<=29)){
                                                correcto=true;
                                            }
                                            else{
                                                correcto=false;
                                                JOptionPane.showMessageDialog(null, "Su día no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                        else{
                                            if((dia>0)&&(dia<=28)){
                                                correcto=true;
                                            }
                                            else{
                                                correcto=false;
                                                JOptionPane.showMessageDialog(null, "Su día no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                    }
                                    else{
                                        correcto=false;
                                        JOptionPane.showMessageDialog(null, "Su mes no existe", "Error de calendario", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                        }
                    }
                }    
            else{
                correcto=false;
                JOptionPane.showMessageDialog(null, "Su año todavía no llega", "Error de calendario", JOptionPane.ERROR_MESSAGE);
            }
        }
        return correcto;
    }
    public boolean isHour2(String hour){
        String hora=hour.substring(0, 2)+":"+hour.substring(2,4)+":"+hour.substring(4);
        try{
            DateFormat dateF= new SimpleDateFormat("HH:mm:ss");
            dateF.parse(hora);
            return true;
        }
        catch(ParseException e){
            
            return false;
            
        }  
    }
}

