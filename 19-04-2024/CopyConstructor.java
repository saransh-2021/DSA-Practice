class App {
    int[] arr = new int[5];
    App(){
    }

    App(App a){
        for (int i=0; i<a.arr.length; i++)
            this.arr[i] = a.arr[i];
    }   
}

public class CopyConstructor {
    public static void main(String[] args) {
        App a1 = new App();
        a1.arr[0] = 10;
        App a2 =  new App(a1);
        // App a2 = a1;
        System.out.println(a2.arr[0]);
        a2.arr[0] = 20;
        System.out.println(a2.arr[0]);
        System.out.println(a1.arr[0]);
    }
}