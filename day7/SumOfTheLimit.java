import java.util.*;
public class SumOfTheLimit {
    public static void SumOfWeight(int []arr,int k,int n){
       //boot to save people....
        int left=0;
        int right=n-1;
        int count =0;
        int sum=arr[left]+arr[right];
        Arrays.sort(arr);
        if(arr[right]<=k){
    while(left<=right){
        if(sum<=k){
            left++;
            right--;
            count++;

        }
        else{
        
        count++;
        right--;
        }
    }
}
    System.out.println(count);



    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the limit : ");
        int k=sc.nextInt();
        SumOfWeight( arr, k,n);


        
  



}
}
