import java.util.*;

public class Duplicates {

        public static void duplicateNums(int arr[],int n){
          Arrays.sort(arr);
          int[] duplicates = new int[n];
          int index = 0;

          if(arr.length <= 1){
            System.out.println("-1");
            return;
          }
          for(int i = 0 ; i<arr.length - 1 ; i++){
              if(arr[i] == arr[i+1]){
                if (index == 0 || duplicates[index - 1] != arr[i]) {
                  duplicates[index++] = arr[i];
                }
              }
          }
          if(index == 0){
            System.out.print("-1");
          }else{
           for(int i = 0 ; i < index ; i++){
            System.out.print(duplicates[i] +" ");
           }
          }
          
        } 
       public static void main(String args[]){
        int arr[]={3,4,5,7,8,1,2,1,3};
        duplicateNums(arr , arr.length);
    }
}