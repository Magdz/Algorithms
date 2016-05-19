/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Philosopher {
    private final Chopstick left, right;
    private static int id = 1;
    public int num;
    
    public Philosopher(Chopstick left, Chopstick right){
        num = id++;
        this.left = left;
        this.right = right;
    }
    
    public void Eat(){
        synchronized(left){
            synchronized(right){
                if(left.inUse() || right.inUse())return;
                left.Use();
                right.Use();
            }
        }
        System.out.println("Philosopher " + num + " is eating.");
    }
    
    public void Think(){
        left.notUse();
        right.notUse();
        System.out.println("Philosopher " + num + " is thinking.");
    }
}
