class App1{
    String s = "ppp";
    {
        System.out.println(s);
    }

    String methodApp1(){
        class App2{
            String s = App1.this.s+"qqq";
            {
                System.out.println(s);
            }
        }
        return new App2().s+s;
    }
}

public class SomeTextFile {
    public static void main(String[] args) {
        App1 a = new App1();
        System.out.println(a.methodApp1());
    }
}
