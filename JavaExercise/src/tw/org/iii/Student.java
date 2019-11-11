package tw.org.iii;

public class Student {
	// 厩ネ妮┦┦だ计
	private String name;
	private boolean sex;
	private int score;

	// よ猭
	// 砞﹚
	public void setName(String inputName) {
		name = inputName;
	}

	// 琩
	public void lookName() {
		System.out.println(name);
	}

	// 砞﹚┦
	public void setSex(int inputSex) {
		switch (inputSex) {
		case 0:
			sex = false;
			break;
		case 1:
			sex = true;
			break;
		default:
			System.out.println("计ぃタ絋叫穝块");
			break;
		}
	}

	// 琩┦
	public void lookSex() {
		if (sex) {
			System.out.println("╧ネ");
		} else {
			System.out.println("ネ");
		}
	}

	// 砞﹚だ计
	public void setScore(int inputScore) {
		score = inputScore;
	}

	// 琩だ计
	public void lookScore() {
		System.out.println(score);
	}

}
