public class Engine {
    private int _bhp;
    private boolean _running;
    private int speed;
    private final int _topSpeed = 5000;

    public void start(){
        _running = true;
    }
    public void stop(){
        _running = false;
    }
    public void increaseSpeed(){
        if(speed < _topSpeed)
            speed++;
    }
    public void decreaseSpeed(){
        if(speed > 0)
            speed--;
    }
    public int getSpeed(){
        return speed;
    }
    public int getTopSpeed(){
        return _topSpeed;
    }
}