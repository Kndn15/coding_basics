public class FindVowels {
    public static void main(String[] args) {
        String s="Programmer";
        String s2=s.toLowerCase();
        int vowelsCount=0;
        int consonantCount=0;
        for(char c:s2.toCharArray()){
            // if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            // System.out.println(c+" vowel");
            // else
            // System.out.println(c+" consonant");
            if("aeiou".indexOf(c)!=-1){
                System.out.println(c+" vowel");
                vowelsCount++;
            }else{
                System.out.println(c+" consonant");
                consonantCount++;
            }
        }
        System.out.println("Vowels count: "+vowelsCount+" consonant count: "+consonantCount);

    }
}
