import java.util.Arrays;
import java.util.List;

interface A {
	void show(int i);

}


public class LamdaExpresion {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4,5,6,1,2,3,7);
		A obj;
//		
//		obj = new A() {
//			public void show() {
//				System.out.println("Hello");
//			}
//		};
//		
		obj = (int i) -> System.out.println("Hello" + i);
		obj = i -> System.out.println("Hello" + i);
		
		obj.show(44);
		
		numbers.forEach(i -> System.out.println(i));

	}

}


//consumer interface