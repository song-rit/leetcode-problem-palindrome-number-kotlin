package song.cpe.palindromenumber.solution

class Solution {

    fun isPalidromeNumber(input: Int): Boolean {
        var numberStr = input.toString()
        var revertInputStr = numberStr.reversed()

        for(i in 0..(numberStr.length / 2) - 1) {
            if(numberStr[i] != revertInputStr[i]) {
                return false
            }
        }
        return true
    }
}