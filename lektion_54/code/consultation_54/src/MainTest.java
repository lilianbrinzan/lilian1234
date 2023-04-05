import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main m;
    @BeforeEach
    public void init(){
        m = new Main();
    }


    @Test
    public void withoutDuplicates_test_oneElement(){
        List<String> actual = Arrays.asList("Jack");
        List<String> expected = Arrays.asList("Jack");

        assertEquals(expected,m.withoutDuplicates(actual));
    }

    @Test
    public void withoutDuplicates_test_noDuplicates(){
        List<String> expected = Arrays.asList("Ann","John","Jack","Mary");
        List<String> actual = Arrays.asList("Jack","John","Mary","Ann");

        assertEquals(expected,m.withoutDuplicates(actual));
    }

    @Test
    public void withoutDuplicates_test_removeDuplicates(){
        List<String> actual = Arrays.asList("Jack","John","Mary","Ann","Jack","John");
        List<String> expected = Arrays.asList("Ann","John","Jack","Mary");

        assertEquals(expected,m.withoutDuplicates(actual));
    }

}