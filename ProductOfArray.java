
import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr1={2,3,4,5,1};
        int product=1;
        for(int i=0;i<arr1.length;i++){
            product+=arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(product);

    }
}
