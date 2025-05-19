package Prototype;

public class Araba implements Cloneable {
	private String marka;
	private String model;
	private int yil;

	public Araba(String marka, String model, int yil) {
		this.marka = marka;
		this.model = model;
		this.yil = yil;
	}

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

	@Override
	protected Araba clone() {
		 try {
	            return (Araba) super.clone();
	        } catch (CloneNotSupportedException e) {
	            throw new RuntimeException("Klonlama başarısız!", e);
	        }
	}
	
	@Override
	public String toString() {
		return "Araba [marka=" + marka + ", model=" + model + ", yil=" + yil + "]";
	}

}
