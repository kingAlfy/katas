import org.junit.Test;
import org.katas.SheepsCounter;

import static org.junit.Assert.assertEquals;


public class SheepsCounterTest {
    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };

    Boolean[] array2 = {true,  true,  true,  null,
            true,  true,  true,  true ,
            true,  null, true,  null,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true};
    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 17, new SheepsCounter().countSheeps(array1));
    }

    @Test
    public void test2() {
        assertEquals("There are 17 sheeps in total", 17, new SheepsCounter().countSheeps(array2));
    }
}
