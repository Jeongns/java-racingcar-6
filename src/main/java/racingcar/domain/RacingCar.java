package racingcar.domain;

public class RacingCar {

    private String name;
    private int distance;

    public void attemptForward(int chance) {
        if (isForward(chance))
            goForward();
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public RacingCar(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    private boolean isForward(int chance) {
        return chance >= RacingGame.FORWARD_INDICATOR;
    }

    private void goForward() {
        this.distance++;
    }
}
