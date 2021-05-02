package matrizes;

import java.util.Scanner;

public class MatrizMultiplicacao {
	public static void main (String args[]){

		Scanner t = new Scanner (System.in);
		int a[][]; a = new int[2][2];
		int b[][]; b = new int[2][2];
		int c[][]; c = new int[2][2];
		long start = System.currentTimeMillis();
		for (int i= 0; i < 2; i++){
				System.out.println();
			for (int j= 0; j <2; j++){
				System.out.print ("Digite o elemento "+i+ " " +j+" da matriz a: ");
					a[i][j] = t.nextInt();
			}
		}

		for (int i= 0; i <2; i++){
				System.out.println();
			for (int j= 0; j <2; j++){
				System.out.print ("Digite o elemento "+i+ " " +j+ " da matriz b: ");
					b[i][j] = t.nextInt();		
			}
		}
		for (int i=0; i < a[i][i]; i++){
				System.out.println();
			for (int j= 0; j < b[j][j]; j++){
				
				for (int x= 0; x < a[j][j]; x++){
					c[i][j] += a[i][x] * b[x][j];
						System.out.print(c[i][j]);
						System.out.print(" ");}
			}
		}
		long elapsed = System.currentTimeMillis() - start;
		System.out.println("tempo"+elapsed );
	}
	

	  

}
