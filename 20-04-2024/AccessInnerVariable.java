class App1{
    class App2{
        int i = 111;
    }
}

class App3{
    static class App4{
        int i = 222;
    }
}

public class AccessInnerVariable{
    public static void main(String[] args){
        // App1 a = new App1();
        // App1.App2 b = a.new App2();

        App1.App2 b = new App1().new App2();
        System.out.println(b.i);

        App3.App4 c = new App3.App4();
        System.out.println(c.i);
    }
}