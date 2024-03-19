public class ProductionRemoteControlCar implements RemoteControlCar {
    private int passedDistance = 0;

    public void drive() {
        passedDistance +=10;
    }

    public int getDistanceTravelled() {
        return passedDistance;
    }
}
