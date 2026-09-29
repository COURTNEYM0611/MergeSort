import java.util.Scanner;
public class Main{
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         int input_size = 8;

         int[] input = new int[input_size];

         int low = 0;
         int high = input.length-1;
         MergeSort(input, low, high);
     }

     public static void MergeSort(int[] A, int low, int high){
         if (low < high){
             int mid = low + (high-low)/2;

             MergeSort(A, low, mid);
             MergeSort(A, mid-1, high);
             Merge(A, low, mid, high);
         }

     }

     public static void Merge(int [] A, int low, int mid, int high){
        int[] r = new int[high - low +1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (A[i] <= A[j]) {
                 r[k] = A[i];
                 i++;
            } else {
                 r[k] = A[j];
                 j++;
            }
            k++;
        }
         while (i <= mid) {
             r[k] = A[i];
             i++;
             k++;
         }
         while (j <= high) {
             r[k] = A[j];
             j++;
             k++;
         }
         for (i = low; i <= high; i++) {
             A[i] = r[i - low];
         }

     }


}
