/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacency.list;

/**
 *
 * @author Ahmed
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        adjList G=new adjList();
        for(int i=0;i<8;i++)
            G.addVertix();
        G.addEdge(0, 1);
        G.addEdge(0, 2);
        G.addEdge(1, 2);
        G.addEdge(7, 3);
        G.addEdge(6, 7);
        G.addEdge(4, 5);
        G.Print();
        G.DFS();
        G.BFS();
    }
    
}
