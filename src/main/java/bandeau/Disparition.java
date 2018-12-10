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
public class Disparition extends Animations{

    @Override
    public void effectuer(Bandeau myBandeau) {
        myBandeau.setMessage("Wooosh");
        for(int s = myBandeau.getFont().getSize();s>0;s--){
            Rotation r = new Rotation()
        }
    }
    
}
