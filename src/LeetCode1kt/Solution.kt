package LeetCode1kt
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result = IntArray(2)
        var flug = 1
        for (i in nums.indices){
            var temp = target - nums[i]
            for (j in nums.indices){
                if (j!=i&&nums[j] == temp){
                    result[0] = i
                    result[1] = j
                    flug = 0
                }
            }
            if (flug == 0){
                break
            }
        }
        return result
    }

}
fun main(){
    var nums = intArrayOf(3,3)
    var target = 6
    var s = Solution()
    var result = s.twoSum(nums,target)
    for(i in result){
        println(i)
    }
}