package array;


//move all zero to end of the array

/*
steps :
find non zero element
swap with the current zero element
 */
public class Day02 {

    public static void swap(int[] arr, int i, int j){

        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }


    public static void main(String[] args) {

        int[] arr = {1,0,4,5,3,0};

        int zeroPointer = 0;

        for(int i =0 ; i<arr.length; i++){
            if(arr[i] != 0){
                swap(arr,i,zeroPointer);// swaping the non zero elements
                zeroPointer ++;// moving to the next element
            }
        }

        System.out.println("After moving zeroes at the end : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
