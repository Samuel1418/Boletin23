/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author Samuel
 */
public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Metodos obx= new Metodos();
       
       Queue<Espera> esp= new LinkedList<>();
        double ganancias=0;
        int numeroP=PedirDatos.enteiro("Introduzca personas a añadir");
        try{
                obx.fila(esp, numeroP);
                ganancias=obx.entradas(esp, ganancias);
                obx.ganado(ganancias);
        }
        catch(ForaDeRangoExcepcion e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}
    }
