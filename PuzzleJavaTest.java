class PuzzleJavaTest{

	public static void main(String[] args) {
		PuzzleJava pJ = new PuzzleJava();
		int[] arr = {3,5,1,2,7,9,8,13,25,32};
		String[] namesArr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};

		// greater than 10
		// for (Object y : pJ.greaterThanTen(arr) ) {
		// 	System.out.println(y);
		// }

		// names
		// for (Object y : pJ.longNames(namesArr) ) {
		// 	System.out.println(y);
		// }

		// is a vowel
		// pJ.isVowel();

		// Random num
		// pJ.randTen();

		// Random String
		System.out.println(pJ.genRandomString());
		pJ.gen10RandString();




	}

}