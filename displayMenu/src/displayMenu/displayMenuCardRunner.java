package displayMenu;

import java.util.Scanner;

public class displayMenuCardRunner {

	public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("input number 1");
    int number1= scanner.nextInt();
    //System.out.println("The number you Entered is :"+ number1);
	System.out.println("input number 2");
	int number2 = scanner.nextInt();
	System.out.println("1 for addition\n 2 for minus \n 3 for multiply \n 4 for divide");
	System.out.println("Select one of the option:");
	int option = scanner.nextInt();
	if (option==1) {
		System.out.println(number1+number2);
		}
	else if(option==2) {
		System.out.println(number1-number2);
	}
	else if(option==3) {
		System.out.println(number1*number2);
	}
	else {
		System.out.println(number1/number2);
	}
	}

}
