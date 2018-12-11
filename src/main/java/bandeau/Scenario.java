/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author aabdo
 */
public class Scenario {
    private LinkedList<Animations> myEffets = new LinkedList();
    private Bandeau myBandeau;
    
    public Scenario(Bandeau bandeau){
        myBandeau=bandeau;
    }
    
    public void addAnimation(Animations a, int rep){
        for(int i = 0;i<rep;i++){
            myEffets.add(a);
        }
    }
    public void addAnimation(Animations a){
        myEffets.add(a);
    }
    
    public void play(){
        for(Animations a:myEffets){
            a.effectuer(myBandeau);
            myBandeau.sleep(100);
        }
    }
    
    public void playShuffle(){
        HashSet<Integer> fait = new HashSet();
        Random rand = new Random();
        while(fait.size()<myEffets.size()){
            int r = rand.nextInt(myEffets.size());
            if(!fait.contains(r)){
                fait.add(r);
                myEffets.get(r).effectuer(myBandeau);
            }
        }
    }
}
