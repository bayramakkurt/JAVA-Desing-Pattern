package Builder;

public class Araba {
	private String marka;
	private String model;
	private int yil;
	private int yuk_kapasitesi;
	private int motor_gucu;
	private String renk;
	private String yakit_turu;
	
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}

	public int getYuk_kapasitesi() {
		return yuk_kapasitesi;
	}

	public void setYuk_kapasitesi(int yuk_kapasitesi) {
		this.yuk_kapasitesi = yuk_kapasitesi;
	}

	public int getMotor_gucu() {
		return motor_gucu;
	}

	public void setMotor_gucu(int motor_gucu) {
		this.motor_gucu = motor_gucu;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getYakit_turu() {
		return yakit_turu;
	}

	public void setYakit_turu(String yakit_turu) {
		this.yakit_turu = yakit_turu;
	}
	
	@Override
	public String toString() {
		return "Araba [marka=" + marka + ", model=" + model + ", yil=" + yil + ", yuk_kapasitesi=" + yuk_kapasitesi
				+ ", motor_gucu=" + motor_gucu + ", renk=" + renk + ", yakit_turu=" + yakit_turu + "]";
	}
	

}
