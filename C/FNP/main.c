#include <stdio.h>
#include <stdlib.h>

int main ( ) {
	unsigned long long int a = 0;
	unsigned long long int n;
	system ( "title DECOMPONDO EM FATORES PRIMOS" );
	system ( "cls" );
	system ( "Color 90" );
	Janela5 ( );
	textcolor ( LIGHTRED );
	gotoxy ( 29, 3 );
	printf ( "DECOMPONDO EM FATORES PRIMOS" );
	textcolor ( LIGHTBLUE );
	gotoxy ( 25, 5 );
	printf ( "Digite um n�mero: " );
	textcolor ( BLACK );
	scanf ( "%llu", &n );
	textcolor ( LIGHTBLUE );
	gotoxy ( 25, 7 );
	printf ( "N�mero digitado: ==> " );
	textcolor ( BLACK );
	printf ( "%llu", n );
	a = fatorando ( n );
	if ( a == n ) {
		textcolor ( LIGHTBLUE );
		gotoxy ( 25, 11 );
		printf ( "O N�mero " );
		textcolor ( BLACK );
		printf ( "%llu ", a );
		textcolor ( LIGHTBLUE );
		printf ( "� primo  " );
	}
	textcolor ( LIGHTRED );
	gotoxy ( 36, 23 );
	printf ( "MUITO OBRIGADO" );
	getche ( );
	exit ( 0 );
}
