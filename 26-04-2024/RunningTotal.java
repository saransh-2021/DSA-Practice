/* 
Write a function void RunningTotal(int number); 
the function will print the running totalof the number passed to  the dunctions.
Example:
RunningTotal(5);
Output: 1,3,6,10,15
*/

public class RunningTotal {
    public static void main(String[] args) {
        runningTotal(5);
    }

    static void runningTotal(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
    }
}
