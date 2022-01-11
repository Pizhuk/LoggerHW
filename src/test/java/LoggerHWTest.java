import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class LoggerHWTest {
    LoggerHW cut = new LoggerHW();
    static List<Arguments> isItLessThanSixTestArgs(){
        return List.of(
                Arguments.arguments(2, true),
                Arguments.arguments(7, false)
        );
    }

    @ParameterizedTest
    @MethodSource("isItLessThanSixTestArgs")
    void isItLessThanSixTest(int num, boolean expected) throws LoggerHW.LessThanSixException {
        boolean actual = cut.isItLessThanSix(num);
        Assertions.assertEquals(expected, actual);
    }


}
