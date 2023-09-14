import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import org.katas.ReversedStrings;

public class ReversedStringTest {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", ReversedStrings.solution("world"));
    }
}
