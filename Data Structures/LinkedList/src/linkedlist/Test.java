
package linkedlist;

/**
 *
 * @author Magdz
 */
public class Test {
    
    public static void main(String[] args) {
        LinkedList L=new LinkedList();
        L.addHead(0);
        System.out.println("Length is="+L.size());
        L.addHead(2);
        L.addTail(9);
        L.insert(6, 3);
        L.print();
        System.out.println("Length is="+L.size());
        L.delete(0);
        System.out.println(L.head());
        System.out.println(L.tail());
        L.removeTail();
        L.removeHead();
        L.print();
        if(L.search(7))System.out.println("Found");
        else System.out.println("Not Found");
        System.out.println("Length is="+L.size());
        L.addTail(3);
        if(L.search(3))System.out.println("Found");
        else System.out.println("Not Found");
        while(!L.isEmpty()){
            L.removeHead();
        }
        System.out.println("Length is="+L.size());
        L.print();
    }
}
