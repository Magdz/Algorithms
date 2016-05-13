/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author Ahmed
 */
public class Edge {
    
    private final Vertix V1;
    private final Vertix V2;
    
    public Edge(Vertix V1,Vertix V2){
        this.V1=V1;
        this.V2=V2;
        this.V1.addEdge(this);
        this.V2.addEdge(this);
    }
    
    public Vertix FirstVertix(){
        return V1;
    }
    
    public Vertix SecondVertix(){
        return V2;
    }
    
}
