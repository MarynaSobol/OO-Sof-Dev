//Student Name: Maryna Sobol
//Student ID: C00312784
// Student Name 	: Oisin Cawley
// Student Id Number: 
// Date 			: Nov-2015
// Purpose 			: My first class implementation

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		thermB();
	} // end main

	public static void thermB() 
	{ // being thermB method
		double thempB = 0.0;
		Thermometer thermB = new Thermometer(10.0);		// Create an instance of our Thermometer class
		thempB = thermB.getCelsius();
		System.out.println("Temp. of Thermometer B is " + thempB);
		
	} // end thermB
} // end class ThermTest