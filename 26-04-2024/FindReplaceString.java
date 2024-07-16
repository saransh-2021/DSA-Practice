// void FindReplaceString(string s, char f, char r){
//     @s = given string
//     @f = to find this character
//     @r = replace with

//     Example:
//     string s = "hello world";
//     FindReplaceString(s, 'l', 'z');
//     Output: "hezzo worzd"
// }

public class FindReplaceString {
    public static void main(String[] args) {
        String s = "hello world";
        findReplaceString(s, 'l', 'z');
    }

    static void findReplaceString(String s, char f, char r){
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == f){
                arr[i] = r;
            }
        }
        System.out.println(new String(arr));
    }
}