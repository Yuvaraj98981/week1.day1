package week1.day1;

public class Assignment_CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 97;
		boolean flag = false;
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				flag = true;
				break;
			}
		}
		System.out.println(flag);
		if (flag == true) {
			System.out.println("The Given Number " + input + " is Not Prime");
		} else {
			System.out.println("The Given Number " + input + " is Prime");
		}
	}

}
