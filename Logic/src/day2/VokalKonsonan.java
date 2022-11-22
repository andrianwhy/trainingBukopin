package day2;

import java.util.Scanner;

public class VokalKonsonan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String hasil;
				
		System.out.print("Huruf ? ");
		String huruf = sc.nextLine();
		huruf = huruf.toUpperCase();
		
		//If condition
//		if (huruf.equals("A") || huruf.equals("O") || huruf.equals("E") || huruf.equals("I") || huruf.equals("U")) {
//			hasil = "Vokal";
//		} else {
//			hasil = "Konsonan";
//		}
		
		//switch condition
		switch (huruf) {
		case "A":
		case "I":
		case "U":
		case "E":
		case "O":
			hasil = "Vokal";
			break;
		default:
			hasil = "Konsonan";
			break;
		}				
		
		//tampilkan
		System.out.println("Huruf "+huruf+" adalah "+hasil);
		sc.close();
	}		
}
