#include <stdio.h>
#include <stdlib.h>

void MergeSort(int *Array,int left,int right);
void Merge(int *Array,int left,int mid,int right);

int main()
{
    int Array[] = {9,5,7,2,3,8,1,6,4};
    MergeSort(&Array,0,8);
    int i;
    for(i = 0; i < 9; ++i)
        printf("%d,",Array[i]);
    return 0;
}

void MergeSort(int *Array,int left,int right){
    if(left >= right)return;
    int mid = (left + right)/2;
    MergeSort(Array, left, mid);
    MergeSort(Array, mid+1, right);
    Merge(Array, left, mid, right);
}

void Merge(int *Array,int left,int mid,int right){
    int length = right - left;
    int A_Left[mid+1-left];
    int A_Right[right-mid];
    int i,j;

    for(i = left, j = 0; i <= mid; ++i, ++j){
        A_Left[j] = Array[i];
    }
    for(i = mid+1, j = 0; i <= right; ++i, ++j){
        A_Right[j] = Array[i];
    }

    int L_Count = 0, R_Count = 0;
    for(i = left; i <= right; i++){
        if(L_Count <= mid && R_Count <= right){
            if(A_Left[L_Count] < A_Right[R_Count]){
                Array[i] = A_Left[L_Count];
                L_Count++;
            }else{
                Array[i] = A_Right[R_Count];
                R_Count++;
            }
        }else if(L_Count <= mid){
            Array[i] = A_Left[L_Count];
            L_Count++;
        }else{
            Array[i] = A_Right[R_Count];
            R_Count++;
        }
    }

}
