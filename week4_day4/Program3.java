import java.util.Scanner;
class Program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean b ;
        System.out.println("enter the boolean value");
        b = sc.nextBoolean();
        if (b==true)
        {
            System.out.println("false");
        }
        else
        {
            System.out.println("true");
        }
    }
}