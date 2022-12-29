package oopProje;

import java.util.ArrayList;
import java.util.Scanner;

public class Ilac {
	Scanner scanner = new Scanner(System.in);
	
	ArrayList<String> recete = new ArrayList<String>();
	
	public void ilaclarim() {
		System.out.print("Kac Tane Ilac Kullaniyorsunuz :");

		int b = scanner.nextInt();
		scanner.nextLine();
		int i = 0 ;	
	
		while( i < b  ) {
	
				System.out.print((i+1)+". Ilac Adi Giriniz : ");
				String ilac_adi = scanner.nextLine();
				recete.add(ilac_adi);
				i++;
	}

	System.out.println("Kullandiginiz Ilaclar :" +recete);
	
	if(recete.size() >= 4) {
		System.out.println("Kullandiginiz Ilac Sayisi Normal Seviyenin Ustunde..."
				+ "\n Gereginden fazla ilac tuketilmesi bagirsak sisteminin isleyisini"
				+ "\n bozarak uzun suren kronik ishal problemi yasanmasina neden olur."
				+ "\n Cogunlukla kimyasal icerikler ile gelistirilen ilaclarin fazla miktarda"
				+ "\n kullanildiginda vucuttan atilmasi zorlasir ve bobrek metabolizmasi uzerinde "
				+ "\n olumsuz etkiler meydana gelir.");
	}
	
	else {
		System.out.println("Kullandiginiz Ilac Sayisi Normal Seviyede...");
	}
}


}
