package tw.brad.apps;

import tw.org.iii.*;

public class Run {
	public static void main(String[] args) {

		Bike b1 = new Bike();
		MyScooter s1 = new MyScooter();
		// �D�}�񨮻PScooter���t�סH
		// ���ե[�t�� �L�X�ƭ�
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		s1.upSpeed();
		s1.upSpeed();
		s1.upSpeed();
		System.out.println("bike���t�� :" + b1.getSpeed());
		System.out.println("Scooter���t��:" + s1.getSpeed());
		// ���մ�ֳt�צ�0
		while (b1.getSpeed() > 0) {
			b1.downSpeed();
			System.out.print("bike�ثe�t��:" + b1.getSpeed()+"	");
		}
		System.out.println();
		while (s1.getSpeed()>0) {
			s1.downSpeed();
			System.out.print("Scooter�ثe�t��:"+s1.getSpeed()+"	");
		}
		System.out.println();
		System.out.println("bike���t�� :" + b1.getSpeed());
		System.out.println("Scooter���t�סG"+s1.getSpeed());
	}
}
