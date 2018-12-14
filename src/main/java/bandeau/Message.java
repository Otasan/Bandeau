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
public class Message extends Animations {
    private String mess;
    /**
     * Message à afficher
     * @param message 
     */
    public Message(String message){
        mess=message;
    }
    
    @Override
    public void effectuer(Bandeau myBandeau) {
        myBandeau.setMessage(mess);
    }
    
}
