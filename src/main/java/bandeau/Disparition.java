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
        int taille = myBandeau.getFont().getSize();//récupère la taille initiale du texte
        Rotation r = new Rotation((Math.PI*4)/taille);//fait 2 tours avant de faire disparaitre le texte
        for(int s = taille;s>0;s--){
            r.effectuer(myBandeau, false);
            Police p = new Police(myBandeau.getFont().getFontName(), s);//ne change que la taille de la police
            p.effectuer(myBandeau);
        }
    }
    
}
