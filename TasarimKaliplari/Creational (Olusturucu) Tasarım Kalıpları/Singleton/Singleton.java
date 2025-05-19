package Singleton;

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		System.out.println("Singleton nesnesi oluşturuldu.");
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}else {
			System.out.println("Zaten bir Singleton nesnesi mevcut.");
		}
		return instance;
	}

}
