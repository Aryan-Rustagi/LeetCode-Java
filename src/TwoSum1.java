import java.util.Arrays;
import java.util.Scanner;
public class TwoSum1 {
    public static int[] TwoSum(int[] array,int target){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();

        int[] result= TwoSum(array,target);

        System.out.println(Arrays.toString(result));
    }
}
