
/* Code : Character Pattern
        Send Feedback
        Print the following pattern for the given N number of rows.
        Pattern for N = 4
        A
        BC
        CDE
        DEFG
        Input format :
        Integer N (Total no. of rows)
        Output format :
        Pattern in N lines
        Constraints
        0 <= N <= 13
        Sample Input 1:
        5
        Sample Output 1:
        A
        BC
        CDE
        DEFG
        EFGHI
        Sample Input 2:
        6
        Sample Output 2:
        A
        BC
        CDE
        DEFG
        EFGHI
        FGHIJK
*/

package pattern.examples;
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i<=n)
        {
            char p = (char) ('A'+i-1);
            int j=1;
            while(j<=i)
            {
                System.out.print(p);
                 p=(char)(p+1);
                j++;
            }
            i++;
            System.out.println();
        }



    }
}
