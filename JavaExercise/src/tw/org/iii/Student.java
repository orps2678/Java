package tw.org.iii;

public class Student {
	// 學生屬性：名子、性別、分數
	private String name;
	private boolean sex;
	private int score;

	// 方法
	// 設定名子
	public void setName(String inputName) {
		name = inputName;
	}

	// 查看名子
	public void lookName() {
		System.out.println(name);
	}

	// 設定性別
	public void setSex(int inputSex) {
		switch (inputSex) {
		case 0:
			sex = false;
			break;
		case 1:
			sex = true;
			break;
		default:
			System.out.println("數值不正確，請重新輸入");
			break;
		}
	}

	// 查看性別
	public void lookSex() {
		if (sex) {
			System.out.println("男生");
		} else {
			System.out.println("女生");
		}
	}

	// 設定分數
	public void setScore(int inputScore) {
		score = inputScore;
	}

	// 查看分數
	public void lookScore() {
		System.out.println(score);
	}

}
