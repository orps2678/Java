package tw.org.iii;

public class MyScooter extends Bike {
	// �ݩ� �O�_���}�O
	private boolean Light;

	// ��k�O�_���G�O
	public boolean isLight() {
		return Light;
	}

	// �O�}��
	public void switchLight() {
		Light = !Light;
	}

	// ��g�[�t��
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 2.4;
	}

	// ��g��t��
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.4;
	}
}
