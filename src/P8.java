
import java.util.Scanner;

interface Cal {

	public int cal(int a, int b);

}

class Show implements Cal {

	@Override
	public int cal(int a, int b) {

		int sum = 0;
		for (a = a; a <= b; a++) {
			sum += a;
		}

		return sum;
	}

}

public class P8 {

	public static void main(String[] args) {

		Cal c = new Show();

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println(c.cal(a, b));

	}

}
