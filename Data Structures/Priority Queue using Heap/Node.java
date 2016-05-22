/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Node {
    private final int value;
    private final int priority;
    
    public Node(int value, int priority){
        this.value = value;
        this.priority = priority;
    }
    
    public int getValue(){
        return value;
    }
    
    public int getPriority(){
        return priority;
    }
}
