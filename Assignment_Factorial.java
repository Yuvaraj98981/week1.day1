package week1.day1;

public class Assignment_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;
		int factorial = 1;
		for (int i = 1; i <= input; i++) {
			factorial = factorial * i;
		}
		System.out.println("The Factorial of the Given Number " + input + " is: " + factorial);
	}

}
