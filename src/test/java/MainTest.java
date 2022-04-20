import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    public static Stream<Arguments> dataForArrayAfterLast4 (){
        return Stream.of(
                Arguments.of(new int[]{2,5,4,5,6}, new int[]{5,6}),
                Arguments.of(new int[]{2,5,4,6}, new int[]{6}),
                Arguments.of(new int[]{1,4,44,6}, new int[]{44,6})
        );
    }

    public static Stream<Arguments> dataForOneAndFourArr (){
        return Stream.of(
                Arguments.of(new int[]{1,1,1}, false),
                Arguments.of(new int[]{4,4,4}, false),
                Arguments.of(new int[]{1,4,3}, false),
                Arguments.of(new int[]{1,4,1}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForArrayAfterLast4")
    void test1ArrayAfterLast4(int[] in, int[] out) {
        Assertions.assertArrayEquals(out, Main.arrayAfterLast4(in));
    }

    @Test
    void test2ArrayAfterLast4(){
        int [] in = new int[]{1,3,5,6};
        Assertions.assertThrows(RuntimeException.class, () -> {
            Main.arrayAfterLast4(in);
        });
    }

    @ParameterizedTest
    @MethodSource ("dataForOneAndFourArr")
    void testOneAndFourArr(int[] arr, boolean mark ) {
        Assertions.assertEquals(mark, Main.oneAndFourArr(arr));
    }
}