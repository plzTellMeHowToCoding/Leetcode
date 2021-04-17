/**
 * 21.4.15
 * */
class CountingBits {
    fun countBits(num: Int): IntArray {
        var binaryNumber = ""
        var count = 0
        val ansList = mutableListOf<Int>()
        for (i in 0..num) {
            binaryNumber = Integer.toBinaryString(i)
            count = binaryNumber.count {
                it == '1'
            }
            ansList.add(count)
        }
        return ansList.toIntArray()
    }
}