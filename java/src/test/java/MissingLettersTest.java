import org.junit.Test;
import org.katas.MissingLetters;

import static org.junit.Assert.assertEquals;

public class MissingLettersTest {
    @Test
    public void exampleTests() {
        assertEquals('e', MissingLetters.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', MissingLetters.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}