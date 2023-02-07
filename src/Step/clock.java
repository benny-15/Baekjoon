package Step;

import java.util.Scanner;

public class clock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
//		if((H != 0) && ((M-45) > 0)) {			// M-45가 0일 때를 고려하지 않았음
//			M -= 45;
//		}
//		else if((H != 0) && ((M-45) < 0)) {
//			H -= 1;
//			M = M + 60 - 45;
//		}
//		else if((H == 0) && ((M-45) > 0)) {
//			M -= 45;
//		}
//		else if((H == 0) && ((M-45) < 0)) {
//			H = 23;
//			M = M + 60 - 45;
//		}
		
//		if(H != 0) {		// 채점 중간에 틀림
//			if ((M-45) >= 0) {
//				M = M - 45;
//			}
//			else if((M-45) < 0) {
//				H = H - 1;
//				M = M + 60 - 45;
//			}
//		}
//		if(H == 0) {
//			if ((M-45) >= 0) {
//				M = M -45;
//			}
//			else if((M-45) < 0) {
//				H = 23;
//				M = M + 60 - 45;
//			}
//		}
		
		// c언어 코드보고 수정했는데도 똑같은 곳에서 틀림,, 채점 60%쯤
//		if((0 <= H && H <= 23) && (0<= M && M <= 59)) {
//			if(H > 0) {		
//				if (M >= 45) {
//					M = M - 45;
//				}
//				else if(M < 45) {
//					H = H - 1;
//					M = M + 60 - 45;
//				}
//			}
//			if(H == 0) {
//				if (M >= 45) {
//					M = M - 45;
//				}
//				else if(M < 45) {
//					H = 23;
//					M = M + 60 - 45;
//				}
//			}
//		}
		
		if(M < 45) {		// 블로그 참고하여 내 식대로 풀이. 맞았다... 어이가 없네!!! 아까는 어디가 틀린거지
			if(H == 0) {
				H = 23;
				M = M + 60 - 45;
			}
			else {
				H = H - 1;
				M = M + 60 - 45;
			}
		}
		else {
			M = M - 45;
		}
		
		System.out.print(H + " " + M);
		
		sc.close();
	}

}
