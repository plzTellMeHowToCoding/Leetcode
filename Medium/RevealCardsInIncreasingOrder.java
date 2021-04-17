import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 19.06.24
 */
public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        int N = deck.length;
        Queue<Integer> index = new LinkedList();
        for (int i = 0; i < N; ++i)
            index.add(i);

        int[] ans = new int[N];
        Arrays.sort(deck);
        for (int card : deck) {
            ans[index.poll()] = card;
            if (!index.isEmpty())
                index.add(index.poll());
        }

        return ans;
    }
}