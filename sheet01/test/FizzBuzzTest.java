import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzTest {
    @Test
    void fizzbuzz() {
        PrintStream oldOut = System.out;
        ByteArrayOutputStream newOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newOut));
        FizzBuzz.main();
        System.setOut(oldOut);
        String output = newOut.toString();
        assertTrue(output.contains("Fizz"));
        assertTrue(output.contains("Buzz"));
        assertTrue(output.contains("FizzBuzz"));
        assertTrue(output.contains("1\n"));
        assertFalse(output.contains("5\n"));
        assertFalse(output.contains("15\n"));
    }
}

