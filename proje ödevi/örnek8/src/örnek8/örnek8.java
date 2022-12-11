package örnek8;

import java.util.Scanner;

public class örnek8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int vizeNot,finalNot;
		double ortalama;
		String durum="";
		System.out.print("Vize Notunuzu Girin :");
		vizeNot=reader.nextInt();
		System.out.print("Final Notujnuz Girini :");
		finalNot=reader.nextInt();
		ortalama=vizeNot*0.4+finalNot*0.6;
		if(ortalama>=50 && finalNot>=50) {
			durum="Geçti";
		}
		else {
			durum="Kaldı";
		}
		System.out.println("Ortalama : " + ortalama);
		
		System.out.println("Durumunuz: " + durum);
		
		}
		

	}
