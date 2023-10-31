import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreTest extends YatzyDataTest {

    @ParameterizedTest(name = "SHOULD return {2} WHEN compute/{0} with {1}")
    @MethodSource("computeArgumentsProvider")
    public void testCompute(final Operation operation, final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Score.compute(operation, diceRoll);

        // THEN
        assertEquals(expected, result);
    }
}