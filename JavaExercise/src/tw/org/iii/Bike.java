package tw.org.iii;

public class Bike {

	// protected �O�@�šG���I�N
	protected double speed;

	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.5;
	}

	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.7;
	}

	public double getSpeed() {
		return speed;
	}
}
