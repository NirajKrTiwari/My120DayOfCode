/*
Array Operation in the two-dimensional array.

Sample Input:   {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}}

Output:
                The sum of each row
                6
                15
                24
                The sum of each Column
                12
                15
                18
                The sum of each element
                45
                Column 3 have the greatest sum: 18
                Row 3 have the greatest sum: 24
*/
public class ArrayOperation {
    static int sum = 0;
    static int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    void sumofrows(){
        System.out.println("The sum of each row");
        for (int[] i : a) {
            sum = 0;
            for (int j : i) {
                sum = sum + j;
            }
            System.out.println(sum);
        }
    }

     void sumofcolumn() {
        System.out.println("The sum of each Column");
        for (int j = 0; j < 3; j++) {
            sum = 0;
            for (int i = 0; i < 3; i++) {
                sum = sum + a[i][j];
            }
            System.out.println(sum);
        }
    }

    void sum() {
        System.out.println("The sum of each element");
        sum = 0;
        for (int[] i : a) {
            for (int j : i) {
                sum = sum + j;
            }
        }
        System.out.println(sum);
    }

    void SumofGreatesColumn() {
        int[] b = new int[3];
        for (int j = 0; j < 3; j++) {
            sum = 0;
            for (int i = 0; i < 3; i++) {
                sum = sum + a[i][j];
            }
            b[j] = sum;
        }
        if (b[0] > b[1] && b[0] > b[2]) {
            System.out.println("Column 1 have the greatest sum: " + b[0]);
        } else if (b[1] > b[2] && b[1] > b[0]) {
            System.out.println("Column 2 the have greatest sum: " + b[1]);
        } else {
            System.out.println("Column 3 the have greatest sum: " + b[2]);
        }
    }

    void SumofGreatestRow() {
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + a[i][j];
            }
            b[i] = sum;
        }
        if (b[0] > b[1] && b[0] > b[2]) {
            System.out.println("Row 1 have the greatest sum: " + b[0]);
        } else if (b[1] > b[2] && b[1] > b[0]) {
            System.out.println("Row 2 have the greatest sum: " + b[1]);
        } else {
            System.out.println("Row 3 have the greatest sum: " + b[2]);
        }
    }

    public static void main(String arg[]) {
        ArrayOperation obj=new ArrayOperation();
        obj.sumofrows();
        obj.sumofcolumn();
        obj.sum();
        obj.SumofGreatesColumn();
        obj.SumofGreatestRow();
    }

}