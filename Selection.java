import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {3,1,6,7,9,5,4};
            System.out.println(Arrays.toString(arr));
        
       for (int i = 0; i < arr.length; i++) {
        int pos = i;
        int min = arr[i];
    
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < min) {
                pos = j;
                min = arr[j];
            }
        }
        arr[pos] = arr[i];
        
        arr[i] = min;
    }
    System.out.println();
     System.out.println(Arrays.toString(arr));
    }
}