/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class LCS {

    static char []X = {'A','B','C','B','D','A','B'};
    static char []Y = {'B','D','C','A','B','A'};

    static int[][] C = new int[X.length][Y.length];
    
    public static void main(String[] args) {
        LCS();
        for(int i = 0; i < X.length; ++i){
            for(int j = 0; j < Y.length; ++j){
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void LCS(){
        for(int i = 0; i < X.length; ++i){
            for(int j = 0; j < Y.length; ++j){
                if(X[i] == Y[j]){
                    if(i == 0 || j == 0){
                        C[i][j] = 1;
                    }else{
                        C[i][j] = C[i-1][j-1] + 1;
                    }
                }else{
                    if(i == 0 && j == 0){
                        C[i][j] = 0;
                    }else if(i == 0){
                        C[i][j] = C[i][j-1];
                    }else if(j == 0){
                        C[i][j] = C[i-1][j];
                    }else{
                        C[i][j] = Math.max(C[i-1][j], C[i][j-1]);
                    }
                }
            }
        }
    }
    
}
