package day2;

import java.util.Scanner;

public class Latihan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nama : ");
		String nama = scan.nextLine();
		
		System.out.print("Cetak : ");
		int ulang = scan.nextInt();
				
		for (int i = 1; i <= ulang; i++) {
			System.out.println(i+"."+nama);
		}
		scan.close();
	}

}
