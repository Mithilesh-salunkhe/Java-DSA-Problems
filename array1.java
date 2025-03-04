// import java.util.*;

// public class array1{

//     public static void update(int marks[]){

//         //for travrsing the array.....
//         for(int i = 0 ; i<marks.length ; i++){
//             marks[i] = marks [i] + 1;
//         }
//     }

//     public static void main(String args[]){
//         // int marks[] = new int[3];
//         // marks[0] = 99;
//         // marks[1] = 96;
//         // marks[2] = 90;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);


//         // Scanner sk = new Scanner(System.in);
//         // int size = sk.nextInt();
//         // int arr[] = new int[size];

//         // //input values in the array....
//         // for(int i = 0; i<size ;i++){
//         //     arr[i] = sk.nextInt();
//         // }

//         // for(int i=0 ; i<arr.length ; i++){
//         //     System.out.print(arr[i] +" ");//here i indicates the index value...
//         // }
//         // 
        
//         int marks[]  = {98 , 99 ,90};
//         update(marks);
        
//         //output of array....
//         for(int i = 0 ; i<marks.length ; i++){
//             System.out.print(marks[i]+" ");
//         }
    
//     }

// }


import java.util.*;

public class array1{
//*********************** LINEAR SEARCH ***************************************** */
    public static int linearSearch(int numbers[] , int key){
        for(int i = 0 ;i<numbers.length ; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

//*************************** Largest and smallest in the array***************
    public static int get_Largest_Smallest(int numbers[]){
        int largest = Integer.MIN_VALUE;   // -infinty
        int smallest = Integer.MAX_VALUE;  // infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is :" + smallest);
        return largest;
    }

//***************************** BINARY SEARCH ***************************** */
    public static int BinarySearch(int arr[] , int key){
        int low = 0;
        int high = arr.length - 1;

        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if (key > arr[mid]) { //right side
                low = mid+1;
            }
            else{//left side...
                high = mid - 1;
            }
        }
        return -1; // if element is not present in the array.....
    }
//*******************  reverse an array  *************************************
 public static void Reverse(int arr[]){
    int first = 0;
    int last = arr.length-1;
    while (first < last) {
        //swap....
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;

        first++;
        last--;
    }
 }  
//*************************** print Pairs **********************
 public static void printPairs(int arr[]){
    for(int i = 0 ; i<arr.length ; i++){//right side

        int curr = arr[i];

        for(int j = i+1 ; j<arr.length ; j++){//left side
            System.out.print("(" + curr + "," + arr[j] + ")"+" ");
        }
        
        System.out.println();
    }
 }                                                           
                                         
//************************ printSubArrays *************************    
 public static void PrintSubarrays(int arr[]){
    int ts = 0;
    for(int i = 0 ; i<arr.length ; i++){
        int start = i;
        
        for(int j = i; j<arr.length ; j++){
            int end = j;

            for(int k = start ; k <= end ;k++){//printing sub arrays.....
                System.out.print(arr[k]+" ");
            }
            System.out.println();
            ts++;
        }
        System.out.println();   
        
    }
    
    System.out.println("total numbers of subarrays are: " + ts);
 }

//********************** Print Max sum Subarray(brute force method) ***************** */
public static void MaxSubarraySum(int arr[]){
    int currSum  = 0;
    int maxSum = Integer.MIN_VALUE;//-infinity..

    for(int i = 0 ; i<arr.length ; i++){
        int start = i;

        for(int j = i; j<arr.length ; j++){
            int end = j;
            currSum  = 0;

            for(int k = start ; k <= end ;k++){//printing sub arrays.....
                currSum+= arr[k];
            }
            System.out.println(currSum);
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        
    }
    System.out.println("max sum = " + maxSum);
    
 }

//**************************** Print Max sum Subarray(PREFIX SUM)****************** */
public static void MaxSubarraySumPrefix(int arr[]){
    int currSum  = 0;
    int maxSum = Integer.MIN_VALUE;//-infinity..
    int prefix[] = new int[arr.length];


    prefix[0] = arr[0];    
    //calculate prefix array...
    for(int i = 1; i<arr.length;i++){
        prefix[i] = prefix[i-1] + arr[i];
    }

    for(int i = 0 ; i<arr.length ; i++){
        int start = i;

        for(int j = i; j<arr.length ; j++){
            int end = j;
        
            currSum = start == 0 ? prefix[end] :  prefix[end] - prefix[start - 1];

            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        
    }
    System.out.println("max sum = " + maxSum);
    
 }

//********************** Print Max sum Subarray(KADANE'S ALGORITHM)************************
public static void Kadane(int arr[]){
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    int minSum = Integer.MAX_VALUE;



    for(int i = 0;i<arr.length;i++){
        if(minSum > arr[i]){
            minSum = arr[i];
        }
        
        currSum += arr[i];
        if(currSum < 0){
            currSum = 0;
        }
        maxSum = Math.max(currSum , maxSum);
    }
    System.out.println(" our max subarray is: " + minSum);
    System.out.println(" our max subarray is: " + maxSum);

}

//************************** Trapped Rain Water ******************** */
public static int trappedWater(int height[]){
    int n = height.length;

    //calculate left max boundary - Array
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for(int i = 1; i<n ; i++){
        leftMax[i] = Math.max(height[i] , leftMax[i-1]);
    } 

    //calculate right max boundary - Array
    int RightMax[] = new int[n];
    RightMax[n-1] = height[n-1];
    for(int i = n-2 ; i>=0 ; i--){
        RightMax[i] = Math.max(height[i], RightMax[i+1]);
    }

    int trappedWater = 0;
    //loop
    for(int i=0 ; i<n ; i++){
        //waterlevel above the bar...
        int waterLevel = Math.min(leftMax[i] , RightMax[i]);

        //trappedWater
        trappedWater += waterLevel - height[i];

    }
    return trappedWater;
}
//***********************Buying And selling price****************
public static int BuyAndSellStocks(int prices[]){
    int buyPrice = Integer.MAX_VALUE;
    int MaxProfit = 0;

    for(int i = 0; i<prices.length ; i++){
        if(buyPrice < prices[i]){ // prices == selling price
            int profit = prices[i] - buyPrice;
            MaxProfit = Math.max(MaxProfit , profit);
        }else{
            buyPrice = prices[i];
        }
    }
    return MaxProfit;
}
    public static void main(String args[]){

        //****************** linear search***************************
        // int numbers[] = {1,2,4,6,10,0,23,43,69};
        // int key = 69;

        // int index = linearSearch(numbers, key);
        // if(index == -1){
        //     System.out.println("NOT FOUND");
        // }else{
        //     System.out.println("index of the key is : "+index );
        // }

        //*************************** Largest and smallest in the array***************
        // int numbers[] = {1,2,6,3,5};
        // System.out.println("largest value is : " + get_Largest_Smallest(numbers));

       //*****************************BINARY SEARCH***************************** */
        // int arr[] = {-4,-1,3,7,10,11};
        // int key = 11;
        // System.out.println(BinarySearch(arr, key));

        //*****************************REVERSE AN ARRAY***********************
        // int arr[] = {2,4,6,8,10};

        // Reverse(arr);
        // for(int i = 0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        

        //************************* Pirnt Pairs****************
        // int arr[] = {2,4,6,8,10};
        // printPairs(arr);

         //************************ printSubArrays *************************
        // int arr[] = {2,4,6,8,10};
        // PrintSubarrays(arr);


//********************** Print Max sum Subarray***************** */
        // int arr[] = {1,-2,6,-1,3};
        // MaxSubarraySum(arr);

//*************************** Print Max sum Subarray(PREFIX SUM)****************** */
        // int arr[] = {1,-2,6,-1,3};
        // MaxSubarraySumPrefix(arr);

//********************** Print Max sum Subarray(KADANE'S ALGORITHM)************************
        // int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        // Kadane(arr);
//************************** Trapped Rain Water ******************** */
        // int height[] = {4,2,0,6,3,2,5};
        // System.out.println(trappedWater(height));

//***********************Buying And selling price****************
        int prices[] = {7,1,5,3,6,4};
        System.out.println(BuyAndSellStocks(prices));
    }

}