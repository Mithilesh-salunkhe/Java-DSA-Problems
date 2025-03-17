public class Kadanes_Algo {

   public static int KadaneAlgo(int arr[]){ //Max subarray sum using Kadanes Algorithm..
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    
    for(int i = 0 ; i <arr.length ; i++){
        currSum +=arr[i];

        if(currSum < 0){
            currSum = 0;
        }
        if(currSum > maxSum){
            maxSum = currSum;
        }
    }
    return maxSum;
   }
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3}; //T.C --> O(n)
        System.out.println(KadaneAlgo(arr));
    }
}
