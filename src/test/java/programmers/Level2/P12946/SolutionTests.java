package programmers.Level2.P12946;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTests {
    @Test
    @DisplayName("n=1 -> [[1, 3]]")
    void t01() {
        assertThat(
                new Solution().solution(1)
        ).isEqualTo(
                new int[][]{{1, 3}}
        );
    }

    @Test
    @DisplayName("n=2 -> [[1, 2], [1, 3], [2, 3]]")
    void t02() {
        assertThat(
                new Solution().solution(2)
        ).isEqualTo(
                new int[][]{{1, 2}, {1, 3}, {2, 3}}
        );
    }
}