
public class Countofdigits {
  public static void main(String[] args) {
    int inp=12345;
    int count=0;
    if(inp==0){
        System.out.println("1");
    }
    while(inp>0){
        int rem=inp%10;
        count++;
        inp=inp/10;
    }
    System.out.println(count);
  }  
}
