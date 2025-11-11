package array;



//find the next permutation problem
/*
steps

1. find the smallest element from the end (pivot)
2. find the just greated element then the pivot
3. swap pivot with the greater element
4. reverse the part after pivot

 */
public class Day05 {


    public static void main(String[] args) {
        // given permutation
        int[] arr = {2,4,1,7,5,0};
        System.out.format("expected out put : \n"+"2 4 5 0 1 7\n");
        System.out.println("my out put : ");
        nextPermutation(arr);
        for(int x : arr){
            System.out.print(x +" ");
        }
    }

    public static void nextPermutation(int[] arr) {

        int n = arr.length;

        //find the pivot element start from the right to left
        int pivot =-1;//if no pivot element

        for(int i =n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot =i;
                break;
            }

        }

        //if pivot is -1 then simply reverse te arr
        if(pivot == -1){
            reverse(arr,0,n-1);
            return;
        }


        //finding the just greater element then pivot and swap
        for(int i = n-1; i>=0 ; i-- ){
            if(arr[i]>arr[pivot]){
                //swap them
                swap( arr,i,pivot);
                break;
            }

        }


        // reverse the part after the pivot
        reverse(arr,pivot+1,n-1);

    }

    public static void swap(int[] arr, int idx1, int idx2 ){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void reverse(int[] arr, int left, int right){

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right --;

        }
    }
}
