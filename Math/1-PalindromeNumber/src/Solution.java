public class Solution {
    public static void main(String[] args) {
        System.out.println(isIntPalindrome(121));
        System.out.println(isIntPalindrome(-121));
    }

    public static boolean isIntPalindrome(int x) {
        String xString = String.valueOf(x);
        String xReversed = new StringBuilder(xString).reverse().toString();

        return xString.compareTo(xReversed) == 0;
    }
}