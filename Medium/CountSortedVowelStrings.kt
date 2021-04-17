class CountSortedVowelStrings {
    /** 2021-04-11 Medium
     * n = 1, ans = 5, [a,e,i,o,u]
     * n = 2, ans = 15, [aa, ae, ai , ao, au,
     *                   ee, ei, eo, eu,
     *                   ii, io, iu,
     *                   oo, ou ,
     *                   uu]
     * n = 3, ans = , [5+4+3+2+1, 4+3+2+1, 3+2+1, 2+1, 1]
     */
    var temp_list = mutableListOf(1,1,1,1,1)
    var ans : Int = 0
    var temp = 0
    fun countVowelStrings(n: Int) : Int{
        for(cahr_len in 0 until n-1) {
            /**
             *  z = 字串長度
             *  ex. z = 2 , aa
             *  ex. z = 3 , aaa
             * */
            for (i in 0 until temp_list.size) {
                temp = 0
                for (j in i until temp_list.size) {
                    /** ---------------------------------------------------
                     *  i = 0, j = 4 ~ 0
                     *  temp_list[4] ~ temp_list[0], 等於以 a 為開頭出現的次數
                     *  ---------------------------------------------------
                     *  i = 1, j = 4 ~ 1
                     *  temp_list[4] ~ temp_list[1], 等於以 e 為開頭出現的次數
                     *  ---------------------------------------------------
                     *  i = 2, j = 4 ~ 2
                     *  temp_list[4] ~ temp_list[2], 等於以 i 為開頭出現的次數
                     *  ---------------------------------------------------
                     *  i = 3, j = 4 ~ 3
                     *  temp_list[4] ~ temp_list[3], 等於以 o 為開頭出現的次數
                     *  ---------------------------------------------------
                     *  i = 4, j = 4
                     *  temp_list[4] , 等於以 u 為開頭出現的次數
                     *  ---------------------------------------------------
                     * */
                    temp += temp_list[j]
                }
                temp_list[i] = temp
            }
        }
        for(temp in temp_list){
            ans += temp
        }
        return ans
    }
}
fun main(){
    println("${CountSortedVowelStrings().countVowelStrings(10)}")
    val fruits = arrayListOf<String>("a","b","c")
    println("size = ${fruits.size}")
    val fruits2 = fruits
    fruits2.clear()
    println("size = ${fruits.size}")
}