package algorithms;

public class MergeSort {

    public static void mergesort(int [] a, int n){
        if(a.length<=1) return ;
        int mid =n/2;
        int [] left = new int[mid];
        for(int i=0; i<mid; i++){
            left[i] = a[i];
        }

        int [] right = new int[n-mid];
        for(int i=0; i<n-mid; i++){
            right[i] = a[mid+i];
        }

        mergesort(left, mid);
        mergesort(right, n-mid);
        merge(a, left, right, mid, n-mid);
    }
    static void merge(int[] a, int [] left, int[] right, int leftLen, int rightLen){
        if(a.length==1) return;
        int i=0, j=0, k=0;
        while(i<leftLen && j<rightLen){
            if(left[i] < right[j]){
                a[k++] =left[i++];

            }
            else{
                a[k]=right[j];
                i++; j++; k++;
            }
            while(i<leftLen){
                a[k++]= left[i++];

            }
            while(j<rightLen){
                a[k++]=right[i++];
            }
        }
    }
}
