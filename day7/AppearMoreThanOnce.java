import java.util.*;
import java.util.ArrayList;
public class AppearMoreThanOnce {
    public static List<Integer> ContainDuplicate(int[] arr){
        List<Integer> duplicates=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int index=Math.abs(arr[i])-1;
            if(arr[index]<0){
                duplicates.add(index-1);

            }
            arr[index]=-arr[index];
        }
        return duplicates; 
       

        
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
        List<Integer>res=ContainDuplicate(arr);
        System.out.println("Duplicates : "+res);

    }

}
