package day4.abstractEx;

public abstract class Crud {
	int timeOut = 100;
	
	abstract void buatKoneksi();
	abstract void modulRepository();
	abstract void modulServices();
}
