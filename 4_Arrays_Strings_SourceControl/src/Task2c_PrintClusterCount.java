
import java.util.Arrays;
import java.util.Scanner;


public class Task2c_PrintClusterCount {

    public static void main(String[] args){
        
        System.out.print("Insert amount of numbers: ");
        Scanner scan = new Scanner(System.in);
        int numbersAmount = scan.nextInt();
        int[] arr = new int[numbersAmount];
        
        for (int row = 0; row < arr.length; row++){
            System.out.printf("Insert element %d ", row + 1);
            arr[row] = scan.nextInt();
        }
        
        Arrays.sort(arr);
        
        int count = 0;
        int cluster = 0;
                
        for(int row = 0; row < arr.length - 1; row++){
            if (arr[row] == arr[row + 1]){
                count++;
            }
            
            if ((arr[row] != arr[row + 1] && count != 0) || 
                    ((row + 1== arr.length - 1) && count != 0 )){
                cluster++;
                count = 0;
                
            }
            
            
        }
              System.out.print(cluster);  
    }
}
