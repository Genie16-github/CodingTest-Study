package programmers.Level0.P120811;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MainTest {

    @Test
    void t1() {
        assertThat(new Solution().solution(new int[]{1,2,7,10,11})).isEqualTo(7);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(new int[]{9,-1,0})).isEqualTo(0);
    }
}