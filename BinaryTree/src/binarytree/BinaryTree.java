package binarytree;

import java.util.*;

/**
 *
 * @author Ahmed
 */
public class BinaryTree {

    public Node root;
    private int NumberofNodes;
    
    public BinaryTree(){
        root=null;
        NumberofNodes=0;
    }
    
    public void addroot(int data){
        Node New_Node=new Node(data);
        if(root==null)root=New_Node;
    }
    
    public void addleft(Node n,int data){
        Node New_Node=new Node(data);
        if(n==root && root==null){
            root=New_Node;
            NumberofNodes++;
            return;
        }
        if(n!=null && n.left==null){
            n.left=New_Node;
            NumberofNodes++;
        }
    }
    
    public void addright(Node n,int data){
        Node New_Node=new Node(data);
        if(n==root && root==null){root=New_Node;
            NumberofNodes++;
            return;
        }
        if(n!=null && n.right==null){
            n.right=New_Node;
            NumberofNodes++;
        }
    }
    
    // Tree Traversals //
    
    public void traversePreorder(){
        if(root==null) return;
        System.out.print(root.data+" ");
        BinaryTree Left=LeftTree(root);
        Left.traversePreorder();
        BinaryTree Right=RightTree(root);
        Right.traversePreorder();
    }
    
    public void traversePostorder(){
        if(root==null) return;
        BinaryTree Left=LeftTree(root);
        Left.traversePreorder();
        BinaryTree Right=RightTree(root);
        Right.traversePreorder();
        System.out.print(root.data+" ");
    }
    
    public void traverseInorder(){
        if(root==null) return;
        BinaryTree Left=LeftTree(root);
        Left.traversePreorder();
        System.out.print(root.data+" ");
        BinaryTree Right=RightTree(root);
        Right.traversePreorder();
    }
    
    // Binary Search Tree Functions //
    
    public void insert(int data){
        Node New_Node=new Node(data);
        if(root==null){
            root=New_Node;
            ++NumberofNodes;
            return;
        }
        if(data<root.data){
            if(root.left==null) root.left=New_Node;
            else{
                BinaryTree Left=LeftTree(root);
                Left.insert(data);
            }
            ++NumberofNodes;
        }else{
            if(root.right==null) root.right=New_Node;
            else{
                BinaryTree Right=RightTree(root);
                Right.insert(data);
            }
            ++NumberofNodes;
        }
    }
    
    public boolean Search(int data){
        if(root==null)return false;
        if(root.data==data)return true;
        else if(data<root.data){
            BinaryTree Left=LeftTree(root);
            return Left.Search(data);
        }
        else{
            BinaryTree Right=RightTree(root);
            return Right.Search(data);
        }
    }
    
    public void traverseBreadthFirst(){
        if(root==null) return;
        Queue q=new LinkedList();
        q.add(root);
        System.out.print("BST: ");
        while(!q.isEmpty()){
             Node N=(Node) q.poll();
             System.out.print(N.data+" ");
             if(N.left!=null) q.add(N.left);
             if(N.right!=null) q.add(N.right);
        }
    }
    
    public void traverseDepthFirst(){
        if(root==null) return;
        Stack s=new Stack();
        s.push(root);
        System.out.print("DST: ");
        while(!s.isEmpty()){
            Node N=(Node) s.pop();
            System.out.print(N.data+" ");
            if(N.right!=null) s.push(N.right);
            if(N.left!=null) s.push(N.left);
        }
    }
    
    public int Leafs(){
        if(root.left==null && root.right==null) return 1;
        BinaryTree Left=LeftTree(root);
        BinaryTree Right=RightTree(root);
        return Left.Leafs()+Right.Leafs();
    }
    
    public int numberofNodes(){
        return NumberofNodes;
    }
    
    private BinaryTree LeftTree(Node root){
        BinaryTree Left=new BinaryTree();
        Left.root=root.left;
        return Left;
    }
    
    private BinaryTree RightTree(Node root){
        BinaryTree Right=new BinaryTree();
        Right.root=root.right;
        return Right;
    }
}
