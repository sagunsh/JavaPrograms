public class Arrays {
    public static void main(String[] args) {
        /* Declaration */
        int intArr[] = new int[5];
        /* Initialization */
        intArr[0] = 5; intArr[1] = 3; intArr[2] = 20; intArr[3] = 14; intArr[4] = 23;

        /* Declaration and initialization */
        double doubleArr[] = {2.5, 1.33, 6.89, 17.33, 43.10};

        /* Multi dimensional array */
        int a[][] = {{1,2}, {3,4}};
        int b[][] = new int[2][2];
        b[0][0] = 3; b[0][1] = 5;
        b[1][0] = 1; b[1][1] = 21;

        for (int i=0; i<2; i++)
            for (int j=0; j<2; j++)
                System.out.println(a[i][j] + b[i][j]);
    }
}
