package Iterator;

public class KanalListesiIterator implements KanalIterator {
	private Kanal[] kanallar;
	private int pozisyon = 0;

	public KanalListesiIterator(Kanal[] kanallar) {
		this.kanallar = kanallar;
	}

	@Override
	public boolean hasNext() {
		return pozisyon < kanallar.length;
	}

	@Override
	public Kanal next() {
		return kanallar[pozisyon++];
	}

}
