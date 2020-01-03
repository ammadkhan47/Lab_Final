package calculator;


public class Calculator {
	
	/**This method takes 3 integers and finds the maximum among them.
	 * 
	 * @param num1 integer parameter 
	 * @param num2 integer parameter
	 * @param num3 integer parameter
	 * @return returns the maximum number
	 */
	public int findMax(int num1, int num2, int num3) {  
		 int[] arr = { num1, num2, num3 };   
		int max = 0;   
		for (int i = 1; i < arr.length; i++) {  
		  if (arr[i] > max)     max = arr[i];
		   }  
		 return max;  
	}
		/**This method takes a integer and computes square of it.
		 * 
		 * @param num integer parameter
		 * @return returns the square of an integer.
		 * @throws IllegalArgumentException exception thrown when parameter num is less than 1 and greater than 9
		 */
		 public int square(int num) throws IllegalArgumentException {  
			 int result = 0;   
			if (num > 0 && num < 10)  
			  result = num * num;  
			else
				throw new IllegalArgumentException();
			return result;  } 
		 
		 /** This method takes a integer and computes cube of it.
		  * 
		  * @param num integer parameter
		  * @return returns the cube of an integer.
		  */
		 public int cube(int num) {
			 
			 return num*num*num;
		 
		 }
}

