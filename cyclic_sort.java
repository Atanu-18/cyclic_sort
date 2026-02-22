import java.util.Arrays;

public class cyclic_sort{
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        
    }
   
    public static void cyclic(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }
}