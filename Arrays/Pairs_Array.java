public class Pairs_Array{

    public static void pairsArray(int arr[]){
        for(int i=0; i<arr.length ;i++){ //track left element in the pair
            for(int j = i +1 ; j < arr.length ; j++){ //track for right element in the pair
                System.out.print("(" + arr[i] +","+ arr[j] +")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};

        pairsArray(arr);
    }
}