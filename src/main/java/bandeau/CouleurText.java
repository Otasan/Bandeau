/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

/**
 *
 * @author aabdo
 */
public class CouleurText extends Animations {
    private Color couleur;

    /**
     * définie la couleur
     * @param r
     * @param g
     * @param b 
     */
    public CouleurText(int r, int g, int b){
        couleur=new Color(r,g,b);
    }
    /**
     * définie la couleur
     * @param couleur 
     */
    public CouleurText(Color couleur){
        this.couleur=couleur;
    }
    
    @Override
    public void effectuer(Bandeau myBandeau) {
        myBandeau.setForeground(couleur);
    }
    
}
