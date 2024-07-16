public class PowerofTwo {
    public static void main(String[] args) {
        int[] test_cases = {4,5,6,2,0,512,8,1025,1};
        for (int num : test_cases) {
            System.out.println(num +" "+ pot(num));
        }
    }

    static boolean pot(int num){
        if (num == 1)
            return true;
        else if (num % 2 != 0) 
            return false;
        else if (num == 0)
            return false;
        else{
            while (num % 2 == 0) {
                if (num == 2) 
                    return true;
            num = num / 2;
            }
        }
        return false;
    }
}
