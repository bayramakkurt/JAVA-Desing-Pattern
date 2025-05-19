package Observer;

import java.util.*;

public abstract class Konu {
	private List<Observer> gözlemciler = new ArrayList<>();
	
	public void gözlemciEkle(Observer gözlemci) {
		gözlemciler.add(gözlemci);
	}

	public void gözlemciKaldır(Observer gözlemci) {
		gözlemciler.remove(gözlemci);
	}

	public void gözlemcileriBilgilendir(String mesaj) {
		for (Observer gözlemci : gözlemciler) {
			gözlemci.guncelle(mesaj);
		}
	}
	
}
