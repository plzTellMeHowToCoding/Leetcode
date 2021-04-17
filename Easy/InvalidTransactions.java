import java.util.*;

public class InvalidTransactions {
    public static void main(String[] args) {
        /*19.8.25 contest*/
        InvalidTransactions it = new InvalidTransactions();
        //"alice,20,800,mtv","alice,50,100,beijing"
        //"alice,20,800,mtv","alice,50,1200,mtv"
        //"bob,627,1973,amsterdam","alex,387,885,bangkok","alex,355,1029,barcelona","alex,587,402,bangkok","chalicefy,973,830,barcelona","alex,932,86,bangkok","bob,188,989,amsterdam"
        //"bob,689,1910,barcelona","alex,696,122,bangkok","bob,832,1726,barcelona","bob,820,596,bangkok","chalicefy,217,669,barcelona","bob,175,221,amsterdam"
        //"chalicefy,639,1283,beijing","maybe,324,192,frankfurt","bob,627,974,amsterdam","alex,962,125,chicago","iris,849,36,beijing","chalicefy,70,415,bangkok","chalicefy,112,467,frankfurt","xnova,358,82,barcelona","chalicefy,180,543,beijing","xnova,624,572,budapest","lee,651,1761,chicago","alex,991,1698,budapest","bob,531,700,amsterdam","chalicefy,926,478,budapest","iris,235,1993,frankfurt","alex,107,812,beijing","maybe,199,1313,barcelona"
        //"lee,886,1785,beijing","alex,763,1157,amsterdam","lee,277,129,amsterdam","bob,770,105,amsterdam","lee,603,926,amsterdam","chalicefy,476,50,budapest","lee,924,859,barcelona","alex,302,590,amsterdam","alex,397,1464,barcelona","bob,412,1404,amsterdam","lee,505,849,budapest"
        List<String> r = it.invalidTransactions(new String[]{"bob,627,1973,amsterdam", "alex,387,885,bangkok", "alex,355,1029,barcelona", "alex,587,402,bangkok", "chalicefy,973,830,barcelona", "alex,932,86,bangkok", "bob,188,989,amsterdam"
        });

        for (String s : r)
            System.out.println(s);
    }
    /*
     * 消費金額超過1000 or 兩個消費地點不同且交易間隔<60
     *
     * 先確認當筆交易金額是否>1000
     * 確認交易人名稱是否相同 && 確認交易地點是否與上一次不同 且 兩筆交易間隔<=60
     * */

    /*
    * 未優化，可將每次回圈執行的String.spilt()方法提出來先執行，例如先將所有陣列字串先分類好
    * */
    public List<String> invalidTransactions(String[] transactions) {
        /* 先將 transcations 裡字串格式先分類好，再用這二維陣列做運算
        String[][] transcation = new String[transactions.length][4];
        for(int i=0; i<transactions.length; i++){
            transcation[i][0] = transactions[i].split(",")[0];
            transcation[i][1] = transactions[i].split(",")[1];
            transcation[i][2] = transactions[i].split(",")[2];
            transcation[i][3] = transactions[i].split(",")[3];
        }
        */
        List<String> result = new ArrayList<>();
        String name, loc, amount;
        int trans_time;
        //走訪transcations陣列
        for (int i = 0; i < transactions.length; i++) {
            name = transactions[i].split(",")[0];
            trans_time = Integer.valueOf(transactions[i].split(",")[1]);
            amount = transactions[i].split(",")[2];
            loc = transactions[i].split(",")[3];
            //若交易金額>1000 && 該筆紀錄尚未存進result中 就存進去
            if (Integer.valueOf(amount) > 1000 && !(result.contains(transactions[i]))) {
                result.add(transactions[i]);
            } else { //否則再走訪transcations
                for (int j = 0; j < transactions.length; j++) {
                    //若交易地點不同 && 兩筆交易時間間隔<=60
                    if (name.equals(transactions[j].split(",")[0]) &&
                            !(transactions[j].split(",")[3].equals(loc)) && Math.abs(Integer.valueOf(transactions[j].split(",")[1]) - trans_time) <= 60) {
                        //判斷有無加過，若無則將該筆紀錄添加至result
                        if (!result.contains(transactions[i]))
                            result.add(transactions[i]);
                    }
                }
            }
        }
        return result;
    }
}