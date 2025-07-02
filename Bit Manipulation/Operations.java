import java.util.Arrays;

public class Operations {

    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }

    }
    public static int setIthBit(int n , int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clearIthBit(int n , int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n , int i,int newBit){
        n = clearIthBit(n, i);
        int bitmask = newBit << i;
        return  n | bitmask ;
    } 
    public static int clearLastBits(int n,int i){
        int bitmask = ~(0)<<i;
        return n & bitmask;
    }
    public static int  clearInRange(int n , int i , int j){
        int a = ~(0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String args[]) {
    //    System.out.println(getIthBit(11, 3));
    // System.out.println(setIthBit(10, 2));
    // System.out.println(clearIthBit(10, 1));
    // System.out.println(updateIthBit(10, 2, 1));
    // System.out.println(clearLastBits(15, 2));
    System.out.println(clearInRange(10, 2, 4));
    }
} 