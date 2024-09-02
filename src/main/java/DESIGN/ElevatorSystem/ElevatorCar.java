package DESIGN.ElevatorSystem;

public class ElevatorCar {
    int id;
    ElevatorDisplay elevatorDisplay;
    int currentFloor;
    InternalButtons internalButtons;
    ElevatorStatus elevatorStatus;
    Direction elevatorDirection;
    ElevatorDoor elevatorDoor;

    public ElevatorCar() {
        elevatorDisplay= new ElevatorDisplay();
        currentFloor=0;
        internalButtons= new InternalButtons();
        elevatorStatus = ElevatorStatus.IDLE;
        elevatorDirection = Direction.UP;
        elevatorDoor = new ElevatorDoor();
    }

    public void showDisplay() {
        elevatorDisplay.showDisplay();
    };

    public void setDisplay() {
        this.elevatorDisplay.setDisplay(currentFloor, elevatorDirection);
    };

    public void pressButton(int destination) {
        internalButtons.pressButton(destination, this);


    };

    boolean moveElevator(Direction direction, int destinationFloor) {
        int startFloor = currentFloor;
        if(direction==Direction.UP){
            for(int i= startFloor; i<=destinationFloor; i++){
                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i==destinationFloor){
                    return true;
                }
            }
        }

        if(direction==Direction.DOWN){
            for(int i= startFloor; i>=destinationFloor; i--){
                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i==destinationFloor){
                    return true;
                }
            }
        }
        return false;
    }

}
