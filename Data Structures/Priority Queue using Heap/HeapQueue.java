
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
public class HeapQueue {
    private final Vector<Node> Nodes;
    
    public HeapQueue(){
        Nodes = new Vector();
    }
    
    private void runHeapify(){
        for(int i=Nodes.size()/2; i>=0; --i){
            Heapify(i);
        }
    }
    
    private void Heapify(int i){
        int left = (i+1)*2-1;
        int right = left+1;
        int top = i;
        if(left < Nodes.size() && Nodes.get(left).getPriority() > Nodes.get(i).getPriority()){
            top = left;
        }
        if(right < Nodes.size() && Nodes.get(right).getPriority() > Nodes.get(top).getPriority()){
            top = right;
        }
        if(top != i){
            swap(i, top);
            Heapify(top);
        }
    }
    
    private void swap(int i, int j){
        Node temp = Nodes.get(i);
        Nodes.set(i, Nodes.get(j));
        Nodes.set(j, temp);
    }
    
    public void Enqueue(int value, int priority){
        Nodes.add(new Node(value, priority));
        runHeapify();
    }
    
    public Node Dequeue(){
        Node temp = Nodes.get(0);
        Nodes.remove(0);
        runHeapify();
        if(temp == null)return null;
        return temp;
    }
    
    public int size(){
        return Nodes.size();
    }
}
