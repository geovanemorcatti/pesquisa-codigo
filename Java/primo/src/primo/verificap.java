package primo;

import java.util.Scanner;

public class verificap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new  Scanner(System.in); //Declarando o scanner, e falando que � do tipo in
		 System.out.println("Digite um n�mero: ");
		 int numeroaverificar = scn.nextInt(); // perceba que eu colokei int,  porque numero decimal n�o � considerado primo
		 boolean primo = true;
		 
		 if (numeroaverificar==0|| numeroaverificar==1)
		 primo = false;
		 
		 else {
		 for (int i = 2; i < numeroaverificar; i++) {
		 if ((numeroaverificar % i) == 0){ //divide o n�mero por i, e ve se o  resto � 0.
		 primo = false; //se for, quer dizer que ele n�o � primo (10/2 = 5,  resto 0 // 7/2 = 3, resto 1)
		 break; //para de verificar (para evitar tempo)
		 }
		 }
		 }
		 
		 if (primo)  //� a mesma coisa de (if primo == true) --> Se o boolean  retornar true
		 System.out.println("O Numero " + numeroaverificar + " � primo!");
		 else  //se ele n�o voltou como true:
		 System.out.println("N�o � primo!");
	}

}
