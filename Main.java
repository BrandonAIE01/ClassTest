import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		double num1 = input.nextDouble();
		
		System.out.println("Enter number 2");
		double num2 = input.nextDouble();
		
		System.out.println("Enter operator");
		char opr = input.next().charAt(0);
		
		logic c = new logic(num1,num2,opr);
		
		System.out.println(c.calculation());

	}

}
