package LeetCode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void test_CanFindTarget() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int indexOfTarget = BinarySearch.search(nums, target);
        assertThat(indexOfTarget).isEqualTo(-1);
    }
}