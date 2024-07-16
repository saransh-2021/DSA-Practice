abstract class App1{
    {
        System.out.println("1");
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");
        System.out.println(2);
    }
}

public class AbstractAnonymous{
    public static void main(String[] args){
        App1 a = new App1(){{
                System.out.println("Anonymous block");
            }
        };

        App1 b = new App1(){}; // Anonymous class
    }
}