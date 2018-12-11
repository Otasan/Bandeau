/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
import java.awt.Font;
/**
 *
 * @author greziz
 */
public class Police extends Animations{
    private String poli;
    private int tail;
    public Police(String police, int taille){
        poli=police;
        tail=taille;   
    }
    
    @Override
    public void effectuer(Bandeau myBandeau) {
        myBandeau.setFont(new Font(poli, Font.PLAIN, tail));
        myBandeau.sleep(10);
    }
}