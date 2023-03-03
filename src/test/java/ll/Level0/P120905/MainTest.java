package ll.Level0.P120905;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    @DisplayName("n(3)과 numlist([4, 5, 6, 7, 8, 9, 10, 11, 12]) 입력하면 [6,9,12] 출력")
    void t1(){
        assertThat(new Solution().solution(3, new int[]{4,5,6,7,8,9,10,11,12}))
                .isEqualTo(new int[]{6,9,12});
    }

}