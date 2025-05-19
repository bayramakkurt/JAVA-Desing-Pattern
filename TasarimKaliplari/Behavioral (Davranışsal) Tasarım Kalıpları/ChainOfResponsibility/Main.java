package ChainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		Handler MüşteriTemsilcisi = new MüşteriTemsilcisi();
		Handler MüdürYardımcısı = new MüdürYardımcısı();
		Handler Müdür = new Müdür();
		
		MüşteriTemsilcisi.ileriHandler(MüdürYardımcısı);
		MüdürYardımcısı.ileriHandler(Müdür);
		
		MüşteriTemsilcisi.handleRequest("Müdür");
		System.out.println("==========================================");
		MüşteriTemsilcisi.handleRequest("Müdür Yardımcısı");
		System.out.println("==========================================");
		MüşteriTemsilcisi.handleRequest("Müşteri Temsilcisi");
		System.out.println("==========================================");
		MüşteriTemsilcisi.handleRequest("Başka bir talep");

	}

}
