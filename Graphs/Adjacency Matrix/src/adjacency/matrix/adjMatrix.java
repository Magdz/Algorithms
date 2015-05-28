/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacency.matrix;

import java.util.*;

/**
 *
 * @author Ahmed
 */
public class adjMatrix {
        
    private final boolean[][] Matrix;
    private final int Vertixes;
    private int Edges;
    
    public adjMatrix(int V){
        Vertixes=V;
        Edges=0;
        Matrix=new boolean[V][V];
        for(int i=0;i<V;++i)for(int j=0;j<V;++j)Matrix[i][j]=false;
    }
    
    public void addEdge(int i,int j){
        Matrix[i][j]=true;
        Matrix[j][i]=true;
        Edges++;
    }
    
    public void removeEdge(int i,int j){
        Matrix[i][j]=false;
        Matrix[i][j]=false;
        Edges--;
    }
    
    public boolean isEdge(int i,int j){
        return Matrix[i][j];
    }
    
    public int NumberofVertixes(){
        return Vertixes;
    }
    
    public int NumberofEdges(){
        return Edges;
    }
    
    public void PrintVertixes(){
        System.out.print("Vertiex:");
        for(int i=0;i<Vertixes;++i)System.out.print(" "+i);
        System.out.println("");
    }
    
    public void PrintEdges(){
        System.out.print("Edges:");
        for(int i=0;i<Vertixes;++i)
            for(int j=0;j<Vertixes;++j)
                if(Matrix[i][j]==true)
                    System.out.print(" ("+i+","+j+")");
        System.out.println("");
    }
    
    public int degree(int v){
        int degree=0;
        for(int i=0;i<Vertixes;++i)
            if(Matrix[v][i]==true)
                degree++;
        return degree;
    }
    
    public void Neighbors(int v){
        System.out.print("Neighbors of #"+v+":");
        for(int i=0;i<Vertixes;++i)
            if(Matrix[v][i]==true)
                System.out.print(" "+i);
        System.out.println("");
    }
    
    public void Print(){
        System.out.println("Adjecency Matrix:");
        for(int i=0;i<Vertixes;++i){
            for(int j=0;j<Vertixes;++j){
                if(Matrix[i][j]){
                    System.out.print("1 ");
                }else System.out.print("0 ");
            }
            System.out.println("");
        }
    }
    
    public void DFS(){
        System.out.print("DFS:");
        Stack S=new Stack();
        int Components=0;
        boolean []Visited=new boolean [Vertixes+1];
        int x=0;
        for(int i=0;i<Vertixes;++i){
            if(!Visited[i]){
                Components++;
                Visited[i]=true;
                S.push(i);
                for(int j=0;j<Vertixes;++j){
                    if(!Visited[j] && Matrix[x][j]==true){
                        Visited[j]=true;
                        S.push(j);
                        x=j;
                        j=0;
                    }
                    if(j==Vertixes-1 && !S.isEmpty()){
                        x=(int)S.pop();
                        System.out.print(" "+x);
                        j=0;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("Components="+Components);
    }
    
    public void BFS(){
        System.out.print("BFS:");
        Queue Q=new LinkedList();
        int Components=0;
        boolean []Visited=new boolean [Vertixes+1];
        int x=0;
        for(int i=0;i<Vertixes;++i){
            if(!Visited[i]){
                Components++;
                Visited[i]=true;
                Q.add(i);
                for(int j=0;j<Vertixes;++j){
                    if(!Visited[j] && Matrix[x][j]==true){
                        Visited[j]=true;
                        Q.add(j);
                        x=j;
                        j=0;
                    }
                    if(j==Vertixes-1 && !Q.isEmpty()){
                        x=(int)Q.remove();
                        System.out.print(" "+x);
                        j=0;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("Components="+Components);
    }
}