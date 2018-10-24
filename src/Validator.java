import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.nextLine(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}


public static String getStringRPS(Scanner scan, String prompt) {
	boolean isValid = false;
	String s = "null";
	while (isValid == false) {
		System.out.println(prompt);
		if (s.equalsIgnoreCase("R") || s.equalsIgnoreCase("P") || s.equalsIgnoreCase("S")) {
			s = scan.next();
			isValid = true;
		} else {
			System.out.println("Please enter a valid command [Rock(R), paper(P) or scissors(S)]");
		}
			scan.nextLine();	
	}
		return s;
}


public static String getStringDC(Scanner sc, String prompt) {
	boolean isValid = false;
	String s = "null";
	while (isValid == false) {
		System.out.println(prompt);
		s = sc.next();
		if (s.equalsIgnoreCase("D") || s.equalsIgnoreCase("C")) {
			isValid = true;
		} else {
			System.out.println("Please enter a valid command [Dogs(D) or cats(C)]");
			sc.nextLine();
		}
				
	}
		return s;
}}


//	public static int getInt(Scanner sc, String prompt) {
//		int i = 0;
//		boolean isValid = false;
//		while (isValid == false) {
//			System.out.print(prompt);
//			if (sc.hasNextInt()) {
//				i = sc.nextInt();
//				isValid = true;
//			} else {
//				System.out.println("Error! Invalid integer value. Try again.");
//			}
//			sc.nextLine(); // discard any other data entered on the line
//		}
//		return i;
//	}
//
//	public static int getInt(Scanner sc, String prompt, int min, int max) {
//		int i = 0;
//		boolean isValid = false;
//		while (isValid == false) {
//			i = getInt(sc, prompt);
//			if (i < min)
//				System.out.println("Error! Number must be " + min + " or greater.");
//			else if (i > max)
//				System.out.println("Error! Number must be " + max + " or less.");
//			else
//				isValid = true;
//		}
//		return i;
//	}
//
//	public static double getDouble(Scanner sc, String prompt) {
//		double d = 0;
//		boolean isValid = false;
//		while (isValid == false) {
//			System.out.print(prompt);
//			if (sc.hasNextDouble()) {
//				d = sc.nextDouble();
//				isValid = true;
//			} else {
//				System.out.println("Error! Invalid decimal value. Try again.");
//			}
//			sc.nextLine(); // discard any other data entered on the line
//		}
//		return d;
//	}
//
//	public static double getDouble(Scanner sc, String prompt, double min, double max) {
//		double d = 0;
//		boolean isValid = false;
//		while (isValid == false) {
//			d = getDouble(sc, prompt);
//			if (d < min)
//				System.out.println("Error! Number must be " + min + " or greater.");
//			else if (d > max)
//				System.out.println("Error! Number must be " + max + " or less.");
//			else
//				isValid = true;
//		}
//		return d;
//	}
//
//	public static String getStringMatchingRegex(Scanner scan, String prompt, String regex) {
//
//		boolean isValid = false;
//		String input;
//		do {
//
//			input = getString(scan, prompt);
//			if (input.matches(regex)) {
//				isValid = true;
//			} else {
//				System.out.println("input must match the right format: ");
//				isValid = false;
//			}
//		} while (!isValid);
//
//		return input;
//
//	}
//}