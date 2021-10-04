package LeetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StrictlyIncreasingTest {
    @Test
    void test_makeArrayIncreasing(){
        int[] arrayOne = {1,5,3,6,7};
        int[] arrayTwo = {4, 3, 1};

        int minimumNumberOfOperations = StrictlyIncreasing.makeArrayIncreasing(arrayOne, arrayTwo);
        assertThat(minimumNumberOfOperations).isEqualTo(2);
    }

}