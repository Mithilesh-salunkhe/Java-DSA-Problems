public class Subarrays {
    public static void printSubarrays(int arr[]){

        for(int i = 0 ; i<arr.length ; i++){ //starting of subarray
            int start = i;

            for(int j = i ; j<arr.length ; j++){//ending of subarray
                int end = j;

                for(int k = start ; k <= end ; k++){//printing subarray
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        printSubarrays(arr); // TC -->O(n^3) bcz of 3 nested loops
    }
}