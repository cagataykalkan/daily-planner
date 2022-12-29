package oopProje;

import java.util.Scanner;

public class Izlenecekler extends Toplanti implements saatInterface{

	
	public Izlenecekler(String yeri2, Double saati2) {
		super(yeri2, saati2);
		
	}

	Scanner scan = new Scanner(System.in);

	String[] filmListesi = {" Esaretin Bedeli","Baba"," Kara Sovalye","Yuzuklerin Efendisi: Kralin Donusu"," Schindler'in Listesi"," Baba 2","12 Ofkeli Adam "," Ucuz Roman","Baslangic"," Yuzuklerin Efendisi: Iki Kule"," Dovus Kulubu"," Yuzuklerin Efendisi: Yuzuk Kardesligi "," Forrest Gump "," Iyi, Kotu ve Cirkin"," Matrix"};
	
	public void filmSecici() {
		String[] filmListesi = {" Esaretin Bedeli","Baba"," Kara Sovalye","Yuzuklerin Efendisi: Kralin Donusu"," Schindler'in Listesi"," Baba 2","12 Ofkeli Adam "," Ucuz Roman","Baslangic"," Yuzuklerin Efendisi: Iki Kule"," Dovus Kulubu"," Yuzuklerin Efendisi: Yuzuk Kardesligi "," Forrest Gump "," Iyi, Kotu ve Cirkin"," Matrix"};
		int randomSayi = (int) (Math.random() * (filmListesi.length));
		System.out.println("Gunun Filmi: "+filmListesi[randomSayi]);
		yerSecme();
		saatSorgulama();
		bilgiler();

	}
	
	@Override
	public String yerSecme() {
		String islem ;
		String yerSecimi = "" ;
		System.out.println("Filmi Nerde: Izlemek Istersiniz: ");
		String yerler = "1-Sinema\n"+
						"2-Ev";
		
		System.out.println(yerler);
		islem = scan.nextLine();
		
		if (islem.equals("1")) {
			yerSecimi = "Sinema";
			setYeri(yerSecimi);
		} 
		else if (islem.equals("2")) {
			yerSecimi = "Ev";
			setYeri(yerSecimi);
		}
		else {
			System.out.println("Yanlis Secim!");
		}
		return yerSecimi;
	}
	

	public void saatSorgulama() {
		System.out.println("Saat Kacta Baslayacak?: ");
		setSaati(scan.nextDouble());
		System.out.println("Ne kadar Surecek: ");
		suresi = scan.nextDouble();

		
		double toplam = getSaati() + suresi;
		
		if (getSaati() <= 20.00) {
			System.out.println("Saat 20.00'dan Once Film Izlemek Icin Bos Vaktiniz Yok.");
		} 
		else if (toplam >= 24.00) {
			System.out.println("Cok Gec Bitiyor.");
		}
		else if (suresi >= 3.00) {
			System.out.println("Film Suresi Cok Uzun Baska Islerinizi Aksatabilir.");
		}
		else {
			System.out.println("Iyi Seyirler.");
		}
	}
	
	
	@Override
	public void bilgiler() {
		System.out.println("Filmin Yeri: "+getYeri() +
						   " \nFilmin Saati: "+getSaati()+
						   " \nFilmin Suresi: "+ suresi+
						   "\nFilmin Bitis Saati"+(getSaati()+suresi));
					
	}
}
