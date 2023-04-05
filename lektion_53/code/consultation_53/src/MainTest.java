import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main m;

    @BeforeEach
    public void init(){
        m = new Main();

    }

    @Test
    public void testFindDom_noDominant(){
        int[] actual = {5,5,6,5,6,6};
        assertEquals(-1, m.findDominant(actual));
    }
    @Test
    public void testFindDom_dominantExists(){
        int[] actual = {5,5,6,5,6,6,1,2,5,5,5,5,5,5,5,5};
        assertEquals(5,m.findDominant(actual));

    }

    @Test
    public void testFindDom_dominantOne(){
        int[] actual = {5};
        assertEquals(5,m.findDominant(actual));

    }


    @Test
    public void testFindDom_dominant_twoDif(){
        int[] actual = {5,6};
        assertEquals(-1,m.findDominant(actual));

    }

    @Test
    public void testFindDom_dominant_equal(){
        int[] actual = {6,6};
        assertEquals(6,m.findDominant(actual));

    }

}