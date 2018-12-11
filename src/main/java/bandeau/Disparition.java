/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

/**
 *
 * @author aabdo
 */
public class Disparition extends Animations{

    @Override
    public void effectuer(Bandeau myBandeau) {
        myBandeau.setMessage("Wooosh");
        int taille = myBandeau.getFont().getSize();
        Rotation r = new Rotation((Math.PI*4)/taille);
        for(int s = taille;s>0;s--){
            r.effectuer(myBandeau, false);
            Police p = new Police(myBandeau.getFont().getFontName(), s);
            p.effectuer(myBandeau);
        }
    }
    
}
