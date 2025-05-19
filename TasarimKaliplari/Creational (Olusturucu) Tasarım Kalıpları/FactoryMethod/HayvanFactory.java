package FactoryMethod;

public class HayvanFactory {
	
	public static Hayvan hayvanOlustur(String hayvanTuru) {
		Hayvan hayvan = null;

		switch (hayvanTuru.toLowerCase()) {
		case "kedi":
			hayvan = new Kedi();
			break;
		case "köpek":
			hayvan = new Köpek();
			break;
		default:
			System.out.println("Geçersiz hayvan türü.");
		}

		return hayvan;
	}
}
