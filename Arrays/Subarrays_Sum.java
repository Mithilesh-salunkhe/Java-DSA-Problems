public class Subarrays_Sum {
    public static int subarraySum(int arr[]){ //(brute force method)

        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i <arr.length ; i++){
            int start = i;

            for(int j = i ; j <arr.length ; j++){
                int end = j;
                int currSum = 0;

                for(int k = start ; k <= end ; k++){
                    currSum += arr[k];
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        System.out.print(subarraySum(arr));//T.C -->O(n^3) 
    }
}