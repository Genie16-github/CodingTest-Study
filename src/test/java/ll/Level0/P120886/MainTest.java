package ll.Level0.P120886;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    @DisplayName("문자열 before, after가 주어질 때 before의 순서를 바꾸어 after를 만들 수" +
            "있으면 1을, 만들 수 없으면 0을 return")
    void t1(){
        Assertions.assertThat(new Solution().solution("olleh", "after"))
                .isEqualTo(1);
    }
}