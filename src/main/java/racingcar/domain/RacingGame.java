package racingcar.domain;

import racingcar.generator.NumberGenerator;

import java.util.Comparator;
import java.util.List;

public class RacingGame {

    public static final int START_LINE = 0;
    public static final int FORWARD_INDICATOR = 4;

    private final NumberGenerator numberGenerator;
    private final RacingCarList raceCarList;

    public RacingGame(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
        this.raceCarList = new RacingCarList();
    }

    public void joinRace(List<String> racingCarNames) {
        for (String racingCarName : racingCarNames) {
            raceCarList.add(new RacingCar(racingCarName));
        }
    }

    public void moveCarsForward() {
        int number = numberGenerator.generate();
        raceCarList.getRacingCarList().stream()
                .forEach(racingCar -> racingCar.attemptForward(number));
    }

    public List<RacingCar> getWinners(){
        int maxDistance = getMaxDistance();
        return raceCarList.getRacingCarList().stream()
                .filter(racingCar -> racingCar.getDistance() == maxDistance)
                .toList();
    }

    private int getMaxDistance(){
        return raceCarList.getRacingCarList().stream()
                .max(Comparator.comparing(RacingCar::getDistance))
                .get().getDistance();
    }
}

