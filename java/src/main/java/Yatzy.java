import java.util.Optional;

public class Yatzy {

    public static final int YATZY_SCORE = 50;
    public static final int SMALL_STRAIGHT_SCORE = 15;
    public static final int LARGEST_STRAIGHT_SCORE = 20;

    protected static int chance(final DiceRoll diceRoll) {
        return diceRoll.sum();
    }

    protected static int yatzy(final DiceRoll diceRoll) {
        return diceRoll.isYatzy() ? YATZY_SCORE : 0;
    }

    protected static int ones(final DiceRoll diceRoll) {
        return diceRoll.sumBy(1);
    }

    protected static int twos(final DiceRoll diceRoll) {
        return diceRoll.sumBy(2);
    }

    protected static int threes(final DiceRoll diceRoll) {
        return diceRoll.sumBy(3);
    }

    protected static int fours(final DiceRoll diceRoll) {
        return diceRoll.sumBy(4);
    }

    protected static int fives(final DiceRoll diceRoll) {
        return diceRoll.sumBy(5);
    }

    protected static int sixes(final DiceRoll diceRoll) {
        return diceRoll.sumBy(6);
    }

    protected static int pair(final DiceRoll diceRoll) {
        return Optional.of(diceRoll.findPair(2))
            .filter(pairs -> !pairs.isEmpty())
            .map(pairs -> pairs.get(0) * 2)
            .orElse(0);
    }

    protected static int twoPairs(final DiceRoll diceRoll) {
        return Optional.of(diceRoll.findPair(2))
            .filter(pairs -> !pairs.isEmpty())
            .map(pairs -> pairs
                .stream()
                .mapToInt(Integer::intValue)
                .sum() * 2)
            .orElse(0);
    }

    protected static int threeOfAKind(final DiceRoll diceRoll) {
        return Optional.of(diceRoll.findPair(3))
            .filter(pairs -> !pairs.isEmpty())
            .map(pairs -> pairs.get(0) * 3)
            .orElse(0);
    }

    protected static int fourOfAKind(final DiceRoll diceRoll) {
        return Optional.of(diceRoll.findPair(4))
            .filter(pairs -> !pairs.isEmpty())
            .map(pairs -> pairs.get(0) * 4)
            .orElse(0);
    }

    protected static int smallStraight(final DiceRoll diceRoll) {
        return diceRoll.isSmallStraight() ? SMALL_STRAIGHT_SCORE : 0;
    }

    protected static int largeStraight(final DiceRoll diceRoll) {
        return diceRoll.isLargeStraight() ? LARGEST_STRAIGHT_SCORE : 0;
    }

    protected static int fullHouse(final DiceRoll diceRoll) {
        return diceRoll.isFullHouse() ? diceRoll.sum() : 0;
    }
}