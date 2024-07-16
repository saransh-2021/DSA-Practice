class Vehicle {
    private CarBrand _brand;
    private VehicleType _vehicleType;
    private Light _lights;
    private MusicSystem _musicSystem;
    private Wheel[] _wheels;
    private Color _color;
    private int _capacity;
    private Door[] _doors;
    private Engine _engine;
    private int _year;
    private int _mileage;

    
    //getters & setters
    public CarBrand get_brand() {
        return _brand;
    }

    public void set_brand(CarBrand _brand) {
        this._brand = _brand;
    }

    public VehicleType get_vehicleType() {
        return _vehicleType;
    }

    public void set_vehicleType(VehicleType _vehicleType) {
        this._vehicleType = _vehicleType;
    }

    public Light get_lights() {
        return _lights;
    }

    public void set_lights(Light _lights) {
        this._lights = _lights;
    }

    public MusicSystem get_musicSystem() {
        return _musicSystem;
    }

    public void set_musicSystem(MusicSystem _musicSystem) { 
        this._musicSystem = _musicSystem;
    }

    public Wheel[] get_wheels() {
        return _wheels;
    }

    public void set_wheels(Wheel[] _wheels) {
        this._wheels = _wheels;
    }

    public Color get_color() {
        return _color;
    }

    public void set_color(Color _color) {
        this._color = _color;
    }

    public int get_capacity() {
        return _capacity;
    }

    public void set_capacity(int _capacity) {
        this._capacity = _capacity;
    }

    public Door[] get_doors() {
        return _doors;
    }

    public void set_doors(Door[] _doors) {
        this._doors = _doors;
    }

    public Engine get_engine() {
        return _engine;
    }

    public void set_engine(Engine _engine) {
        this._engine = _engine;
    }

    public int get_year() {
        return _year;
    }

    public void set_year(int _year) {
        this._year = _year;
    }

    public int get_mileage() {
        return _mileage;
    }

    public void set_mileage(int _mileage) {
        this._mileage = _mileage;
    }

    //-------------------------------------

    public void getVehicIeType() {
    }

    public void getLightCount() {
    }

    public void getWheelCount() {
    }

    public void getDoorCount() {
    }

    public void increaseSpeed() {
    }

    public void decreaseSpeed() {
    }

    public void stop() {
    }

    public void start() {
    }

    public void startMusic() {
    }

    public void stopMusic() {
    }

    public void increaseVolume() {
    }

    public void DecreaseVolume() {
    }

    public void openDoor(int num) {
    }

    public void closeDoor(int num) {
    }

    public void isDoorOpen(int num) {
    }


}

class Light {
    private Color _color;
    private Shape _shape;
    private LightType _lightType;
    private boolean _fullBeam;

    public void getColor(){}
    public void getShape(){}
    public void switchedOn(){}
    public void switchedOff(){}
    public void fullBeam(){}
}

class Wheel {
    private Shape _shape;
    private Color _color;
    private int _radius;
    private boolean _slipping;
    private boolean _hasDust;

    public void getShape(){}
    public void getColor(){}
    public void getRadius(){}
    public void isSlipping(){}
    public void hasDust(){}

}


//when we call parameterized construcotr of a specialized class, the values are not able to be set in the parent class, so we need to call its constructor using super inside the child param constructor

//we cant call a derived fn (fn of a class which extends parent) from a base/parent class