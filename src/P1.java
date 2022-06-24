import java.util.ArrayList;

public class P1 {

	public static void main(String[] args) {

		ArrayList<Integer> v= new ArrayList<Integer>();
		v.add(1);
		v.add(2);
		v.add(new Integer(3)); //auto unboxing
		
		v.add(2,4); // 인덱스 2에 4를 넣음
		
		for(int i=0;i<v.size();i++) {
			int n=v.get(i);
			System.out.println(v.get(i));
		}
		
		
		
		
	}

}
