/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

/**
 *
 * @author Ahmed
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashmap H=new Hashmap();
        int A=H.setHash("Ahmed Magdy");
        System.out.println(A);
        System.out.println(H.getData(A));
        A=H.setHash("John Smith");
        System.out.println(A);
        System.out.println(H.getData(A));
        A=H.setHash("Lisa Smith");
        System.out.println(A);
        System.out.println(H.getData(A));
        H.setHash("Sam Doe");
        H.setHash("Sandra Dee");
        H.setHash("Ted Baker");
        H.setHash("Hello World");
        
        System.out.println("");
        H.Print();
    }
    
}
