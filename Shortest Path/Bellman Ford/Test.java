
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Test {

    static int infinity = (int)(1e7);
    static int N = 5;
    static int []Nodes;
    static Vector<Edge> Edges;
    
    public static void main(String[] args) {
        Edges = new Vector();
        Nodes = new int[N];
        for(int i = 0; i < N; i++){
            Nodes[i] = infinity;
        }
        
        Edges.add(new Edge(0,1,6));
        Edges.add(new Edge(0,2,7));
        Edges.add(new Edge(1,2,8));
        Edges.add(new Edge(1,4,-4));
        Edges.add(new Edge(1,3,5));
        Edges.add(new Edge(2,3,-3));
        Edges.add(new Edge(2,4,9));
        Edges.add(new Edge(3,1,-2));
        Edges.add(new Edge(4,3,7));
        Edges.add(new Edge(4,0,2));
        
        BellmanFord Bell = new BellmanFord(Nodes, Edges, 0);
        Nodes = Bell.Run();
        
        for(int i = 0; i < N ; ++i){
            System.out.println(Nodes[i] + " ");
        }
        
    }
    
}
