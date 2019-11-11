package tw.org.iii;

public class MyScooter extends Bike {
	// 屬性 是否有開燈
	private boolean Light;

	// 方法是否有亮燈
	public boolean isLight() {
		return Light;
	}

	// 燈開關
	public void switchLight() {
		Light = !Light;
	}

	// 改寫加速度
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 2.4;
	}

	// 改寫減速度
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.4;
	}
}
