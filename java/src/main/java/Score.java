import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import static java.util.Map.entry;

public class Score {

    static final Map<Operation, Function<DiceRoll, Integer>> MAP = Map.ofEntries(
        entry(Operation.chance, Yatzy::chance),
        entry(Operation.yatzy, Yatzy::yatzy),
        entry(Operation.ones, Yatzy::ones),
        entry(Operation.twos, Yatzy::twos),
        entry(Operation.threes, Yatzy::threes),
        entry(Operation.fours, Yatzy::fours),
        entry(Operation.fives, Yatzy::fives),
        entry(Operation.sixes, Yatzy::sixes),
        entry(Operation.pair, Yatzy::pair),
        entry(Operation.twoPairs, Yatzy::twoPairs),
        entry(Operation.threeOfAKind, Yatzy::threeOfAKind),
        entry(Operation.fourOfAKind, Yatzy::fourOfAKind),
        entry(Operation.smallStraight, Yatzy::smallStraight),
        entry(Operation.largeStraight, Yatzy::largeStraight),
        entry(Operation.fullHouse, Yatzy::fullHouse)
    );

    public static int compute(final Operation operation, final DiceRoll diceRoll) {
        return Optional.ofNullable(MAP.get(operation))
            .map(function -> function.apply(diceRoll))
            .orElseThrow(() -> new IllegalArgumentException("Unknown operation " + operation.name()));
    }
}