package oopProje;

import java.util.ArrayList;
import java.util.Scanner;

public class Alisveris {
	private String alinacakYiyecek;
	private String alinacakIcecek;
	private String alinacakAtistirmalik;
	private double fiyat;
	
	ArrayList<String> alinacakListesi = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	String eklenecek;

	public void listeyeEkle() {
	
	String islem ;
	String eklenecek;
	while(true) {		
		String alinacakar = "*************************\n"+
							"1-Yiyecekler\n"+
							"2-Icecekler\n"+
							"3-Atistirmaliklar\n"+
							"4-Listeyi göruntule\n"+
							"cikmak icin q basiniz";
		System.out.println(alinacakar);
		
		System.out.println("Eklemek Istediginiz Urunu Secin: ");
		islem = scan.nextLine();
		
		if (islem.equals("1")) {
			yiyecekEkle(alinacakYiyecek);
			
		} 
		else if (islem.equals("2")) {
			icecekEkle(alinacakar);
			

		}
		else if (islem.equals("3")) {
			atistirmalikEkle(alinacakar);
			

		}
		else if (islem.equals("q")) {
			break;
			
		}
		else if (islem.equals("4")) {
			listeyiGöster();
		}
		else {
			System.out.println("Yanlis Secim");
		}
	}
	}	

	public void yiyecekEkle(String alinacakYiyecek) {
		System.out.println("Eklemek istediginiz yiyecegin adi: ");
		eklenecek = scan.nextLine();
		alinacakListesi.add(eklenecek);
	}
	public void icecekEkle(String alinacakIcecek) {
		System.out.println("Eklemek istediginiz icecegin adi: ");
		eklenecek = scan.nextLine();
		alinacakListesi.add(eklenecek);	
	}
	public void atistirmalikEkle(String alinacakAtistirmalik) {
		System.out.println("Eklemek istediginiz atistirmaligin adi: ");
		eklenecek = scan.nextLine();
		alinacakListesi.add(eklenecek);	
	}
	
	public void listeyiGöster() {
		System.out.println(alinacakListesi);
	}
	public String getAlinacakYiyecek() {
		return alinacakYiyecek;
	}
	public void setAlinacakYiyecek(String alinacakYiyecek) {
		this.alinacakYiyecek = alinacakYiyecek;
	}
	public String getAlinacakIcecek() {
		return alinacakIcecek;
	}
	public void setAlinacakIcecek(String alinacakIcecek) {
		this.alinacakIcecek = alinacakIcecek;
	}
	public String getAlinacakAtistirmalik() {
		return alinacakAtistirmalik;
	}
	public void setAlinacakAtistirmalik(String alinacakAtistirmalik) {
		this.alinacakAtistirmalik = alinacakAtistirmalik;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	
}
