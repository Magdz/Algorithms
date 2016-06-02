/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Edge {
    public final int from;
    public final int to;
    public final int weight;
    
    public Edge(int from, int to, int weight){
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}
