
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReplaceArray_Rank {
    public static void main(String[] args) {
        int[] arr={70,20,10,10,40};
        System.out.println(Arrays.toString(arr));
        int rankedArray[]=ranking(arr);
        System.out.println(Arrays.toString(rankedArray));
    }
    public static int[] ranking(int[] arr){
        int[] clone=arr.clone();
        Arrays.sort(clone);
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int rank=1;
        for(int value:clone){
            if(!map.containsKey(value))
            map.put(value, rank++);
        }
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=map.get(arr[i]);
        }
        return  result;
    }
}
