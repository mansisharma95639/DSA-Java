 //Reverse a number eg : 10899
public class App {
    public static void main(String[] args) throws Exception {
       int n=10899;
       while(n>0){
        int lastDigit = n % 10;
        n = n / 10;
        System.out.print(lastDigit);
       }
    }
}
