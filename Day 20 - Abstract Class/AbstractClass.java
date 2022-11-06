
/*

Abstract Class in Java
-----------------------------

HackerRank Question URL: https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true
-------------------------------------------------------------------------------------------------------------------------------------------------------------
Test Case1:
Problem:
If you try to create an instance of this class like the following line you will get an error:

Book new_novel=new Book(); 
solution:
Create another class MyBook which inherit the properties of Abstract class Book. And need to define body of abstract void setTitle(String s) because
abstract method in doesn't have defination in the abstract class.

Sample Input:
Yet another Novel
Sample Output: 
The title is: Yet another Novel

-------------------------------------------------------------------------------------------------------------------------------------------------------------

Sample Input:
A tale of two cities
Sample Output:
The title is: A tale of two cities


 */

import java.util.*;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    String s;

    public void setTitle(String s) {
        this.s = s;
    }

    String getTitle() {
        return s;
    }
}
// Write MyBook class here

public class AbstractClass {

    public static void main(String[] args) {
        // Book new_novel=new Book(); This line prHMain.java:25: error: Book is
        // abstract; cannot be instantiated
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();

    }
}