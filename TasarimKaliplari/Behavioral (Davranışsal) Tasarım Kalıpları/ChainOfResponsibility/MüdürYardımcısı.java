package ChainOfResponsibility;

public class MüdürYardımcısı extends Handler{
	@Override
	public void handleRequest(String request) {
		if (request.equals("Müdür Yardımcısı")) {
			System.out.println("Müdür Yardımcısı talebi işliyor.");
		} else if (nextHandler != null) {
			System.out.println("Müdür Yardımcısı talebi işleyemedi, üstüne yönlendiriliyor.");
			nextHandler.handleRequest(request);
		}
	}
}
