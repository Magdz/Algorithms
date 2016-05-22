/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    static int[] Array = {9,5,6,1,4,3,7,8,2};

    public static void main(String[] args) {
        QuickSort(Array,0,Array.length-1);
        for(int i=0; i<Array.length; ++i){
            System.out.println(Array[i]);
        }
    }
    
    public static void QuickSort(int[] Array, int start, int end){
        if(start < end){
            int Index = Partition(Array,start,end);
            QuickSort(Array, start, Index-1);
            QuickSort(Array, Index, end);
        }
    }
    
    public static int Partition(int[] Array, int start, int end){
        int pivot = Array[end];
        int Index = start;
        for(int i=start; i<end; ++i){
            if(Array[i] <= pivot){
                Swap(Array,i,Index);
                Index++;
            }
        }
        Swap(Array,Index,end);
        return Index;
    }
    
    public static void Swap(int[]Array, int i, int j){
        int temp = Array[i];
        Array[i] = Array[j];
        Array[j] = temp;
    }
}
