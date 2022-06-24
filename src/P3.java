import java.util.ArrayList;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {

		// 노션 정리가 필요 ! !!
		ArrayList<String> a = new ArrayList<String>();
		Scanner s = new Scanner(System.in);

//		for(int i=0; i<3; i++) {
//			a[i]=s.next();
//		}

		for (int i = 0; i < 3; i++) {
			String str = s.next();
			a.add(str);
		}

		for (int i = 0; i < 3; i++) {
			String st = a.get(i);
			System.out.println(st);
		}

		
		
		// arraylist 배열의 데이터 중 젤 긴 데이터를 뽑는 과정 
		int max = 0; // 젤 긴 데이터 값의 인덱스를 저장할 max

		for (int i = 1; i < a.size(); i++) {
			if(a.get(max).length() < a.get(i).length()) {
				max=i;
			}
		}
		System.out.println(a.get(max));
		
		
		
	}

}
