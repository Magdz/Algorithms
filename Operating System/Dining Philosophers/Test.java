/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Test {

    public static final int N = 5;
    
    public static void main(String[] args) throws InterruptedException {
        Chopstick [] sticks = new Chopstick[N];
        Philosopher [] philos = new Philosopher[N];
        
        for(int i = 0; i < N; ++i)
            sticks[i] = new Chopstick();
        for(int i = 0; i < N; ++i)
            philos[i] = new Philosopher(sticks[i], sticks[(i+1)%N]);
        
        for(int i = 0; i < N; ++i){
            new Thread(new EatThink(philos[i])).start();
            Thread.sleep(SleepLength());
        }
    }
    
    public static long SleepLength(){
        return (long) (((Math.floor(Math.random())*10)) * 100 + ((Math.floor(Math.random())*10)));
    }
}
