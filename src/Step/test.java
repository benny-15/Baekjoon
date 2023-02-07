package Step;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		if(90 <= i && i <= 100) 
			System.out.println("A");
		else if (80 <= i && i <= 89) 
			System.out.println("B");
		else if (70 <= i && i <= 79) 
			System.out.println("C");
		else if (60 <= i && i <= 69) 
			System.out.println("D");
		else
			System.out.println("F");
		
		sc.close();
		
		// switch 문으로는 범위 지정이 어렵다  
//		switch(i) {
//		case 100 : 
//		case 90 :
//			System.out.println("A");
//			break;
//		case 80 : 
//			System.out.println("B");
//			break;
//		case 70 :
//			System.out.println("C");
//			break;
//		case 60 :
//			System.out.println("D");
//			break;
//		default :
//			System.out.println("F");
//			break;
//		}
		
//		-> 예전에 한 것 보니 i를 10으로 나눠서 10, 9 같이하고 8, 7, 6 default로 나눔.
//		switch (score / 10) {
//		case 10:
//		case 9:
//			printf("A");
//			break;
//		case 8:
//			printf("B");
//			break;
//		case 7:
//			printf("C");
//			break;
//		case 6:
//			printf("D");
//			break;
//		default :
//			printf("F");
//			break;
//		}

	}

}
