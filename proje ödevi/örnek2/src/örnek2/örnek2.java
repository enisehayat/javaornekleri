package örnek2;

public class örnek2 {

	public static void main(String[] args) {
		double n1 = -9 , n2 = 13.5 , n3 = 8;
		System.out.println("..:: Sayılar ::..");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println("");
		if( n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " sayısı büyüktür. ");
		
		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " sayısı büyüktür.");
		
		else
			System.out.println(n3 + " sayısı büyüktür.");
	}

}
