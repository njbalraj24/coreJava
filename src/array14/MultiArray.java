package array14;

public class MultiArray 
{    
    public static void main(String args[]) 
    {    
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 3x3 matrix    
        // Printing the 2D array    
        for (int i = 0; i < 3; i++) 
        {    
            for (int j = 0; j < 3; j++) 
            {    
                System.out.print(arr[i][j] + " ");    
            }    
            System.out.println();    
        }    
    }    
}  