package day1;

import java.util.Scanner;

public class Andrian_id {

	public static void main(String[] args) {
		
		Scanner baca = new Scanner(System.in);
		
		String Nama, Alamat;
		int Umur;
		
		System.out.print("masukkan nama : ");
		Nama = baca.nextLine();
		
		System.out.print("masukkan alamat : ");
		Alamat = baca.nextLine();
		
		System.out.print("masukkan umur : ");
		Umur = baca.nextInt();
				
		System.out.println("data input nama : "+Nama+" alamat : "+Alamat+" umur : "+Umur+" th");
		
		baca.close();
		
	}

}
