package my_sort;

import java.util.Arrays;
//���util����ʵ�����ṩ���ֹ������
//ð������,���Ǳȴ�СȻ��һ�����滻��ȥ
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
