package tw.org.iii;

import java.util.Arrays;
import java.util.HashMap;

public class PokerHashMap {
	public static void main(String[] args) {
		// �~�P�{��
		int[] poker = new int[52];
		// array��l�ƫ�A�C�Ӧ�l���Ʀr��0

		// �����}�C�C�Ӧ�l�Ѽ�
		for (int i = 0; i < poker.length; i++) {
			poker[i] = i;
		}

		for (int i = poker.length - 1; i > 0; i--) {
			// random ��X�n���}�C���ĴX�Ӥ���
			int rand = (int) (Math.random() * (i + 1)); // ���]rand=5
			int temp = poker[rand]; // �ǳƤ@��temp�Npoker 5���������˶i��
			poker[rand] = poker[i]; // poker[5] �������|�Qpoker[i]���������N
			poker[i] = temp; // �A�N �������temp���������� poker[i]�����洫
		}

		// for each �L�X��������
//		for (int v : poker)
//			System.out.println(v);

		// System.out.println("---�ڬO���j�u---");

		// �o�P�\��
		// �[�J4��� �t�~�C�Ӫ�⬰13�i�P �ΰ}�C���
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

		String[] suit = { "�®�", "�R��", "���", "����" };
		for (int[] player : players) {
			Arrays.sort(player);// �Ƨ�
			for (int card : player) {
				int quotient = card / 13; // �Ӽ�
				int remainder = card % 13; // �l��
				System.out.print(suit[quotient] + pokerAns.get(remainder) + "	");
			}
			System.out.println();
		}

	}

}
