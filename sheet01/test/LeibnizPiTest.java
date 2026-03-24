import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class LeibnizPiTest {
    @Test
    void leibnizPi() {
        PrintStream oldOut = System.out;
        ByteArrayOutputStream newOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newOut));
        LeibnizPi.main();
        System.setOut(oldOut);
        String output = newOut.toString();
        assertTrue(output.contains("3.14159"));
    }
}

