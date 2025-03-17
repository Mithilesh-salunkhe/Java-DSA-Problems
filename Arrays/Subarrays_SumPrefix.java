public class Subarrays_SumPrefix {
    public static int subarraySum(int arr[]){  //Prefix Sum method..

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        // PREFIX ARRAY...
        int prefix[] = new int[arr.length]; 
        prefix[0] = arr[0];

        for(int i=1 ; i<arr.length ; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for(int i = 0 ; i <arr.length ; i++){
            int start = i;

            for(int j = i ; j <arr.length ; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];    

                if(currSum > maxSum){
                    maxSum = currSum;
                }
               
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3}; // T.C --> O(n^2)
        System.out.print(subarraySum(arr)); 
    }
}