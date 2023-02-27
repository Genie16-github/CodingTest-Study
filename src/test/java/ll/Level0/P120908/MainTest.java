package ll.Level0.P120908;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("\"ab6CDE443fgh22iJKlmn1o\"와 \"6CD\"를 입력하면 1 출력")
    void t1() {
        assertThat(new Solution().solution("ab6CDE443fgh22iJKlmn1o", "6CD")).isEqualTo(1);
    }

    @Test
    @DisplayName("\"ppprrrogrammers\"와 \"pppp\"를 입력하면 2 출력")
    void t2() {
        assertThat(new Solution().solution("ppprrrogrammers", "pppp")).isEqualTo(2);
    }

    @Test
    @DisplayName("\"AbcAbcA\"와 \"AAA\"를 입력하면 2 출력")
    void t3() {
        assertThat(new Solution().solution("AbcAbcA", "AAA")).isEqualTo(2);
    }
}