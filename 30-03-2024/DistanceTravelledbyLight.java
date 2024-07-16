// write a program to calculate the distance travelled by light in 5days and 5 hours. speed of light = 30000 m/s

public class DistanceTravelledbyLight {
    public static void main(String[] args) {
        int speed = 30000;
        double time = 5*24*60*60 + 5*60*60;
        double distance = speed * time;
        System.out.println("Distance travelled by light in 5 days and 5 hours is " + distance + " meters");
    }
}