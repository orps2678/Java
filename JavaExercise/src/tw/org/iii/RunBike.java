package tw.org.iii;

public class RunBike {
	// 執行腳踏車用
	public static void main(String[] args) {
		Bike b1;
		// new的時候在記憶體產生了一塊空間
		// Bike()當有了空間之後會需要初始化的動作，所以我們會去呼叫腳踏車的建構式
		b1 = new Bike();// 當等號成立就代表完成初始化
		System.out.println(b1.getSpeed());
		while (b1.getSpeed() < 10) {
			b1.upSpeed();
		}
		System.out.println(b1.getSpeed() + "	");
	}

}
