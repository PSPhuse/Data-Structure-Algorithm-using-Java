import java.util.Arrays;
import java.util.Scanner; 
public class BinaryAlgorithm {

    static int binarySeaech(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;

        //To Ascending Array
        if(arr[start]<arr[end])
        {
            while(start<=end)
            {
                int mid = start + (end-start)/2;
                
                if(target<arr[mid])
                    end = mid-1;
                else if(target > arr[mid])
                    start = mid+1;
                else
                    return mid;
            }
        }
        //TO Descending Array
        else{
            while(start<=end)
            {
                int mid = start+(end-start)/2;
                if(target<arr[mid])
                    start = mid+1;
                else if(target>arr[mid])
                    end = mid-1;
                else
                    return mid;
            }
        }
        //if element not found in array
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr = {1,5,8,10,15,78,100};
        int[] arr1 = {100,78,15,10,8,5,1};
        System.out.println("Your array is:"+Arrays.toString(arr1));
        int target = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element to Search in array:");
        target = sc.nextInt();
        System.out.println("Element present at Index:"+binarySeaech(arr1,target));
    }
}