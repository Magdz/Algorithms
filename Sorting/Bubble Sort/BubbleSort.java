/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Array = {9,5,6,1,4,3,7,8,2};
        BubbleSort(Array);
        for(int i=0; i<Array.length; ++i){
            System.out.println(Array[i]);
        }
    }
    
    public static int[] BubbleSort(int[] Array){
        for(int i=0; i<Array.length; ++i){
            for(int j=Array.length-1; j>i; --j){
                if(Array[j]<Array[j-1])Array = Swap(Array,j,j-1);
            }
        }
        return Array;
    }
    
    public static int[] Swap(int[]Array, int i, int j){
        int temp = Array[i];
        Array[i] = Array[j];
        Array[j] = temp;
        return Array;
    }
}
