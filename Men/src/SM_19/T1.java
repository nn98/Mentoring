package SM_19;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		
		if(a<=b && b<=c || c<=b && b<=a) 
		{
		System.out.println(b);
	}
		
		
		else if  (a<=c && c<=b || b<=c && c<=a) {
			
			System.out.println(c);
		}
		
		
		 else  {
			System.out.println(a);
		
		}
		
		
		
	}
}
