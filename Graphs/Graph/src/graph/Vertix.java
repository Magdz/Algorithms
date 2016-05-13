/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.Vector;

/**
 *
 * @author Ahmed
 */
public class Vertix {
    
    public String name;
    private final Vector<Edge> Edges;
    
    public Vertix(String name){
        this.name=name;
        Edges=new Vector();
    }
    
    public void addEdge(Edge e){
        Edges.add(e);
    }
    
    public int NumberofEdges(){
        return Edges.size();
    }
    
    /* default Function for the package */
    Edge getEdge(int index){
        if(Edges.isEmpty())return null;
        return Edges.get(index);
    }
    
    public Vertix getNeighbor(int index){
        Edge Temp=getEdge(index);
        if(Temp==null)return null;
        if(Temp.FirstVertix()!=this)return Temp.FirstVertix();
        return Temp.SecondVertix();
    }
    
}
