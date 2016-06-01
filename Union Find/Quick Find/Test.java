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

    public static void main(String[] args) {
        QuickFind Q = new QuickFind(10);
        Q.union(0, 5);
        System.out.println("0 and 5 are in one set");
        Q.union(9, 3);
        System.out.println("9 and 3 are in one set");
        System.out.println("Is 9 and 5 connected? " + Q.connected(9, 5));
        Q.union(9, 5);
        System.out.println("9 and 5 are in one set");
        System.out.println("Is 9 and 5 connected? " + Q.connected(9, 5));
        Q.union(6, 8);
        System.out.println("6 and 8 are in one set");
    }
    
}
