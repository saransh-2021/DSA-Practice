// write a program to build this pattern for an generalised input n
// in this program input given given is 4
/*
1
2 3
4 5 6
7 8 9 10
4 5 6
2 3 
1
*/

public class PatternType1 {
    public static void main(String[] args) {
        int lines = 3;
        pattern(lines);
    }
    
    static void pattern(int n){
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    
        count -= n;
        for(int i = n; i > 1; i--){
            for(int j = i-1; j>0 ; j-- ){
                System.out.print((count-j) + " ");
            }
            System.out.println();
            count= count-i+1;
        }
    }
}