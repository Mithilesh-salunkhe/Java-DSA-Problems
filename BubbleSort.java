public class BubbleSort {

    public static void bubbleSort(int arr[]){

        for(int i = 0 ; i <arr.length ; i++){ //just tracking num of turns
            for(int j = 0 ;  j <arr.length - 1 - i ; j++){
                if(arr[j] > arr[j + 1]){
                    //swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        
    }
    public static void main(String args[]){ 
        int arr[]  = {5,4,1,3,2};
        bubbleSort(arr);
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
  
}