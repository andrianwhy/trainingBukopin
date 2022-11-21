package day1;

import java.util.Scanner;

public class Andrian_readKB {
	
	
	public static void main(String[] args) {
		//buat var baca
		Scanner baca = new Scanner(System.in);		
		System.out.print("Masukkan nama : ");
		
		String nama = baca.nextLine(); //input dari keyboard
		
		System.out.println("Nama diinput : "+nama);		
		baca.close();			
	}
}
