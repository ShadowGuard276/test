package charcter;

public class charRunner {

	public static void main(String[] args) {
	
			MyChar myChar = new MyChar('A');
			System.out.println(myChar.isVowel());
			
			//'a', 'e', 'i', 'o', 'u' and Capitals
			System.out.println(myChar.isDigit());
			System.out.println(myChar.isAlphabet()); //'a' to 'z' or 'A' to 'Z'

			System.out.println(myChar.isConsonant());
			
			MyChar.printLowerCaseAlphabets();
			MyChar.printUpperCaseAlphabets();

	}

}
