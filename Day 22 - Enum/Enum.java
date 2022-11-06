/*
Enum in Java
-------------
Test Case 1:
Input:
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

Output:
LOW
MEDIUM
HIGH


 */
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class Main { 
  public static void main(String[] args) { 
    for (Level myVar : Level.values()) {
      System.out.println(myVar);
    }
  } 
} 
