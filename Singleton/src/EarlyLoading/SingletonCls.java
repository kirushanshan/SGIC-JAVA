package EarlyLoading;

/**
* Singleton Class in Java with Early loading
*/

public class SingletonCls {
	// singleton instance, this instance is created in JVM during start of the application
    // which is early loading
    private static final SingletonCls singletonInst = new SingletonCls();
     
    // a variable of singleton class
    private String message = "";
     
    // making constructor private so that no other class could use the default constructor
    private SingletonCls() {
    }
     
    // the method which gives access to the only instance of SingletonCls
    public static SingletonCls getInstance(){
        return singletonInst;
    }
 
    // getter for the vairable message
    public String getMessage() {
        return message;
    }
 
    // setter for the variable message
    public void setMessage(String message) {
        this.message = message;
    }

}
