package algorithms;

import java.util.Arrays;

public class ArraySortMethod {
    public static void swap(int i, int j, int[]arr){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
   //Bubble sort
    public int[] bubbleSort(int[] arr){
       int len=arr.length;
       int j;
       for(int n=len-1; n>=0; n--){
           for(int i=0;i<n;i++ ){
               j=i+1;
               if(arr[i]>arr[j]) swap(i, j, arr);
           }
       }
       return arr;
    }

    //Selection Sort
    public int[] selectionSort(int[] arr){
        int temp;
        int j;
        for(int i=0; i<arr.length; i++){
            temp=arr[i];
            for(j=i+1; j<arr.length; j++){
                if(arr[j]<arr[i]) {
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }

        }
        return arr;
    }

    //

    public static void main(String args[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        ArraySortMethod arraySortMethod=new ArraySortMethod();
        int[] arr2=arraySortMethod.selectionSort(arr1);
        Arrays.stream(arr2).forEach(a->System.out.print(a+ ", "));
    }
}
