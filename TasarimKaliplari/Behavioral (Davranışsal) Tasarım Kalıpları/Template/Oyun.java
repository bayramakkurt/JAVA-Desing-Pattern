package Template;

public abstract class Oyun {
	abstract void oyunKur();
	abstract void oyunBaşlat();
	abstract void oyunBitir();
	
	//Kalıp olan kısım burası
	public final void oyna() {
		oyunKur();
		
		oyunBaşlat();
		
		oyunBitir();
	}
}
