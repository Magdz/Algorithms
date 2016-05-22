/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class HeapSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Array = {9,5,6,1,4,3,7,8,2};
        for(int i=Array.length/2; i>=0; --i){
            Heapify(Array,i);
        }
        for(int i=0; i<Array.length; ++i){
            System.out.println(Array[i]);
        }
    }
    
    public static int[] Heapify(int[] Array,int i){
        int l = (i+1)*2-1;
        int r = l+1;
        int largest=i;
        if(l<Array.length && Array[l] < Array[i])
            largest = l;
        else
            largest = i;
        if(r<Array.length && Array[r] < Array[largest])
            largest = r;
        if(largest != i){
            Swap(Array,i,largest);
            Heapify(Array,largest);
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
