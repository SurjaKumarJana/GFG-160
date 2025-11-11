package array;


//Rotate and array for d times anti-clock direction

/*
steps:
break the array into two part 0-d, d-(n-1)
reverse each part
reverse entire array
 */
public class Day04 {

    public static  void reverse(int[] arr , int left, int right){

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        //let d =10
        int d =1;
        if(d>arr.length){
            d %=arr.length;
        }

        //reversing the first part
        reverse(arr,0,d-1);
        //reversing the second part
        reverse(arr,d,arr.length-1);

        //reversing the entir array
        reverse(arr,0,arr.length-1);

        System.out.println("After rotation : ");
        for(int x : arr){
            System.out.print(x+" ");
        }

    }
}
