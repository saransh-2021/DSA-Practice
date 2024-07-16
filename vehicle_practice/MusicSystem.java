public class MusicSystem {
    private String _brand;
    private int _wattage;
    private int _voltage;
    private int _volume;
    private boolean _running;
    private Speaker _speakers;

    public String getBrand(){
        return _brand;
    }
    public int getWattage(){
        return _wattage;
    }
    public int getVoltage(){
        return _voltage;
    }
    public int getVolume(){
        return _volume;
    }
    public Shape getSpeakCount(){
        return _speakers.getShape();
    }
    public boolean isRunning(){
        return _running;
    }
    public void start(){
        _running = true;
    }
    public void stop(){
        _running = false;
    }
    public void increaseVolume(){
        if(_running){
            if(_volume < 100)
                _volume++;
        }
    }
    public void DecreaseVolume(){
        if(_running){
            if(_volume > 0)
                _volume--;
        }
    }

    class Speaker {
        private Shape _shape;
        
        public void setShape(Shape shape){
            _shape = shape;
        }
        public Shape getShape(){
            return _shape;
        }
    }
}
