package Step;

import java.util.Scanner;

public class oven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		if((m + t) >= 60) {		// 230207 진행중
			h += 1;
			if(h >= 24) {
				h = 0;
				m = m - 60 + t;
			}
			else if(t >= 60) {
				h += 1;
				
			}
		}
		else {
			m = m+t;
		}
		
		
		System.out.println(h + " " + m);
		

	}

}
