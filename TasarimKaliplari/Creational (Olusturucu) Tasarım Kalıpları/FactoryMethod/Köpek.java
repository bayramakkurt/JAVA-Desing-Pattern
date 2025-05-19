package FactoryMethod;

public class Köpek implements Hayvan {
	public Köpek() {
		System.out.println("Köpek oluşturuldu.");
	}

	@Override
	public void sesVer() {
		System.out.println("Hav hav");
	}

}
