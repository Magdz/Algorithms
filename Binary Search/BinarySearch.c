#include <stdio.h>

void main()
{
    int n,i,value,index,found=0;
    int low, middle, high;
    printf("Enter Number of elements: ");
    scanf("%d", &n);
    int x[n];
    printf("Enter Array elements: ");
    for(i=0; i<n; i++){
        scanf("%d", &x[i]);
    }
    printf("Enter a value to search for it: ");
    scanf("%d", &value);
    low=0;
    high=n-1;
    while(!found && low<high){
        middle = (low+high)/2;
        if(value == x[middle]){
            found=1;
            index=middle;
        }else if(value < x[middle]){
            high = middle -1;
        }else{
            low = middle +1;
        }
    }
    if(found){
        printf("Found");
    }else{
        printf("Not Found");
    }
}
