package project5;

public class JamesBond {
	public static boolean bondRegex(String input) {
		return input.matches("[\\d)]*\\([\\d()]*007[\\d(]*\\)[\\d()]*");
	}
}
