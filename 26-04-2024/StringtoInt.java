/*
make a function to convert string to integer
atoi("100");
output: 100
*/

public class StringtoInt {
    public static void main(String[] args) {
        System.out.println(atoi("100"));
    }

    static int atoi(String s){
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = res * 10 + s.charAt(i) - '0';
        }
        return res;
    }
}
