public class inverted_rotated_half_pyramid {

    public static void invertedHalfPyramid(int n){ // n -> total rows
        //outer
        for(int i = 1 ; i <= n ; i++){
            //spaces
            for(int j = 1 ; j <= n-i ; j++ ){
                System.out.print(" ");
            }
            //stars
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedHalfPyramid(10);
    }
}
