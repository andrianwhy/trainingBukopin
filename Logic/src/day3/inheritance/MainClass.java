package day3.inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//construct
		KendaraanDarat kd1 = new KendaraanDarat();
		KendaraanDarat kd2 = new KendaraanDarat();
		
		kd1.namaKendaraan = "truck";
		kd2.namaKendaraan = "Bus";
		
		System.out.println("Kendaraan pertama : "+ kd1.namaKendaraan);
		System.out.print("Bergerak ");
		kd1.bergerakDi();
		System.out.println();
		System.out.println("Kendaraan Kedua : "+kd2.namaKendaraan);
		System.out.print("Bergerak ");
		kd2.bergerakDi();
	}

}
