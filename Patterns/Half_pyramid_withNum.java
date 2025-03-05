public class Half_pyramid_withNum {

    public static void pyramid_withnum(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid_withnum(5);
    }
}
