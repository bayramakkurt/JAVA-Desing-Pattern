package FactoryMethod;

public class Kedi implements Hayvan {
	public Kedi() {
		System.out.println("Kedi oluşturuldu.");
	}

	@Override
	public void sesVer() {
		System.out.println("Miyav");
	}

}
