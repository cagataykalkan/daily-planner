package oopProje;

import java.util.Scanner;

public class Yemek {
	private int ogunSayisi;
	private int ogundekiCesitSayisi;
	
	Scanner scan = new Scanner(System.in);
	
	String[] anaYemekler = {"Pilav","Makarna","Manti","Kuru Fasulye","Taze Fasulye","Tavuk Izgara "};
	String[] yancilar = {"Salata","Yogurt","Cacik","Mucver"};
	String[] tatlilar = {"Sutlac","Pasta","Kazandibi","Cheesecake","Trilece"};
	
	int random1 = (int)(Math.random()*(anaYemekler.length));
	int random2 = (int)(Math.random()*(yancilar.length));
	int random3 = (int)(Math.random()*(tatlilar.length));
	


	public void ogunSayisiSecici() {
		
		cesitSayisiKontrol();
		
		if (ogunSayisi == 1) {
			ogunHazirlayici(anaYemekler);
		}
		else if (ogunSayisi ==2) {
			ogunHazirlayici(anaYemekler, yancilar);
		}
		else if (ogunSayisi ==3) {
			ogunHazirlayici(anaYemekler, yancilar,tatlilar);
		}

	}

	public void ogunHazirlayici(String[] anaYemekler) {
		System.out.println("Ana Yemeginiz: "+anaYemekler[random1]);
	}
	
	public void ogunHazirlayici(String[] anaYemekler,String[] yancilar) {
		System.out.println("Ana Yemeginiz: "+anaYemekler[random1]);
		System.out.println("Yanciniz: "+ yancilar[random2]);
	}
	
	public void ogunHazirlayici(String[] anaYemekler,String[] yancilar,String[] tatlilar) {
		System.out.println("Ana Yemeginiz: "+anaYemekler[random1]);
		System.out.println("Yanciniz: "+ yancilar[random2]);
		System.out.println("Tatliniz: "+tatlilar[random3]);
	}

	private int cesitSayisiKontrol() {
		while (true) {
			System.out.println("Bu Ogunde Kac Cesit Yiyeceksiniz?: ");
			ogunSayisi = scan.nextInt();
			
			if (ogunSayisi<=0 || ogunSayisi>3) {
				System.out.println("Cesit Sayisi 3'den Fazla Olamaz.Tekrar Giriniz");
			}
			else {
				System.out.println("Bugunki Yemek Menunuz:  "+ogunSayisi);
				break;
			}
		}
		return ogunSayisi;
	}

	public int getOgunSayisi() {
		return ogunSayisi;
	}
	public void setOgunSayisi() {
	
	}
	public int getOgundekiCesitSayisi() {
		return ogundekiCesitSayisi;
	}
	public void setOgundekiCesitSayisi(int ogundekiCesitSayisi) {
		this.ogundekiCesitSayisi = ogundekiCesitSayisi;
	}


}
