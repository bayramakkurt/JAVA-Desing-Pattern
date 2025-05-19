package Template;

public class Main {
	public static void main(String[] args) {
		Oyun oyun = new Futbol();
		oyun.oyna();

		System.out.println();

		Oyun oyun2 = new Basketbol();
		oyun2.oyna();
	}

}
