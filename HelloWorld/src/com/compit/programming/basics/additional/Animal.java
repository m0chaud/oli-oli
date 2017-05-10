package com.compit.programming.basics.additional;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chaudharimehul
 * 
 * This program is from youtube tutorial. Code is copied from youtube link and modified for performing certain experiments
 * https://www.youtube.com/watch?v=WPvGqX-TXP0
 */
public class Animal {

	private static final double FAVNUMBER = 1.6180;

	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;

	protected static int numberOfAnimal = 0;

	static Scanner userInput = new Scanner(System.in);

	public Animal() {

		numberOfAnimal++;

		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNumbers );

		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " + diffOfNumbers );

		int multiOfNumbers = 5 * 1;
		System.out.println("5 * 1 = " + multiOfNumbers );

		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 = " + divOfNumbers );

		int modOfNumbers = 5 % 3;
		System.out.println("5 % 3 = " + modOfNumbers );

/*		if (userInput.hasNextLine()) {
			this.setName(userInput.nextLine());
		}
*/
		this.setFavoriteChar();
		this.setUniqueID();

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public boolean isHasOwner() {
		return hasOwner;
	}


	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}


	public byte getAge() {
		return age;
	}


	public void setAge(byte age) {
		this.age = age;
	}


	public long getUniqueID() {
		return uniqueID;
	}


	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
	}


	public void setUniqueID() {

		long minNumber = 1;
		long maxNumber = 1000000;

		// Generates a random number between 1 and 1000000
		this.uniqueID = minNumber + (long)(Math.random() * ((maxNumber - minNumber) + 1));

		// You can cast from one primitive value into another by putting what you want between ( )
		// (byte) (short) (long) (double)
		// (float), (boolean) & (char) don't work.
		// (char) stays as a number instead of a character
		// You convert from a primitive to a string like this

		String stringNumber = Long.toString(maxNumber);
		// Byte.toString(bigByte); Short.toString(bigShort); Integer.toString(bigInt);
		// Float.toString(bigFloat); Double.toString(bigDouble); Boolean.toString(trueOrFalse);
		// You convert from a String to a primitive like this
		int numberString = Integer.parseInt(stringNumber);
		System.out.println(" the number string is : " + numberString);
		// parseShort, parseLong, parseByte, parseFloat, parseDouble, parseBoolean
		System.out.println("Unique ID set to: " + this.uniqueID);

	}


	public char getFavoriteChar() {
		return favoriteChar;
	}


	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}


	public void setFavoriteChar() {

		int randomNumber = (int) (Math.random() * 126) + 1;
		this.favoriteChar = (char) randomNumber;

		// if then else statement
		// > < == != >= <=
		if(randomNumber == 32){
			System.out.println("Favorite character set to: Space");
		} else if(randomNumber == 10){
			System.out.println("Favorite character set to: New Line");
		} else {
			System.out.println("Favorite character set to: " + this.favoriteChar);
		}

		// Logical operators
		// ! : Converts the boolean value to its right to its opposite form ie. true to false
		// & : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)
		// && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
		// | : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
		// || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
		// ^ : Returns true if there is 1 true and 1 false boolean value on the right or left
		if((randomNumber > 97) && (randomNumber < 122)){
			System.out.println("Favorite character is a lowercase letter");
		}
		if(((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))){
			System.out.println("Favorite character is a letter");
		}
		if(!false){
			System.out.println("I turned false to " + !false);
		}

		// The ternary operator assigns one or another value based on a condition
		int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;
		System.out.println("The biggest number is " + whichIsBigger);

		// The switch statement is great for when you have a limited number of values
		// and the values are int, byte, or char unless you have Java 7 which allows Strings
		switch(randomNumber){
		case 8 :
			System.out.println("Favorite character set to: Backspace");
			break;
		case 9 :
			System.out.println("Favorite character set to: Horizontal Tab");
			break;
		case 10 :
		case 11 :
		case 12 :
			System.out.println("Favorite character set to: Something else weird");
			break;
		default :
			System.out.println("Favorite character set to: " + this.favoriteChar);
			break;
		}
	}

	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", hasOwner=" + hasOwner + ", age=" + age + ", uniqueID="
				+ uniqueID + ", favoriteChar=" + favoriteChar + ", speed=" + speed + ", height=" + height + "]";
	}


	protected static void countTo(int startingNumber){

		for(int i = startingNumber; i <= 100; i++){

			// continue is used to skip 1 iteration of the loop
			if(i == 90) continue;
			System.out.println(i);

		}
	}



	protected static String printNumbers(int maxNumbers){

		int i = 1;

		while(i < (maxNumbers / 2)){

			System.out.println(i);
			i++;

			// This isn't needed, but if you want to jump out of a loop use break
			if(i == (maxNumbers/2)) break;
		}

		Animal.countTo(maxNumbers/2);

		// You can return a value like this
		return "End of printNumbers()";

	}

	protected static void guessMyNumber(){

		int number;

		// Do while loops are used when you want to execute the code in the braces at least once
		do {
			System.out.println("Guess my number up to 100");
			// If what they entered isn't a number send a warning
			while(!userInput.hasNextInt()){
				String numberEntered = userInput.next();
				System.out.printf("%s is not a number\n", numberEntered);
			}
			number = userInput.nextInt();
		}while(number != 50);

		System.out.println("Yes the number was 50");
	}

	// This will be used to demonstrate polymorphism
	public String makeSound(){
		return "Grrrr";
	}

	// With polymorphism we can refer to any Animal and yet use overridden methods
	// in the specific animal type
	public static void speakAnimal(Animal randAnimal){
		System.out.println("Animal says " + randAnimal.makeSound());
	}


	public static void main(String[] args){

		Animal theDog = new Animal();

		System.out.println("The animal is named " + theDog.getName());
//		System.out.println(Animal.printNumbers(100));

//		Animal.countTo(100);
//		Animal.guessMyNumber();

		// An array is a fixed series of boxes that contain multiple values of the same data type
		// How you create arrays
		// int[] favoriteNumbers;
		// favoriteNumbers = new int[20];

		int[] favoriteNumbers = new int[20];
		favoriteNumbers[0] = 100;

		String[] stringArray = {"Random", "Words", "Here"};

		// for(dataType[] varForRow : arrayName)
		for(String word : stringArray)
		{
			System.out.println(word);
		}
		
		//One Dimension Array
		String oneDimArray[] = {"1","2", "3"};
		
		for (int i = 0; i < oneDimArray.length; i++) {
			System.out.println(oneDimArray[i]);
		}
		
		//Two dimensional Array
		String twoDimensionalArray[][] = {{"000","001"},{"010","011"}};
		
		for (int i = 0; i < twoDimensionalArray.length; i++) {
			for (int j = 0; j < twoDimensionalArray[i].length; j++) {
				System.out.print("|" + twoDimensionalArray[i][j]);
			}
			System.out.println("|");
		}
		
		String threeDimensionalArray[][][] = {{{"000","001"},{"100","101"},{"200","201"},{"300","301"}},
											  {{"010","011"},{"110","111"},{"210","211"},{"310","311"}}};

		String threeDimensionalArrayOneMore[][][] = {{{"000"},{"100"},{"200"},{"300"}},
				  {{"010"},{"110"},{"210"},{"310"}}};
		
		// This is a multidimensional array
		//1. ArrayName
		//2. How Many Go Down (or Say How Many Rows)
		//3. How Many Across (or Say How Many Columns)
		//4. How many of those groups (or say How many are for the last size of array)
		String[][][] threeDimLastHasTwo = { { { "000","001" }, { "100","101" }, { "200","201" }, { "300","301" } },
				{ { "010","011" }, { "110","111" }, { "210","211" }, { "310","311" } },
				{ { "020","021" }, { "120","121" }, { "220","221" }, { "320","321" } }};

		String[][][][] fourDimension = {{ { { "000" }, { "100" }, { "200" }, { "300" } },
				{ { "010" }, { "110" }, { "210" }, { "310" } },
				{ { "020" }, { "120" }, { "220" }, { "320" } }},{ { { "001" }, { "101" }, { "201" }, { "301" } },
					{ { "011" }, { "111" }, { "211" }, { "311" } },
					{ { "021" }, { "121" }, { "221" }, { "321" } }}};

		for(int i = 0; i < threeDimLastHasTwo.length; i++)
		{
			System.out.println("i = " + i + " arrayName.length =" + threeDimLastHasTwo.length );
			for(int j = 0; j < threeDimLastHasTwo[i].length; j++)
			{
				System.out.println("i = " + i + " arrayName.length =" + threeDimLastHasTwo.length  + " j = " + j + " arrayName[i].length = " + threeDimLastHasTwo[i].length);				
				for(int k = 0; k < threeDimLastHasTwo[i][j].length; k++)
				{
					System.out.println("i = " + i + " arrayName.length =" + threeDimLastHasTwo.length  + " j = " + j + " arrayName[i].length = " + threeDimLastHasTwo[i].length + " k = " + k + " arrayName[i][j].length = " + threeDimLastHasTwo[i][j].length);				
					System.out.print("| " + threeDimLastHasTwo[i][j][k] + " ");
				}
			}

			System.out.println("|");
		}

		for(int i = 0; i < threeDimLastHasTwo.length; i++)
		{
			for(int j = 0; j < threeDimLastHasTwo[i].length; j++)
			{
				for(int k = 0; k < threeDimLastHasTwo[i][j].length; k++)
				{
					System.out.print("| " + threeDimLastHasTwo[i][j][k] + " ");
				}
			}

			System.out.println("|");
		}

		// You can copy an array (stringToCopy, indexes to copy)
		String[] cloneOfArray = Arrays.copyOf(stringArray, 3);

		// You can print out the whole array
		System.out.println(Arrays.toString(cloneOfArray));

		// Returns the index or a negative number
		System.out.println(Arrays.binarySearch(cloneOfArray, "Random"));
		System.out.println(Arrays.binarySearch(threeDimLastHasTwo[0][0], "000"));

	}

}
