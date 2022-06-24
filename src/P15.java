import java.util.Scanner;

public class P15 {

	// 카페 문제 2번
	static void high(int a[][], int b, int c) {
		int max = 0;
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < c; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		int[][] ary = new int[3][3];

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = s.nextInt();
			}
		}
		high(ary, 3, 3);

	}

}
