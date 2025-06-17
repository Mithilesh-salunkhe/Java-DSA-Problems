import java.util.*;

public class shortest_path {

    public static float shortestPath(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            //North
            if (dir == 'N') {
                y++;
            }

            //south
            else if (dir == 'S') {
                y--;
            }

            //east
             else if (dir == 'E') {
                x++;
            }
            
            //west
             else if (dir == 'E') {
                x--;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;

        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str)); //T.C --> O(n)
    }
}