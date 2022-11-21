package day1;

import java.util.Scanner;

public class Andrian_method2 {

	static void cetak(int a, int b, int hasil) {
		System.out.println("jumlah "+a+" + "+b+" adalah "+hasil);
	}
	
	static Integer hitung(int inA, int inB) {
		return inA + inB;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner baca = new Scanner(System.in);
		int a,b, hasil;
		
		System.out.print("masukkan nilai 1 : ");
		a = baca.nextInt();
		System.out.print("masukkan nilai 2 : ");
		b = baca.nextInt();
		
		System.out.println("nilai 1 = "+a);
		System.out.println("nilai 2 = "+b);
		
		hasil = hitung(a, b);
		cetak(a, b, hasil);
		
	}

}
