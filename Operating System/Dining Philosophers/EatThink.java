/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class EatThink implements Runnable{
    private Philosopher philo;
    
    public EatThink(Philosopher philo){
        this.philo = philo;
        System.out.println("Philosopher " + philo.num + " is here");
    }
    
    @Override
    public void run(){
        do{
            try{
                philo.Eat();
                Thread.sleep(Test.SleepLength());
                philo.Think();
                Thread.sleep(Test.SleepLength());
            }catch(Exception e){
                System.out.println("Something happened to Philosopher "+ philo.num + " " + e.getMessage());
            }
        }while(true);
    }
}
