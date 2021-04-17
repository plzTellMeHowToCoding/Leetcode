fun dayOfYear(date: String): Int {
    //2019-03-01
    //取得年、月、日
    val y = date.substring(0,4).toInt()
    val m = date.substring(5,7).toInt()
    val d = date.substring(8,date.length).toInt()
    //初始化結果=0
    var result = 0
    //只用整數陣列紀錄每月天數
    var month_days : Array<Int> = arrayOf(31,28,31,30,31,30,31,31,30,31,30,31)
    //若為1月，直接回傳日數
    if(m == 1)
        return d
    //判斷是否為閏年，若是則將2月天數改為29天
    else if(isLeapYear(y)){
        month_days[1] = 29
        //使用迴圈走訪月，result累加到傳入參數的前一個月
        for(index : Int in 0 until m-1){
            result += month_days[index]
        }
        //最後再加天數，回傳
        result+=d
        return result
    }else{
        //使用迴圈走訪月，result累加到傳入參數的前一個月
        for(index : Int in 0 until m-1){
            result += month_days[index]
        }
        //最後再加天數，回傳
        result+=d
        return result
    }
}
//判斷閏年
fun isLeapYear(year : Int)  =
    //若除以400能整除則為閏年，或除以4能整除；但除以100不能整除 也為閏年
    if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)) true else false

fun main() {
    /*19.8.11*/
    println(dayOfYear("2019-08-11"))
}