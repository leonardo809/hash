/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package código;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Home1
 */
public class archi {
    public ArrayList<String> emp=new ArrayList<String>();
    public ArrayList<String> hash=new ArrayList<String>();
    public ArrayList<String> adh=new ArrayList<String>();
    public ArrayList<String> asis=new ArrayList<String>();
    public ArrayList<String> rdn=new ArrayList<String>();
    public ArrayList<String> addh=new ArrayList<String>();
    public ArrayList<String> hpe=new ArrayList<String>();
    public String documento;
    public String a;
    public void empleados(){
        Validacion val=new Validacion();
        acciones action=new acciones();
        String aux="";
        File path1;
        int cont=0;
        emp.clear();
        hash.clear();
        if(action.seleccionar.showDialog(null, "Abrir")==JFileChooser.APPROVE_OPTION){
            action.archivo=action.seleccionar.getSelectedFile();
            path1=action.seleccionar.getSelectedFile();
            if(action.archivo.canRead()){
                if(action.archivo.getName().endsWith("txt")){
                    
                    try {
                         documento=action.Abrirarchivo(action.archivo);
                        a=path1.toString();
                        
                        FileReader r=new FileReader(path1);
                        BufferedReader buffer=new BufferedReader(r);
                        String temp ="";
                        while(temp!=null){
                            temp=buffer.readLine();
                            String x;
                            x=temp;
                            emp.add(x);
                            hash.add("1");
                            cont++;
                        }
                    } catch (IOException|NullPointerException ex) {
                        Logger.getLogger(Diseño.archivos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no Compatible", "Error", JOptionPane.ERROR_MESSAGE);
                    a="";
                }
            }
        }
      int size=emp.size();
        for(int i=0;i<size-1;i++){
            aux=emp.get(i).substring(0, 6);
            JOptionPane.showMessageDialog(null, aux);
            if(val.isNumeric(aux)){
            String aux3="1";
            int aux2=Integer.parseInt(aux);
            int res=aux2%cont;
            int ok=0;
            while(ok==0){
                if(res>9){
                    res=0;
                }else{
                 if(hash.get(res).equals(aux3)){
                     hash.set(res, emp.get(i).substring(0,6));
                     ok=1;
                 }
                 else{
                     res++;
                 }
                }
            }            
           }
       }
        for(int k=0; k<size-1;k++) System.out.println(hash.get(k)+"\n");
    
    }
    public void otros(int op){
    acciones action=new acciones();
        String aux="";
        File path2;
        int cont=0;
        if(action.seleccionar.showDialog(null, "Abrir")==JFileChooser.APPROVE_OPTION){
            action.archivo=action.seleccionar.getSelectedFile();
            path2=action.seleccionar.getSelectedFile();
            if(action.archivo.canRead()){
                if(action.archivo.getName().endsWith("txt")){
                    
                    try {
                         documento=action.Abrirarchivo(action.archivo);
                        a=path2.toString();
                        
                        FileReader r=new FileReader(path2);
                        BufferedReader buffer=new BufferedReader(r);
                        String temp ="";
                        while(temp!=null){
                            
                            temp=buffer.readLine();
                            String x;
                            x=temp;
                            switch(op){
                                case 1:
                                    asis(x);
                                    break;
                                case 2:
                                    adh(x);
                                break;
                                case 3:
                                    rdn(x);
                                break;
                                case 4:
                                    addh(x);
                                break;
                                case 5:
                                    hpe(x);
                                break;
                                
                                default:
                                    JOptionPane.showMessageDialog(null,"Error", "Error", JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                            cont++;
                        }
                    } catch (IOException|NullPointerException ex) {
                        Logger.getLogger(Diseño.archivos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no Compatible", "Error", JOptionPane.ERROR_MESSAGE);
                    a="";
                }
            }
        }
    }
    public void adh(String x)    {
        adh.add(x);
    }
    public void asis(String x)    {
        asis.add(x);
         
    }
    public void rdn(String x)    {
        rdn.add(x);
         
    }
    public void addh(String x)    {
        
        addh.add(x);
         
    }
    public void hpe(String x)    {
        
        hpe.add(x);
         
    }
    public boolean a_empleado(){ 
        boolean correcto=true;
        int emp_a, emp_b, i=0;
        String empl;
        Validacion val=new Validacion();
        while((correcto==true)&&(i<emp.size()-1)){
           if((!emp.get(i).equals(""))){  
               if(emp.get(i).length()==47){
                   for(int j=i+1; j<emp.size()-2;j++){
                       if((val.isNumeric(emp.get(i).substring(0, 6))==true)&&(val.isNumeric(emp.get(j).substring(0, 6))==true)){
                           if((emp_a=Integer.parseInt(emp.get(i).substring(0, 6)))==(emp_b=Integer.parseInt(emp.get(j).substring(0, 6)))){
                               correcto=false;
                               JOptionPane.showMessageDialog(null, "Tiene dos claves iguales", "Error de clave", JOptionPane.ERROR_MESSAGE);
                               break;
                           }
                           else{
                               correcto=true;
                           }
                       }
                       else{
                           correcto=false;
                           JOptionPane.showMessageDialog(null,"Una de sus claves no es numérica","Error de clave",JOptionPane.ERROR_MESSAGE);
                           break;
                       }
                   }
                   empl=emp.get(i).substring(6, 40);
                   if((empl.equals("                                  ")) && (correcto==true)){
                       correcto=false;
                       JOptionPane.showMessageDialog(null, "Falta nombre del empleado","Error de nombre",JOptionPane.ERROR_MESSAGE);
                   }
                   else{
                       empl=emp.get(i).substring(40,41);
                       empl=empl.toUpperCase();
                       if((empl.equals("A"))||(empl.equals("I"))){
                           if(val.isNumeric(emp.get(i).substring(41, 47))==true){
                               if(val.isDate(emp.get(i).substring(41, 47))==true){
                                   correcto=true;
                               }
                               else{
                                   JOptionPane.showMessageDialog(null, "La fecha es errónea", "Error", JOptionPane.ERROR_MESSAGE);
                                   correcto=false;
                               }
                           }
                           else{
                               correcto=false;
                               JOptionPane.showMessageDialog(null, "La fecha no es numérica", "Error de fecha",JOptionPane.ERROR_MESSAGE);
                           }
                       }
                       else{
                           correcto=false;
                           JOptionPane.showMessageDialog(null, "El status no corresponde", "Error de status",JOptionPane.ERROR_MESSAGE);
                       }
                   }
               }
               else{
                   correcto=false;
                   JOptionPane.showMessageDialog(null, "Su archivo tiene un campo que\n no cumple con lo largo requerido","Errro de contenido", JOptionPane.ERROR_MESSAGE);
               }
           }
           else{
               correcto=false;
               JOptionPane.showMessageDialog(null, "Su archivo tiene un campo vacio", "Error de contenido", JOptionPane.ERROR_MESSAGE);
           }
           i++;
        }
        return correcto;
    } 
    public boolean a_horario(){
    Validacion val=new Validacion();
    boolean correcto=true;
    int i=0;
    String hor;
    int clva, clvb;
    while((correcto==true) && (i<adh.size()-1)){
        if(!adh.get(i).isEmpty()){
            if(adh.get(i).length()==51){
                for(int j=i+1;j<adh.size()-2;j++){
                    if((val.isNumeric(adh.get(i).substring(0, 1))==true)&&(val.isNumeric(adh.get(j).substring(0, 1))==true)){
                        if((clva=Integer.parseInt(adh.get(i).substring(0, 1)))==(clvb=Integer.parseInt(adh.get(j).substring(0, 1)))){
                            correcto=false;
                            JOptionPane.showMessageDialog(null, "Dos ID son inguales", "Error de clave", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                        else{
                            correcto=true;
                            
                        }
                    }
                    else{
                        correcto=false;
                        JOptionPane.showMessageDialog(null, "Una ID no es numérica", "Error de clave", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
                if((!adh.get(i).substring(1,50).equals("                                                 ")) && (correcto==true)){
                    hor=adh.get(i).substring(50);
                    hor=hor.toUpperCase();
                    if((hor.equals("A"))||(hor.equals("I"))){
                        correcto=true;
                    }
                    else{
                        correcto=false;
                        JOptionPane.showMessageDialog(null, "El Status es incorrecto", "Error de status", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    correcto=false;
                    JOptionPane.showMessageDialog(null, "Falta la descripción del horario", "Error de descripción", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                correcto=false;
                JOptionPane.showMessageDialog(null, "No cumple con el tamaño el renglón", "Error de tamaño",JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            correcto=false;
            JOptionPane.showMessageDialog(null, "Renglón vacío", "Error",JOptionPane.ERROR_MESSAGE);
        }
        i++;
    }
    return true;
}
    public boolean a_detalledelhorario(){
        Validacion val=new Validacion();
        boolean correcto=true, relación=true;
        int i=0, aux, aux2;
        int[] cdcl=new int [10];
        String cla, clb;
        System.out.println(addh);
        while((correcto==true) && (i<addh.size()-1)){
           int f=0;
            if(!addh.get(i).isEmpty()){
                if(addh.get(i).length()==10){
                    if(val.isNumeric(addh.get(i).substring(0, 1))==true){
                        if((aux=Integer.parseInt(addh.get(i).substring(0, 1)))<=(adh.size()-1)){
                            for(int j=0;j<adh.size()-1;j++){
                                if((aux=Integer.parseInt(addh.get(i).substring(0, 1)))==(aux2=Integer.parseInt(adh.get(j).substring(0, 1)))){
                                    f=1;
                                }
                            }
                            if(f==1){
                                switch(aux=Integer.parseInt(addh.get(i).substring(0, 1))){
                                    case 0:
                                        cdcl[0]++;
                                        break;
                                    case 1:
                                        cdcl[1]++;
                                        break;
                                    case 2:
                                        cdcl[2]++;
                                        break;
                                    case 3:
                                        cdcl[3]++;
                                        break;
                                    case 4:
                                        cdcl[4]++;
                                        break;
                                    case 5:
                                        cdcl[5]++;
                                        break;
                                    case 6:
                                        cdcl[6]++;
                                        break;
                                    case 7:
                                        cdcl[7]++;
                                        break;
                                    case 8:
                                        cdcl[8]++;
                                        break;
                                    case 9:
                                        cdcl[9]++;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Error en conteo", "Error de programación", JOptionPane.ERROR_MESSAGE);
                                        correcto=false;
                                        break;
                                }
                                if(val.isNumeric(addh.get(i).substring(1, 2))==true){
                                    if(((aux=Integer.parseInt(addh.get(i).substring(1, 2)))<7) && (((aux=Integer.parseInt(addh.get(i).substring(1, 2)))>0))){
                                        if(val.isNumeric(addh.get(i).substring(2,6))==true){
                                            if(val.isHour(addh.get(i).substring(2, 6))==true){
                                                if(val.isNumeric(addh.get(i).substring(6))==true){
                                                    if(val.isHour(addh.get(i).substring(6))==true){
                                                        correcto=true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null, "Horario de salida erroneo", "Error de horario", JOptionPane.ERROR_MESSAGE);
                                                        correcto=false;
                                                    }
                                                }
                                                else{
                                                    JOptionPane.showMessageDialog(null, "Hora no numérica", "Error de hora", JOptionPane.ERROR_MESSAGE);
                                                    correcto=false;
                                                }
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(null, "Horario de salida erroneo", "Error de horario", JOptionPane.ERROR_MESSAGE);
                                                correcto=false;
                                            }
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(null, "Hora no numérica", "Error de hora", JOptionPane.ERROR_MESSAGE);
                                            correcto=false;
                                        }
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Número de día inexistente", "Error de día", JOptionPane.ERROR_MESSAGE);
                                        correcto=false;
                                    }
                                }
                                else{
                                JOptionPane.showMessageDialog(null, "EL día no es númerico", "Error de día", JOptionPane.ERROR_MESSAGE);
                                correcto=false;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"No se encuentra la clave\n en el archivo de horario","Error de relación", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "El id de horario es mayor al número\n de registros en el archivo de horario", "Error de relación", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "La ID no es numérica", "Error de clave", JOptionPane.ERROR_MESSAGE);
                        correcto=false;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "No cumple con el tamaño el renglón", "Error de tamaño",JOptionPane.ERROR_MESSAGE);
                    correcto=false;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Renglón vacío", "Error",JOptionPane.ERROR_MESSAGE);
                correcto=false;
            }
            i++;
        }
        return correcto;
    }
    public boolean a_horarioporempleado(){
        boolean correcto=true;
        int i=0;
        Validacion val=new Validacion();
        while((correcto==true)&&(i<hpe.size()-1)){
            int f=0, aux;
            String id, clave, status;
            if(!hpe.get(i).isEmpty()){
                if(hpe.get(i).length()==8){
                    if(val.isNumeric(hpe.get(i).substring(0,1))==true){
                        if((aux=Integer.parseInt(hpe.get(i).substring(0,1)))<=(hpe.size()-1)){
                            id=hpe.get(i).substring(0, 1);
                            for(int j=0; j<hpe.size()-1;j++){
                                if(id.equals(adh.get(j).substring(0, 1))){
                                    f=1;
                                }
                            }
                            if(f==1){
                                if(val.isNumeric(hpe.get(i).substring(1, 7))==true){
                                    f=0;
                                    clave=hpe.get(i).substring(1, 7);
                                    for(int j=0;j<hash.size()-1;j++){
                                        if(clave.equals(hash.get(j))){
                                            f=1;
                                        }
                                    }
                                    if(f==1){
                                        status=hpe.get(i).substring(7);
                                        status=status.toUpperCase();
                                        if((status.equals("A")) && status.equals("I")){
                                            correcto=true;
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(null,"El status es incorrecto", "Error de status",JOptionPane.ERROR_MESSAGE);
                                            correcto=false;
                                        }
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Empleado no encontrado","Error de relacion",JOptionPane.ERROR_MESSAGE);
                                        correcto=false;
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "La clave del empleado no es numérica","Error de clave",JOptionPane.ERROR_MESSAGE);
                                    correcto=false;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Id de horario no encontrado","Error de relacion",JOptionPane.ERROR_MESSAGE);
                                correcto=false;
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "El id es mayor a los registrados en \nel archivo de horario","Error de id",JOptionPane.ERROR_MESSAGE);
                            correcto=false;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Id es numérica","Error de id",JOptionPane.ERROR_MESSAGE);
                        correcto=false;      
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Uno de los registros no cumple \ncon el largo requerido","Error de clave",JOptionPane.ERROR_MESSAGE);
                    correcto=false;   
                }                  
            }
            else{
                JOptionPane.showMessageDialog(null, "Uno de los registros está vacio \ncon el largo requerido","Error de clave",JOptionPane.ERROR_MESSAGE);
                correcto=false;   
            }
            i++;
        }
        return correcto;
    }
    public boolean a_reglasdenegocio(){
        boolean correcto=true;
        int i=0;
        Validacion val=new Validacion();
        while((correcto==true) && (i<rdn.size()-1)){
            if(!rdn.get(i).isEmpty()){
                if(rdn.get(i).length()==57){
                    if(val.isNumeric(rdn.get(i).substring(0, 1))==true){
                        for(int j=i+1; j<rdn.size()-2;j++){
                            if(rdn.get(i).substring(0,1).equals(rdn.get(j).substring(0, 1))){
                                correcto=false;
                                break;
                            }
                        }
                        if((correcto==true) && (!rdn.get(i).substring(1,50).equals("                                               "))){
                            if(!rdn.get(i).substring(50, 56).equals("       ")){
                                String aux;
                                aux=rdn.get(i).substring(56);
                                aux=aux.toUpperCase();
                                if((aux.equals("A") || (aux.equals("I")))){
                                    correcto=true;
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "El status es erróneo","Error de status",JOptionPane.ERROR_MESSAGE);
                                    correcto=false;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"No hay regla de asisteencia","Error de regla",JOptionPane.ERROR_MESSAGE);
                                correcto=false;
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"No hay descripción", "Error de descipción",JOptionPane.ERROR_MESSAGE);
                            JOptionPane.showMessageDialog(null,"Su clave está repetida", "Error de clave",JOptionPane.ERROR_MESSAGE);
                            correcto=false;
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Su clave no es numérica", "Error de clave", JOptionPane.ERROR_MESSAGE);
                        correcto=false;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Un registro no cumple con\nel largo requerido","Error de longitud", JOptionPane.ERROR_MESSAGE);
                    correcto=false;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Un registro se encuentra vacio","Error de registro",JOptionPane.ERROR_MESSAGE);
                correcto=false;
            }
            i++;
        }
        return correcto;
    }
    public boolean a_asistencia(){
        Validacion val=new Validacion();
        boolean correcto=true;
        int i=0, f=0;
        while((correcto==true) && (i<asis.size()-1)){
            if(!asis.get(i).isEmpty()){
                if(asis.get(i).length()==19){
                    if(val.isNumeric(asis.get(i).substring(0, 6))==true){
                        for(int j=0;j<emp.size()-1;j++){
                            if(asis.get(i).substring(0, 6).equals(emp.get(j).substring(0, 6))){
                                f=1;
                                break;
                            }
                        }
                        if(f==1){
                            if(val.isNumeric(asis.get(i).substring(6, 12))==true){
                                if(val.isDate(asis.get(i).substring(6, 12))==true){
                                    if(val.isNumeric(asis.get(i).substring(12, 18))==true){
                                        if(val.isHour2(asis.get(i).substring(12, 18))==true){
                                            if(val.isNumeric(asis.get(i).substring(18))==true){
                                                int aux;
                                                if(((aux=Integer.parseInt(asis.get(i).substring(18)))<5) && ((aux=Integer.parseInt(asis.get(i).substring(18)))>0)){
                                                    correcto=true;
                                                }
                                                else{
                                                    JOptionPane.showMessageDialog(null, "El biométrico está fuera de rango", "Error de biométrico",JOptionPane.ERROR_MESSAGE);
                                                    correcto=false;
                                                }
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(null, "El biométrico no es númerico","Error de Biométrico",JOptionPane.ERROR_MESSAGE);
                                                correcto=false;
                                            }
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(null,"No es una hora","Error de hora",JOptionPane.ERROR_MESSAGE);
                                            correcto=false;
                                        }
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null,"La hora no es numérica", "Error de hora",JOptionPane.ERROR_MESSAGE);
                                        correcto=false;
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "No es una fecha","Error Fecha",JOptionPane.ERROR_MESSAGE);
                                    correcto=false;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "La fecha no es numérica", "Error de fecha",JOptionPane.ERROR_MESSAGE);
                                correcto=false;
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"el empleado no está registrado","Error de empleado",JOptionPane.ERROR_MESSAGE);
                            correcto=false;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "La clave no es numérica","Error de clave",JOptionPane.ERROR_MESSAGE);
                        correcto=false;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Un registro no cumple con\nel largo requerido","Error de longitud",JOptionPane.ERROR_MESSAGE);
                    correcto=false;
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Un registro se encuentra vacio","Error de registro", JOptionPane.ERROR_MESSAGE);
                correcto=false;
            }
            i++;
        }
        return correcto;
    }
}

