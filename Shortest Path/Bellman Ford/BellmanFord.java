
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
public class BellmanFord {
    private final int []Nodes;
    private final Vector<Edge> Edges;
    
    public BellmanFord(int[] Nodes, Vector<Edge> Edges, int source){
        this.Nodes = Nodes;
        this.Edges = Edges;
        Nodes[source] = 0;
    }
    
    public int[] Run(){
        for(int i = 0; i < Nodes.length; ++i){
            for(int j = 0; j < Edges.size(); ++j){
                if(Nodes[Edges.get(j).from] + Edges.get(j).weight < Nodes[Edges.get(j).to]){
                    Nodes[Edges.get(j).to] = Nodes[Edges.get(j).from] + Edges.get(j).weight;
                }
            }
        }
        return Nodes;
    }
}
