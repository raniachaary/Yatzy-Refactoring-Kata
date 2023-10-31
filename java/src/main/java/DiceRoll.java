import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DiceRoll {
    public static final Set<Integer> SMALLEST_STRAIGHT = Set.of(1, 2, 3, 4, 5);
    public static final Set<Integer> LARGEST_STRAIGHT = Set.of(2, 3, 4, 5, 6);

    private final List<Integer> dice;

    public DiceRoll(final Integer... dices) {
        if (dices.length != 5) {
            throw new IllegalArgumentException("Invalid dices parameters");
        }
        dice = Arrays.asList(dices);
    }

    public int sum() {
        return asIntStream()
            .sum();
    }

    public boolean isYatzy() {
        return distinctCount() == 1;
    }

    public int sumBy(int d) {
        return asIntStream()
            .filter(value -> value == d)
            .sum();
    }

    public boolean isSmallStraight() {
        return asSet().containsAll(SMALLEST_STRAIGHT);
    }

    public boolean isLargeStraight() {
        return asSet().containsAll(LARGEST_STRAIGHT);
    }

    public boolean isFullHouse() {
        return findPair(2).size() == 2
            && distinctCount() == 2;
    }

    public List<Integer> findPair(int x) {
        return groupedByValue()
            .entrySet().stream()
            .filter(entry -> entry.getValue() >= x)
            .map(Map.Entry::getKey)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
    }

    private Map<Integer, Long> groupedByValue() {
        return dice.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private IntStream asIntStream() {
        return dice.stream().mapToInt(Integer::intValue);
    }

    private Set<Integer> asSet() {
        return new HashSet<>(dice);
    }

    private long distinctCount() {
        return asIntStream()
            .distinct()
            .count();
    }

    @Override
    public String toString() {
        return String.format("[%s]", dice.stream()
            .map(String::valueOf)
            .collect(Collectors.joining(", ")));
    }
}
