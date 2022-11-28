package day3;

import java.util.Scanner;

public class Latihan2Andrian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,2,1,4,5,6,6,9,8};
		boolean status = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("cari bilangan ? ");
		int cari = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == cari) {
				status = true;		
			} 
		}
		
		if (status == true) {
			System.out.println("bilangan "+cari+" ada didalam array");
		} else {
			System.out.println("bilangan "+cari+" tidak ada didalam array");
		}
			
		
		sc.close();
	}

}
