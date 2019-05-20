import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArraysWorkshopTest {
    private ArraysWorkshop arraysWorkshop = new ArraysWorkshop();

    @Test
    public void reverseArrayWithOddElements() {
        int[] actual = new int[]{5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};

        assertThat(arraysWorkshop.reverseArray(actual), is(expected));
    }

    @Test
    public void reverseArrayWithEvenElements() {
        int[] actual = new int[]{5, 4, 3, 2};
        int[] expected = new int[]{2, 3, 4, 5};

        assertThat(arraysWorkshop.reverseArray(actual), is(expected));
    }
}