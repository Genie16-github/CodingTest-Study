package ll.Level0.P120893;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("cccCCC 입력하면 CCCccc 출력")
    void t1() {
        Assertions.assertThat(new Solution().solution("cccCCC")).isEqualTo("CCCccc");
    }

    @Test
    @DisplayName("abCdEfghIJ 입력하면 ABcDeFGHij 출력")
    void t2() {
        Assertions.assertThat(new Solution().solution("abCdEfghIJ")).isEqualTo("ABcDeFGHij");
    }
}