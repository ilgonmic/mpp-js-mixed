import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertTrue

class CommonTests {
    @Test
    fun passedTest() {
        assertTrue { true }
    }

    @Ignore
    @Test
    fun failedTest() {
        assertTrue { false }
    }
}