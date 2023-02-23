package ll.Level0.P120829;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MainTest {
    @Test
    @DisplayName("70도가 입력되었을 때 1 출력")
    void t1() {
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName("91도가 입력되었을 때 3 출력")
    void t2() {
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }

    @Test
    @DisplayName("180도가 입력되었을 때 4 출력")
    void t3() {
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }

    @Test
    @DisplayName("90도가 입력되었을 때 2 출력")
    void t4() {
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }
}
