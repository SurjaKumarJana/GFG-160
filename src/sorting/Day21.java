package sorting;

import CommonCode.PrintArray;

//problem statement : Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
//Note: You need to solve this problem without utilizing the built-in sort function.
public class Day21 {

    public static void main(String[] args) {
        int[] arr = {0,1,2,0,0,1,2,0,0,1,2,0,0,1,2,0,0,1,2,0,0,1,2,0,0,1,2,0,0,1,2,0,1,2};
        sort012(arr);
        PrintArray.printIntegerArray(arr);
    }
    public static void sort012(int[] arr) {

        //approach 1: sorting the array
        //Arrays.sort(arr);

        //approach 2 : by using the frequecy of the items

        /*
        int n = arr.length;

        int zeroes = 0;
        int ones = 0;
        int twoes = 0;

        //we need to find out the frequency first
        for(int i =0; i<n; i++){
            if(arr[i] == 0) {zeroes ++;}
            else if(arr[i] == 1){ones ++;}
            else{twoes ++;}
        }

        // now we will assign the values according to the frequency

        int idx =0;

        for(int i = 0; i<zeroes; i++){
            arr[idx++] = 0;
        }
        for(int i = 0 ; i<ones; i++){
            arr[idx++] = 1;
        }
        for(int i = 0 ; i<twoes; i++){
            arr[idx++] = 2;
        }
        */


        //approach 3: by using Dutch National Flag algorithm

        int n = arr.length;

        // we need three pointers low ,mid, high
        //initially low and mid point to 0th index
        // high points last element
        int low =0;
        int mid =0;
        int high = n-1;

        // we use a while loop for iteration
        /* at any index
            arr[mid] can have three values :
                            0 --> swap mid and low and move low and mid
                            1 --? only move mid
                            2 --> swap high and mid and move mid and high
        */
        while(mid<=high){

            if(arr[mid] == 0 ){
                //swapping
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                // shifting the mid and low
                mid ++;
                low ++;
            }
            else if(arr[mid] == 1){
                mid ++;
            }
            else{
                //swapping
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                // shifting the mid and low
                high --;
            }
        }



    }
}

