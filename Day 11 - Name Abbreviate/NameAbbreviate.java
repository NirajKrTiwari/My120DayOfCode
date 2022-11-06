
/*
Name Abbreviate
-----------------------------------------------------------------
Test Case1:
Number input by the user
Solution:
Boolean flag = Character.isDigit(A[i].charAt(i));
Input:
Enter Name: hkghjghj 122
Output:
Wrong Input
Name:
----------------------------------------------------------------
Sample1
Input:
Enter Name: Akash Kumar Raj Malhotra
Output:
Name: A.K.R.Malhotra

Sample1
Input:
Enter Name: A K Raju
Output:
Name: A.K.Raju



 */
import java.util.Scanner;

public class NameAbbreviate {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: ");
        str = in.nextLine();
        String A[] = str.split(" ");
        char first = 0;
        String f = "";

        for (int i = 0; i < A.length; i++) {
            Boolean flag = Character.isDigit(A[i].charAt(i));
            if (flag == false) {
                if (i < A.length - 1) {
                    first = A[i].charAt(0);
                    f = f.toUpperCase() + first + ".";
                } else {
                    f = f + A[i];
                }
            } else {
                System.out.println("Wrong Input");
                break;
            }
        }
        System.out.println("Name: " + f);
    }
}
