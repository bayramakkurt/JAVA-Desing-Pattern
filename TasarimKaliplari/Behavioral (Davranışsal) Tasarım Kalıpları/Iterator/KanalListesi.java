package Iterator;

public class KanalListesi {
	private Kanal[] kanallar;

	public KanalListesi() {
		kanallar = new Kanal[] {
				new Kanal("TRT 1"),
				new Kanal("NTV"),
				new Kanal("Star TV"),
				new Kanal("Kanal D"),
				new Kanal("Show TV"),
				new Kanal("Fox TV")
		};
	}

	public KanalIterator iterator() {
		return new KanalListesiIterator(kanallar);
	}

}
