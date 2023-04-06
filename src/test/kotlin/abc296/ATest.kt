package abc296

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ATest {
    @Test
    fun 入力例1() {
        assertFalse(hasConsecutiveChars(6, "MFMFMF"))
    }

    @Test
    fun 入力例2() {
        assertTrue(hasConsecutiveChars(9, "FMFMMFMFM"))
    }

    @Test
    fun 入力例3() {
        assertFalse(hasConsecutiveChars(1, "F"))
    }
}
