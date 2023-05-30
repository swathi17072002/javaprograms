import java.util.Scanner;

class Anagrams {

    public boolean isAnagram(String a, String b) {
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        int count1,count2;
        if(a.length()==b.length()){
            for(int i=0;i<A.length();i++){
                count1=count2=0;
                for(int j=0;j<A.length();j++){
                    if(A.charAt(i)==A.charAt(j))
                    count1++;
                    if(A.charAt(i)==B.charAt(j))
                    count2++;
                }
                if(count1==count2)
                continue;
                else
                return false;
            }
            return true;
        }
        else
        return false;
    }
}
public class CheckAnagrams{
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first string");
        String a = scan.next();
        System.out.println("enter second string");
        String b = scan.next();
        Anagrams ag = new Anagrams();
        boolean res = ag.isAnagram(a, b);
        if(res)
          System.out.println("Anagrams");
      else
          System.out.println("Not Anagrams");
    }
}