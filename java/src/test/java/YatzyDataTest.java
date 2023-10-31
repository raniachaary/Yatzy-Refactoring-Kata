import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class YatzyDataTest {
    protected static Stream<Arguments> chanceArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(2, 3, 4, 5, 1), 15),
            Arguments.arguments(new DiceRoll(3, 3, 4, 5, 1), 16)
        );
    }

    protected static Stream<Arguments> yatzyArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(4, 4, 4, 4, 4), 50),
            Arguments.arguments(new DiceRoll(6, 6, 6, 6, 6), 50),
            Arguments.arguments(new DiceRoll(6, 6, 6, 6, 3), 0)
        );
    }

    protected static Stream<Arguments> onesArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(1, 2, 3, 4, 5), 1),
            Arguments.arguments(new DiceRoll(1, 2, 1, 4, 5), 2),
            Arguments.arguments(new DiceRoll(6, 2, 2, 4, 5), 0),
            Arguments.arguments(new DiceRoll(1, 2, 1, 1, 1), 4)
        );
    }

    protected static Stream<Arguments> twosArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(1, 2, 3, 2, 6), 4),
            Arguments.arguments(new DiceRoll(2, 2, 2, 2, 2), 10)
        );
    }

    protected static Stream<Arguments> threesArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(1, 2, 3, 2, 3), 6),
            Arguments.arguments(new DiceRoll(2, 3, 3, 3, 3), 12)
        );
    }

    protected static Stream<Arguments> foursArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(4, 4, 4, 5, 5), 12),
            Arguments.arguments(new DiceRoll(4, 4, 5, 5, 5), 8),
            Arguments.arguments(new DiceRoll(4, 5, 5, 5, 5), 4)
        );
    }

    protected static Stream<Arguments> fivesArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(4, 4, 4, 5, 5), 10),
            Arguments.arguments(new DiceRoll(4, 4, 5, 5, 5), 15),
            Arguments.arguments(new DiceRoll(4, 5, 5, 5, 5), 20)
        );
    }

    protected static Stream<Arguments> sixesArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(4, 4, 4, 5, 5), 0),
            Arguments.arguments(new DiceRoll(4, 4, 6, 5, 5), 6),
            Arguments.arguments(new DiceRoll(6, 5, 6, 6, 5), 18)
        );
    }

    protected static Stream<Arguments> pairArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(3, 4, 3, 5, 6), 6),
            Arguments.arguments(new DiceRoll(5, 3, 3, 3, 5), 10),
            Arguments.arguments(new DiceRoll(5, 3, 6, 6, 5), 12)
        );
    }

    protected static Stream<Arguments> twoPairsArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(3, 3, 5, 4, 5), 16),
            Arguments.arguments(new DiceRoll(3, 3, 5, 5, 5), 16)
        );
    }

    protected static Stream<Arguments> threeOfAKindArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(3, 3, 3, 4, 5), 9),
            Arguments.arguments(new DiceRoll(5, 3, 5, 4, 5), 15),
            Arguments.arguments(new DiceRoll(3, 3, 3, 3, 5), 9),
            Arguments.arguments(new DiceRoll(3, 3, 3, 3, 3), 9)
        );
    }

    protected static Stream<Arguments> fourOfAKindArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(3, 3, 3, 3, 5), 12),
            Arguments.arguments(new DiceRoll(5, 5, 5, 4, 5), 20)
        );
    }

    protected static Stream<Arguments> smallStraightArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(1, 2, 3, 4, 5), 15),
            Arguments.arguments(new DiceRoll(2, 3, 4, 5, 1), 15),
            Arguments.arguments(new DiceRoll(1, 2, 2, 4, 5), 0)
        );
    }

    protected static Stream<Arguments> largeStraightArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(6, 2, 3, 4, 5), 20),
            Arguments.arguments(new DiceRoll(2, 3, 4, 5, 6), 20),
            Arguments.arguments(new DiceRoll(1, 2, 2, 4, 5), 0)
        );
    }

    protected static Stream<Arguments> fullHouseArgumentsProvider() {
        return Stream.of(
            // DiceRoll // expected
            Arguments.arguments(new DiceRoll(6, 2, 2, 2, 6), 18),
            Arguments.arguments(new DiceRoll(2, 3, 4, 5, 6), 0),
            Arguments.arguments(new DiceRoll(3, 3, 3, 3, 1), 0),
            Arguments.arguments(new DiceRoll(2, 2, 3, 3, 5), 0)
        );
    }

    protected static Stream<Arguments> computeArgumentsProvider() {
        return Stream.of(
            // Operation // DiceRoll // expected
            Arguments.arguments(Operation.chance, new DiceRoll(2, 3, 4, 5, 1), 15),
            Arguments.arguments(Operation.yatzy, new DiceRoll(4, 4, 4, 4, 4), 50),
            Arguments.arguments(Operation.ones, new DiceRoll(1, 2, 3, 4, 5), 1),
            Arguments.arguments(Operation.twos, new DiceRoll(1, 2, 3, 2, 6), 4),
            Arguments.arguments(Operation.threes, new DiceRoll(1, 2, 3, 2, 3), 6),
            Arguments.arguments(Operation.fours, new DiceRoll(4, 4, 4, 5, 5), 12),
            Arguments.arguments(Operation.fives, new DiceRoll(4, 4, 4, 5, 5), 10),
            Arguments.arguments(Operation.sixes, new DiceRoll(6, 5, 6, 6, 5), 18),
            Arguments.arguments(Operation.pair, new DiceRoll(5, 3, 3, 3, 5), 10),
            Arguments.arguments(Operation.twoPairs, new DiceRoll(3, 3, 5, 4, 5), 16),
            Arguments.arguments(Operation.threeOfAKind, new DiceRoll(5, 3, 5, 4, 5), 15),
            Arguments.arguments(Operation.fourOfAKind, new DiceRoll(5, 5, 5, 4, 5), 20),
            Arguments.arguments(Operation.smallStraight, new DiceRoll(1, 2, 3, 4, 5), 15),
            Arguments.arguments(Operation.largeStraight, new DiceRoll(6, 2, 3, 4, 5), 20),
            Arguments.arguments(Operation.fullHouse, new DiceRoll(6, 2, 2, 2, 6), 18)
        );
    }
}
