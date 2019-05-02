import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex1Test {

    @Test
    void maxFirstSuccess() {
        Ex1 ex1 = new Ex1();
        Integer[] arr1 = {14,2};
        MinMax result = ex1.getMinMax(arr1);
        assertEquals(2, result.getMin());
        assertEquals(14, result.getMax());
    }

    @Test
    void minFirstSuccess() {
        Ex1 ex1 = new Ex1();
        Integer[] arr1 = {23,8000};
        MinMax result = ex1.getMinMax(arr1);
        assertEquals(23, result.getMin());
        assertEquals(8000, result.getMax());
    }
}