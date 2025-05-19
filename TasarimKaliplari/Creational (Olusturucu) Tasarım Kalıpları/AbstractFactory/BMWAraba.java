package AbstractFactory;

public class BMWAraba implements Araba{
	String renk;
	double fiyat;
	
	public BMWAraba(String renk, double fiyat) {
		this.renk = renk;
		this.fiyat = fiyat;
	}
	
	@Override
	public String getRenk() {
		return renk;
	}
	@Override
	public double getFiyat() {
		return fiyat;
	}

}
