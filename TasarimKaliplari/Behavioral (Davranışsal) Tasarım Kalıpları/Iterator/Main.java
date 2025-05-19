package Iterator;

public class Main {

	public static void main(String[] args) {
		KanalListesi kanalListesi = new KanalListesi();
		KanalIterator iterator = kanalListesi.iterator();
		
		while (iterator.hasNext()) {
			Kanal kanal = iterator.next();
			System.out.println(kanal.getKanalAdi());
		}

	}

}
