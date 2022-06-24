class St<T>{
	
	int n;
	Object []st;
	
	St(){
		st=new Object[3];
		n=0;
	}
	
	public void push(T item) {
		if(n==3) { // 스택이 다 차있다. 더 이상 값을 넣을 수 없다.
			return;
		}
	
		st[n]=item;
		n++;
	}
	
	public T pop() {
		if(n==0) { // 스택이 비어있어 꺼낼 수 없다.
			return null;
		}
		
		n--;
		return (T) st[n];
	}
	
	
}
public class P6 {

	public static void main(String[] args) {

	//417 스택 제네릭으로 구현
		
	St<String> s=new St<String>();
	
	s.push("java"); // st[0]
	s.push("db");   //  st[1]
	s.push("html"); // st[2]
		
	for(int i=0; i<3; i++) {
		System.out.println(s.pop());
	}	
	
	
	// <>타입의 클래스 st는 언제든 타입을 바꿔볼 수 있다 아래처럼
	St<Integer> s1=new St<Integer>();
	
	s1.push(3);
	s1.push(4);
	s1.push(5);
	
	for(int i=0; i<3; i++) {
		System.out.println(s1.pop());
	}	
	
	
	
	
	
	
	
	}

}
