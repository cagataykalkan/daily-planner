package oopProje;

import java.util.ArrayList;
import java.util.Scanner;

public class dersProgrami extends Toplanti{
	private String ders;
	private String derslik;
	private String dersMalzemeleri;

	
	
	Scanner scan = new Scanner(System.in);
	ArrayList<String> dersSinifi = new ArrayList<>();
	ArrayList<String> dersAdi = new ArrayList<>();
	ArrayList<Double> dersSaati = new ArrayList<>();
	ArrayList<String> dersMalzemelesi = new ArrayList<>();

	
	public dersProgrami(String yeri, Double saati, String ders, String dersMalzemeleri) {
		super(yeri, saati);
		this.ders = ders;
		
		this.dersMalzemeleri= dersMalzemeleri;
	}

	
	public void dersZamani() {
		while (true) {
			String islem;
			System.out.println("**********************\n"
								+"1-Ders Ekle:\n"
								+"2-Derslerini Gor\n"
								+"Cikmak Icin q Basiniz.");
			
			islem = scan.nextLine();
			if (islem.equals("1")) {
				System.out.println("Dersin Adi:");
				ders = scan.nextLine();
				dersAdi.add(ders);

				System.out.println("Dersin Sinifi: ");
				derslik=scan.nextLine();
				dersSinifi.add(derslik);
				
				System.out.println("Dersin Saati: ");
				saatSorgulama();
				double saat = getSaati();
				dersSaati.add(saat);
				scan.nextLine();
				
				System.out.println("Dersin Malzemeleri:");
				dersMalzemeleri = scan.nextLine();
				dersMalzemelesi.add(dersMalzemeleri);
		
			}
			else if (islem.equals("2")) {
				dersleriGor();
			}
			else if (islem.equals("q")) {
				break;
			}
			else {
				System.out.println("Gecersiz Islem");
			}			
		}
	}

	public void saatSorgulama() {
		double saat = scan.nextDouble();
		setSaati(saat);
	}

	private void dersleriGor() {
		System.out.println("Ders Adi: "+dersAdi);
		System.out.println("Derslik: "+dersSinifi);
		System.out.println("Ders Saati: "+ dersSaati);
		System.out.println("Ders Malzemeleri: "+dersMalzemelesi);


	}
	public String getDers() {
		return ders;
	}
	public void setDers(String ders) {
		this.ders = ders;
	}
	public String getDersMalzemeleri() {
		return dersMalzemeleri;
	}
	public void setDersMalzemeleri(String dersMalzemeleri) {
		this.dersMalzemeleri = dersMalzemeleri;
	}
	public String getDerslik() {
		return derslik;
	}
	public void setDerslik(String derslik) {
		this.derslik = derslik;
	}
	
}
