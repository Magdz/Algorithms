#include <time.h>
#include <pthread.h>
#include <semaphore.h>
#include <stdio.h>
#include <stdlib.h>

#define NUM_Loop 10

pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;

void* print_letter(void *arg){
    char letter = *(char *)arg;
    int i;
    for(i = 0; i < NUM_Loop; i++){
        pthread_mutex_lock(&mutex);

        printf(" %c", letter);

        pthread_mutex_unlock(&mutex);
    }
    pthread_exit(NULL);
}

int main(void)
{
    pthread_t idA, idB, idC;
    char letterA = 'A';
    char letterB = 'B';
    char letterC = 'C';

    pthread_create(&idA, NULL, print_letter, &letterA);
    pthread_create(&idB, NULL, print_letter, &letterB);
    pthread_create(&idC, NULL, print_letter, &letterC);

    pthread_join(idA, NULL);
    pthread_join(idB, NULL);
    pthread_join(idC, NULL);

}


