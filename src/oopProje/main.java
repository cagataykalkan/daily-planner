package oopProje;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		while (true) {
			try {
		
		String islemler ="--------------------------------------------\n" 
				+"1-Alisveris Listesi\n"
				+ "2-Ders Programi\n"
				+ "3-Fatura\n"
				+ "4-Ilac\n"
				+ "5-Izlenecek Film Listesi\n"
				+ "6-Su Takibi\n"
				+ "7-Toplanti Planlayici\n"
				+ "8-Yemek Menusu Olusturucusu\n"
				+"Cikmak Icin q Basiniz.\n"
				+"--------------------------------------------\n";
		
		System.out.println(islemler + "Bir Islem Secin:\n");
		Scanner src = new Scanner(System.in);
		String secim = src.nextLine();
		
		if(secim.equals("1")) {
			Alisveris alisveris = new Alisveris();
			alisveris.listeyeEkle();
		}
		
		else if (secim.equals("2")) {
			dersProgrami ders = new dersProgrami(null, null, islemler, null);
			ders.dersZamani();
		}
		
		else if (secim.equals("3")) {
			Fatura fatura = new Fatura();
			fatura.faturaGoster();
		}
		else if (secim.equals("4")) {
			Ilac ilac = new Ilac();
			ilac.ilaclarim();
		}
		else if (secim.equals("5")) {
			Izlenecekler film = new Izlenecekler(secim, null);
			film.filmSecici();
		}
		else if (secim.equals("6")) {
			Su su = new Su();
			su.icilenSu();
		}
		else if (secim.equals("7")) {
			Toplanti toplanti = new Toplanti(null, null);
			toplanti.toplantiOlustur();
 		}
		else if (secim.equals("8")) {
			Yemek menu = new Yemek();
			menu.ogunSayisiSecici();
		}
		else if(secim.equals("q")) {
			System.out.println("Sistemden Cikiliyor...");
				break;
		}
		else {
			System.out.println("Hatali Secim!");
		}
	}
			catch(Exception error) {
					System.out.println("Bir Hata M1evcut. ");
					System.out.println(error.toString());
				
			}
			}
	}
	
}
