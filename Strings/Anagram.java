import java.util.Arrays;

public class Anagram {
    public static void anagram(String str1 , String str2){

        //covert it to lowercase..
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //check if length is same or not ..
        if(str1.length() == str2.length()){

            //convert strings to array..
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sort the array...
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            //if sorted arrays are same then they are anagram ...
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println("yes it is a anagram");
            }else{
                System.out.println("not an anagram");
            }
        }else{
            //case when lengths are nit same..
            System.out.println(" not an anagram");
        }

    }

    public static void main(String args[]){
           String str1 = "race";
           String str2 = "care";

           anagram(str1, str2);
    }
}
