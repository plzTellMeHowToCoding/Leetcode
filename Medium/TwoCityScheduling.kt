/**
 * 21-04-17
 * 確保 city A & city B 都要有到過
 * 將 costs 以 city A - city B 的差升冪排序
 * 這樣 costs 前半的數列代表去 city A 比較省
 * costs 後半的數列代表去 city B 比較省
 * 因此將 costs 前半 city A 的 cost 相加，後半 city B 的 cost 相加
 * */
class TwoCityScheduling {
    var totalCost = 0
    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        costs.sortBy {
            it[0] - it[1]
        }
        for(i in costs.indices){
            totalCost += if(i < (costs.size/2)){
                costs[i][0]
            }else{
                costs[i][1]
            }
        }
        return totalCost
    }
}