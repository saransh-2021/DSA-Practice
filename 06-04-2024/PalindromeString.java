// wirte a code to check for a palindromee number without coverting it to a string.

public class PalindromeString {
    public static void main(String[] args) {
        int num1 = 12321;
        int num2 = 12345;
        int num3 = 123321;
        int num4 = 1234321;
        int num5 = 123454321;
        System.out.println(isPalindrome(num1));
        System.out.println(isPalindrome(num2));
        System.out.println(isPalindrome(num3));
        System.out.println(isPalindrome(num4));
        System.out.println(isPalindrome(num5));
    }

    static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return temp == rev;
    }

    static boolean isPalindrome2(int num) {
        char[] numbers =  Integer.toString(num).toCharArray();
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - i - 1])
                return false;
        }
        return true;
    }

    static boolean isPalindrome3(int num) {
        int temp = num;
        int rev = 0;
        while (num > 0) {
            rev = rev << 1;
            rev = rev | (num & 1);
            num = num >> 1;
        }
        return temp == rev;
    }
}
