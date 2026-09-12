public class palindromeS{
    public static void main(String[] args) {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmno";

        int start = 0;       // starting position
        int windowSize = 10; // substring size

        int left = start;
        int right = start + windowSize - 1;

        boolean palindrome = true;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (palindrome) {
            System.out.println("Selected substring is a palindrome");
        } else {
            System.out.println("Selected substring is not a palindrome");
        }
    }
}