package ChainOfResponsibility;

public class Müdür extends Handler {
	@Override
	public void handleRequest(String request) {
		if (request.equals("Müdür")) {
			System.out.println("Müdür talebi işliyor.");
		} else {
			System.out.println("Talep işlenemedi.");
		}
	}

}
