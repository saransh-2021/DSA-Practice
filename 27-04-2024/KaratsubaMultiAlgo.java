/*

*/
import java.lang.Math;

public class KaratsubaMultiAlgo {
    public static void main(String[] args) {
        int num1 = 1234 ;
        int num2 = 5678 ; 
        int size = 4 ;
        System.out.println(Multiply.even_multiply1(num1, num2, size));
        System.out.println(Multiply.even_multiply2(num1, num2, size));
    }
}

class Multiply{
    static int even_multiply1(int a, int b, int n){
        // Reduced to 4 multiplications from 16 multiplications
        int multiplier = (int) Math.pow(10, n/2);
        int x = a / multiplier;
        int y = a % multiplier;
        int c = b / multiplier;
        int d = b % multiplier;

        if (n==2){
            return 100*x*c + 10*(x*d+y*c) + y*d;
        }
        else{
            return (int) (Math.pow(10, n)*even_multiply1(x, c, n/2) + 
                        multiplier*( even_multiply1(x, d, n/2)+ even_multiply1(y, c, n/2) )+ 
                        even_multiply1(y, d, n/2)) ;
        }
    }

    static int even_multiply2(int a, int b, int n){
        // further Reduced to 3 multiplications from 4 multiplications
        if(n==1){
            return a*b;
        }
        else{
            int multiplier = (int) Math.pow(10, n/2);
            int x = a / multiplier;
            int y = a % multiplier;
            int c = b / multiplier;
            int d = b % multiplier;

            int ac = even_multiply2(x, c, n / 2);
            int bd = even_multiply2(y, d, n / 2);
            int ad_bc = even_multiply2(x + y, c + d, n / 2) - ac - bd;

            return (int) (int) (ac * Math.pow(10, n) + ad_bc * multiplier + bd);
        }
    }
}