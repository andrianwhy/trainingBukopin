package day3;

public class MainClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		
		//construct class
		Ikan ikan1 = new Ikan();//laut
		Ikan ikan2 = new Ikan();//tawar
		
		ikan1.nama = "Tongkol";
		ikan1.habitat = "air laut";
		
		ikan2.nama = "lele";
		ikan2.habitat = "air tawar";
		
		System.out.println("nama ikan : "+ikan1.nama);
		System.out.println("nama habitat : "+ikan1.habitat);
		System.out.print("bernafas ");
		ikan1.bernafas();
		System.out.println();
		System.out.println("nama ikan : "+ikan2.nama);
		System.out.println("nama habitat : "+ikan2.habitat);
		
		System.out.println("End");
	}

}
