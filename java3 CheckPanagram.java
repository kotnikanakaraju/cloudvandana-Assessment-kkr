package kanaka;

public class CheckPanagram {
	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(sentence);
        System.out.println("Is the sentence a Pangram? " + isPangram);
		
	}
	private static boolean checkPangram(String str) {
        boolean[] mark = new boolean[26];
        int index;
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            } else {
                continue;
            }
            mark[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (!mark[i]) {
                return false;
            }
        }
        return true;
    }

}
