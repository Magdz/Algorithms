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
        QUwithPath Q = new QUwithPath(10);
        Q.union(3, 4);
        Q.union(3, 8);
        Q.union(6, 5);
        Q.union(9, 4);
        Q.union(2, 1);
        System.out.println(Q.connected(8, 9));
        System.out.println(Q.connected(5, 4));
        Q.union(5, 0);
        Q.union(7, 2);
        Q.union(6, 1);
        Q.union(7, 3);
    }
    
}
