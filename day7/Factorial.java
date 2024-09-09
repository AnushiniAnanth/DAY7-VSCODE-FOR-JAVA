import java.util.*;
public class Factorial {
    public static int factorial(int n){
        int fact=1;
        if(n==1||n==0){
           fact=1;

        }
        else{
           fact=n*factorial(n-1);
     
            
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int res=factorial(n);
        System.out.println("Factorial is"+res);
    }

}
