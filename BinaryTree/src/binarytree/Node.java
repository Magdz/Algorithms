/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Ahmed
 */
public class Node {
    
    public int data;
    public Node left;
    public Node right;
    
    public Node(int data){
        this.data=data;
        left=right=null;
    }
    
}
