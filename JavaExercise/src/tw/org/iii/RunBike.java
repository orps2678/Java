package tw.org.iii;

public class RunBike {
	// ����}�񨮥�
	public static void main(String[] args) {
		Bike b1;
		// new���ɭԦb�O���鲣�ͤF�@���Ŷ�
		// Bike()���F�Ŷ�����|�ݭn��l�ƪ��ʧ@�A�ҥH�ڭ̷|�h�I�s�}�񨮪��غc��
		b1 = new Bike();// �������ߴN�N������l��
		System.out.println(b1.getSpeed());
		while (b1.getSpeed() < 10) {
			b1.upSpeed();
		}
		System.out.println(b1.getSpeed() + "	");
	}

}
