import java.util.Iterator;
import java.util.TreeSet;
class Pro implements Comparable<Pro>{
	// Comparable은 뒤에 제네릭을 꼭 넣어줘야함(클래스명)
	// 가진 메소드는 compareTo 1개이다 (오버라이딩 해야함)
	// interface라 implements로 상속받음
String a;
int b;

Pro(String a, int b){
	this.a=a;
	this.b=b;
}

@Override
//Comparable를 상속 받았으니
//Comparable에 들어있는 추상 메소드 compareTo를 오버라이딩
public int compareTo(Pro p) { // 인터페이스는 무조건 public !!
	if(this.b>p.b) {
		return 1;
	}else if(b<p.b) {
		return -1;
	}else {    
		return 0;        
	}   
}

public void show() { // 혹은 이렇게 클래스에서 선언해야함
							// 출력 메소드를
System.out.println(a+" "+b);	
}
	

public String toString(){ // 해놓으면 자동으로 문자열로 바꿔줌
	return a+" "+b;
}
	
}
public class P11 {

	public static void main(String[] args) {

		TreeSet<Pro> t= new TreeSet<Pro>();
		
		
		t.add(new Pro("cc",128));
		t.add(new Pro("aa",123));
		t.add(new Pro("bb",125));
		
		Iterator<Pro> it=t.iterator();
		while(it.hasNext()) { //요소가 있다면 true를 반환하는 메소드 hasnext
		
			
			// 이렇게 출력하려면 toString 필요함 36번 라인
			System.out.println(it.next());
			
			// show 를 만들어서 출력해도 가능 30번라인
			// 그냥 it.show하지않고 .을 두번 찍어서 불러옴;; 잘볼것
			//Iterator로 선언해서 그런건지 모르곘음
//			it.next().show(); 
//		
		}
		
		
		}

}
