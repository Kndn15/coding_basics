import java.util.*;
public class PowerofNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter the power");
        int p=sc.nextInt();
        int out=1;
        for(int i=1;i<=p;i++){
            out=out*n;
        }
        System.out.println(out);
    }
}
