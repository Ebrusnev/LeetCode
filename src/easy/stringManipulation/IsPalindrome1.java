package easy.stringManipulation;

public class IsPalindrome1 {
    private static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() <=1) {
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome("0p"));
        System.out.println(isPalindrome("I am not a: Palindrome"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

}
