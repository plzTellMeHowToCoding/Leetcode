fun main() {
    //(2,3,1,3,2,4,6,7,9,2,19),(2,1,4,3,9,6)
    /*19.8.13*/
    val r : IntArray = relativeSortArray(intArrayOf(2,3,1,3,2,4,6,7,9,2,19), intArrayOf(2,1,4,3,9,6))
    for(n in r)
        print("$n ")
}
fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
    //宣告結果陣列，初始大小為arr1的長度
    var result : IntArray = IntArray(arr1.size)
    //宣告用於填入結果陣列的索引值
    var index : Int = 0

    //走訪arr2，因為要以arr2的順序作排序
    for(num in arr2){
        //若arr1中也有arr2中的值
        if(arr1.contains(num)){
            //走訪arr1陣列
            for(count in arr1.indices){
                //若當前arr1的值 = 當前走訪到的arr2中的值
                if(arr1[count] == num) {
                    //將當前arr1的值存入結果陣列
                    result[index] = arr1[count]
                    //索引+1
                    index++
                    //將當前arr1的值改為-1
                    arr1[count] = -1
                }
            }
        }
    }
    //將剩餘的arr1排序
    arr1.sort()
    //走訪剩餘的arr1陣列
    for(num in arr1)
        //若當前的值不等於-1(代表arr2中沒有該元素)
        if(num != -1) {
            //將當前的值存入結果陣列
            result[index] = num
            //索引+1
            index++
        }
    return result
}