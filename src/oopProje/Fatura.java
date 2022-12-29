package oopProje;

import java.util.ArrayList;
import java.util.Scanner;

public class Fatura {
	
	private String faturaAdi;
	private double faturaTutari;
	private int sonOdemeyeKalanGun;

	ArrayList<String> faturaIsmi = new ArrayList<String>() ;
	ArrayList<Double> faturaTutari1 = new ArrayList<Double>() ;
	ArrayList<Integer> sonOdemeyeKalanGun1 = new ArrayList<Integer>() ;
	
	Scanner scan = new Scanner(System.in);


	public void faturaGoster() {
		while (true) {
			String islem;
			String islemler = "*******************\n"+
							  "1-Fatura Ekle\n"+
							  "2-Faturalari Gor\n"+						
							  "Cikmak Icin q Bas";
			
			System.out.println(islemler);
			System.out.println("Yapmak Istediginiz Islemi Secin: ");
			islem = scan.nextLine();
			
			if (islem.equals("1")) {
				faturaOlustur(faturaAdi, faturaTutari, sonOdemeyeKalanGun);
			} 
			else if (islem.equals("2")) {
				System.out.println("Fatura Adi: "+faturaIsmi);
				System.out.println("Fatura Tutari: "+faturaTutari1);
				System.out.println("Son Odeme Kalan Gun: "+sonOdemeyeKalanGun1);
			}
			else if (islem.equals("q")) {
				System.out.println("Cikiliyor..");
				break;
			}
			else {
				System.out.println("Yanlis Islem...");
			}
		}

	}
	public void faturaOlustur(String faturaAdi,double faturaTutari,int sonOdemeyeKalanGun) {
		try {
		System.out.println("Fatura Adi: ");
		faturaAdi = scan.nextLine();
		System.out.println("Fatura Tutari:");
		faturaTutari = scan.nextDouble();
		System.out.println("Son Odemeye Kalan Gun: ");
		sonOdemeyeKalanGun = scan.nextInt();
		scan.nextLine();
		
		faturaIsmi.add(faturaAdi);
		faturaTutari1.add(faturaTutari);
		sonOdemeyeKalanGun1.add(sonOdemeyeKalanGun);
		}catch(Exception error) {
			System.out.println("Bir Hata Mevcut");
			System.out.println(error.toString());
		}
	}
	public String getFaturaAdi() {
		return faturaAdi;
	}
	public void setFaturaAdi(String faturaAdi) {
		this.faturaAdi = faturaAdi;
	}
	public double getFaturaTutari() {
		return faturaTutari;
	}
	public void setFaturaTutari(double faturaTutari) {
		this.faturaTutari = faturaTutari;
	}
	public int getSonOdemeyeKalanGun() {
		return sonOdemeyeKalanGun;
	}
	public void setSonOdemeyeKalanGun(int sonOdemeyeKalanGun) {
		this.sonOdemeyeKalanGun = sonOdemeyeKalanGun;
	}
	
}
	
	
	
	
	
	
	
	
	
	

