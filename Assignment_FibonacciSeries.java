package week1.day1;

public class Assignment_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 11;
		int fnum = 0;
		int snum = 1;
		int sum = 0;
		System.out.println("The Fibonacci Series for the Given Number " + input + " is: ");
		System.out.println(fnum);
		System.out.println(snum);
		for (int i = 2; i < input; i++) {
			sum = fnum + snum;
			fnum = snum;
			snum = sum;
			System.out.println(sum);
		}

	}
}
