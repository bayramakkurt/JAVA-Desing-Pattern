package AbstractFactory;

public class Main {

	public static void main(String[] args) {
		
		AbstractFabrika audiFabrika = new AudiFabrika();
		AbstractFabrika bmwFabrika = new BMWFabrika();
		
		Araba audiAraba = audiFabrika.createAraba("Kırmızı", 50000);
		Motor audiMotor = audiFabrika.createMotor("Dizel", 20000);
		
		Araba bmwAraba = bmwFabrika.createAraba("Mavi", 60000);
		Motor bmwMotor = bmwFabrika.createMotor("Benzin", 25000);
		

	}

}
