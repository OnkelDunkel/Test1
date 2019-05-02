import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex1 {

    public MinMax getMinMax(Integer[] numbers) {

        if(numbers.length == 0) return null;

        List<Integer> l = Arrays.asList(numbers);

        MinMax minMax = new MinMax(Collections.min(l),Collections.max(l));

        return minMax;
    }
}
