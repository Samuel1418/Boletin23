/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Metodos {
    public void fila(Queue<Espera> esp,int persons) throws ForaDeRangoExcepcion{
        if(persons<=50&& persons>0){
            for(int i=0;i<=persons-1;i++){
                int edad=(int)(Math.random()*50)+5; 
                Espera perso=new Espera(edad);
                esp.add(perso);
            }
        }
        else{
            if (persons<=0){
                throw new ForaDeRangoExcepcion("Tiene que haber personas");
            }
            else{
                throw new ForaDeRangoExcepcion("Se ha superado el cupo de 50 personas");
            }
        }
    }
    public double entradas(Queue<Espera>esp, double ganancias) throws ForaDeRangoExcepcion{
        if(esp.size()<=0){
            throw new ForaDeRangoExcepcion("Sin entradas");
        }
        else{
            for(Espera edad: esp){
                if(edad.getEdade()>=5 && edad.getEdade()<=10){
                    ganancias=ganancias+1;
                }
                else if(edad.getEdade()>=11 && edad.getEdade()<=17){
                    ganancias=ganancias+2.5;
                }
                else if(edad.getEdade()>=18){
                    ganancias=ganancias+3.5;
                }
            }
        }
        esp.removeAll(esp);
        return ganancias;
    }
    public void ganado(double ganancias){
        JOptionPane.showMessageDialog(null,"Se ha ganado: "+ganancias);
        System.exit(0);
}
}
