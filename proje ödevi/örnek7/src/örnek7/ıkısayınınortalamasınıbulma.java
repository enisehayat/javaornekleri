package örnek7;

import java.util.Scanner;

public class ıkısayınınortalamasınıbulma {

	public static void main(String[] args) {
	    int sayi1=0;
	    Scanner klavye=new Scanner(System.in);
	    System.out.println("İlk sayıyı giriniz:");
		sayi1= klavye.nextInt();
	    //İlk sayıyı girdik.
		
		int sayi2=0;
		Scanner klavye2=new Scanner (System.in);
		System.out.println("İkinci sayıyı giriniz:");
		sayi2=klavye.nextInt();
		//İkinci sayıyı girdik.
		int ortalama=0;
		ortalama=(sayi1+sayi2)/2;
		System.out.println(" İki sayının ortalması: "+ ortalama);
		
		
	    
	    

	}

}
