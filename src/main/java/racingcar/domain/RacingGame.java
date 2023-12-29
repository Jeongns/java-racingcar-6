package racingcar.domain;

import racingcar.generator.NumberGenerator;

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
}
