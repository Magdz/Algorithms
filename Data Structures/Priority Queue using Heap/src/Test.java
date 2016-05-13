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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HeapQueue PQ = new HeapQueue();
        PQ.Enqueue(5, 2);
        PQ.Enqueue(1, 1);
        PQ.Enqueue(6, 3);
        PQ.Enqueue(7, 3);
        PQ.Enqueue(12, 2);
        
        while(PQ.size() != 0){
            System.out.println(PQ.Dequeue().getValue());
        }
    }
    
}
