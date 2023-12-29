package racingcar.generator;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public int generate(int startNumber, int endNumber) {
        return pickNumberInRange(startNumber, endNumber);
    }
}
