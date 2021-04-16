package selectionsort;

/**
 *
 * @author Lenovo
 */
public class SelectionSort {

     public static void selectionSort(int[] arr){
        for(int n = 0; n < arr.length - 1; n++){
            int minimum = arr[n];
            int index = n;
            for(int m = n + 1; m < arr.length; m++){
                if(minimum > arr[m]){
                    minimum = arr[m];
                    index = m;
                }
            }
            if(index != n){
                System.out.println(" X : " + arr[n] + " > " + " Y : " + arr[index]);
                arr[index] = arr[n];
                arr[n] = minimum;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,11,8,4,13,1};
        
        System.out.println("Before Selection Sort");
        
        for(int n : arr){
            System.out.print(n + " ");
        }
        
        System.out.println();
        
        selectionSort(arr);
        
        System.out.println("After Selection Sort");
        
        for(int n : arr){
            System.out.print(n + " ");
 
     }
   } 
}
