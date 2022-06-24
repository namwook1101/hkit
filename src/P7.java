import java.util.ArrayList;
import java.util.Iterator;

public class P7 {

	public static void main(String[] args) {

	//p421 페이지 !!!
	// arraylist와 iterator
	ArrayList<Integer> a= new ArrayList<Integer>();
	
	a.add(5);
	a.add(4);
	a.add(3);
	
	Iterator<Integer> it= a.iterator();

	
	while(it.hasNext()) { //요소가 있으면 true를 반환 5 4 3
		int n=it.next(); // 요소를 반환 해서 n에 담아줌
		System.out.print(n+" "); // 담아진 값을 출력
	// 3까지 출력하고 hasnext()가 true를 반환하지 않아서 종료
	}
		
	while(it.hasNext()) { //요소가 있으면 true를 반환 5 4 3
		System.out.print(it.next()); // 담아진 값을 출력
	// 3까지 출력하고 hasnext()가 true를 반환하지 않아서 종료
	}
		
	}

}
