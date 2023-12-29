package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RacingCarTest {

    @Test
    @DisplayName("전진 조건에 부합할 경우 차량이 옳바르게 전진한다.")
    void validAttemptForward() {
        // given
        RacingCar racingCar = new RacingCar("Test");
        racingCar.attemptForward(4);
        // when, then
        assertEquals(racingCar.getDistance(),1);
    }

    @Test
    @DisplayName("전진 조건에 부합하지 않을 경우 차량이 전진 하지 않는다.")
    void unValidAttemptForward() {
        // given
        RacingCar racingCar = new RacingCar("Test");
        racingCar.attemptForward(1);
        // when, then
        assertEquals(racingCar.getDistance(), 0);
    }
}