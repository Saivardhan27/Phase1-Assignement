import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email");
		String s = sc.next();
		String[] array = { "jjfgsfsfd@gmail.com", "tejeswar@gmail.com", "saivardhan@gmail.com", "naveenkumar@gmail.com",
				"sravankumar@gmail.com" };
		if(search(array,s)) System.out.println("Email is available");
		else System.out.println("Entered email is not found");
	}

	public static boolean search(String[] array, String s) {
		for (int i = 0; i < array.length; i++) {
			if (s.equalsIgnoreCase(array[i]))
				return true;
		}
		return false;
	}
}
