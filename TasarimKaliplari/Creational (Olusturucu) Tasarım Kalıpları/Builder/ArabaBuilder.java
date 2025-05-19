package Builder;

public class ArabaBuilder implements Builder {
	private Araba araba;
	
	public ArabaBuilder() {
		araba = new Araba();
	}
	
	@Override
	public void buildMarka() {
		araba.setMarka("Toyota");
	}
	@Override
	public void buildModel() {
		araba.setModel("Corolla");
	}
	@Override
	public void buildYil() {
		araba.setYil(2020);
	}
	@Override
	public void buildYukKapasitesi() {
		araba.setYuk_kapasitesi(500);
	}
	@Override
	public void buildMotorGucu() {
		araba.setMotor_gucu(150);
	}
	@Override
	public void buildRenk() {
		araba.setRenk("Mavi");
	}
	@Override
	public void buildYakitTuru() {
		araba.setYakit_turu("Benzin");
	}
	@Override
	public Araba build() {
		return araba;
	}
	

}
