package my_sort;
//合并排序
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] a = new int[]{1,5,2,9,3,7,0,5};

        a = mergeSort(a,0,a.length-1);
        Arrays.stream(a).forEach(System.out::print);
    }

    private static int[] mergeSort(int[] a, int low, int high) {
//    	这个就是类里面定义一个函数
        int mid = (low+high)/2;
        if (low<high) {
            mergeSort(a, low, mid);
            mergeSort(a, mid+1, high);
            merge(a,low,mid,high);
        }
        return a;
    }

    private static void merge(int[] a, int low, int mid, int high) {
        int i = low;
        int j = mid+1;
        int temp[] = new int[high-low+1];
        int index = 0;
        while (i<=mid && j<=high){
            if (a[i]<a[j]) {
                temp[index++] = a[i++];
            }else {
                temp[index++] = a[j++];
            }
        }
        while (i<=mid){
            temp[index++] = a[i++];
        }
        while (j<=high){
            temp[index++] = a[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            a[low+k] = temp[k];
        }
    }
}
