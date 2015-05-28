/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacency.matrix;

/**
 *
 * @author Ahmed
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        adjMatrix G=new adjMatrix(6);
        G.addEdge(0, 1);
        G.addEdge(0, 2);
        G.addEdge(0, 4);
        G.addEdge(1, 2);
        G.addEdge(1, 5);
        G.addEdge(2, 5);
        G.addEdge(3, 3);
        G.addEdge(3, 4);
        G.addEdge(4, 5);
        G.Print();
        G.DFS();
        G.BFS();
    }
    
}
