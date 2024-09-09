import java.util.*;
public class productOfSubarray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int prod=1;
        int count=0;
        int right=0;
        int left=0;
        System.out.println("Enter the product value : ");
        int k=sc.nextInt();
        for(right=0;right <n;right ++){
            

            prod*=arr[right];
            while(prod>=k){
                prod/=arr[left];
                left++;
            }
            count+=right-left+1;


        }
       
        System.out.println(count);
        


        
    }

}
