import java.util.ArrayList;
import java.util.Arrays;

class BasicJava{

	// Print 1 - 255
	public void twoFiftyFive() {
		for (int i = 1; i < 256; i++ ) {
			System.out.println(i);
		}	
	}

	// Print odd numbers b/w 1-255
	public void oddNums(){
		for (int i = 1; i < 256; i++ ){
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
	// Print sum while interating
	public void sumNum(){

	}
	// Min Max Avg
	public void minMaxAvg(int[] arr){
		int min = arr[0];
		int max = arr[0];
		int sum = 0;
		int avg;

		for (int i = 0; i < arr.length; i++ ) {
			sum = arr[i] + sum;
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		avg = sum / arr.length;
		int[] newArr = {min,max,avg};
		System.out.println(Arrays.toString(newArr));

	}
	// Greater than y
	public void greaterThanY(int[] arr, int y){
		int count = 0;
		for(int x = 0; x < arr.length; x++){;
			if(arr[x] > y){
				count++;
			}
		}
		System.out.println(count);
	}
	// Square array values
	public void squareArr(int[] arr){
		for (int i = 0; i < arr.length ; i++){
			arr[i] = arr[i] * arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}
	// Shift 1

	public void shiftOne(int[] arr){
		for (int i = 0; i < arr.length ; i++){
			try{
				arr[i] = arr[i + 1];
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	// Swap negs with 0 
}