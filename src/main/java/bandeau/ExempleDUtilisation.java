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
        s.addAnimation(new RainbowBack());
        s.addAnimation(new Disparition());
        s.play();
    }
    
    public void exemple() {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Hello");
		monBandeau.sleep(1000);
		monBandeau.setMessage("On va changer de police");
		monBandeau.sleep(1000);
		monBandeau.setMessage("Monospaced 15 Bold");
		monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
		monBandeau.sleep(1000);
		monBandeau.setMessage("SansSerif 15");
		monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
		monBandeau.sleep(1000);
		monBandeau.setMessage("On va zoomer");
		monBandeau.sleep(1000);
		monBandeau.setMessage("Zoom........");
		for (int i = 5; i < 60 ; i+=5) {
			monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
			monBandeau.sleep(100);
		}
		monBandeau.sleep(1000);

		monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
		monBandeau.setMessage("On va tourner");
		monBandeau.sleep(1000);
		monBandeau.setMessage("On tourne...");
		for (int i = 0; i <= 100; i++) {
			monBandeau.setRotation(2*Math.PI*i / 100);
			monBandeau.sleep(100);
		}

		monBandeau.setMessage("On va changer de couleur de fond");
		monBandeau.sleep(1000);
		monBandeau.setBackground(Color.DARK_GRAY);
		monBandeau.setMessage("On va changer de couleur");
		monBandeau.sleep(1000);
		monBandeau.setForeground(Color.YELLOW);
		monBandeau.sleep(1000);
		monBandeau.setFont(font);
		monBandeau.setForeground(fore);
		monBandeau.setBackground(back);
		monBandeau.setMessage("Termine");
		//System.exit(0);
   }
}
