package Step;

import java.util.Scanner;

public class multiple {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 배열로 할 필요 없고 나머지 이용하면 되지!!! 
		
		int sum1 = a * (b%10);
		int sum2 = a * ((b/10)%10);
		int sum3 = a * (b/100);		// == (b/10)/10
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum1+(sum2*10)+(sum3*100));	// or a*b
		
		sc.close();

	}

}
