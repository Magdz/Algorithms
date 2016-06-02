/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Knapsack {

    /**
     * @param args the command line arguments
     */
    
    static int n = 4;
    static int W = 5;
    
    static int[] weights = {0,2,3,4,5};
    static int[] values = {0,3,4,5,6};
    
    static int[][] C = new int[n+1][W+1];
    
    public static void main(String[] args) {
        Knapsack();
        for(int i=0; i<=n; ++i){
            for(int j=0; j<=W; ++j){
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Max is: " + C[n][W]);
    }
 
    public static void Knapsack(){
        for(int i=1; i<=n; ++i){
            for(int w=1; w<=W; ++w){
                if(weights[i] <= w)
                    if(values[i] + C[i-1][w-weights[i]] > C[i-1][w])
                        C[i][w] = values[i] + C[i-1][w-weights[i]];
                    else
                        C[i][w] = C[i-1][w];
                else
                    C[i][w] = C[i-1][w];
            }
        }
    }
    
}
