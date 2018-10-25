import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static String getString(Scanner sc, String prompt) { // Validates the String inputs.
		System.out.print(prompt);
		String s = sc.nextLine();
		// If you put in an invalid D/C input on the second run thru there is a bug. I
		// can't seem to figure out where the scanner is stuck.
		return s;
	}
}
