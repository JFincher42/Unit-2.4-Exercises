
public class BooleanTest {

	public static void main(String[] args) {
		boolean test1 = true;
		boolean test2 = 5 + 2 < 7;
		boolean test3 = (5 + 2) <= 7;
		
		int i=5;
		boolean test4 = i > 3;
		i = 2;
		boolean test5 = i > 3;
		
		double foo = 4.5;
		foo++;
		
		System.out.println("test1 = " + test1);
		System.out.println("test2 = " + test2);
		System.out.println("test3 = " + test3);
		System.out.println("test4 = " + test4);
		System.out.println("test5 = " + test5);
		System.out.println("foo = " + foo);

	}

}
