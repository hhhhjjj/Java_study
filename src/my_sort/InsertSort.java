package my_sort;

import java.util.Arrays;
//����ͺʹ������ϲ���һ����С��һֱ����߱Ƚ�
public class InsertSort {
    public static void main(String[] args) {
        int [] a = new int[]{1,5,2,9};
        for (int i = 0; i < a.length; i++) {
            int index = i;
            int temp = a[i];
            while (index>0 && a[index-1]>temp){
                a[index] = a[index-1];
                index--;
            }
            a[index] = temp;
        }

        Arrays.stream(a).forEach(System.out::print);
    }
}
