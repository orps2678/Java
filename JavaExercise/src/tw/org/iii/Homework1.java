package tw.org.iii;

public class Homework1 {

	public static void main(String[] args) {
		// 小題目
		int a = 0;
		String[] mesg = { "OK", "XX" };
		// 請加上一下程式碼 讓console交替印出 OK,XX

		// 解法1:
		for (int i = 0; i < 4; i++) {
			if (a == 0) {
				System.out.println(mesg[a]);
				a++;
			} else {
				System.out.println(mesg[a]);
				a--;
			}
		}

		// 老師解法1:三元運算式
		//如果a等於0的話，a就等於1否則的話a則為0
		
		a = a == 0 ? 1 : 0;	//a為0經過三元運算值會等於1
		System.out.println("三元運算 : "+mesg[a]);//印出XX
		a = a == 0 ? 1 : 0;//a為1經過三元運算值會等於0
		System.out.println("三元運算 : "+mesg[a]);//印出OK
		a = a == 0 ? 1 : 0;	//a為0經過三元運算值會等於1
		System.out.println("三元運算 : "+mesg[a]);//印出XX
		a = a == 0 ? 1 : 0;//a為1經過三元運算值會等於0
		System.out.println("三元運算 : "+mesg[a]);//印出OK
		
		//老師解法2:  XOR用法
		//XOR特性為同性相斥結果為1、異性相吸結果為0
		//同性相斥意思是 假設A等於1，那麼 A^1的意思就為 1與1相同，結果為1
		//異性相吸意思是 假設A等於0，那麼 A^1的意思就為 0與1不相同，結果為0
		a = a ^ 1;
		System.out.println("XOR用法 :"+mesg[a]);
		a = a ^ 1;
		System.out.println("XOR用法 :"+mesg[a]);
		a = a ^ 1;
		System.out.println("XOR用法 :"+mesg[a]);
		a = a ^ 1;
		System.out.println("XOR用法 :"+mesg[a]);

	}

}
