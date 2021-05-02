#include <stdio.h>
#include <stdlib.h>

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main()
{
    clock_t t;
    int num, i, j, cont=0, resp;

    printf("digite um numero inteiro positivo:\n");
    scanf("%i", &num);
    t = clock(); //armazena tempo
    for(i=1;i<10000;i++)
    {
        for(j=1;j<10000;j++)
        {
            if(i%j==0)
                cont++;
            if(cont==2)
            {
                resp=num/i;
                printf("%i |%i=%i", num, i, resp);
            }
        }

        if(resp==1)
            break;
    }
    t = clock() - t; //tempo final - tempo inicial
    printf("Tempo de execucao: %lf", ((double)t)/((CLOCKS_PER_SEC/1000)));
    return 0;
}
