import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class PuzzleJava{

	// Greater than 10
	public ArrayList greaterThanTen(int[] arr){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int x : arr) {
			if( x > 10){
				newList.add(x);
			}
		}
		return newList;
	}
	// Find long names
	public ArrayList longNames(String[] namesArr){
		ArrayList<String> newList = new ArrayList<String>();
		namesArr = shuffleArray(namesArr);
		for (String x : namesArr){
			if (x.length() > 5) {
				newList.add(x);
			}
		}
		return newList;
	}

	// Shuffle
	public String[] shuffleArray(String[] arr){
		Random rand = ThreadLocalRandom.current();
		for (int i = arr.length - 1; i > 0; i--){
			int index = rand.nextInt(i + 1);
			String a = arr[index];
			arr[index] = arr[i];
			arr[i] = a;
		}
		return arr;
	}

	// is a vowel
	public void isVowel(){
		String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		alpha = shuffleArray(alpha);

		System.out.println(alpha[0]);
		System.out.println(alpha[alpha.length - 1 ]);

		String[] vowels = {"a", "e", "i", "o", "u"};

		if(Arrays.asList(vowels).contains(alpha[0])){
			System.out.println("VOWEL!");
		}
	}

	// Random num
	public int[] randTen(){
		int[] randomTen;
		randomTen = new int[10];
		Random randomGen = new Random();

		for (int i = 1; i <= 10; i++ ) {
			randomTen[i - 1] = randomGen.nextInt(101-55)+55;
		}
		System.out.println(Arrays.toString(randomTen));
		return randomTen;

	}

	// Random String
	public static String genRandomString(){
		Random rand = ThreadLocalRandom.current();
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int five = 5;
	return generateString(rand, letters, five);
	}

	public static String[] gen10RandString(){
		String[] stringArray;
		stringArray = new String[10];
		Random rng = ThreadLocalRandom.current();
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int five = 5;

		for(int x = 0; x < 10; x++){
		String randString = generateString(rng, letters, five);
		stringArray[x] = randString;
		}
		System.out.println(Arrays.toString(stringArray));
		return stringArray;
	}

	public static String generateString(Random rand, String characters, int length){
	char[] text = new char[length];
	for ( int i = 0; i < length; i++){
	  text[i] = characters.charAt(rand.nextInt(characters.length()));
	}
	return new String(text);
	}

}