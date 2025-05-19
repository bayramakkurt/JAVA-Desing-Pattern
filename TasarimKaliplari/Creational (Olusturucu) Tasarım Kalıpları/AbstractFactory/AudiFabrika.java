package AbstractFactory;

public class AudiFabrika implements AbstractFabrika {
	
	@Override
	public Araba createAraba(String renk, double fiyat) {
		return new AudiAraba(renk, fiyat);
	}

	@Override
	public Motor createMotor(String tur, double fiyat) {
		return new AudiMotor(tur, fiyat);
	}

}
