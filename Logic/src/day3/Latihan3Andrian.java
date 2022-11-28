package day3;

import java.util.Scanner;

public class Latihan3Andrian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nama : ");
		String nama = sc.nextLine();
		String[] aNama = nama.split(" ");		
		
		for (int i = 0; i < aNama.length; i++) {			
			System.out.println(aNama[i].substring(0,1).toUpperCase()+" "
					+ ""+aNama[i].substring(aNama[i].length()-1).toUpperCase());
		}
		
		sc.close();
	}

}
