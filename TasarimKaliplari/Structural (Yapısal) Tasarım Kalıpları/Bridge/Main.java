package Bridge;

public class Main {

	public static void main(String[] args) {
		TV samsungTV = new SamsungTV();
		LogitechUzaktanKontrol localRemote = new LogitechUzaktanKontrol(samsungTV);
		localRemote.KanalDeğiştir(5);

	}

}
