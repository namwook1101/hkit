import java.util.TreeSet;

public class P13 {

	public static void main(String[] args) {
		TreeSet<Integer> grade=
				new TreeSet<Integer>();
		
		grade.add(30);
		grade.add(100);
		grade.add(50);
		grade.add(500);
		
		Integer i;
		i=grade.first();
		System.out.println(i);
		// 젤 작은 수
		
		i=grade.last();
		System.out.println(i);
		// 젤 큰 수
		
		i=grade.lower(new Integer(80));
		System.out.println(i);
		// 내림차순 2인자 출력
		
		i=grade.higher(new Integer(80));
		System.out.println(i);
		// 오름차순에서 2인자 출력
	}

}
