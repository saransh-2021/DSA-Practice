public class Door {
    private boolean _isOpen;

    public boolean isOpen(){
        return _isOpen;
    }
    public void openDoor(){
        _isOpen = true;
    }
    public void closeDoor(){
        _isOpen = false;
    }
}