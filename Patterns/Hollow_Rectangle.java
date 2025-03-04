public class Hollow_Rectangle {

    public static void hollowRectangle(int tolRows , int tolCols){
        //outer -rows
        for( int i = 1 ; i <= tolRows ; i++){
            //inner - columns
            for(int j = 1 ; j <= tolCols ;  j++){
                //( i , j)
                if( i == 1 || j == 1 || i == tolRows || j == tolCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        hollowRectangle(5, 15);
    }
}