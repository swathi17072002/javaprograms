import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        int sum,largest=0;
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
            arr[i][j] = sc.nextInt();
        for(int i=0;i<arr.length-2;i++){
        for(int j=0;j<arr.length-2;j++){
            sum=0;
            for(int m=i;m<i+3;m++){
                for(int n=j;n<j+3;n++){
                    sum = sum+arr[m][n];
                }
            }
            if(largest<sum)
            largest = sum;
        }
        }
        System.out.println(largest);
    }
}