package tw.org.iii;

public class Student {
	// �ǥ��ݩʡG�W�l�B�ʧO�B����
	private String name;
	private boolean sex;
	private int score;

	// ��k
	// �]�w�W�l
	public void setName(String inputName) {
		name = inputName;
	}

	// �d�ݦW�l
	public void lookName() {
		System.out.println(name);
	}

	// �]�w�ʧO
	public void setSex(int inputSex) {
		switch (inputSex) {
		case 0:
			sex = false;
			break;
		case 1:
			sex = true;
			break;
		default:
			System.out.println("�ƭȤ����T�A�Э��s��J");
			break;
		}
	}

	// �d�ݩʧO
	public void lookSex() {
		if (sex) {
			System.out.println("�k��");
		} else {
			System.out.println("�k��");
		}
	}

	// �]�w����
	public void setScore(int inputScore) {
		score = inputScore;
	}

	// �d�ݤ���
	public void lookScore() {
		System.out.println(score);
	}

}
