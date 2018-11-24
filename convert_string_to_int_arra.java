
public class convert_string_to_int_arra {
	public static void main(String args[]) {
		String test = "12 41 21 19 15 10"; 
		// The string you want to be an integer array.
		String[] integerStrings = test.split(" "); 
		// Splits each spaced integer into a String array.
		int[] integers = new int[integerStrings.length]; 
		// Creates the integer array.
		for (int i = 0; i < integers.length; i++){
		    integers[i] = Integer.parseInt(integerStrings[i]); 
		//Parses the integer for each string.
		    System.out.println(integers[i]);
		}
	}
}	
