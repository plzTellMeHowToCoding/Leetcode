import java.util.*

fun main() {
    /*19.8.15*/
}

fun duplicateZeros(arr: IntArray): Unit {
    //宣告暫時儲存陣列元素的串列
    var tempArrList = ArrayList<Int>()
    //若arr中有0再執行
    if(arr.contains(0)) {
        //走訪arr
        for (num in arr) {
            //若當前走訪的元素為0，則在串列鍾加兩次0
            if(num == 0) {
                tempArrList.add(0);
                tempArrList.add(0);
            }else //否則直接將該元素添加至串列
                tempArrList.add(num)
        }
        //走訪arr陣列(取長度)
        for(index in arr.indices){
            //將arr陣列替換為串列中的值
            arr[index] = tempArrList.get(index)
        }
    }
}