package Template;

public class Basketbol extends Oyun {

     @Override 
     void oyunBitir() {
    	 System.out.println("Basketbol oyunu bitti.");
     }
     @Override
	void oyunKur() {
		System.out.println("Basketbol oyunu kuruldu.");
	}
     @Override
     void oyunBaşlat() {
         System.out.println("Basketbol oyunu başlatıldı.");
     }

}
