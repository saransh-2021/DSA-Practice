public class test {
    public static void main(String[] args) {
        // new test();
        int x = 10; x += 5;
        System.out.println(x);
    }

    {
        new app2();
    }

    static class app2{
        {
        new test().new app3();
    }
    }

    class app3{
        {
            System.out.println("success");
        }
    }
}