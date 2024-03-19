public class ExperimentalRemoteControlCar implements RemoteControlCar{
    private int passedDistance = 0;

    public void drive() {
        passedDistance +=20;
    }

    public int getDistanceTravelled() {
        return passedDistance;
    }
}
