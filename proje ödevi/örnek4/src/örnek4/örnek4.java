package örnek4;

import java.util.Scanner;

public class örnek4 {

	public static void main(String[] args) {
		double a,b,c;
		Scanner oku=new Scanner(System.in);
		
		System.out.print("Birinci dik kenar giriniz:");
		a=oku.nextDouble();
		System.out.print("İkinci dik kenarı giriniz:");
		b=oku.nextDouble();
		
		c=Math.sqrt(a*a+b*b);
		
		System.out.printf("\nHipotenüs:%.2f",c);
	}

}
