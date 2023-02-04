package Step;

import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[] {1, 1, 2, 2, 2, 8};
		int[] array2 = new int[6];		// null까지 들어가기 떄문에 5개가 아닌 6개로 배열 만들어야 함
		
		for(int i = 0; i < 6; i++) {
			array2[i] = scan.nextInt();
		}
		for(int j = 0; j < 6; j++) {
			System.out.print(array[j] - array2[j]+" ");
		}
		scan.close();

	}

}
