public class StringManipulator{
	public String trimAndConcat(String wordA, String wordB){
		String wordC = wordA +" "+ wordB;
		return wordC;
	};

	public String getIndexOrNull(String wordA, char letter){
		int index = wordA.indexOf(letter);
		if (index != -1){
			return String.valueOf(index);
		}
		else {
			return null;
		}
	};

	public String getIndexOrNull(String wordA, String wordB){
		int index = wordA.indexOf(wordB);
		if (index != -1){
			return String.valueOf(index);
		}
		else {
			return null;
		}
	};

	public String concatSubstring(String wordA, int num1, int num2, String wordB){
		String wordC = wordA.charAt(num1) + wordB;
		return wordC;
	};


}