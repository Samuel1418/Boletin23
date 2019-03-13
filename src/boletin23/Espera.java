/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

/**
 *
 * @author Samuel
 */
public class Espera {
    int edade;

    public Espera(int edade) {
        this.edade = edade;
    }

    
    
    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    @Override
    public String toString() {
        return "Espera{" + "edade=" + edade + '}';
    }
    
    
    
}
