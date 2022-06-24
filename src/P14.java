import java.util.Scanner;

class Calc {

	int sum = 0;

	int calculate(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		return sum;
	}
}

public class P14 {

	public static void main(String[] args) {
//		1. 5부터 10까지의정수형데이터를입력받아5~10이외의
//		정수형이입력되면“다시입력”이라고출력한다. 입력받은정수값을
//		Calcclass의calculate()
//		함수를이용하여1부터입력받은숫자까지홀수만더하는프로그램을작성해라. 
//		(calculate()
//	함수는int형정수를입력받아1부터입력받은숫자까지홀수의합을구하여리턴하는 함수)
// 문제 1번
		Scanner s = new Scanner(System.in);
		Calc c = new Calc();

		while (true) {
			int i = s.nextInt();
			if (i < 5 || i > 10) {
				System.out.println("다시 입력");
				continue;
			} else {
				System.out.println(c.calculate(i));
			}
		}

	}

}
