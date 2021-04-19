#include <stdio.h>
#include <stdlib.h>

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num, i, j, cont=0, resp;

    printf("digite um numero inteiro positivo:\n");
    scanf("%i", &num);

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

    return 0;
}
