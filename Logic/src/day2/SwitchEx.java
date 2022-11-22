package day2;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lampu = "hijau";
		//merah -> berhenti
		//kuning -> bersedia
		//hijau -> jalan
		
		switch (lampu) {
		case "merah":
			System.out.println("berhenti !!!");
			break;
		case "kuning":
			System.out.println("bersedia");
			break;
		case "hijau":
			System.out.println("jalan");
			break;
		default:
			break;
		}
	}

}
