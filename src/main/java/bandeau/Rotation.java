/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author greziz
 */
public class Rotation extends Animations {
    
    private Float angl;
    
    public Rotation(Float angle){
        angl=angle;
    }
    
    @Override
    public void effectuer(Bandeau myBandeau) {
        for (int i = 0; i <= 100; i++) {
			myBandeau.setRotation(2*Math.PI*i / 100);
    }
    
}
}