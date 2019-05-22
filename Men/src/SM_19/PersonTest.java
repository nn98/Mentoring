package SM_19;
class PersonT {
	int age;
	String name;
	void set() {
		age=22;
		name="aaa";
	}
}


public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonT p=new PersonT();
		System.out.println(p.age+p.name);
	}

}
