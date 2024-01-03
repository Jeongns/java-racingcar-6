package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.generator.NumberGenerator;

import java.util.List;

class RacingGameTest {

    private final NumberGenerator forwardIndicatorNumberGenerator = new NumberGenerator() {
        @Override
        public int generate() {
            return RacingGame.FORWARD_INDICATOR;
        }
    };

    @Test
    @DisplayName("차량들이 전진 시도를 한 후 정상적으로 결과를 가져오는지 확인한다.")
    void validMoveCar() {
        // given
        RacingGame racingGame = new RacingGame(forwardIndicatorNumberGenerator);
        racingGame.joinRace(List.of("TEST_1", "TEST_2", "TEST_3"));
        // when
        racingGame.moveCarsForward();
        // then
        List<RacingCar> winners = racingGame.getWinners();
        List<String> winnersName = winners.stream().map(RacingCar::getName).toList();
        List<Integer> winnersDistance = winners.stream().map(RacingCar::getDistance).toList();
        Assertions.assertThat(winnersName).containsExactly("TEST_1", "TEST_2", "TEST_3");
        Assertions.assertThat(winnersDistance).containsExactly(1, 1, 1);
    }


}