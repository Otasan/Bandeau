/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
import java.awt.Color;
/**
 *
 * @author greziz
 */
public class Fond extends Animations{
    private Color couleurf;
    
    /**
     * Définie la couleur du fond
     * @param r
     * @param g
     * @param b 
     */
    public Fond (int r, int g, int b){
        couleurf= new Color(r,g,b);
    } 
    /**
     * Définie la couleur du fond
     * @param couleurf 
     */
    public Fond(Color couleurf){
        this.couleurf=couleurf;
    }
    
    @Override
    public void effectuer(Bandeau myBandeau) {
        myBandeau.setBackground(couleurf);
    }
    
}
