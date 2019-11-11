package tw.org.iii;

public class PokerSwitch {
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

		String[] suit = { "�®�", "�R��", "���", "����" };
		for (int[] player : players) {
			for (int card : player) {
				int quotient = card / 13; // �Ӽ�
				int remainder = card % 13; // �l��
				switch (remainder) {
				case 0:
					System.out.print(suit[quotient]+"K	");
					break;
				case 1:
					System.out.print(suit[quotient]+"A	");
					break;
				case 11:
					System.out.print(suit[quotient]+"J	");
					break;
				case 12:
					System.out.print(suit[quotient]+"Q	");
					break;
				default:
					System.out.print(suit[quotient]+remainder+"	");
					break;
				}
			}
			System.out.println();
		}

	}

}
