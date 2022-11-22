package day2;

import java.util.Scanner;

public class Latihan4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		
		System.out.print("Bilangan : ");
		int bil = scan.nextInt();
				
		for (int i = 1; i <= bil; i++) {
			System.out.print(i);
			if (i<bil) {
				System.out.print(",");
			}
		}

		scan.close();
	}

}
