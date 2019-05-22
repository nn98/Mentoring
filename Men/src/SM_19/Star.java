package SM_19;
import java.util.Scanner;

public class Star {
	static int k=1;
	static void c1(int n) {
		if(n==0) return;
		for(int i=0;i<k;i++) 
			System.out.print("*");
		System.out.println();
		k++;
		c1(n-1);
	}
	static void c2(int n) {
		if(n==0) return;
	}
	static void c3(int n) {
		if(n==0) return;
		for(int i=0;i<n;i++) 
			System.out.print("*");
		System.out.println();
		c3(n-1);
	}
	static void c4(int n) {
		if(n==0) return;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("º°Âï±â ¹øÈ£ : ");
		int c=s.nextInt();
		System.out.print("º°Âï±â È½¼ö : ");
		int n=s.nextInt();
		switch(c) {
		case 1:
			c1(n);
			break;
		case 2:
			c2(n);
			break;
		case 3:
			c3(n);
			break;
		case 4:
			c4(n);
			break;
		}
	}
}