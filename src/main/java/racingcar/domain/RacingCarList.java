package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingCarList {

    private final List<RacingCar> racingCarList;

    public RacingCarList() {
        racingCarList = new ArrayList<>();
    }

    public void add(RacingCar racingCar) {
        racingCarList.add(racingCar);
    }

    public List<RacingCar> getRacingCarList() {
        return Collections.unmodifiableList(racingCarList);
    }

}
