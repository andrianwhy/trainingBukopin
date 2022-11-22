package day2;

import java.util.Iterator;
import java.util.Scanner;

public class Latihan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		
		System.out.print("Bilangan : ");
		int bil = scan.nextInt();
				
		for (int i = 1; i <= bil; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 1; i <= bil; i++) {
			System.out.print((i*2)+" ");
		}
		System.out.println();
		
		for (int i = 1; i <= bil; i++) {
			System.out.print((i*2-1)+" ");
		}
		scan.close();
	}

}
