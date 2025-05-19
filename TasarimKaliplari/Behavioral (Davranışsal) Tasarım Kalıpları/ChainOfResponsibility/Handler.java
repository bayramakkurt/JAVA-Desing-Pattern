package ChainOfResponsibility;

public abstract class Handler {
	protected Handler nextHandler;
	
	public void ileriHandler(Handler next) {
		this.nextHandler = next;
	}
	
	public abstract void handleRequest(String request);
}
