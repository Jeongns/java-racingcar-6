package racingcar.domain;

public class RacingCar {

    private String name;
    private int distance;

    public RacingCar(String name){
        this.name = name;
        this.distance = RacingGame.START_LINE;
    }

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

    private boolean isForward(int chance) {
        return chance >= RacingGame.FORWARD_INDICATOR;
    }

    private void goForward() {
        this.distance++;
    }
}
