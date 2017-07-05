class PythagoreanTest{
	public static void main(String[] args) {
		Pythagorean pythTest = new Pythagorean();
		double legC = pythTest.calculateHypotenuse(4,9);
		System.out.println("Leg C is: " + legC);
	}
}