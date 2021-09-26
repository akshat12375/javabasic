
import java.util.Scanner;

public class binary 
{    
    int binarysearch(int array[], int element, int low, int high)
    {
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if (array[mid] == element)
              return mid;
            if (array[mid] < element)
              low = mid + 1;
            else
              high = mid - 1;
        }   
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        binary obj = new binary();
        
        System.out.println("Enter number of elements:");
        int num = sc.nextInt();
        int array[] = new int[num];
        System.out.println("Enter data in sorted order");
        for (int i = 0; i < num; i++) {
            System.out.println("Enter data");
            array[i] = sc.nextInt();
        }
        System.out.print("Array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        
        System.out.println("\nEnter an element to be searched : ");
        int n = sc.nextInt();
        
        int result = obj.binarysearch(array, n, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }

}
