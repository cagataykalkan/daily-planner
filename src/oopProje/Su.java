package oopProje;

import java.util.Scanner;


public class Su {

	 private final int gunlukIhtiyac=10;

	 public void ihtiyacSu(){
	        System.out.println("Normal Bir Insanin Gunluk Icmesi Gereken Minimum Su Miktari 2 Litredir");
	        
	    }
	    
	    public void icilenSu(){
	        Scanner src1 = new Scanner(System.in);  
	        

	        	System.out.println("Simdiye Kadarki Icilen Su Bardagi Sayisini Giriniz: ");
	        	int icilenBardak = src1.nextInt();
	        	int kalanBardak = 0;
	            if(icilenBardak < 0){
	                System.out.println("Icilen Su Negatif Olamaz!!");
	                System.out.println("Gunluk Ihtiyaciniza Ulasmaniz Icin Icmeniz Gereken Bardak Sayisi: 10");
	                System.out.println("Icilmesi Gereken Kalan Su Miktari: 2000 ml");
	                
	            }
	            else if(icilenBardak>=0 && icilenBardak<10){
	                System.out.println("Gunluk Icmeniz Gereken Minimum Su Miktarini Icmediniz!!");
	                    int icilenSuMiktari = icilenBardak * 200;
	                    System.out.println("Icilen Su Miktari: " + icilenSuMiktari + "ml");
	                kalanBardak = gunlukIhtiyac - icilenBardak;
	                System.out.println("Gunluk Ihtiyaca Ulasmaniz Icin Icmeniz Gereken Bardak Sayisi: " + kalanBardak + "");
	                    int kalanSuMiktari = kalanBardak * 200;
	                    System.out.println("Icilmesi Gereken Kalan Su Miktari: " + kalanSuMiktari + "ml");
	            }
	            
	            else if(icilenBardak>=10){
	                System.out.println("\nTEBRIKLER\nGunluk Icmeniz Gereken Minimum Su Miktarini Ictiniz.");
	                    int icilenSuMiktari = icilenBardak * 200;
	                    System.out.println("Icilen Su Miktari: " + icilenSuMiktari + "ml");
	            }
	            
	            else{
	                System.out.println("!HATALI GIRIS!"); 
	               
	            }
	        
	    }
	    
	
}
