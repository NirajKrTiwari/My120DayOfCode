/*
Method Overloading
--------------------
Test Case 1:
Input:
Press 1: Addition of Integer number
Press 2: Multiplication
Press 3: Enter String
1
Enter a & b
2
3
Output:
Sum: 5

Test Case 2:
Input:
Press 1: Addition of Integer number
Press 2: Multiplication
Press 3: Enter String
2
Enter a & b
2
3
Output:
Multiplication: 6.0

Test Case 3:
Input:
Press 1: Addition of Integer number
Press 2: Multiplication
Press 3: Enter String
3
Enter String
Hello World
Output:
Output: Hello World

 */
import java.util.Scanner;

public class MethodOverloading {
    static int Overloading(int a,int b)
    {
        return a+b;
    }
    static float Overloading(float a,float b)
    {
        return a*b;
    }
    static void Overloading(String a)
    {
        System.out.println("Output: "+a);
    }

    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Press 1: Addition of Integer number \nPress 2: Multiplication \nPress 3: Enter String");
        n=in.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("Enter a & b");
                int a=in.nextInt();
                int b=in.nextInt();
                System.out.println("Sum: "+Overloading(a,b));
                break;
            case 2:
                System.out.println("Enter a & b");
                float a1=in.nextFloat();
                float b1=in.nextFloat();
                System.out.println("Multiplication: "+Overloading(a1,b1));
                break;
            case 3:
                System.out.println("Enter String");
                in.nextLine();
                String s=in.nextLine();
                Overloading(s);
                break;
            default:
                System.out.println("Wrong Input");
                break;

        }
    }

}
