/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triplestep;

import java.util.Arrays;

/**
 *
 * @author magdz
 */
public class TripleStep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(TripleStep(3));
        System.out.println(TripleStepMem(3));
        System.out.println(TripleStep(9));
        System.out.println(TripleStepMem(9));
    }
    
    /*  Big O 3^n */
    public static int TripleStep(int n){
        if(n == 0) return 1;
        if(n < 0) return 0;
        
        return TripleStep(n-1) + TripleStep(n-2) + TripleStep(n-3);
    }
    
    /* Big O n */
    public static int TripleStepMem(int n){
        int[] memory = new int[n+1];
        Arrays.fill(memory, -1);
        return TripleStepMem(n, memory);
    }
    
    public static int TripleStepMem(int n, int[] memory){
        if(n == 0) return 1;
        if(n < 0) return 0;
        if(memory[n] > -1) return memory[n];
        
        memory[n] = TripleStepMem(n-1, memory) + TripleStepMem(n-2, memory) + TripleStepMem(n-3, memory);
        return memory[n];
    }
    
}
