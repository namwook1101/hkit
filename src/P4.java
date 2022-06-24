class Book {

	String name;
	int price;

	Book(String a) {
		this(a, 40000); // name,price를 this로 호출해서 대입
	}

	Book(String a, int b) {
		this.name = a;
		this.price = b;
	}

	void title() {
		System.out.println(name + price);
	}

}

public class P4 {

	public static void main(String[] args) {

		Book b1 = new Book("자바");

		b1.title(); // 자바는 40000원

		Book b2 = new Book("파이썬", 30000);

		b2.title(); // 파이썬 30000원
	}

}
