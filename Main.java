import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {

        int[] testInput = IntStream.generate(() -> new Random().nextInt(10)).limit(10).toArray();

        // Increase the loop count to get better results once it works.
        // TestSuite.run(testInput, 10000);
        TestSuite.run(testInput, 10);
    }
}
