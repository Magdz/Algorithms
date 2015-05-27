/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.*;

/**
 *
 * @author Ahmed
 */
public class Graph {

    private final Vector<Edge> Edges;
    private final Vector<Vertix> Vertixes;
    
    public Graph(){
        Edges=new Vector();
        Vertixes=new Vector();
    }
    
    public void addVertix(String name){
        Vertix New_Vertix=new Vertix(name);
        Vertixes.addElement(New_Vertix);
    }
    
    private Vertix getVertix(String name){
        for(int i=0;i<Vertixes.size();++i){
            if(Vertixes.get(i).name==name)return Vertixes.get(i);
        }
        return null;
    }
    
    
    public void addEdge(String V1,String V2){
        Vertix v1=getVertix(V1),v2=getVertix(V2);
        if(v1==null || v2==null)return;
        Edge New_Edge=new Edge(v1,v2);
        Edges.addElement(New_Edge);
    }
    
    public boolean isEdge(String V1,String V2){
        Vertix v1=getVertix(V1),v2=getVertix(V2);
        if(v1==null || v2==null)return false;
        Edge Temp_Edge=new Edge(v1,v2);
        for(int i=0;i<Edges.size();++i){
            if(Edges.get(i)==Temp_Edge)return true;
        }
        return false;
    }
    
    public boolean isVertix(String name){
        if(getVertix(name)==null)return false;
        return true;
    }
    
    public int degree(String name){
        Vertix Temp=getVertix(name);
        if(Temp==null)return 0;
        return Temp.NumberofEdges();
    }
    
    public void neighbors(String name){
        Vertix Temp=getVertix(name);
        if(Temp==null)return;
        System.out.print("Neighbors:");
        for(int i=0;i<Temp.NumberofEdges();++i){
            System.out.print(" "+Temp.getNeighbor(i).name);
        }
        System.out.println("");
    }
    
    public void DepthFirstSearch(){
        if(Vertixes.isEmpty())return;
        Stack<Vertix> s=new Stack();
        boolean[] Visited=new boolean[Vertixes.size()];
        System.out.print("DFS:");
        int Components=1;
        int index=0;
        Visited[index]=true;
        s.push(Vertixes.get(index));
        for(int i=0;i<Vertixes.size();++i){
            while(!s.isEmpty()){
                Vertix t=s.peek();
                for(int j=0;j<t.NumberofEdges();++j){
                    Vertix N=t.getNeighbor(j);
                    int Nindex=getindex(N);
                    if(!Visited[Nindex]){
                        t=N;
                        Visited[Nindex]=true;
                        s.push(N);
                    }
                }
                System.out.print(" "+s.pop().name);
            }
            if(!Visited[i]){
                s.push(Vertixes.get(i));
                //Components++;
            }
        }
        while(!s.isEmpty())System.out.print(" "+s.pop().name);
        System.out.println("");
        System.out.println("Number of Components: "+Components);
    }
    
    private int getindex(Vertix V){
        for(int i=0;i<Vertixes.size();++i)
            if(getVertix(V.name)==V)return i;
        return 0;
    }


    public void BreadthFirstSearch(){
        if(Vertixes.isEmpty())return;
        Queue<Vertix> q=new LinkedList();
        boolean[] Visited=new boolean[Vertixes.size()];
        System.out.print("BFS:");
        int Components=1;
        int index=0;
        Visited[index]=true;
        q.add(Vertixes.get(index));
        for(int i=0;i<Vertixes.size();++i){
            while(!q.isEmpty()){
                Vertix t=q.peek();
                for(int j=0;j<t.NumberofEdges();++j){
                    Vertix N=t.getNeighbor(j);
                    int Nindex=getindex(N);
                    if(!Visited[Nindex]){
                        t=N;
                        Visited[Nindex]=true;
                        q.add(N);
                    }
                }
                System.out.print(" "+q.remove().name);
            }
            if(!Visited[i]){
                q.add(Vertixes.get(i));
                //Components++;
            }
        }
        while(!q.isEmpty())System.out.print(" "+q.remove().name);
        System.out.println("");
        System.out.println("Number of Components: "+Components);
    }
}