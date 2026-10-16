
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
public class MinScalar_product {
    public static void main(String[] args) {
        int[] arr1={1,2,-4,5,2,6,8};
        int[] arr2={4,5,2,9,7,5,4};
        if(arr1.length==arr2.length){
            Arrays.sort(arr1);
            Arrays.sort(arr2,Collections.reverseOrder());
            int min=0;
            for(int i=0;i<arr1.length;i++){
                min+=arr1[i]*arr2[i];
            }
            System.out.println("minimum scalar product is "+min);
        }else{
            System.out.println("cant find min scalar cause both arrays are not in same size");
        }

    }
}
