package racingcar.console;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReaderTest {

    private final Reader reader = new Reader();

    @AfterEach
    void closeReader() {
        reader.close();
    }


    @ParameterizedTest
    @DisplayName("입력된 이름을 정상적으로 저장하는지 확인한다.")
    @ValueSource(strings = {"test1,test2,test3"})
    void validReadName(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThat(reader.readNames()).containsExactly("test1", "test2", "test3");
    }

    @ParameterizedTest
    @DisplayName("올바르지 않은 입력을 받았을때 오류를 발생시킨다.")
    @ValueSource(strings = {"test1,test222,test3"})
    void unValidReadName(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThrows(IllegalArgumentException.class, () -> reader.readNames());
    }
}