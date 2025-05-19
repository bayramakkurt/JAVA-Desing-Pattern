package Facade;

public class SekilOlusturucu {
	private Sekil dikdortgen;
	private Sekil daire;
	private Sekil kare;
	
	public SekilOlusturucu() {
		dikdortgen = new Dikdortgen();
		daire = new Daire();
		kare = new Kare();
	}
	
	public void dikdortgenCiz() {
		dikdortgen.ciz();
	}

	public void daireCiz() {
		daire.ciz();
	}

	public void kareCiz() {
		kare.ciz();
	}

	

}
