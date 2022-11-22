package day2;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int umur = 24;
		String point = "A";
		
		//if single body
		if(true)
			System.out.println("if sebaris 1");
			System.out.println("if sebaris 2");
		
		
		//jika point A atau B cetak high point
		if (point.equals("A") || point.equals("B")) {
			System.out.println("High point");
		}
		
		//jika point A cetak lulusan terbaik
		if (point.equals("A")) {
			System.out.println("Lulusan Terbaik");
		}
		
		System.out.println("start");
		//jika umur dibawah 25 maka cetak belum cukup umur
		if (umur<=25) {
			System.out.println("belum cukup umur");
		} else {
			System.out.println("sudah cukup umur");
		}
		System.out.println("end");
		
	}

}
