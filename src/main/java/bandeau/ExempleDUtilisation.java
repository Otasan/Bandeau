package bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {
    private static Bandeau monBandeau = new Bandeau();
    
    public static void main(String[] args) {
	    //new ExempleDUtilisation().exemple();
        Scenario s = new Scenario(monBandeau);
        s.addAnimation(new Message("AaAaAaAaAa"));
        s.addAnimation(new Rotation(Math.PI));
        s.addAnimation(new Fondu(new Color(255, 0, 0)));
        s.addAnimation(new RainbowBack(), 3);
        s.addAnimation(new Fondu(Color.WHITE));
        s.addAnimation(new RainbowText());
        s.addAnimation(new Disparition());
        s.play();
    }
   
}
