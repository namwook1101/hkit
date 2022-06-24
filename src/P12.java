import java.util.HashSet;

class Student{

	String a;
	String b;
	
	Student(String a, String b){
		this.a=a;
		this.b=b;
	}
	
	public int hashCode() {
		return Integer.parseInt(a); // 반환형이 int 니까 
		// a를 비교해야하니 문자열 a를 int형으로 변환
	}
	
	public boolean equals(Object obj) {
		Student std = (Student)obj;  
		if(std.a == a) { 
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return a  + ":" + b;
	}
	
	
	
}

public class P12 {

	public static void main(String[] args) {

		// 같은 해쉬코드를 가진 데이터를 1개만 출력해보는 작업
		// 해쉬코드와 투스트링 그리고 equals를 만들어줘야함
		
		HashSet<Student> set =new HashSet<Student>();
		set.add(new Student("100","홍길동"));
		set.add(new Student("200","강감찬"));
		set.add(new Student("300","이순신"));
		set.add(new Student("400","정약용"));
		set.add(new Student("100","송중기"));
		System.out.println(set);	
		
		
	}

}
