package array;


//Given an integer array arr. You need to find and return the maximum sum possible from all the
//subarrays.

//Kadane's algo
/*
1. start with the begining index
2. iterate throw the arrray
3. if the current value increase the subarray sum then include this
4. if the current value is greater than the subarray sum till now , then start a new array from now


 */
public class Day10 {


    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("the maximum sum is : "+maxSubarraySum(arr));
    }

    // method to find the maximum sum of subarray
    public static int maxSubarraySum(int[] arr) {

        // two values to track the maximum sum
        // and the subarray
        int result = arr[0];
        int maxEnd = arr[0];// this represent the sum of subarray

        // iterate through the arr
        for(int i =1 ; i <arr.length; i++){

            //check if the current subarray + arr[i] is greater or individual arr[i]
            //if it is yes, add this value in subarray
            // or start a new subarray from here
            if((maxEnd+arr[i])>arr[i]){maxEnd += arr[i];}
            else{maxEnd = arr[i];}

            if(maxEnd > result){result = maxEnd;}
        }

        // after this iteration we will get the maximum sum
        return result;

    }
}
