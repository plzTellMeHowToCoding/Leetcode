fun main() {
    /*19.8.9 by kotlin*/
    println(tribonacci(25))
}

fun tribonacci(n : Int) : Int{
    //建構array list儲存答案
    //前三項固定為0,1,1
    val list  = ArrayList<Int>()
    list.add(0)
    list.add(1)
    list.add(1)
    //索引3開始，依序填入(當前索引-1+當前索引-2+當前索引-3)的值
    for(i in 3..n step 1){
        list.add(i , (list.get(i-1) + list.get(i-2) + list.get(i-3)))
    }
    //回傳結果
    return list.get(n)
}