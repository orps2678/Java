package tw.org.iii;

import java.util.Arrays;
import java.util.HashMap;

public class PokerHashMap {
	public static void main(String[] args) {
		// 洗牌程式
		int[] poker = new int[52];
		// array初始化後，每個位子的數字為0

		// 給予陣列每個位子參數
		for (int i = 0; i < poker.length; i++) {
			poker[i] = i;
		}

		for (int i = poker.length - 1; i > 0; i--) {
			// random 選出要取陣列的第幾個元素
			int rand = (int) (Math.random() * (i + 1)); // 假設rand=5
			int temp = poker[rand]; // 準備一個temp將poker 5的元素先裝進來
			poker[rand] = poker[i]; // poker[5] 的元素會被poker[i]的元素取代
			poker[i] = temp; // 再將 原先拿給temp的元素給魚 poker[i]完成交換
		}

		// for each 印出全部元素
//		for (int v : poker)
//			System.out.println(v);

		// System.out.println("---我是分隔線---");

		// 發牌功能
		// 加入4花色 另外每個花色為13張牌 用陣列表示
		int[][] players = new int[4][13];
		for (int i = 0; i < poker.length; i++) {
			players[i % 4][i / 4] = poker[i];
		}

		HashMap<Integer, String> pokerAns = new HashMap<Integer, String>();
		pokerAns.put(0, "A");
		for (int i = 1; i < 10; i++) {
			pokerAns.put(i, (i + 1) + "");
		}
		pokerAns.put(10, "J");
		pokerAns.put(11, "Q");
		pokerAns.put(12, "K");

		String[] suit = { "黑桃", "愛心", "方塊", "梅花" };
		for (int[] player : players) {
			Arrays.sort(player);// 排序
			for (int card : player) {
				int quotient = card / 13; // 商數
				int remainder = card % 13; // 餘數
				System.out.print(suit[quotient] + pokerAns.get(remainder) + "	");
			}
			System.out.println();
		}

	}

}
