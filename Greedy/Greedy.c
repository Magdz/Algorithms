#include <stdio.h>
#include <stdlib.h>
#define N 11

typedef struct{
    int start;
    int end;
}Activity;

void Greedy(Activity Act, int index);

Activity Acts[N] = { {1,4},{3,5},{0,6},{5,7},{3,8},{5,9},{6,10},{8,11},{8,12},{2,13},{12,14} };
int taken[N];
int reject[N];

int main()
{
    int i;
    Greedy(Acts[0], 0);
    for(i = 0; i < N; ++i){
        if(taken[i] == 1)printf("Act(%d) ",i);
    }
    return 0;
}

void Greedy(Activity Act, int index){
    taken[index] = 1;
    int i;
    for(i = 0; i < N; ++i){
        if(Acts[i].start < Act.end) reject[i] = 1;
    }
    for(i = 0; i <= N; ++i){
        if(i == N)return;
        if(reject[i] != 1)break;
    }
    for(i = 0; i < N; ++i){
        if(taken[i] != 1 && reject[i] != 1){
            Greedy(Acts[i], i);
        }
    }
}
