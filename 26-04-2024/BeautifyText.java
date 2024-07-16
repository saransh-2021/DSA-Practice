/* 
write a function void Beautify(String s);
the function will print every word in  anew line with some beautification
Example: Beautify("The World is Beautiful");
Output:
*************
* The       *
* World     *
* is        *
* Beautiful *
************* 
*/

public class BeautifyText {
    public static void main(String[] args) {
        Beautify("The World is Beautiful");
    }

    static void Beautify(String s){
        String[] arr = s.split(" ");
        int max = 0;
        for (String string : arr) {
            if (string.length() > max) {
                max = string.length();
            }
        }
        for (int i = 0; i < max+4; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (String string : arr) {
            System.out.print("* " + string);
            for (int i = 0; i < max - string.length(); i++) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }
        for (int i = 0; i < max+4; i++) {
            System.out.print("*");
        }
    }
}
