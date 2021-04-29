import kotlin.math.max

/**
 *  21-04-29
 *  使用動態規劃解題
 */
class HouseRobber {
    fun rob(nums: IntArray): Int {
        return when(nums.size){
            1 -> {
                nums[0]
            }
            2 -> {
                max(nums[0],nums[1])
            }
            else -> {
                val rob = IntArray(nums.size)
                rob[0] = nums[0]
                rob[1] = max(nums[0],nums[1])
                for(i in 2 .. nums.size){
                    rob[i] = max(rob[i-2]+nums[i],rob[i-1])
                }
                rob[nums.size-1]
            }
        }
    }
}