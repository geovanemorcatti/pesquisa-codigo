#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
 setlocale(LC_ALL, "");
  clock_t t;
 int num, i, resultado = 0;

 printf("Digite um n�mero: ");
 scanf("%d", &num);
 t = clock(); //armazena tempo
 for (i = 2; i <= num / 2; i++) {
    if (num % i == 0) {
       resultado++;
       break;
    }
 }

 if (resultado == 0)
    printf("%d � um n�mero primo\n", num);
 else
    printf("%d n�o � um n�mero primo\n", num);
t = clock() - t; //tempo final - tempo inicial
printf("Tempo de execucao: %lf", ((double)t)/((CLOCKS_PER_SEC/1000)));
 return 0;
}
