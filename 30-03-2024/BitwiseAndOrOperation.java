public class BitwiseAndOrOperation {
    public static void main(String[] args) {
        // write a program which do a bitwise OR, XOR and AND operation of 5 and 7 and then print the values
        int c = 5 | 7;
        int d = 5 & 7;
        int e = 5 ^ 7;  
        System.out.println("Bitwise OR of 5 and 7 is: " + c);
        System.out.println("Bitwise AND of 5 and 7 is: " + d);
        System.out.println("Bitwise XOR of 5 and 7 is: " + e);

        // wite a program to get the nth bit of a number
        int num = 5;
        int n = 2;
        int bit = (num >> n) & 1;
        System.out.println("The " + n + "th bit of " + num + " is: " + bit);
    }
}
