import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.katas.AreaOfCIrcle;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AreaOfCirlceTest {
    @Test
    @Order(1)
    public void testOne() {
        assertEquals(3.141, AreaOfCIrcle.area(1), 0.01);
    }

    @Test @Order(2)
    public void testExamples() {
        assertEquals( 5881.248, AreaOfCIrcle.area(43.2673), 0.01);
        assertEquals(14526.724, AreaOfCIrcle.area(68     ), 0.01);
    }

    @Test @Order(3)
    public void testZero() {
        assertThrows(IllegalArgumentException.class, () -> AreaOfCIrcle.area(0));
    }

    @Test @Order(4)
    public void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> AreaOfCIrcle.area(-1.0));
    }
}
