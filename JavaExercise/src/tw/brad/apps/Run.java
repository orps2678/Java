package tw.brad.apps;

import tw.org.iii.*;

public class Run {
	public static void main(String[] args) {

		Bike b1 = new Bike();
		MyScooter s1 = new MyScooter();
		// 求腳踏車與Scooter的速度？
		// 嘗試加速度 印出數值
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		s1.upSpeed();
		s1.upSpeed();
		s1.upSpeed();
		System.out.println("bike的速度 :" + b1.getSpeed());
		System.out.println("Scooter的速度:" + s1.getSpeed());
		// 嘗試減少速度至0
		while (b1.getSpeed() > 0) {
			b1.downSpeed();
			System.out.print("bike目前速度:" + b1.getSpeed()+"	");
		}
		System.out.println();
		while (s1.getSpeed()>0) {
			s1.downSpeed();
			System.out.print("Scooter目前速度:"+s1.getSpeed()+"	");
		}
		System.out.println();
		System.out.println("bike的速度 :" + b1.getSpeed());
		System.out.println("Scooter的速度："+s1.getSpeed());
	}
}
