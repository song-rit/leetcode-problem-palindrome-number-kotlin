package song.cpe.palindromenumber.solution

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SolutionTest {

    var solution = Solution()

    @Test
    fun isPalindromeNumber() {
        val input = 121
        val result = solution.isPalidromeNumber(input)
        Assertions.assertTrue(result)
    }
}