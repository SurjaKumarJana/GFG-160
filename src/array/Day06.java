package array;




/*
You are given an array arr consisting of n integers where each number represents a vote to a candidate. Return
the candidates that have votes greater than n/3, If there's not a majority vote, return an empty array.
Note: The answer should be returned in an increasing format.
 */

// we will use moore's voting algo

import java.util.ArrayList;

/*
steps :
if the majority count logic is n/k then  the numbers of posible candidate = k-1

here the logic is n/3
so the number of candidate is 2; we need to track two candidate

1. check if the current element is already tracked or not
2. if already tracked then increase the corresponding count;
3. if not tracked
    3.a) check if the  candidate count is 0 or not
    3.b) if any count is 0 update the corresponding element

4. at the end of this iteration you will get the two possible candidate
5. now count the vote
6. check the logic fits or not
7. return the result
 */
public class Day06 {


    public static void main(String[] args) {
        //given arr
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        ArrayList<Integer> result = findMajority(arr);
        System.out.print("The Majority elements are : ");
        for(Integer x : result){
            System.out.print(" "+x+" ");
        }
    }

    //method to get the candidates
    public static ArrayList<Integer> findMajority(int[] arr) {

        int n = arr.length;

        //tracking the most posible two candidte as n =3 the candidate will be 2
        int ele1=-1, ele2 =-1;
        //counting the posiblity
        int count1=0,count2=0;

        //interation to find the probable candidates
        for(int i=0 ; i<n; i++){
            //check if it is already a candidate or not
            if(arr[i] == ele1){count1++;}
            else if(arr[i] == ele2){count2++;}
            else{
                //if the element is a new element

                //check if the count == 0 if then we will update element
                if(count1 == 0){
                    ele1 = arr[i];//update the element
                    count1 =1;//update the count
                }else if(count2 == 0){
                    ele2 = arr[i];
                    count2 =1;
                }else{
                    //if the count is not zero then reduce the count
                    count1-- ;
                    count2--;
                }

            }

        }

        //after this iteration we will get the two posible candidate
        //now count the numbers of votes if it is > n/3 then add it to the array

        ArrayList<Integer> result = new ArrayList<>();
        count1 =0;
        count2 =0;

        count1 = countVote(arr, ele1);
        count2 = countVote(arr,ele2);

        if(count1 > (n/3)){result.add(ele1);}
        if(count2 > (n/3)){result.add(ele2);}

        //sorting if it is needed
        if(result.size() == 2 && (result.get(0) > result.get(1))){
            int temp = result.get(0);
            result.set(0,result.get(1));
            result.set(1,temp);
        }



        return result;


    }

    public static int countVote(int[] arr, int element){

        int n = 0;
        for(int x: arr){
            if(x == element){
                n++;
            }
        }

        return n;
    }

}
