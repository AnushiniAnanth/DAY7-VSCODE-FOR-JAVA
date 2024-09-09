import java.util.*;
public class PrintingStatement {
    public static void  printNumberReverse(int n){
        if(n>0){
          
            System.out.println(n);
            printNumberReverse(n-1);
        }
    }
        public static void  printNumber(int n){
            if(n>0){
                
               
                printNumber(n-1);
            System.out.println(n);

            } 
        
    }
    public static void  printNum(int n){
        if(n>0){
            
            System.out.println(n);
            printNum(n-1);
          
        System.out.println(n);

        } 
    
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
       System.out.println("The reverse number serie is ");
        printNumberReverse(n);
        System.out.println("The number seris is ");
        printNumber(n);
        System.out.println("The number seris and reverse is ");
        printNum(n);

    }

}
