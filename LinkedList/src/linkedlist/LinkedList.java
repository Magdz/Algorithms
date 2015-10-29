
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
        return head.getData();
    }
    
    public int tail(){
        return tail.getData();
    }
    
    public void addHead(int data){
        Node New_Node=new Node(data);
        if(head==null)head=tail=New_Node;
        else{
            Node Temp=head;
            head=New_Node;
            head.setNext(Temp);
        }
        ++length;
    }
    
    public void addTail(int data){
        Node New_Node=new Node(data);
        if(tail==null)head=tail=New_Node;
        else{
            tail.setNext(New_Node);
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
            Temp=Temp.getNext();
        }
        New_Node.setNext(Temp.getNext());
        Temp.setNext(New_Node);
        ++length;
    }
    
    public boolean search(int data){
        Node Temp=head;
        while(Temp!=null){
            if(Temp.getData()==data)return true;
            Temp=Temp.getNext();
        }
        return false;
    }
    
    
    public void removeHead(){
        head=head.getNext();
        if(head==null)tail=null;
        --length;
    }
    
    public void removeTail(){
        Node Temp=head;
        while(Temp.getNext()!=tail)Temp=Temp.getNext();
        tail=Temp;
        tail.setNext(null);
        if(tail==null)head=null;
        --length;
    }
    
    public void delete(int index){
        if(index>=length || index<0)return;
        Node Temp=head;
        for(int i=0;i<index;++i){
            Temp=Temp.getNext();
        }
        Temp.setNext(Temp.getNext().getNext());
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
            System.out.print(Current.getData()+" ");
            Current=Current.getNext();
        }
        System.out.println("");
    }
    
    public Node getIndex(int index){
        Node Temp = head;
        while(Temp!=null && index>0){
            --index;
            Temp=Temp.getNext();
        }
        return Temp;
    }
}
