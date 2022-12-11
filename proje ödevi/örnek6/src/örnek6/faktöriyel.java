package örnek6;

import java.util.Scanner;

public class faktöriyel {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 int faktöriyel = 1;
		 
		 System.out.println("Bir sayi giriniz: ");
		 int sayi = scan.nextInt();
		 
		 for(int i = 1; i <= sayi; i++)
		 {
			 faktöriyel = faktöriyel * i;
		 }
		 System.out.println(sayi + "!=" + faktöriyel);
	}
			 

	}


