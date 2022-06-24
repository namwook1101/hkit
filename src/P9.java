class Gen<T>{ // 제네릭 타입의 Gen 생성 T는 무슨 타입일지 모른다는 가정
	T t, t1; // t와 t1은 들어올 데이터를 담을 값 아래 서울과 부산이 담김
				// 제네릭 타입의 클래스니 타입도 제네릭 T타입
	Gen(T t, T t1) {  // 제네릭 타입의 t와 t1선언
		this.t=t; // this로 받아줌
		this.t1=t1; // 원래 클래스 하는거랑 비슷함
	}

	T one() { 
		return t; // 생성자에 첫번쨰 값을 반환
	}
	
	T two() {
		return t1; // 생성자에 두번째 값을 반환
	}

	boolean three() {
//		if(t.equals(t1)){
//			return true;
//		}
//		return false;
	
	return t.equals(t1); // 위 처럼 하거나 혹은 이렇게
	} // false를 출력해야하니 위 두개의 값을 비교해서 틀리면 false를 반환하게 유도
	
	
}
public class P9 {

	public static void main(String[] args) {
	
	Gen<String> g=new Gen<String>("seoul","busan");
	// 여기서 제네릭 타입의 타입을 정할 수 있다 지금은 String 으로 선언
	// 그리고 서울과 부산을 생성자로 넣어줌 
	
	
	System.out.println(g.one());   //seoul 출력
	System.out.println(g.two());   //busan 출력
	System.out.println(g.three());   //false 출력

	
	
	}

}
