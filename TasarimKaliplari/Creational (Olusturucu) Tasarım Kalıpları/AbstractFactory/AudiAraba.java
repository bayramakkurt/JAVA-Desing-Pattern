package AbstractFactory;

public class AudiAraba implements Araba{
	private String renk;
	private double fiyat;
	
	public AudiAraba(String renk, double fiyat) {
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
