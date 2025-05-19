package ChainOfResponsibility;

public class MüşteriTemsilcisi extends Handler {
	
	@Override
	public void handleRequest(String request) {
		if (request.equals("Müşteri Temsilcisi")) {
			System.out.println("Müşteri Temsilcisi talebi işliyor.");
		} else if (nextHandler != null) {
			System.out.println("Müşteri Temsilcisi talebi işleyemedi, üstüne yönlendiriliyor.");
			nextHandler.handleRequest(request);
		}
	}
}
