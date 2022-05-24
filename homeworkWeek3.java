
public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Create an array of int called ages that contains the following values: 3,
		 * 9, 23, 64, 2, 8, 28, 93. a. Programmatically subtract the value of the first
		 * element in the array from the value in the last element of the array (i.e. do
		 * not use ages[7] in your code). Print the result to the console. b. Add a new
		 * age to your array and repeat the step above to ensure it is dynamic (works
		 * for arrays of different lengths). c. Use a loop to iterate through the array
		 * and calculate the average age. Print the result to the console.
		 */
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 0};

		int lastMinusFirst = ages[ages.length - 1] - ages[0];
		System.out.println(lastMinusFirst);

		double sum = 0;
		for(int i = 0; i < ages.length; i++) {
		sum += ages[i];
		}
		double average = sum / ages.length;
		System.out.println("array average: " + average);

		/*
		 * 2. Create an array of String called names that contains the following values:
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”. a. Use a loop to iterate
		 * through the array and calculate the average number of letters per name. Print
		 * the result to the console. b. Use a loop to iterate through the array again
		 * and concatenate all the names together, separated by spaces, and print the
		 * result to the console.
		 */
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		double sum2 = 0;
		for (String person : names) {
		sum2 += person.length();
		}
		double average2 = sum2 / names.length;
		System.out.println("name length average " + average2);

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		 }
		System.out.println("");

		String firstElement = names[0];
		String lastElement = names[names.length - 1];
		System.out.println("first element: " + firstElement);
		System.out.println("last element: " + lastElement);

		/*
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over
		 * the previously created names array and add the length of each name to the
		 * nameLengths array.
		 */
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int[] nameLengths = new int[names.length];

		for (int i = 0; i < nameLengths.length; i++) {
		nameLengths[i] = (names[i]).length();
	 }
		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
		 * of all the elements in the array. Print the result to the console.
		 */
		int sum3 = 0;
		for(int number : nameLengths) {
		sum3 += number;

		System.out.println(sum3);

	
		}
	/*
	 * 7. Write a method that takes a String, word, and an int, n, as arguments and
	 * returns the word concatenated to itself n number of times. (i.e. if I pass in
	 * “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	 */
	
	public static String stringTogether(String word, int n) {
		String strungWord = "";

		for (int i = 0; i < n; i++) {
			strungWord += word;

		}
		return strungWord;
		
	}
	
	/* 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
	 * (the full name should be the first and the last name as a String separated by a space).		
	 */
		
	public static String combineStrings(String firstName, String lastName) {
		return (firstName + " " + lastName);
		
	
	}	
		
	/* 9.	Write a method that takes an array of int and returns true if the sum of all the 
	 * ints in the array is greater than 100.
	 */
	
	public static boolean isSumGreater100(int[] numbers) {
		
		int sumOfArray = 0;
		for(int i = 0; i < numbers.length; i++) {
			sumOfArray += numbers[i]; 	
		}
		return sumOfArray > 100;
		
	}
/* 10.	Write a method that takes an array of double and returns the average of all the elements in the array.
 * 	
 */
	
	public static double averageDoubles(double[] nums) {
		double sumDoubles = 0; 
		for(int i = 0; i < nums.length; i++) {
			sumDoubles += nums[i];
		}
		return sumDoubles / nums.length; 
	}
	
	/* 11.	Write a method that takes two arrays of double and returns true if the average of the elements in 
	 * the first array is greater than the average of the elements in the second array.
	 */
	
	public static boolean isFirstAverageGreater(double[] first, double[] second) {
		double sumFirst = 0;
		double sumSecond = 0;
		for(int i = 0; i < first.length; i++) {
			sumFirst += first[i];
		}
		for(int i = 0; i < second.length; i++) {
			sumSecond += second[i];
		}
		double firstAv = sumFirst / first.length;
		double secondAv = sumSecond / second.length;
		return firstAv > secondAv; 
	}
	
/* 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a 
 * double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.	
 */
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside == true && moneyInPocket > 10.50;
		
	}
/* 13.	Create a method of your own that solves a problem. In comments, write what 
 * the method does and why you created it.	
 */
	
	public static boolean kidGetsDessert(double proportionDinnerEaten, int minutesOnScreens) {
		return proportionDinnerEaten > 0.5 && minutesOnScreens < 60;
		
		//This method is roughly what I use to determine whether my 7 year old should be allowed to have sweets. 
		//(i.e., he ate enough good food and theoretically got some exercise because he wasn't sitting all day.) 
		//Sometimes this is a tough decision in the moment...I would love to be more consistent. :) 
	}
	
}
