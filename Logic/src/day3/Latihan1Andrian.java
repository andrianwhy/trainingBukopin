package day3;

import java.util.Scanner;

public class Latihan1Andrian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		//loop input masakan
		System.out.print("Tentukan banyak menu masakan : ");
		int jml = sc.nextInt();
		sc.nextLine();//buffer
		String[] masakan = new String[jml];
		
		//cetak
		for (int i = 0; i < masakan.length; i++) {			
			System.out.print("masakan ke "+(i+1)+" : ");
			masakan[i] = sc.nextLine();
		}
		
		System.out.println("Macam masakan : ");
		for (int i = 0; i < masakan.length; i++) {			
			System.out.println((i+1)+". "+ masakan[i]);
		}
		
		sc.close();
	}

}
