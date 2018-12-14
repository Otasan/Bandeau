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
    
    private double angl;
    /**
     * Angle devant être ajouté à la rotation actuelle
     * @param angle 
     */
    public Rotation(Double angle){
        angl=angle;
    }
    
    @Override
    public void effectuer(Bandeau myBandeau) {
        double init = myBandeau.getRotation();
        for (double i = 0; i <= 100; i++) {
            myBandeau.setRotation(init+(angl*i / 100));
            myBandeau.sleep(10);
        }
    }
    /**
     * même rotation mais sans attente dans la boucle
     * @param myBandeau
     * @param f 
     */
    public void effectuer(Bandeau myBandeau, boolean f) {
        double init = myBandeau.getRotation();
        for (double i = 0; i <= 100; i++) {
            myBandeau.setRotation(init+(angl*i / 100));
        }
    }
}
