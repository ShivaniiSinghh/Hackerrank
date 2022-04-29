/*
There are N students in a classroom and they are seated in a linear order. The teacher plans to change the seating arrangement of all the students in such a way that each
student sits on the new bench everyday. For example, student sitting at first bench moves to the second bench.

Input Format
An integer N denoting number of students An array arr[n]

Constraints
1

Output Format
An array displaying the required seating arrangement

Sample Input
6
James Logan Mason Jacob Lucas Ethan

Sample Output
Ethan James Logan Mason Jacob Lucas

*/
import java.util.*;

public class ChangeArrangement {
    public static void main(String[] args) { /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        String last=arr[n-1];
        for(int j= arr.length-1;j>0; j--)
            arr[j]= arr[j-1];
        arr[0]=last;
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
