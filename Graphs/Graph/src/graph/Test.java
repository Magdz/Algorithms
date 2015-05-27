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
public class Test {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph G=new Graph();
        G.addVertix("A");
        G.addVertix("B");
        G.addEdge("A", "B");
        G.addVertix("C");
        G.addEdge("A", "C");
        G.addVertix("D");
        G.DepthFirstSearch();
        G.neighbors("A");
    }
}
