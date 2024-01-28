package codingProject;

public class Week04_Coding_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// 1. 
	// initialize array
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
	// a) subtract value of first element from last and print to console
		System.out.println(ages[ages.length-1]- ages[0]);
		
	// b) new array	with 9 elements
		int[] ages2 = {5, 12, 123, 15, 54, 89, 978, 15, 258};
		
	// b) ii. Repeat step 1.a
		System.out.println(ages2[ages2.length-1]- ages2[0]);
		
	// c) iterate through ages[] to calculate average age and print to the console
		int sum = 0;
		for (int age : ages) {
			sum += age;	
		}
		int averageAge = sum / ages.length;
		System.out.println(averageAge);
		
	// 2. create array
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	// a) use loop to calc avg number of letters per name
		int totalLength = 0;
		for (String name : names) {
			totalLength += name.length();
					}
			System.out.println(totalLength / names.length);
	
	// b) concatenate all names in the array, separated by spaces. Print to console.
		String concatString = "";
		for (String nameb : names) {
			concatString += nameb + " ";
		}
		System.out.println(concatString);
		
	// 3. How do you access the last element of any array?
			// array.length - 1

	// 4. How do you access the first element of any array?
			// array[0]
			
	// 5. New array called nameLengths - loop through names[] and add length of each name to nameLengths[]
		int[] nameLengths = new int[names.length]; // declare new array
		int i = 0; 
		for (String name5 : names) {
			nameLengths[i] = name5.length(); // loop through each index and put the value of the string length into the new array
			// System.out.println(nameLengths[i]); // print to console each value
			i++; 
		}
	
		// 6. Add up all values in nameLengths[] and print to console
		int sum6 = 0;
		for (int name6 : nameLengths) {
			sum6 += name6; // adds up the values through the loop
		}
		System.out.println(sum6); // prints value to console after loop completes
		
		// Test code for Question 7 method
			// System.out.println(concatenateStringAndInt("Bob", 3));
		
		// Test code for Question 8 method
			// System.out.println(fullName("Spencer", "Bean"));
		
		// Test code for Question 9 method
			// System.out.println(sumBiggerThan100(ages));
		
		double[] doubleArray = {3.50, 5.50, 3.50, 9.50, 8.00}; //test array for Question 10
		// System.out.println(arrayAverage(doubleArray));
		
		// Test code for Question 11
		double[] doubleArray2 = {2.50, 5.50, 3.50, 9.50, 8.00};
		// System.out.println(compareAverages(doubleArray, doubleArray2)); // Test print for Question 11
		
		//Test code for Question 12
		// boolean temp = true;
		// double money = 10.51;
		//System.out.println(drinkTempOutside(temp, money)); // print to console true or false depending on preceding variables
		
		// Test for Question 13 "create your own method"
		convertMphtoFPS(80);
	}
	
	
	
	
	// 7. Use a method to take a string and int and concatenate values in string as many times as the value of int
public static String concatenateStringAndInt(String word, int n) { // initialize the method and declare what variables will be input
	String word7 = "";		
	for (int i = 0; i < n; i++) { // loop through word the number of times of n
		word7 += word; // add the string value of word to the end of the string value of word7
		}
	return word7; // return the value of word7 after the loop has completed
	}

	// 8. Write a method that takes two strings, and returns full name separated by a space
public static String fullName(String firstName, String lastName) { // initialize method
	return firstName + " " + lastName; // return value pieced together
	}

	// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
public static boolean sumBiggerThan100(int[] array) { // initialize boolean method
	int sum9 = 0;
	for (int num : array) { // start enhanced loop
		sum9 += num; // add up all values in array
	}
	return sum9 > 100; // returns true or false 
	}

	// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
public static double arrayAverage(double[] array10) { //initialize double method
	double sum10 = 0;
	for (double num10 : array10) { // start loop
		sum10 += num10; // add values in array together
	}
	return sum10 / array10.length; //returns average size of each value in array
}

	// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
public static boolean compareAverages(double[] array11, double[] array111) {
	double sum11 = 0.00;
	double sum111 = 0.00;
	for (double num11 : array11) { // start loop
		sum11 += num11; // add values in array together
}
	for (double num111 : array111) { // start loop
		sum111 += num111; // add values in array together
	}
	double avg1 = sum11 / array11.length; // gets average value for first array
	double avg2 = sum111 / array111.length; // gets average value for second array
	return avg1 > avg2; // returns true or false
}

	// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
public static boolean drinkTempOutside(boolean isHotOutside, double moneyInPocket) {
	return isHotOutside && moneyInPocket > 10.50;
}

	// 13. Write my own method - I will make a calculator that will calculate how many feet per second you are traveling based on an input of miles per hour and have it print to the console when invoked
public static void convertMphtoFPS(double howFast) { // initialize method
	double feetPerSecond = (howFast * 5280.00) / 3600.00; // calculate feet per second
	System.out.println(feetPerSecond); // print value to console
	}



}
