package day3;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nama = new String[5];
		
		//isi
//		nama[0] = "Iwan";
		
		//cetak
		for (int i = 0; i < nama.length; i++) {
			nama[i] = "isi di "+i;
			System.out.println(nama[i]);
		}
		
		System.out.println(nama);
	}

}
