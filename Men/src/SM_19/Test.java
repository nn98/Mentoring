package SM_19;
import java.util.Scanner;

public class Test {
	
	static int fac(int n) {
		if(n==1) return n;
		return n*fac(n-1);
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum = 1;
//		
//		for (int i=n-1; i>0; i--) {
//			n*=i;
//		}
		System.out.println(n+" "+fac(n));
	}
}