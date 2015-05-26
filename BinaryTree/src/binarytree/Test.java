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
public class Test {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree T=new BinaryTree();
        T.addroot(8);
        T.addleft(T.root, 4);
        T.addright(T.root, 16);
        T.addleft(T.root.left, 2);
        T.addright(T.root.left, 6);
        T.addleft(T.root.right, 7);
        T.addright(T.root.right, 20);
        T.insert(10);T.insert(50);T.insert(0);
        if(T.Search(10))System.out.println("Found");
        else System.out.println("Not Found");
        System.out.println("Postorder: ");
        T.traversePostorder();
        System.out.println("");
        System.out.println("Preorder: ");
        T.traversePreorder();
        System.out.println("");
        System.out.println("Inorder: ");
        T.traverseInorder();
        System.out.println("");
        T.traverseBreadthFirst();
        System.out.println("");
        T.traverseDepthFirst();
    }   
}
