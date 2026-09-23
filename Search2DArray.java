import java.util.Arrays;
import java.util.Scanner;

public class Search2DArray {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{9,8,7,6,5}};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element to Search:");
        int n = sc.nextInt();

        iterate(arr);
        int res[] = search(arr, n);
        System.out.println("Element Found at:"+Arrays.toString(res));
    }

    //Iterate an Array
    public static void iterate(int[][] a1)
    {
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a1[i].length;j++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.err.println();
        }
    }
    public static int[] search(int[][] a2,int target)
    {
        for(int i=0;i<a2.length; i++)
        {
            for(int j=0;j<a2[i].length;j++)
            {
                if(target == a2[i][j])
                    return new int[] {i,j};
            }
        }
        return new int[] {-1,-1};
    }
}