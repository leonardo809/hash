/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package código;

import Diseño.Cargar;
import Diseño.Idiomas;


/**
 *
 * @author Home1
 */
public class progrees {
    public static void main(String[] args){
        Idiomas por= new Idiomas();
        Cargar car=new Cargar();
        car.setVisible(true);
        try
        {
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                car.l1.setText(Integer.toString(i)+"%");
                car.pb.setValue(i);
                if(i==100){
                    car.setVisible(false);
                    car.dispose();
                    por.setVisible(true);
                }
            }
        }catch(InterruptedException e){
            
        }
    }
}
