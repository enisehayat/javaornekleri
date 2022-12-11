package örnek9;

import java.util.Scanner;

public class çemberinçevresi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Çemberin yarı çapını giriniz: ");
		int yarıcap = scan.nextInt();
		
		System.out.println("Çemberin çevresi = " + (2* Math.PI* yarıcap));

	}

}
