package racingcar.generator;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumberGenerator implements NumberGenerator {

    private final int START_NUMBER = 1;
    private final int END_NUMBER = 9;


    @Override
    public int generate() {
        return pickNumberInRange(START_NUMBER, END_NUMBER);
    }
}
