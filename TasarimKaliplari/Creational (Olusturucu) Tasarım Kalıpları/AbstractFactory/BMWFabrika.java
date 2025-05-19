package AbstractFactory;

public class BMWFabrika implements AbstractFabrika {

	@Override
	public Araba createAraba(String renk, double fiyat) {
		return new BMWAraba(renk, fiyat);
	}

	@Override
	public Motor createMotor(String tur, double fiyat) {
		return new BMWMotor(tur, fiyat);
	}
}
