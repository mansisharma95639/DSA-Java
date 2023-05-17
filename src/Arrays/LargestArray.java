package Arrays;
import java.util.*;
public class LargestArray{
    public static int largestArray(){
        int largestElement = Integer.MIN_VALUE;
        int [] a = {2,3,6,4,7,20,11,5};
        for(int i=0;i<a.length ;i++){
            if( largestElement < a[i]){
                largestElement = a[i];
            }
        }
        return largestElement;
    }
    public static void main(String args[])
        {
           System.out.println("Largest Element is "+largestArray()); 
        }
}
