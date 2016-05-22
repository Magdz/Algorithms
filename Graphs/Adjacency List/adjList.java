/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacency.list;

import java.util.*;

/**
 *
 * @author Ahmed
 */
public class adjList {
    
    private LinkedList<Vector> List;
    private int Edges;
    private int Vertixes;
    
    public adjList(){
        List=new LinkedList();
        Edges=0;
        Vertixes=0;
    }
    
    public void addVertix(){
        List.add(new Vector());
        Vertixes++;
    }
    
    public void addEdge(int i,int j){
        List.get(i).add(j);
        List.get(j).add(i);
        Edges++;
    }
    
    public void removeVertix(int v){
        List.get(v);
        for(int i=0;i<List.get(v).size();++i){
            this.removeEdge(i ,v);
        }
        List.remove(v);
        Vertixes--;
    }
    
    public void removeEdge(int i,int j){
        List.get(i).remove(j);
        List.get(j).remove(i);
        Edges--;
    }
    
    public void Print(){
        System.out.println("Adjacency List:");
        for(int i=0;i<Vertixes;++i){
            System.out.print("L["+i+"]:");
            for(int j=0;j<List.get(i).size();++j){
                System.out.print(" "+List.get(i).get(j));
            }
            System.out.println("");
        }
    }
    
    public boolean isEdge(int i,int j){
        if(List.get(i).get(j)!=null)return true;
        return false;
    }
    
    public int degree(int v){
        return List.get(v).size();
    }
    
    public int NumberofVertixes(){
        return Vertixes;
    }
    
    public int NumberofEdges(){
        return Edges;
    }
    
    public void PrintVertixes(){
        System.out.print("Vertixes:");
        for(int i=0;i<Vertixes;++i)
            System.out.print(" "+i);
        System.out.println("");
    }
    
    public void PrintEdges(){
        System.out.print("Edges:");
        for(int i=0;i<Vertixes;++i)
            for(int j=0;j<List.get(i).size();++j)
                System.out.print(" ("+i+", "+j+")");
        System.out.println("");
    }
    
    public void Neighbors(int v){
        System.out.print("Neighbors of #"+v+":");
        for(int i=0;i<List.get(v).size();++i)
            System.out.print(" "+List.get(v).get(i));
        System.out.println("");
    }
    
    public boolean isEmpty(){
        if(Vertixes==0)return true;
        return false;
    }
    
    public void DFS(){
        if(isEmpty())return;
        System.out.print("DFS:");
        Stack S=new Stack();
        int Components=0;
        boolean[]Visited=new boolean[Vertixes];
        int x;
        for(int i=0;i<Vertixes;++i){
            if(!Visited[i]){
                Components++;
                x=i;
                Visited[x]=true;
                S.push(x);
                for(int j=0;j<List.get(x).size();++j){
                    int t=(int)List.get(x).get(j);
                    if(!Visited[t]){
                        Visited[t]=true;
                        S.push(t);
                        x=t;
                        j=0;
                    }
                    if(j==List.get(x).size()-1 && !S.isEmpty()){
                        x=(int)S.pop();
                        System.out.print(" "+x);
                        j=0;
                    }
                }
            }
            while(!S.isEmpty()){
                System.out.print(" "+(int)S.pop());
            }
        }
        System.out.println("");
        System.out.println("Components: "+Components);
    }
    
    public void BFS(){
        if(isEmpty())return;
        System.out.print("BFS:");
        Queue Q=new LinkedList();
        int Components=0;
        boolean[]Visited=new boolean[Vertixes];
        int x;
        for(int i=0;i<Vertixes;++i){
            if(!Visited[i]){
                Components++;
                x=i;
                Visited[x]=true;
                Q.add(x);
                for(int j=0;j<List.get(x).size();++j){
                    int t=(int)List.get(x).get(j);
                    if(!Visited[t]){
                        Visited[t]=true;
                        Q.add(t);
                        x=t;
                        j=0;
                    }
                    if(j==List.get(x).size()-1 && !Q.isEmpty()){
                        x=(int)Q.remove();
                        System.out.print(" "+x);
                        j=0;
                    }
                }
            }
            while(!Q.isEmpty()){
                System.out.print(" "+(int)Q.remove());
            }
        }
        System.out.println("");
        System.out.println("Components: "+Components);
    }
}
