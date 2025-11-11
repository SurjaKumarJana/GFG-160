package array;




//find second largest element in array problem

//steps:
/*
1. let max = arr[0]
2. if arr[i] >max
    second_largest = max;
    max = arr[i];
3. after the interation we will get the second max element
 */
public class Day01 {



    public static void main(String[] args) {

        //question arr , second largest element = 6
        int[] arr = {1,3,4,5,6,4,6,9};

        int n = arr.length;
        int largest =arr[0];
        int secondLargest = arr[0];

        //iteration
        for(int i =0; i < n ; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }

        }


        //printing the result
        System.out.println("second largest element is : "+secondLargest);

    }
}
