package FactoryMethod;

public class Main {
	
	public static void main(String[] args) {
		Hayvan hayvan1 = HayvanFactory.hayvanOlustur("kedi");
		hayvan1.sesVer();

		Hayvan hayvan2 = HayvanFactory.hayvanOlustur("köpek");
		hayvan2.sesVer();

		Hayvan hayvan3 = HayvanFactory.hayvanOlustur("kaplumbağa");
		if (hayvan3 != null) {
			hayvan3.sesVer();
		}
	}

}
