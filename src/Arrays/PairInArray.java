package Arrays;

public class PairInArray {
    public static void pairInArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int currentValue = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+currentValue+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int [] arr = {2,3,4,5,6,7};
        pairInArray(arr);
    }
}

// OUTPUT
// (2,3)(2,4)(2,5)(2,6)(2,7)
// (3,4)(3,5)(3,6)(3,7)
// (4,5)(4,6)(4,7)
// (5,6)(5,7)
// (6,7)