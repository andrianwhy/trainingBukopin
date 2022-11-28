package day3.inheritance;

public class MainClassTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HewanQurban hq = new HewanQurban();
		HewanQurban hq1 = new HewanQurban();
		
		hq.jenisHewan = "Sapi";
		hq1.jenisHewan = "Kambing";
		
		hq.Umur = "3 tahun";
		hq1.Umur = "2 tahun";
		
		System.out.println("Jenis Hewan : "+hq.jenisHewan);
		System.out.println("Umur Hewan : "+hq.Umur);
		System.out.print("memiliki karakter ");
		hq.karakter();
		System.out.println();
		
		System.out.println("Jenis Hewan : "+hq1.jenisHewan);
		System.out.println("Umur Hewan : "+hq1.Umur);
	}

}
