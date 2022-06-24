
public class P16 {

	public static int add(int a[], int b){
		int sum=0;
		for(int i=0; i<b; i++){
			sum+=a[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {

		 int [] arr={1,2,3,4,5};

		 int r;

		 r=add(arr,5);
		 System.out.println(r);
	}

}
