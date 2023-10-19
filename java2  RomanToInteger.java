package kanaka;

public class RomanToInteger {
	public static void main(String[] args) {
		String romanNumber = "IX";
        int integerNumber = romanToInteger(romanNumber);
        System.out.println("Roman Number " + romanNumber + " is converted to Integer " + integerNumber);
		
	}
	private static int romanToInteger(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && romanCharToInt(s.charAt(i)) > romanCharToInt(s.charAt(i - 1))) {
                res += romanCharToInt(s.charAt(i)) - 2 * romanCharToInt(s.charAt(i - 1));
            } else {
                res += romanCharToInt(s.charAt(i));
            }
        }
        return res;
    }
	private static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
	}

}
