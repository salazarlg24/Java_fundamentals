import java.lang.Math;

class Pythagorean {
	public double calculateHypotenuse(int legA, int legB) {
	double a = legA * legA;
	double b = legB * legB;
	double c = a + b;
  	double squareRoot = Math.sqrt(c);
  	return squareRoot;
	}
}