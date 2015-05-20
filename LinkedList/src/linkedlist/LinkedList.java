
package linkedlist;

/**
 *
 * @author Magdz
 */
public class LinkedList {
    
    private Node head;
    private Node tail;
    private int length;
    
    public LinkedList(){
        head=null;
        tail=null;
        length=0;
    }
    
    public int head(){
        return head.data;
    }
    
    public int tail(){
        return tail.data;
    }
    
    public void addHead(int data){
        Node New_Node=new Node(data);
        if(head==null)head=tail=New_Node;
        else{
            Node Temp=head;
            head=New_Node;
            head.next=Temp;
        }
        ++length;
    }
    
    public void addTail(int data){
        Node New_Node=new Node(data);
        if(tail==null)head=tail=New_Node;
        else{
            tail.next=New_Node;
            tail=New_Node;
        }
        ++length;
    }
    
    public void insert(int data,int index){
        if(index>length || index<0)return;
        if(index==0){
            addHead(data);
            return;
        }
        if(index==length){
            addTail(data);
            return;
        }
        Node New_Node=new Node(data);
        Node Temp=head;
        for(int i=0;i<index-1;++i){
            Temp=Temp.next;
        }
        New_Node.next=Temp.next;
        Temp.next=New_Node;
        ++length;
    }
    
    public boolean search(int data){
        Node Temp=head;
        while(Temp!=null){
            if(Temp.data==data)return true;
            Temp=Temp.next;
        }
        return false;
    }
    
    
    public void removeHead(){
        head=head.next;
        if(head==null)tail=null;
        --length;
    }
    
    public void removeTail(){
        Node Temp=head;
        while(Temp.next!=tail)Temp=Temp.next;
        tail=Temp;
        tail.next=null;
        if(tail==null)head=null;
        --length;
    }
    
    public void delete(int index){
        if(index>=length || index<0)return;
        Node Temp=head;
        for(int i=0;i<index;++i){
            Temp=Temp.next;
        }
        Temp.next=Temp.next.next;
        --length;
    }
    
    public int size(){
        return length;
    }
    
    public boolean isEmpty(){
        if(head==null)return true;
        return false;
    }
    
    public void print(){
        Node Current=head;
        for(int i=0;i<length && head!=null ;++i){
            System.out.print(Current.data+" ");
            Current=Current.next;
        }
        System.out.println("");
    }
}
