class CustomStack(maxSize: Int) {
    /** 2021-04-01 Medium
     *  使用陣列解，預設索引值為 -1，待有資料要push 進stack 時才將索引++
     */
    private var item_arr = IntArray(maxSize)
    private var index = -1

    //確認當前索引值是否小於陣列最後一個索引值（也就是還有空間）後再進行push
    fun push(x: Int) {
        if (index < item_arr.lastIndex) {
            index++
            item_arr[index] = x
        }
    }

    //若stack 為空則回傳-1，若不為空則將最後一個索引值的value 回傳，並--索引值
    fun pop(): Int {
        var temp = -1
        if (index < 0) {
            return temp
        } else {
            temp = item_arr[index--]
            return temp
        }
    }

    /** 若總共要增加的個數 > 堆疊長度，則只將該堆疊內的元素都+ `val`
     *  反之， 則將堆疊內的k 個元素 + `val`
     */
    fun increment(k: Int, `val`: Int) {
        if (k > item_arr.size) {
            for (i in 0..index) {
                item_arr[i] += `val`
            }
        } else {
            for (i in 0 until k) {
                item_arr[i] += `val`
            }
        }
    }
}