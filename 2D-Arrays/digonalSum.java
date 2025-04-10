public class digonalSum {
    public static int digonalSum(int matrix[][]){ //T.C --> O(n^2)
        int sum = 0;

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                //Primary digonal...
                if(i == j){
                    sum += matrix[i][j];
                }
                //Secondary digonal....
                else if (i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }

    public static int digonalSum2(int matrix[][]){// T.C --> O(n)
        int sum = 0 ;

        for(int i = 0 ; i < matrix.length ; i++){
            // Primary digonal...
            sum+= matrix[i][i];

            //Secondary digonal...
            if( i != matrix.length - i - 1){
                sum+= matrix[i][matrix.length - i -1];
            }
        }
        return sum;
    }

    public static void main(String args[]){
        int matrix[][] ={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        // System.out.println(digonalSum(matrix));


        System.out.println(digonalSum2(matrix));
        
    }
}
