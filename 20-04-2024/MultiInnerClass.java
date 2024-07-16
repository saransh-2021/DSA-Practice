class App1{
    {
        new App2();
        new App2().fun(); // this can be used to run a function only once and the memory is saved
    }

    static class App2{
        {
            new App1().new App3();
        }

        void fun(){

        }
    }

    class App3{
        {
            System.out.println("S");
        }
    }
}

public class MultiInnerClass {
    public static void main(String[] args) {
        new App1();
    }
}
