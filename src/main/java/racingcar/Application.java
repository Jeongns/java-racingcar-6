package racingcar;

import racingcar.console.Printer;
import racingcar.console.Reader;
import racingcar.domain.RacingCar;
import racingcar.domain.RacingGame;
import racingcar.generator.RandomNumberGenerator;

import java.util.List;

import static racingcar.console.Printer.*;

public class Application {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Reader reader = new Reader();
        RacingGame racingGame = new RacingGame(new RandomNumberGenerator());


        printer.print(START_MESSAGE);
        List<String> names = reader.readNames();
        racingGame.joinRace(names);

        printer.print(TRY_MESSAGE);
        int tryCount = reader.readNumber();

        for(int i = 0; i < tryCount; i++){
            racingGame.moveCarsForward();
            printer.printCurrentStatus(racingGame.getCurrentStatus());
        }

        List<RacingCar> winners = racingGame.getWinners();
        printer.printWinners(winners);
    }
}
