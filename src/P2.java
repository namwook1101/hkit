import java.util.ArrayList;
import java.util.Vector;

class XYX{
	private int x,y;

	public XYX(int x, int y) {
		this.x = x;
		this.y = y;
	}			
									   // tostring
	public String toString() { // 객체를 문자열로 바꿔서 출력가능하게 함
		return x+","+y;
	}
}
public class P2 {
	public static void main(String[] args)  {
		
		ArrayList<XYX> a=new ArrayList<XYX>();
		
		a.add(new XYX(3,4));
		a.add(new XYX(4,5)); //인덱스1 아래 REMOVE로 삭제
		a.add(new XYX(2,9));
		
		a.remove(1);  //인덱스 1 객체 삭제
		
		for(int i=0;i<a.size();i++) {
			XYX x=a.get(i);
			System.out.println(x); // 그냥 출력하면 해쉬코드로 나옴 
											// tostring 해줘야함
		}
		
	}
}