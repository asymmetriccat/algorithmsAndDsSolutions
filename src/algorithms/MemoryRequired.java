package algorithms;

import java.util.Arrays;

/*
  We were given an array. Values of the array were memory sizes and the memory that is required by the system can only be represented in powers of 2. We had to return the size of the memory required by the system.
Ex: – arr = {2,1,4,5}
Total = 12
So, memory required =16
 */
public class MemoryRequired {
    public int memoryReq(int [] arr){
        int sum=Arrays.stream(arr).sum();
        int memory=2;
        while(memory<sum){
            memory=memory*2;
        }
        return memory;
    }

    public static void main(String argus[]){
        MemoryRequired memoryRequired=new MemoryRequired();
        int[] arr={1,2,3,4,5,6,7};
        int result=memoryRequired.memoryReq(arr);
        System.out.println(result);
    }
}
