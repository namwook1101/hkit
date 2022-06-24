import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P17 {

	public static void main(String[] args) throws IOException {

		
		FileOutputStream fos=null;
		
		fos=new FileOutputStream("fi.txt");
		
		
		byte b[]={1,2,3,4,5};
		fos.write(b);
		fos.close();
		
		
		
		int x;
		FileInputStream fis=null;
		fis=new FileInputStream("fi.txt");
		
		while((x=fis.read())!=-1) {
			System.out.print(x);
		}
		fis.close();
		
		
		
		
		
	}

}
