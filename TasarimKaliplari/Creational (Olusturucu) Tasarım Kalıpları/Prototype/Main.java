package Prototype;

public class Main {

	public static void main(String[] args) {
		Araba orijinal = new Araba("Toyota", "Corolla", 2023);
        Araba kopya = orijinal.clone();
        kopya.setMarka("Honda");
        
        System.out.println(orijinal.toString());
        System.out.println(kopya.toString());

	}

}
