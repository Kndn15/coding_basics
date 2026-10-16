import java.util.*;
public class PrimenoinRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int initial=sc.nextInt();
        int last=sc.nextInt();
        
        for(int i=initial;i<=last;i++){
            if(i<2){
                continue;
            }
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
        sc.close();

    }
}

/*
 * initial,last
 */
