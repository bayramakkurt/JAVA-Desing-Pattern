package AbstractFactory;

public interface AbstractFabrika {
	Araba createAraba(String renk, double fiyat);

	Motor createMotor(String tur, double fiyat);
}
