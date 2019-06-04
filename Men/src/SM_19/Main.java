package SM_19;

import java.util.Arrays;

public class Main {

	static class A {
		private int a;
		public void set(int a) {
			this.a=a;
		}
		public int get() {
			return a;
		}
		public void see() {
			return;
		}
	}
	
	static class B extends A {
		protected int b,c;
	}
	
	static class C extends B {
		public int d,e;
	}
	public static void main(String[] args) {
		int[] arr=new int[10];
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<10;i++) {
			arr[i]=i+1;
		}
		
		System.out.println(Arrays.toString(arr));
		// TODO Auto-generated method stub
		A objA=new A();
		B objB=new B();
	}

}
