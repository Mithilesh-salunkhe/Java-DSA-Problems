import java.util.Scanner;

public class twoDimensionalArrays {

    public static boolean search(int matrix[][] , int key){
        for(int i =0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] == key){
                    System.out.println("found in cell : (" + i +"," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void twoDArrays(){
        int matrix[][] = new int [3][3];

        int n = 3 ; int m = 3;

        Scanner sc= new Scanner(System.in);

        for(int i = 0 ; i<n ; i++){//rows
            for(int j = 0 ; j < m ; j++){//coloums
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,  5);
    }
    public static void main(String args[]){ 
       twoDArrays();
       
    }
  
}