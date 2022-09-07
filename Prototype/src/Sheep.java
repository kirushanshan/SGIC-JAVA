
public class Sheep implements Animal {

	public Sheep() {
		System.out.println("Sheep is madde");
	}
	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is being madde");
		
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sheepObject;
	}
	
	@Override
	public String toString() {
		return("In the pro");
	}
	
	
	

}
