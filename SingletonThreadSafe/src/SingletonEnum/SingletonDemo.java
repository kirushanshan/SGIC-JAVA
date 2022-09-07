package SingletonEnum;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc obj = Abc.INSTANCE;
		obj.i = 5;
		obj.show();
		
		Abc obj1 = Abc.INSTANCE;
		obj1.i = 6;
//		obj1.show();
		
		obj.show();

	}

}


enum Abc {
	INSTANCE;
	
	int i;
	
	public void show() {
		System.out.println(i);
		
	}
	
}
