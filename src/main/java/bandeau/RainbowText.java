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
        for(int b = 0;b<=255;b++){
            CouleurText c = new CouleurText(255-b,b,0);
            c.effectuer(myBandeau);
            myBandeau.sleep(1);
        }
    }
    
}
