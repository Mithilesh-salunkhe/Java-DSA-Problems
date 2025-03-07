public class largest_smallest_in_Array {

    public static int largestSmallestInArray(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={-4,-1,3,7,10,11};

        System.out.println(largestSmallestInArray(arr)); //TC - O(N) -- linear time complexity
    }
}