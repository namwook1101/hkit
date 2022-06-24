import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	
	int num;
	System.out.println("입력 :");
	num=s.nextInt();
	
	if(num/10==3||num/10==6||num/10==9) {
		if(num%10==3||num%10==6||num%10==9) {
		System.out.println("짝짝");
		}
		else {
		System.out.println("짝");
		}
		}
		else {
		if(num%10==3||num%10==6||num%10==9) {
		System.out.println("짝");
		}
		else {
		System.out.println("떙");
		}
		
	}

	}
	}
