package oopProje;

import java.util.Scanner;

public class Toplanti implements saatInterface{
	
	
	protected String yeri;
	protected double saati;
	protected double suresi;
	
	Scanner scan = new Scanner(System.in);

	public Toplanti(String yeri2, Double saati2) {

	}


	public void toplantiOlustur() {
		System.out.println("Toplanti Olusturuluyor...");
		yerSecme();
		saatSorgulama();
		bilgiler();
	
	}

	public void saatSorgulama() {
		
		System.out.println("Toplantiniz Saat Kacta Baslayacak?: ");
		setSaati(scan.nextDouble());
		System.out.println("Toplantiniz Ne Kadar Surecek?: ");
		suresi = scan.nextDouble();
		
		double toplam = getSaati() +suresi;
		
		if (getSaati() >= 20.00) {
			System.out.println("Saat 20.00'dan Sonra Film Saatidir. Toplanti Koyulamaz.");
		} 
		else if (toplam >= 20.00) {
			System.out.println("Toplanti Cok Gec Bitiyor.");
		}
		else if (suresi >= 3.00) {
			System.out.println("Toplanti Suresi Cok Uzun. Baska Islerinizi Aksatabilir.");
		}
		else {
			System.out.println("Musaitsiniz.");
		}

	}
	
	public String yerSecme() {
		String islem ;
		String yerSecimi = "" ;
		System.out.println("Toplantiniz Nerde: ");
		String yerler = "1-Okul\n"+
						"2-Ofis\n"+
						"3-Ev(online)";
		System.out.println(yerler);
		islem = scan.nextLine();

		if (islem.equals("1")) {
			
			System.out.println("Toplanti Yeri Okul Olarak Ayarlandi.");
			yerSecimi = "Okul";
			setYeri(yerSecimi);
			
		} 
		else if (islem.equals("2")) {
			
			System.out.println("Toplanti Yeri Ofis Olarak Ayarlandi.");
			yerSecimi = "Ofis";
			setYeri(yerSecimi);

		}
		else if (islem.equals("3")) {
			
			System.out.println("Toplanti Yeri Ev Olarak Ayarlandi.");
			yerSecimi = "Ev";
			setYeri(yerSecimi);

		}
		else {
			System.out.println("Boyle Bir Toplanti Yeri Bulunmamaktadir.");
		}
		return yerSecimi;
			
	}


	public void bilgiler() {
		System.out.println("Toplanti Yeri: "+yeri +
							" \nToplanti Saati: "+getSaati()+
								" \nToplanti Suresi: "+suresi);

	}

	public String getYeri() {
		return yeri;
	}
	public String setYeri(String yeri) {
		return this.yeri = yeri;
	}
	public Double getSaati() {
		return saati;
	}
	public void setSaati(Double saati) {
		this.saati = saati;
	}


	public void setSaati(double saati) {
		this.saati = saati;
	}
	
}
