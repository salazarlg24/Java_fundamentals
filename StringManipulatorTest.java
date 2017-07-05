class StringManipulatorTest{

	public static void main(String[] args) {
		
		StringManipulator trim = new StringManipulator();
		String output = trim.trimAndConcat("Hello", "World");
		System.out.println(output);

		StringManipulator indexOrNull = new StringManipulator();
		String output2 = indexOrNull.getIndexOrNull("Hello", "o");
		System.out.println(output2);

		StringManipulator indexOrNull2 = new StringManipulator();
		String output3 = indexOrNull2.getIndexOrNull("Hello World", "World");
		System.out.println(output3);

		StringManipulator concat = new StringManipulator();
		String output4 = concat.concatSubstring("Hello",1,2,"World");
		System.out.println(output4);
	}

}