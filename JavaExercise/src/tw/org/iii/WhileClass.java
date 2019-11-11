package tw.org.iii;

public class WhileClass {

	public static void main(String[] args) {
		// 1+2+3+...+question=?
		int question = 100;
		int a = 0, n = 1;
		while (n <= question) {
			a = a + n++;
			System.out.println(a);
		}
	}
}
