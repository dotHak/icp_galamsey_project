package galamsey;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.lang.Math;

/**
 * @author JONES DARI
 *This class keeps information about all the GALAMSAY observatories 
 *The class equally returns the largest observatory ever recorded 
 */
public class Monitoring {
	public String ObservatoryName;
	public String getObservatoryName() {
		return ObservatoryName;
	}
	/**
	 * @param observatoryName 
	 * This method can be used to set the name of the GALAMSAY observatory name
	 */
	public void setObservatoryName(String observatoryName) {
		ObservatoryName = observatoryName;
	}
	/**
	 * @return: It returns the colour value associated with a created object
	 */
	public int getColorValue() {
		return ColorValue;
	}
	/**
	 * @param colorValue: It sets the new colour value discovered 
	 */
	public void setColorValue(int colorValue) {
		ColorValue = colorValue;
	}
	//instance variable for the colour value
	public int ColorValue;
	
	/**
	 * This an empty constructor for the monitoring class
	 */
	public Monitoring() {
		
	}
	/**
	 * An overloaded constructor which takes
	 * @param name: The name of colour associated with an given colour name
	 * @param colorNum: The number or value for the colour value based on the intensity of the GALAMSAY
	 */
	public Monitoring(int colorNum, String name) {
		this.ObservatoryName=name;
		this.ColorValue=colorNum;
		}
	/**
	 *This method keeps track of all observatories recorded  and can display all
	 *the records it holds.  
	 */
	public void ListOfObservatories() {
		TreeMap<Integer, String> lst=new TreeMap<Integer, String>();//creating a HashMap object to store observatories
		lst.put(1,"Green" );// populating the HashMap collection
		lst.put(3,"Brown" );
		lst.put(5,"Yellow" );
		System.out.println(lst.lastKey());//returns the largest Galamsay colour value ever recorded
		System.out.println();
		System.out.println(lst.values());
				
			
				
				
			
				
			
	}			
	
	
	/**
	 * @param args
	 * The main method for testing the code above
	 */
	public static void main(String args[]) {
		
		//object of the Monitoring class
		Monitoring m2=new Monitoring(4,"white");
		Monitoring m1=new Monitoring();
		m1.ListOfObservatories();
		//invoking setters and getters methods
		m2.setColorValue(6);
		System.out.println(m2.getColorValue());
		
	}
		

}
