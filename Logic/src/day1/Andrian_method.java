package day1;

public class Andrian_method {

	//deklar method
	static void cetak(String inNama, String inAlamat, int inUmur) {
		System.out.println("cetak Nama : "+ inNama);
		System.out.println("cetak Alamat : "+ inAlamat);
		System.out.println("cetak Umur : "+ inUmur);
	}
	
	static String cetak2() {
		
		
		return "SU-57";		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nama = "TheRock";
		String alamat = "California";
		int umur = 55;
		
		System.out.println("start");
		
		cetak(nama,alamat,umur);//panggil method		
		String result = cetak2();
		System.out.println(result);
		
		System.out.println("end");
	}

}
