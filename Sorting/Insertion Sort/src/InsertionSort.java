/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Array = {9,5,6,1,4,3,7,8,2};
        InsertionSort(Array);
        for(int i=0; i<Array.length; ++i){
            System.out.println(Array[i]);
        }
    }
    
    public static int[] InsertionSort(int[] Array){
        for(int j=1; j<Array.length; ++j){
            int key = Array[j];
            int i = j-1;
            while(i>=0 && Array[i]>key){
                Array[i+1] = Array[i];
                i--;
            }
            Array[i+1] = key;
        }
        return Array;
    }
}
