import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		double result;
		System.out.println("Enter  any Arithematic operation add / sub / mul / div ");
		String operation = sc.next();

		switch (operation) {
		case "add":
			result = first + second;
			System.out.println(first + " + " + second + " = " + result);
			break;
		case "sub":
			result = first - second;
			System.out.println(first + " - " + second + " = " + result);
			break;
		case "mul":
			result = first * second;
			System.out.println(first + " * " + second + " = " + result);
			break;
		case "div":
			result = first / second;
			System.out.println(first + " / " + second + " = " + result);
			break;
		default:
			System.out.println("Entered operator does not exist");
		}

	}
}
