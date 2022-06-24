import java.util.HashSet;
import java.util.Iterator;

class Num{   

	int a;
	Num(int a){
		this.a=a;
	}

	public String toString(){
		return a+" ";
	}
	
	public int hashCode() {
		return a; // 0 ~ 2 
						 // 값을 3으로 나워 나머지로 그룹핑을 해줌 왜지??
	}
	
	public boolean equals(Object obj) {
		Num num=(Num)obj; // 다운 캐스팅
		if(num.a==this.a) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
public class P10 {

	public static void main(String[] args) {

		HashSet<Num> h= new HashSet<Num>();
		
		
		h.add(new Num(30));
		h.add(new Num(40));
		h.add(new Num(60));
		h.add(new Num(60));
		
		Iterator<Num> i=h.iterator();
		
	while(i.hasNext()) { //요소가 있다면 true를 반환하는 메소드 hasnext
		System.out.print(i.next());
	}
		
		
	}

}
