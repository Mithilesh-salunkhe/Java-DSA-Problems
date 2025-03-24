import java.util.*;

public class Missing_no {

        public static int missingNum(int arr[]){
          int currNum = 1;
 
          Arrays.sort(arr);

          for(int i =0 ; i<arr.length ; i++){
            if(arr[i] == currNum){
                currNum++;
            }
          }
          return currNum;

        } 
       public static void main(String args[]){ //T.C -->   O(n);
        int arr[]={1,2,3,5};
        System.out.println(missingNum(arr));
    }
}