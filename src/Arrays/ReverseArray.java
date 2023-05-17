package Arrays;

public class ReverseArray { // Reversing an array without using extra space
    public static void reverseArray(int [] n){
        int first = 0;
        int last = n.length -1;
      while(first < last){
            int temp = n[last];
            n[last]= n[first];
            n[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int [] arr ={22,13,43,4,22,76};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
