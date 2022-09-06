package EarlyLoading;

public class EarlyMain {
	   public static void main(String[] args) {
	        // access instance of SingletonCls using getInstance() method
	        SingletonCls instance = SingletonCls.getInstance();
	        instance.setMessage("This message is set in main of ExamplePgm");
	        displayMsg();
	    }
	     
	    public static void displayMsg(){
	        SingletonCls instance = SingletonCls.getInstance();
	        System.out.println(instance.getMessage());
	    }

}
