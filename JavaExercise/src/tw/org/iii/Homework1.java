package tw.org.iii;

public class Homework1 {

	public static void main(String[] args) {
		// �p�D��
		int a = 0;
		String[] mesg = { "OK", "XX" };
		// �Х[�W�@�U�{���X ��console����L�X OK,XX

		// �Ѫk1:
		for (int i = 0; i < 4; i++) {
			if (a == 0) {
				System.out.println(mesg[a]);
				a++;
			} else {
				System.out.println(mesg[a]);
				a--;
			}
		}

		// �Ѯv�Ѫk1:�T���B�⦡
		//�p�Ga����0���ܡAa�N����1�_�h����a�h��0
		
		a = a == 0 ? 1 : 0;	//a��0�g�L�T���B��ȷ|����1
		System.out.println("�T���B�� : "+mesg[a]);//�L�XXX
		a = a == 0 ? 1 : 0;//a��1�g�L�T���B��ȷ|����0
		System.out.println("�T���B�� : "+mesg[a]);//�L�XOK
		a = a == 0 ? 1 : 0;	//a��0�g�L�T���B��ȷ|����1
		System.out.println("�T���B�� : "+mesg[a]);//�L�XXX
		a = a == 0 ? 1 : 0;//a��1�g�L�T���B��ȷ|����0
		System.out.println("�T���B�� : "+mesg[a]);//�L�XOK
		
		//�Ѯv�Ѫk2:  XOR�Ϊk
		//XOR�S�ʬ��P�ʬۥ����G��1�B���ʬۧl���G��0
		//�P�ʬۥ��N��O ���]A����1�A���� A^1���N��N�� 1�P1�ۦP�A���G��1
		//���ʬۧl�N��O ���]A����0�A���� A^1���N��N�� 0�P1���ۦP�A���G��0
		a = a ^ 1;
		System.out.println("XOR�Ϊk :"+mesg[a]);
		a = a ^ 1;
		System.out.println("XOR�Ϊk :"+mesg[a]);
		a = a ^ 1;
		System.out.println("XOR�Ϊk :"+mesg[a]);
		a = a ^ 1;
		System.out.println("XOR�Ϊk :"+mesg[a]);

	}

}
