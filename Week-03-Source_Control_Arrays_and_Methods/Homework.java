import java.lang.reflect.Array;

public class Homework {
	
	public static void main(String[] args) {
	
	String fullName = createFullName("Bill", "Smith");
	System.out.println(fullName);
	
	System.out.println(power(3, 4));
	
	String name = fullName;
	int num = 3;
	System.out.println(concatenateWord(name, num));
	
	// New array to print to the console
	int[] array = {1, 5, 2, 8, 13, 6};
		System.out.println(array[0]);
		System.out.println(array[array.length - 1]);
		System.out.println(array[5]);
	// traditional for loop
		for (int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
	}
	// enhanced for loop
		for ( int enhanced : array) {
		System.out.println(enhanced);
	}
	// sum the values in the array
		System.out.println("Sum of array values");
		int sum = 0;
		for (int element: array) {
			sum += element;
		}
		System.out.println(sum);
	// average of all array values
		int sum1 = 0;
		for (int element1 : array) {
			sum1 += element1;
		}
		System.out.println("Average of array values");
		System.out.println(sum1 / array.length);
	// Array values print if odd
		System.out.println("Odd Array Values");
		
		for (int element2 : array) {
			if (element2 % 2 != 0) {
			System.out.println(element2);
		}
		}
		System.out.println("Question 11: Array full of names");
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
			
		// initialize names1 variable
		String names1 = "";
		int nameLength = 0;
		for (String element3 : names) {
			names1 += element3 + " ";
		}
		System.out.println(names1);
		
		
		for (String element4 : names) {
			nameLength += element4.length();
		}
		System.out.println("Question 12: Length of names concatenated");
		System.out.println(nameLength);
			
		System.out.println("Question 13: Method that takes string name and prints greeting");
		printGreeting("John");
	
		System.out.println("Question 14: Method that takes string name and prints greeting with return");
		System.out.println(printGreeting1("John"));
	
		System.out.println("Question 15: True if word longer than int");
		System.out.println(wordLengthVar("Hello", 1));
	
		System.out.println("Question 16: Word contained in array");
		String[] array16 = {"Hello", "Goodbye", "Cat", "Dog"};
		
		System.out.println(containsWord(array16, "Hello"));
		
		System.out.println("Q17: Return smallest in array");
		int[] array17 = {116, 51, 23, -8, 13, 6};
		System.out.println(smallestVar(array17));
		
		System.out.println("Q18: Method return avg of array");
		double[] arraydouble = {1.05, 5.08, 3.09, 8.05, 8.88, 6.63};
		System.out.println(arrayAve(arraydouble));
		
		System.out.println("Q19: strings turned to int length at that location");
		arrayLengths(array16);
		
	}
	
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public static int power(int base, int exponent) {
		int result = 1;
		for (int index = 1; index <= exponent; index++) {
			result = result * base;
		}
		return result;
	}
	
	public static String concatenateWord(String word, int number) {
		String result = "";
		for (int index = 1; index <= number; index++) {
			result = result + word;
		}
		return result;
	}
	
	// Question 13
	public static void printGreeting(String name) {
		System.out.println("Hello, " + name + "! Welcome!");
	}
	// Question 14
	public static String printGreeting1(String name1) {
		return "Hello, " + name1 + "! Welcome to the fam!";
			}
	// Question 15
	public static boolean wordLengthVar(String word, int number) {
		if (word.length() > number) {
			return true;
		} else {
			return false;
		}
	}
	// Question 16
	public static boolean containsWord(String[] words, String wordcont) {
		for (String newArray : words) {
			if (newArray.equals(wordcont)) {
				return true;
			}
		}
		return false;
	}
	// Question 17
	public static int smallestVar(int[] smallfry) {
		int smallest = smallfry[0];
		for (int number17 : smallfry) {
			if (number17 < smallest) {
				smallest = number17;
			}
		}
		return smallest;
	}
	// Question 18
	public static double arrayAve(double[] array18) {
		double sum18 = 0.00;
		for (double sumarray18 : array18) {
			sum18 += sumarray18;
		}
		return sum18 / array18.length;
	}
	// Question 19
	public static void arrayLengths(String[] array19) {
		int[] lengths = new int[array19.length];
		for (int i = 0; i < array19.length; i++) {
			lengths[i] = array19[i].length();
			System.out.println(lengths[i]);
		}
	}

	
	
}



