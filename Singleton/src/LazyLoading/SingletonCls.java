package LazyLoading;

public class SingletonCls {
	   // singleton instance declaration
    private static SingletonCls singletonInst;
     
    // a variable of singleton class
    private String message = "";
     
    // making constructor private so that no other class could use the default constructor
    private SingletonCls() {
        System.out.println("Singleton instance created.");
    }
     
    // the method which gives access to the only instance of SingletonCls
    public static SingletonCls getInstance(){
        if(singletonInst==null){
            singletonInst = new SingletonCls();
            System.out.println("SingletonCls instance created for the first time.");
        }
        return singletonInst;
    }
 
    // getter for the variable message
    public String getMessage() {
        return message;
    }
 
    // setter for the variable message
    public void setMessage(String message) {
        this.message = message;
    }

}
