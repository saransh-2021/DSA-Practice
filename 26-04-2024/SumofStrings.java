/*
write a function int SumofStrings(String s1, String s2);
the function will return the sum of the two strings
Example:
SumofStrings("100", "200");
Output: "300"
*/

public class SumofStrings {
    public static void main(String[] args) {
        // Method 1 - Using atoi function to convert string to integer and then adding them.`
        // System.out.println(sumofStrings("100", "200"));

        // Method 2 - Using class to add two numeric strings
        // Stringmal s1 = new Stringmal("100");
        // Stringmal s2 = new Stringmal("200");
        // System.out.println(s1.sumofStrings1(s2));

        // Method 3 - Using StringBuilder class to add two numeric strings
        UseStringBuild s1 = new UseStringBuild("100");
        UseStringBuild s2 = new UseStringBuild("200");
        System.out.println(s1.sumofStrings2(s2));

    }

    static int atoi(String s){
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = res * 10 + s.charAt(i) - '0';
        }
        return res;
    }

    static String sumofStrings(String s1, String s2){
        int num1 = atoi(s1);
        int num2 = atoi(s2);
        return String.valueOf(num1 + num2);
    }
}

class Stringmal{
    String num;
    
    Stringmal(String num){
        this.num = num;
    }

    String sumofStrings1(Stringmal s2){
        int num1 = atoi(this.num)+ atoi(s2.num);
        return itos(num1);
    }

    int atoi(String s){
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = res * 10 + s.charAt(i) - '0';
        }
        return res;
    }

    String itos(int num){
        String res = "";
        while(num > 0){
            res = (char)(num%10 + '0') + res;
            num /= 10;
        }
        return res;
    }
}

class UseStringBuild{
    String num;

    UseStringBuild(String num){
        this.num = num;
    }

    String sumofStrings2(UseStringBuild s2){
        StringBuilder num1 = new StringBuilder(this.num);
        StringBuilder num2 = new StringBuilder(s2.num);
        StringBuilder res = new StringBuilder();

        num1 = num1.reverse();
        num2 = num2.reverse();

        int carry = 0;
        int i = 0;
        while(i < num1.length() || i < num2.length()){
            int n1 = i < num1.length() ? num1.charAt(i) - '0' : 0;
            int n2 = i < num2.length() ? num2.charAt(i) - '0' : 0;
            int sum = n1 + n2 + carry;
            res.append(sum%10);
            carry = sum/10;
            i++;
        }
        if(carry != 0)
            res.append(carry);
        return res.reverse().toString();
    }
}