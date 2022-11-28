package day3;

public class latihan4Andrian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		
		Kendaraan motor = new Kendaraan();
		Kendaraan mobil = new Kendaraan();
		
		motor.model = "naked bike";
		motor.tahun = "2013";
		
		mobil.model = "sedan";
		mobil.tahun = "2020";
		
		System.out.println("model kendaraan : "+motor.model);
		System.out.println("tahun kendaraan : "+motor.tahun);
		System.out.print("berjalan ");
		motor.bbm();
		System.out.println();
		System.out.println("model kendaraan : "+mobil.model);
		System.out.println("tahun kendaraan : "+mobil.tahun);
		
		System.out.println("end");
	}

}
