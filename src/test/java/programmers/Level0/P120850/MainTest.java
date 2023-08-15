package programmers.Level0.P120850;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void t1() {
        assertThat(new Solution().solution("hi12392"))
                .isEqualTo(new int[]{1, 2, 2, 3, 9});
    }

    @Test
    void t2() {
        assertThat(new Solution().solution("p2o4i8gj2"))
                .isEqualTo(new int[]{2, 2, 4, 8});
    }
}