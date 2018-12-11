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
public class Fondu extends Animations{
    private Color couleur;
    
    public Fondu (Color c){
        couleur=c;
    }

    @Override
    public void effectuer(Bandeau myBandeau) {
        Color init = myBandeau.getBackground();
        int diffR = couleur.getRed()-init.getRed();
        int diffG = couleur.getGreen()-init.getGreen();
        int diffB = couleur.getBlue()-init.getBlue();
        for(int i=0;i<100;i++){
            Fond f = new Fond(new Color(init.getRed()+diffR*i/100,init.getGreen()+diffG*i/100,init.getBlue()+diffB*i/100));
            f.effectuer(myBandeau);
            myBandeau.sleep(10);
        }
    }
    
}
