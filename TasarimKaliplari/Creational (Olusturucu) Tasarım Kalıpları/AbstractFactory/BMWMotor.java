package AbstractFactory;

public class BMWMotor implements Motor {
	private String tur;
	private double fiyat;

	public BMWMotor(String tur, double fiyat) {
		this.tur = tur;
		this.fiyat = fiyat;
	}

	@Override
	public String getTur() {
		return tur;
	}

	@Override
	public double getFiyat() {
		return fiyat;
	}

}
