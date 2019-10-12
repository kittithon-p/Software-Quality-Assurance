import java.util.Scanner;

public class Main {

	private static Scanner keyboard;
	public static void main(String[] args) {
		int input;
		keyboard = new Scanner(System.in);
		System.out.print("Enter Integer 1-100 : ");
		input = keyboard.nextInt();
		String output = getInt(input);
		System.out.print(""+output);
			
	}
	
		public static String getInt(int keyboard) {
			if (((keyboard%3)==0)&&((keyboard%5)==0)) {
				return FizzBuzz();	
			} else if ((keyboard%3)==0) {
				return Fizz();	
			}else if ((keyboard%5)==0) {
				return Buzz();	
			}else {
				return Integer.toString(keyboard);
			}
			
		}
		
		public static String Fizz() {
			return "Fizz";
		}
		public static String Buzz() {
			return "Buzz";
		}
		public static String FizzBuzz() {
			return "FizzBuzz";
		}
}