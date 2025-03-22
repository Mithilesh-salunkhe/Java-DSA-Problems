public class Move_zeros {

        public static void moveZerosToEnd(int arr[]){
            //start with first position
           int insertPosition = 0;

        //fill all non zero numbers
           for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] != 0){
                arr[insertPosition] = arr[i];
                insertPosition++;
            }
           }
           // fill remaning with zeros
           while(insertPosition < arr.length){
            arr[insertPosition++] = 0;
           }
        }
       public static void main(String args[]){ //T.C -->   O(n);
        int arr[]={2,1,0,3,0,12};
        moveZerosToEnd(arr);

        for (int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}