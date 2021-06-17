package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
	String[] things = {"one","two","three","four","five"};
	
		//2. print the third element in the array
	  System.out.println(things[3]);
		//3. set the third element to a different value
		things[3] = "ten";
		Random ran = new Random();
		//4. print the third element again
		System.out.println(things[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		int[] numbs = new int[50];
		for (int i = 0; i<numbs.length; i++) {
			numbs[i] = ran.nextInt(100);
		}
		
		//6. make an array of 50 integers
		int smallest = numbs[0];
		for (int f = 0; f<numbs.length; f++) {
			if(numbs[f]<smallest) {
				smallest = numbs[f];
			}
		}
		System.out.println(smallest);
		//7. use a for loop to make every value of the integer array a random number
		System.out.println(numbs);
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
