/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author aabdo
 */
public class RainbowText extends Animations{
    @Override
    public void effectuer(Bandeau myBandeau) {
        for(int g = 0;g<=255;g++){
            CouleurText c = new CouleurText(255-g,g,0);
            c.effectuer(myBandeau);
            myBandeau.sleep(5);
        }
        for(int b = 0;b<=255;b++){
            CouleurText c = new CouleurText(0,255-b,b);
            c.effectuer(myBandeau);
            myBandeau.sleep(5);
        }
        for(int r = 0;r<=255;r++){
            CouleurText c = new CouleurText(r,0,255-r);
            c.effectuer(myBandeau);
            myBandeau.sleep(5);
        }
    }
    
}
