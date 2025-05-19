package Builder;

public class Main {

	public static void main(String[] args) {
		
		ArabaBuilder arabaBuilder = new ArabaBuilder();
		ArabaDirector arabaDirector = new ArabaDirector();
		
		arabaDirector.buildAraba(arabaBuilder);
		Araba araba = arabaBuilder.build();
		
		System.out.println(araba.toString());
	}
}
