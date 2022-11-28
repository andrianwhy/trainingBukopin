package day3;

public class StringOpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'x','s','i','s'};
		String s = new String(ch);
		System.out.println(s);
				
		String nama = "Xsis";
		
		//panjang string
		System.out.println(nama.length());
		
		//replace
		String alamat = "jl. pakubuwono 12";
		alamat=alamat.replace(".", " ");
		System.out.println(alamat);
		
		//substring, ambil beberapa karakter dari kalimat atau kata
		String bahasa = "JavaFramework";
		System.out.println(bahasa.substring(0,4));
		
		
		//split
		String warna = "merah putih biru";
		System.out.println(warna.split(" "));
		String[] aWarna = warna.split(" ");
		System.out.println(aWarna[1]);
		
	
	}

}
