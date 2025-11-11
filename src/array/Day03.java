package array;



//reverse an array problem
/*
steps:
1. take two pointer pointing to the end elements
2. swap them untill they did n't cross each other
3. move them toward center of the array

 */
public class Day03 {


    public static void swap(int[] arr, int i, int j){

        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }

    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6,7};

        int n = arr.length;
        //pointers
        int left =0;
        int right =n-1;

        //reversal
        while(left<right){
            swap(arr, left,right);

            //moving pointers
            left++;
            right--;
        }


        System.out.println("After reversal : ");
        for(int x : arr){
            System.out.print(x+" ");
        }

    }
}
