package racingcar.console;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class Reader {

    public List<String> readNames() {
        String line = Console.readLine();

        if (Arrays.stream(line.split(",")).anyMatch(name -> name.length() > 5))
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다");

        return Arrays.stream(line.split(","))
                .filter(name -> name.length() <= 5)
                .toList();
    }

    public int readNumber() {
        return Integer.parseInt(Console.readLine());
    }

    public void close() {
        Console.close();
    }
}
