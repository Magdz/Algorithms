/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Chopstick {
    private boolean used = false;
    
    public void Use(){
        used = true;
    }
    
    public void notUse(){
        used = false;
    }
    
    public boolean inUse(){
        return used;
    }
}
