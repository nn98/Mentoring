package SM_19;
import java.util.Scanner;

public class T1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(), y=s.nextInt(), w=s.nextInt(), h=s.nextInt();
		int a2=w-x;
		int a1=x-0;
		int a3=y-0;
		int a4=h-y;
		int m,n;
		if (a1>a2) {
			m=a2;	
		}
		else {
			m=a1;
		}
		
		
		if (a3>a4) {
			n=a4;
		}
		else {
			n=a3;
		}
		
		
		if (m>n) {
			System.out.println(n);
		}
		
		else {
			System.out.println(m);
		}
		
		
	}

}
