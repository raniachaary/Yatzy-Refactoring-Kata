import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest extends YatzyDataTest {

    @ParameterizedTest(name = "SHOULD return {1} WHEN chance with {0}")
    @MethodSource("chanceArgumentsProvider")
    public void testChance(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.chance(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN yatzy with {0}")
    @MethodSource("yatzyArgumentsProvider")
    public void testYatzy(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.yatzy(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN ones with {0}")
    @MethodSource("onesArgumentsProvider")
    public void testOnes(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.ones(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN twos with {0}")
    @MethodSource("twosArgumentsProvider")
    public void testTwos(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.twos(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN threes with {0}")
    @MethodSource("threesArgumentsProvider")
    public void testThrees(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.threes(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN fours with {0}")
    @MethodSource("foursArgumentsProvider")
    public void testFours(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.fours(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN fives with {0}")
    @MethodSource("fivesArgumentsProvider")
    public void testFives(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.fives(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN sixes with {0}")
    @MethodSource("sixesArgumentsProvider")
    public void testSixes(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.sixes(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN pair with {0}")
    @MethodSource("pairArgumentsProvider")
    public void testPair(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.pair(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN twoPairs with {0}")
    @MethodSource("twoPairsArgumentsProvider")
    public void testTwoPairs(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.twoPairs(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN threeOfAKind with {0}")
    @MethodSource("threeOfAKindArgumentsProvider")
    public void testThreeOfAKind(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.threeOfAKind(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN fourOfAKind with {0}")
    @MethodSource("fourOfAKindArgumentsProvider")
    public void testFourOfAKind(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.fourOfAKind(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN smallStraight with {0}")
    @MethodSource("smallStraightArgumentsProvider")
    public void testSmallStraight(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.smallStraight(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN largeStraight with {0}")
    @MethodSource("largeStraightArgumentsProvider")
    public void testLargeStraight(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.largeStraight(diceRoll);

        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "SHOULD return {1} WHEN fullHouse with {0}")
    @MethodSource("fullHouseArgumentsProvider")
    public void testFullHouse(final DiceRoll diceRoll, final int expected) {
        // GIVEN // WHEN
        var result = Yatzy.fullHouse(diceRoll);

        // THEN
        assertEquals(expected, result);
    }
}