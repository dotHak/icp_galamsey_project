// Package name
package MonitoringIO_Class;


// imports
import java.util.Scanner;

/**
 * This class allows the user to enter the information about galamsey, through providing a menu from which he/she chooses what he/she wants to enter
 * 
 * @author Lisa Princesse Ikirezi
 * @version 1.0.0
 */


public class monitoringIO {

	// instance variable
	
	static Scanner input=new Scanner(System.in); // used to get the information from the keyboard entered by the user.
	
	public monitoringIO() {
		
		// Default Constructor
	}
	
	/**
	 *  GalamseyData method asks the user to provide information to create a Galamsey object
	 *  @param longitude The Longitude of the Galamsey position
	 *  @param latitude  The latitude of Galamsey position
	 *  @param year      The year in which the Galamsey occured
	 *  @param colour    The colour that indicates the intensity of Galamsey
	 */

	public static void GalamseyData() {
		
		// Entering Galamsey Data
		System.out.println(" Enter Longitude of Galamsey");
		double longitude= input.nextDouble();
		
		System.out.println("Enter Latitude of Galamsey");
		double latitude= input.nextDouble();
		
		System.out.println(" Enter Galamsey Year as an integer. E.g: 2001");
		int year=input.nextInt();
		
		System.out.println("Enter Colour. Options:\n green\n Yellow\n brown ");
		vegColour colour= input.nextLine();
		
		//Creates an object of Galamsey with data entered
		
		Galamsey GalamseyData= new Galamsey(longitude, latitude, year, colour);
		
		GalamseyData.toString(); // Prints the data entered to the screen
	}
	
	/**
	 *  ObservatoryData method asks the user to enter information to create an observatory 
	 */

	public void ObservatoryData() {
		
		// Entering Observatory Data
		Observatory  ObservatoryData1= new Observatory();
		
		System.out.println(" Enter the Observatory NAME");
		ObservatoryData1.setCountryName(input.nextLine());
		
		System.out.println(" Enter the country name");
		ObservatoryData1.setObservatoryName(input.nextLine());
		
		System.out.println(" Enter year it started");
		ObservatoryData1.setYearStarted(input.nextInt());
		
		System.out.println(" Enter area covered");
		ObservatoryData1.setAreaCovered(input.nextDouble());
		
		ObservatoryData1.toString();
		
				
	}

		/**
		 * Main method which prints a menu for the user to enter data on galamsey.
		 * @param args
		 */
	public static void main(String[] args) {
		
		monitoringIO monitoringIOObjects= new monitoringIO();
				
		// Printed Menu to the user, to guide them on what to choose
		
		System.out.println("        The available Features");
		System.out.println("      ----------------------------\n");
		System.out.println(" Instructions: \n");
		System.out.println("  Type 1 if you want to enter Observatory data");
		System.out.println("  Type 2 if you want to enter Galamsey Data");
		System.out.println("  Type 3 if you want to provide monitoring Statistics on the following:"+ "\n\n"+ "    a. Largest Average Galamsey"+"\n\n"+ "    b. Largest Galamsey ever"+ "\n\n"+"    c. All Galamsey with colour value greater than the one provided\n");
		System.out.println("  Type 4 to Exit \n\n");
		
		// Asks the user to choose which feature they want to fill based on the menu provided
		
		System.out.println(" Which feature do you want to enter: \n");
		
		int choiceNumber= input.nextInt();
		

			while (choiceNumber < 5) {
					
		
				switch (choiceNumber){
			
					case 1:
					
						monitoringIOObjects.ObservatoryData();
						break;
			
					case 2:
				
						GalamseyData();
						break;
						
					case 3:
						
						// First user enters  the statistics for the largest Average Galamsey						
							
						System.out.println("Enter statistics of the largest average galamsey");
							
						String LargestGalamsey= input.nextLine();
							
						// Secondly user enters the largest galamsey ever
						
						System.out.println("Enter statistics of the largest galamsey ever");
							
						String LargestGalamseyEver= input.nextLine();
							
						// Lastly user enters statistics of galamseys with colour value greater than 1. Where 1 represents Green and im
						
						int colourNum=1; // a given number
						
						System.out.println(" Enter statistics of galamseys with colour value greater than"+ colourNum);
						
						String GalamseyGreaterStat= input.nextLine();
	
		
					case 4:
				
						// Exiting 
						System.out.println(" YOU HAVE EXITED ");
						input.close();
						System.exit(0);
				
				
				}
			
				System.out.println(" Which Feature do you want to enter NEXT");
		
				choiceNumber= input.nextInt();
		
			}
	}
	
}
