package racingcar.console;

import racingcar.domain.RacingCar;

import java.util.List;

public class Printer {

    public static final String START_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public static final String TRY_MESSAGE = "시도할 회수는 몇회인가요?";

    public void print(String text) {
        System.out.println(text);
    }

    public void printCurrentStatus(List<RacingCar> raceCarList) {
        String result = "";
        for (RacingCar racingCar : raceCarList) {
            result += String.format("%s : %s\n", racingCar.getName(), "-".repeat(racingCar.getDistance()));
        }
        print(result);
    }

    public void printWinners(List<RacingCar> winnerList) {
        List<String> winnersName = winnerList.stream()
                .map(RacingCar::getName)
                .toList();
        String result = String.join(", ", winnersName);
        print("최종 우승자 : " + result);
    }

}
