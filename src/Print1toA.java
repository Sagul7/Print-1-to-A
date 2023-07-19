import java.util.Scanner;

public class Print1toA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(print(A));
    }
    public static int print(int A)
    {
        if(A==1)
        {
            return 1;
        }
        System.out.println(print(A-1));
        return A;
    }
}
/*
Print 1 to A
You are given an integer A, print 1 to A using using recursion.
Note :- After printing all the numbers from 1 to A, print a new line.

Input 1:
A = 10
Input 2:
A = 5

Output 1:
1 2 3 4 5 6 7 8 9 10

Output 2:
1 2 3 4 5
 */