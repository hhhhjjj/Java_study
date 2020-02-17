package my_sort;

import java.util.Arrays;
//这个util库其实就是提供各种工具类的
//冒泡排序,就是比大小然后一个个替换过去
public class BubbleSort {
	public static void main(String[] args) {
		int [] a = new int[] {1,5,2,9};
		for (int i = 0; i < a.length; i++) {
			for (int j =0;j < a.length - 1 - i;j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					
				}
				
			}
		}
		Arrays.stream(a).forEach(System.out :: print);
	}

}
