package Arrays;
import java.util.*;
public class linearSearch {
    public static int linearsearch(int n[], int key){
        for(int i=0;i<=n.length;i++){
            if(n[i] == key){
                System.out.println("Found value : "+key);
                return i;
            }
        }
        System.out.println("Not Found");
        return -1;
    }
    public static void main(String args[])
        {
            int[] n= {2,3,7,4,9,22};
            linearsearch(n,2);
        }
}
