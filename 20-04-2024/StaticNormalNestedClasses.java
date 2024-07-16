class App1{
    {
        System.out.println(1);
    }

    class App2{
        {
            System.out.println(2);
        }
    }
    static{
        System.out.println(3);
    }
    static class App3{
        {
            System.out.println(4);
        }

        static{
            System.out.println(5);
        }
    }
}

public class StaticNormalNestedClasses {
    public static void main(String[] args) {
        App1 a = new App1();
        App1.App2 b = a.new App2();
        App1.App3 c = new App1.App3();
    }
}
