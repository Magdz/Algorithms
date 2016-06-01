/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class QuickFind {
    
    private final int N;
    private final int []id;
    
    public QuickFind(int N){
        this.N = N;
        id = new int[N];
        for(int i=0; i < N; ++i){
            id[i] = i;
        }
    }
    
    public void union(int x, int y){
        if(id[x] != id[y]){
            for(int i = 0; i < N; i++){
                if(id[i] == id[x]) id[i] = id[y];
            }
        }
    }
    
    public boolean connected(int x, int y){
        return id[x] == id[y];
    }
    
}
