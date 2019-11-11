package tw.org.iii;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// �����瘜�
		int[] array1 = new int[5];
		array1[0] = 10;
		array1[1] = 33;
		array1[2] = 78;
		array1[3] = 105;
		array1[4] = 98;

		int[] array2 = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		Arrays.sort(array1);
		Arrays.sort(array2);

		for (int j : array1) {
			System.out.print(j + "	");
		}
		System.out.println();
		System.out.println("---我是分隔線---");
		for (int i : array2) {
			System.out.print(i + "	");
		}

	}

}
