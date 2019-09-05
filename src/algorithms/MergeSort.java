package algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void mergesort(int [] a, int n){
        if(n<2) return;
        int mid=n/2;
        int [] s1= Arrays.copyOfRange(a, 0, mid);
        int [] s2 =Arrays.copyOfRange(a, mid, n);
        mergesort(s1, s1.length);
        mergesort(s2, s2.length);
        merge(a, s1, s2);

    }
    private static void merge(int [] a, int [] s1, int [] s2){
        int lena= s1.length;
        int lenb=s2.length;
        int i=0, j=0;
        while(i+j<a.length){
            if(j==lenb || s1[i]<s2[j]){
                a[i+j] =s1[i];
                i++;
            }
            else{
                a[i+j] = s2[j];
                j++;
            }
        }
    }
}
